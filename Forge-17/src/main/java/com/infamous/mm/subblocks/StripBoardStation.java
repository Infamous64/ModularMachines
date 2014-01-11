package com.infamous.mm.subblocks;

import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.infamous.mm.blocks.BaseSubBlock;
import com.infamous.mm.blocks.BlockContainerNonOpaqueMain;
import com.infamous.mm.blocks.containers.ContainerStripBoardStation;
import com.infamous.mm.client.gui.GuiStripBoardStation;
import com.infamous.mm.core.ISubContainerNonOpaque;
import com.infamous.mm.core.MMLog;
import com.infamous.mm.core.ParameterBuilder;
import com.infamous.mm.items.Items;
import com.infamous.mm.lib.ItemRef;
import com.infamous.mm.te.TileEntityContainerNonOpaque;

public class StripBoardStation extends BaseSubBlock implements ISubContainerNonOpaque{
	public static final int subId = BlockContainerNonOpaqueMain.getNextSubId();
	private IIcon icon;
	
	private final String texture = "StripBoardStation.png";
	private final float minX = 0.0F;
	private final float minY = 0.0F;
	private final float minZ = 0.0F;
	private final float maxX = 1.0F;
	private final float maxY = 1.0F;
	private final float maxZ = 1.0F;
	private final String renderMethod = "renderStripBoardStation";
	private final int key = 0;
	private final String unlocalizedName = "StripBoardStation";
	private final int itemsLength = 1;
	
	
	public StripBoardStation(){
	}

	public void initialize(){
		MMLog.log("Initializing Strip Board Station");
		super.init(unlocalizedName, texture, minX,minY,minZ, maxX,maxY, maxZ,renderMethod, subId, new ContainerStripBoardStation(), new GuiStripBoardStation());
	}
	public void onBlockPlacedBy(ParameterBuilder params){
		TileEntityContainerNonOpaque te = (TileEntityContainerNonOpaque) params.getWorld().func_147438_o(params.getIntCoords()[0], params.getIntCoords()[1], params.getIntCoords()[2]); //getBlockTileEntity
		te.setSubId(params.getItemStack().getItemDamage());
	}

	@Override
	public int getSizeInventory() {
		return this.itemsLength;
	}

	@Override
	public ItemStack getStackInSlot(ParameterBuilder params) {
		return (ItemStack) ((ItemStack[])params.getItemStackArray())[params.getSlotNum()];
	}

	@Override
	public ItemStack decrStackSize(ParameterBuilder params) {
		ItemStack itemstack = this.getStackInSlot(params);
		
		if(itemstack != null){
			if(itemstack.stackSize <= params.getSizeToRemove()){
				this.setInventorySlotContents(params.setItemStack(null));
			}else{
				itemstack = itemstack.splitStack(params.getSizeToRemove());
				this.onInventoryChanged();
			}
		}
		
		return itemstack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(ParameterBuilder params) {
		ItemStack itemstack = this.getStackInSlot(params);
		this.setInventorySlotContents(params.setItemStack(null));
		return itemstack;
	}

	@Override
	public ItemStack[] setInventorySlotContents(ParameterBuilder params) {
		ItemStack[] items = params.getItemStackArray();
		ItemStack itemstack = params.getItemStack();
		
		if(itemstack != null && itemstack.stackSize > this.getInventoryStackLimit()){
			itemstack.stackSize = this.getInventoryStackLimit();
		}
		items[params.getSlotNum()] = itemstack;
		return items;
	}
	@Override
	public int getInventoryStackLimit() {
		return 1;
	}

	@Override
	public void onInventoryChanged() {
	}

	@Override
	public boolean isUseableByPlayer(ParameterBuilder params) {
		int[] coords = params.getIntCoords();
		return params.getEntityPlayer().getDistanceSq(coords[0]+0.5,coords[1]+0.5,coords[2]+0.5) <= 64;
	}

	@Override
	public boolean isItemValidForSlot(ParameterBuilder params) {
		return params.getItemStack().isItemEqual(new ItemStack(Items.ItemMain, 1, ItemRef.itemDamages.get("StripBoard")));
	}

	@Override
	public ItemStack[] initItemsArray() {
		return new ItemStack[this.itemsLength];
	}
	
//	public IIcon getBlockTexture(ParameterBuilder params){
//		return params.getBlockMainInstance().sbsicon;
//	}
//	
	



}
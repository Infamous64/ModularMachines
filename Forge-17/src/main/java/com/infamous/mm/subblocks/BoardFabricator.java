package com.infamous.mm.subblocks;


import net.minecraft.item.ItemStack;

import com.infamous.mm.blocks.BaseSubBlock;
import com.infamous.mm.blocks.BlockContainerNonOpaqueMain;
import com.infamous.mm.core.ISubContainerNonOpaque;
import com.infamous.mm.core.MMLog;
import com.infamous.mm.core.ParameterBuilder;
import com.infamous.mm.te.TileEntityContainerNonOpaque;

public class BoardFabricator extends BaseSubBlock implements ISubContainerNonOpaque {
	public static final int subId = BlockContainerNonOpaqueMain.getNextSubId();
	private final String texture = "BoardFabricator.png";
	private final float minX = 0.0F;
	private final float minY = 0.0F;
	private final float minZ = 0.0F;
	private final float maxX = 1.0F;
	private final float maxY = 1.0F;
	private final float maxZ = 1.0F;
	private final String renderMethod = "renderBoardFabricator";
	private final String unlocalizedName = "BoardFabricator";
	
	public BoardFabricator(){
	}
	
	public void initialize(){
		MMLog.log("Initializing Board Fabricator");
		super.init(unlocalizedName,texture, minX,minY,minZ,maxX,maxY, maxZ, renderMethod, subId, null, null); //TODO replace nulls with GuiContainer and Container instances
	}
	public void onBlockPlacedBy(ParameterBuilder params){
		TileEntityContainerNonOpaque te = (TileEntityContainerNonOpaque) params.getWorld().func_147438_o(params.getIntCoords()[0], params.getIntCoords()[1], params.getIntCoords()[2]);//getBlockTileEntity
		te.setSubId(params.getItemStack().getItemDamage());
	}

	@Override
	public int getSizeInventory() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ItemStack getStackInSlot(ParameterBuilder params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack decrStackSize(ParameterBuilder params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(ParameterBuilder params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack[] setInventorySlotContents(ParameterBuilder params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getInventoryStackLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void onInventoryChanged() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isUseableByPlayer(ParameterBuilder params) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isItemValidForSlot(ParameterBuilder params) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ItemStack[] initItemsArray() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	public IIcon getBlockTexture(ParameterBuilder params){
//		return params.getBlockMainInstance().boardfabicon;
//	}
}

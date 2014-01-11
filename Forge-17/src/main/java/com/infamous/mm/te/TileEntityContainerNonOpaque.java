package com.infamous.mm.te;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

import com.infamous.mm.core.ClassFuncMapper;
import com.infamous.mm.core.ParameterBuilder;
import com.infamous.mm.lib.BlockRef;

public class TileEntityContainerNonOpaque extends TileEntity implements IInventory{
	private int subId = 0;
	private float subX;
	private float subY;
	private float subZ;
	private ItemStack[] items;
	
	public TileEntityContainerNonOpaque(){
		items = (ItemStack[]) ClassFuncMapper.func_mapper(subId, "initItemsArray");
	}
	
	@Override
	public void func_145839_a(NBTTagCompound nbt) {//readFromNBT
	super.func_145839_a(nbt);
	this.subId = nbt.getInteger("state") & 0xFF;
	}

	@Override
	public void func_145841_b(NBTTagCompound nbt) {//writeToNBT
	super.func_145841_b(nbt);
	nbt.setInteger("state", this.subId);
	}
	
	public int getSubId(){
		return subId;
	}
	public float getsubX(){
		return subX;
	}
	public float getsubY(){
		return subY;
	}
	public float getsubZ(){
		return subZ;
	}
	public TileEntityContainerNonOpaque setSubId(int subId){
		this.subId = subId;
		return this;
	}
	public TileEntityContainerNonOpaque setSubX(float subX){
		this.subX = subX;
		return this;
	}public TileEntityContainerNonOpaque setSubY(float subY){
		this.subY = subY;
		return this;
	}public TileEntityContainerNonOpaque setSubZ(float subZ){
		this.subZ = subZ;
		return this;
	}

	@Override
	public int getSizeInventory() {
		return (Integer) ClassFuncMapper.func_mapper(this.subId, "getSizeInventory");
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return (ItemStack) ClassFuncMapper.func_mapper(this.subId, "getStackInSlot", new ParameterBuilder().setSlotNum(slot).setItemStackArray(items));
	}

	@Override
	public ItemStack decrStackSize(int slot, int toRemove) {
		return (ItemStack) ClassFuncMapper.func_mapper(this.subId, "decrStackSize", new ParameterBuilder().setSlotNum(slot).setSizeToRemove(toRemove).setItemStackArray(items));
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {
		return (ItemStack) ClassFuncMapper.func_mapper(this.subId, "getStackInSlotOnClosing", new ParameterBuilder().setSlotNum(slot).setItemStackArray(items));
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack itemstack) {
		items = (ItemStack[]) ClassFuncMapper.func_mapper(this.subId, "setInventorySlotContents", new ParameterBuilder().setSlotNum(slot).setItemStack(itemstack).setItemStackArray(items));
	}

	@Override
	public String func_145825_b() { //getInvName
		return "inventory." + BlockRef.ContainerNonOpaqueUnlocalizedNames.get(subId);
	}

	@Override
	public boolean func_145818_k_() { //isNameLocalized
		return false;
	}

	@Override
	public int getInventoryStackLimit() {
		return (Integer) ClassFuncMapper.func_mapper(this.subId, "getInventoryStackLimit");
	}

	@Override
	public void onInventoryChanged(){
		ClassFuncMapper.func_mapper(this.subId, "onInventoryChanged");
	}
	
	
	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return (Boolean) ClassFuncMapper.func_mapper(this.subId, "isUseableByPlayer", new ParameterBuilder().setEntityPlayer(player).setIntCoords(field_145851_c, field_145848_d, field_145849_e)); //xCoord, yCoord, zCoord
	}

	@Override
	public void openChest() {	
	}

	@Override
	public void closeChest() {
	}

	@Override
	public boolean isItemValidForSlot(int slot, ItemStack itemstack) {
		return (Boolean) ClassFuncMapper.func_mapper(this.subId, "getSizeInventory", new ParameterBuilder().setSlotNum(slot).setItemStack(itemstack));
	}
}
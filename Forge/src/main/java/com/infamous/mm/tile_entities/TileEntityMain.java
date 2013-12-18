package com.infamous.mm.tile_entities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityMain extends TileEntity {
	private int subId = 0;
	private float subX;
	private float subY;
	private float subZ;
	
	public TileEntityMain(){
		
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
	super.readFromNBT(nbt);
	this.subId = nbt.getInteger("state") & 0xFF;
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {
	super.writeToNBT(nbt);
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
	public TileEntityMain setSubId(int subId){
		this.subId = subId;
		return this;
	}
	public TileEntityMain setSubX(float subX){
		this.subX = subX;
		return this;
	}public TileEntityMain setSubY(float subY){
		this.subY = subY;
		return this;
	}public TileEntityMain setSubZ(float subZ){
		this.subZ = subZ;
		return this;
	}
	
	
}

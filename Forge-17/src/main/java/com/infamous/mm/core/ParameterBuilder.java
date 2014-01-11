package com.infamous.mm.core;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.infamous.mm.blocks.BlockContainerNonOpaqueMain;
import com.infamous.mm.te.TileEntityContainerNonOpaque;

public class ParameterBuilder {
	
	

	public ParameterBuilder setIntCoords(int x,int y, int z){
		this.coordsint[0] = x;
		this.coordsint[1] = y;
		this.coordsint[2] = z;
		return this;
	}
	
	public ParameterBuilder setDoubleCoords(double x, double y, double z){
		this.coordsdouble[0] = x;
		this.coordsdouble[1] = y;
		this.coordsdouble[2] = z;
		return this;
	}
	public ParameterBuilder setFloatCoords(float x, float y, float z){
		this.coordsfloat[0] = x;
		this.coordsfloat[1] = y;
		this.coordsfloat[2] = z;
		return this;
	}
	public ParameterBuilder setModel(ModelBase model) {
		this.model = model;
		return this;
	}
	
	
	public ParameterBuilder setIsItemRenderFlag(boolean flag){
		this.isItemRenderFlag = flag;
		return this;
	}
	
	public boolean getIsItemRenderFlag(){
		return this.isItemRenderFlag;
	}
	
	public int[] getIntCoords(){
		 return coordsint;
	}
	
	public double[] getDoubleCoords(){
		 return coordsdouble;
	}
	public float[] getFloatCoords(){
		 return coordsfloat;
	}
	public ParameterBuilder setWorld(World world){
		this.world = world;
		return this;
	}
	public World getWorld(){
		return this.world;
	}
	public ParameterBuilder setEntityLivingBase(EntityLivingBase entitylivingbase){
		this.entityliving = entitylivingbase;
		return this;
	}
	public EntityLivingBase getEnitityLivingBase(){
		return this.entityliving;
	}public ParameterBuilder setItemStack(ItemStack itemstack){
		this.itemstack = itemstack;
		return this;
	}public ItemStack getItemStack(){
		return this.itemstack;
	}
	public ParameterBuilder setIconRegister(IIconRegister register) {
		this.iconregister = register;
		return this;
	}
	public IIconRegister getIconRegister(){
		return this.iconregister;
	}
	public ParameterBuilder setSide(int side) {
		this.side = side;
		return this;
	}
	public int getSide(){
		return this.side;
	}
	public ParameterBuilder setMeta(int meta){
		this.meta = meta;
		return this;
	}
	public int getMeta(){
		return this.meta;
	}
	
	public ParameterBuilder setBlockMainInstance(BlockContainerNonOpaqueMain blockmain){
		this.blockmain = blockmain;
		return this;
	}
	
	public BlockContainerNonOpaqueMain getBlockMainInstance() {
		return this.blockmain;
	}
	
	
	private int side;
	private int meta;
	private IIconRegister iconregister;
	private int[] coordsint = new int[3];
	private double[] coordsdouble = new double[3];
	private float[] coordsfloat = new float[3];
	private ModelBase model;
	private World world;
	private EntityLivingBase entityliving;
	private ItemStack itemstack;
	private BlockContainerNonOpaqueMain blockmain;
	private boolean isItemRenderFlag;
	private int slot;
	private int sizeToRemove;
	private EntityPlayer entityPlayer;
	private ItemStack[] itemStackArray;
	private TileEntityContainerNonOpaque tileEntityContainerNonOpaque;
	
	public ParameterBuilder setSlotNum(int slot) {
		this.slot = slot;
		return this;
	}

	public int getSlotNum(){
		return this.slot;
	}

	public int getSizeToRemove() {
		return sizeToRemove;
	}

	public ParameterBuilder setSizeToRemove(int sizeToRemove) {
		this.sizeToRemove = sizeToRemove;
		return this;
	}

	public EntityPlayer getEntityPlayer() {
		return entityPlayer;
	}

	public ParameterBuilder setEntityPlayer(EntityPlayer entityPlayer) {
		this.entityPlayer = entityPlayer;
		return this;
	}

	public ItemStack[] getItemStackArray() {
		return itemStackArray;
	}

	public ParameterBuilder setItemStackArray(ItemStack[] itemStackArray) {
		this.itemStackArray = itemStackArray;
		return this;
	}

	public TileEntityContainerNonOpaque getTileEntityContainerNonOpaque() {
		return tileEntityContainerNonOpaque;
	}

	public ParameterBuilder setTileEntityContainerNonOpaque(TileEntityContainerNonOpaque tileEntityContainerNonOpaque) {
		this.tileEntityContainerNonOpaque = tileEntityContainerNonOpaque;
		return this;
	}

	
}

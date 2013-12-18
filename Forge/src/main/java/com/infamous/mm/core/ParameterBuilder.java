package com.infamous.mm.core;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.infamous.mm.blocks.BlockMain;

public class ParameterBuilder {

	public ParameterBuilder setInt(int x,int y, int z){
		this.coords[0] = x;
		this.coords[1] = y;
		this.coords[2] = z;
		return this;
	}
	public ParameterBuilder setModel(ModelBase model) {
		this.model = model;
		return null;
	}
	
	public int[] getInt(){
		 return coords;
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
	public ParameterBuilder setIconRegister(IconRegister register) {
		this.iconregister = register;
		return this;
	}
	public IconRegister getIconRegister(){
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
	
	public ParameterBuilder setBlockMainInstance(BlockMain blockmain){
		this.blockmain = blockmain;
		return this;
	}
	
	public BlockMain getBlockMainInstance() {
		return this.blockmain;
	}
	
	
	private int side;
	private int meta;
	private IconRegister iconregister;
	private int[] coords = new int[3];
	private ModelBase model;
	private World world;
	private EntityLivingBase entityliving;
	private ItemStack itemstack;
	private BlockMain blockmain;
	
	
	
	
	
	
	
}

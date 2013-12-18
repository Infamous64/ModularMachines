package com.infamous.mm.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.infamous.mm.core.ClassFuncMapper;
import com.infamous.mm.core.ModularMachines;
import com.infamous.mm.core.ParameterBuilder;
import com.infamous.mm.core.lib.BlockRef;
import com.infamous.mm.core.lib.Ref;
import com.infamous.mm.tile_entities.TileEntityMain;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMain extends BlockContainer{
	
	@SideOnly(Side.CLIENT)
	public Icon sbsicon;
	
	@SideOnly(Side.CLIENT)
	public Icon boardfabicon;
	
	public BlockMain(int id) {
		super(id, Material.iron);
		setCreativeTab(ModularMachines.tabMM);
		setStepSound(Block.soundMetalFootstep);
		setHardness(2.0F);
		setUnlocalizedName("DefaultName");
	}
	
	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityMain();
	}
	
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
		int subId = ((TileEntityMain)world.getBlockTileEntity(x, y, z)).getSubId();
		this.setBlockBounds(BlockRef.BlockBounds.get("minx").get(subId), BlockRef.BlockBounds.get("miny").get(subId), BlockRef.BlockBounds.get("minz").get(subId),
				BlockRef.BlockBounds.get("maxx").get(subId), BlockRef.BlockBounds.get("maxy").get(subId), BlockRef.BlockBounds.get("maxz").get(subId));
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entitylivingbase, ItemStack itemstack){
		ClassFuncMapper.func_mapper(((TileEntityMain)world.getBlockTileEntity(x, y, z)).getSubId(),"onBlockPlacedBy",new ParameterBuilder().setWorld(world).setInt(x,y,z).setEntityLivingBase(entitylivingbase).setItemStack(itemstack));
		
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		this.sbsicon = register.registerIcon(Ref.MOD_ID.toLowerCase() + ":" + BlockRef.BlockMainTextures.get(BlockRef.subIdMap.get("StripBoardStation")));
		this.boardfabicon = register.registerIcon(Ref.MOD_ID.toLowerCase() + ":" + BlockRef.BlockMainTextures.get(BlockRef.subIdMap.get("BoardFabricator")));
	}
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getBlockTexture(IBlockAccess world, int x, int y, int z, int side){
		return getBlockIconFromSubId(((TileEntityMain)world.getBlockTileEntity(x, y, z)).getSubId());
	}
	
	
	public Icon getBlockIconFromSubId(int subId){
		
		return (Icon) ClassFuncMapper.func_mapper(subId,"getBlockTexture", new ParameterBuilder().setBlockMainInstance(this)); 
	}
	
	@Override
	public void getSubBlocks(int id, CreativeTabs tab, List subItems){
		for (int i = 0; i < BlockRef.BlockMainKeys.length; i++){
			subItems.add(new ItemStack(this, 1, i));
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int id, int meta){
		return this.sbsicon;
		
	}

}
/*	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}
	@Override
	public int getRenderType(){
		return -1;
	}
}

Currently not used until I get around to making models
*/


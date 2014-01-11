package com.infamous.mm.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.infamous.mm.core.ClassFuncMapper;
import com.infamous.mm.core.MMLog;
import com.infamous.mm.core.ModularMachines;
import com.infamous.mm.core.ParameterBuilder;
import com.infamous.mm.lib.BlockRef;
import com.infamous.mm.te.TileEntityContainerNonOpaque;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockContainerNonOpaqueMain extends BlockContainer{
	private static int nextSubId = 0;
	
	
	@SideOnly(Side.CLIENT)
	public IIcon sbsicon;
	
	@SideOnly(Side.CLIENT)
	public IIcon boardfabicon;
	
	public BlockContainerNonOpaqueMain() {
		super(Material.field_151573_f);
		func_149647_a(ModularMachines.tabMM);
		func_149672_a(Block.field_149777_j);
		func_149711_c(2.0F);
	}
	@Override
	public boolean func_149727_a(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){ //onBlockActivated
		if(!world.isRemote)
			player.openGui(ModularMachines.instance, 0, world, x, y, z);
		return true;
	}
	
	@Override
	public void func_149719_a(IBlockAccess world, int x, int y, int z) {//setBlockBoundsBasedOnState()
		int subId = ((TileEntityContainerNonOpaque)world.func_147438_o(x, y, z)).getSubId(); // getBlockTileEntity(x,y,z)
		this.func_149676_a(BlockRef.ContainerNonOpaqueBounds.get("minx").get(subId), BlockRef.ContainerNonOpaqueBounds.get("miny").get(subId), BlockRef.ContainerNonOpaqueBounds.get("minz").get(subId),
				BlockRef.ContainerNonOpaqueBounds.get("maxx").get(subId), BlockRef.ContainerNonOpaqueBounds.get("maxy").get(subId), BlockRef.ContainerNonOpaqueBounds.get("maxz").get(subId));//setBlockBounds(minx,miny,minz,maxx,maxy,maxz)
	}
	
	@Override
	public void func_149689_a(World world, int x, int y, int z, EntityLivingBase entitylivingbase, ItemStack itemstack){//onBlockPlacedBy
		ClassFuncMapper.func_mapper(((TileEntityContainerNonOpaque)world.func_147438_o(x, y, z)).getSubId(),"onBlockPlacedBy",new ParameterBuilder().setWorld(world).setIntCoords(x,y,z).setEntityLivingBase(entitylivingbase).setItemStack(itemstack));
		
	}
//	@SideOnly(Side.CLIENT)
//	@Override
//	public void func_149651_a(IIconRegister register){//registerIcons
//		this.sbsicon = register.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + BlockRef.BlockMainTextures.get(BlockRef.ContainerNonOpaqueSubIdMap.get("StripBoardStation")));
//		this.boardfabicon = register.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + BlockRef.BlockMainTextures.get(BlockRef.ContainerNonOpaqueSubIdMap.get("BoardFabricator")));
//	}
//	@SideOnly(Side.CLIENT)
//	@Override
//	public IIcon func_149673_e(IBlockAccess world, int x, int y, int z, int side){//getBlockTexture
//		return getBlockIconFromSubId(((TileEntityMain)world.func_147438_o(x, y, z)).getSubId());
//	}
	
	
//	public IIcon getBlockIconFromSubId(int subId){
//		
//		return (IIcon) ClassFuncMapper.func_mapper(subId,"getBlockTexture", new ParameterBuilder().setBlockMainInstance(this)); 
//	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void func_149666_a(Item item, CreativeTabs tab, List subItems){//getSubBlocks
		for (int i = 0; i < BlockRef.ContainerNonOpaqueClasses.size(); i++){
			subItems.add(new ItemStack(item, 1, i));
		}
	}
	
	@Override
	public TileEntity func_149915_a(World var1, int var2) {
		return new TileEntityContainerNonOpaque();
	}

//	@Override
//	public boolean isOpaqueCube(){
//		return false;
//	}
	@Override
	public boolean func_149686_d(){
		return false;
	}
	@Override
	public int func_149645_b(){
		return -1;
	}
	
	public static int getNextSubId(){
		int ret = nextSubId;
		nextSubId++;
		return ret;
	}
	
}


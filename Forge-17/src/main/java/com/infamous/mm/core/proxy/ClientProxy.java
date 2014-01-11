package com.infamous.mm.core.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.MinecraftForgeClient;

import com.infamous.mm.blocks.Blocks;
import com.infamous.mm.client.render.BlockTileEntityRenderer;
import com.infamous.mm.client.render.ItemBlockRenderer;
import com.infamous.mm.client.render.Renderers;
import com.infamous.mm.core.MMLog;
import com.infamous.mm.lib.BlockRef;
import com.infamous.mm.lib.Reference;
import com.infamous.mm.te.TileEntityContainerNonOpaque;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy{

	private Renderers models;
	
	@Override
	public void initRenderers(){
		
		models = new Renderers();
		ItemStack item = new ItemStack(GameRegistry.findItem(Reference.MOD_ID, BlockRef.BLOCK_NAME),1,0);
		MMLog.log((item.getUnlocalizedName()).toString());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityContainerNonOpaque.class, new BlockTileEntityRenderer(models));
		MinecraftForgeClient.registerItemRenderer(GameRegistry.findItem(Reference.MOD_ID, BlockRef.BLOCK_NAME), new ItemBlockRenderer(models));
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID){
		case 0:
			MMLog.log("get Client Gui Element Case 0");
			TileEntityContainerNonOpaque te = (TileEntityContainerNonOpaque) world.func_147438_o(x, y, z);
			if (te != null && te instanceof TileEntityContainerNonOpaque){
				int subId = te.getSubId();
				return (BlockRef.ContainerNonOpaqueGuiClasses.get(subId)).newInst(player.inventory, te);
			}
//			case 1:
//			TileEntityContainerOpaque te = (TileEntityContainerOpaque) world.func_147438_o(x, y, z);
//			if (te != null){
//				int subId = te.getSubId();
//				return (BlockRef.ContainerOpaqueGuiClasses.get(subId)).newInst(player.inventory, te);
//			}
		}
		return null;
	}
	
	
}

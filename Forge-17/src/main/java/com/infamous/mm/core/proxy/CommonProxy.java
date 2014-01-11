package com.infamous.mm.core.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.infamous.mm.core.MMLog;
import com.infamous.mm.lib.BlockRef;
import com.infamous.mm.te.TileEntityContainerNonOpaque;

import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler{

	public void initRenderers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID){
		case 0:
			MMLog.log("get Server Gui Element Case 0");
			TileEntityContainerNonOpaque te = (TileEntityContainerNonOpaque) world.func_147438_o(x,y,z);
			if (te != null && te instanceof TileEntityContainerNonOpaque){
				int subId = te.getSubId();
				return (BlockRef.ContainerNonOpaqueContainerClasses.get(subId)).newInst(player.inventory,te);
			}
//		case 1:
//			TileEntityContainerOpaque te = (TileEntityContainerOpaque) world.func_147438_o(x, y, z);
//			if (te != null){
//				int subId = te.getSubId();
//				return (BlockRef.ContainerOpaqueContainerClasses.get(subId)).newInst(player.inventory, te);
//			}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}
}

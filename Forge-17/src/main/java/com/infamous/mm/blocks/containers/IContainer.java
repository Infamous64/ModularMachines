package com.infamous.mm.blocks.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;

public interface IContainer {

	public Object newInst(InventoryPlayer invPlayer, TileEntity te);
	
}

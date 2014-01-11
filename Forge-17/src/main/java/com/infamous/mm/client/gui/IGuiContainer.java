package com.infamous.mm.client.gui;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;

public interface IGuiContainer {
	
	public Object newInst(InventoryPlayer invPlayer, TileEntity te);
}

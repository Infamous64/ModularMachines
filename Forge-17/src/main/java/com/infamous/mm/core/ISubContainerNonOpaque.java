package com.infamous.mm.core;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public interface ISubContainerNonOpaque {

   int getSizeInventory();
   ItemStack getStackInSlot(ParameterBuilder params);
   ItemStack decrStackSize(ParameterBuilder params);
   ItemStack getStackInSlotOnClosing(ParameterBuilder params);
   ItemStack[] setInventorySlotContents(ParameterBuilder params);
   int getInventoryStackLimit();
   void onInventoryChanged();
   boolean isUseableByPlayer(ParameterBuilder params);
   boolean isItemValidForSlot(ParameterBuilder params);
   void initialize();
   void onBlockPlacedBy(ParameterBuilder params);
   ItemStack[] initItemsArray();
	
	
}

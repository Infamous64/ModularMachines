package com.infamous.mm.blocks.containers;

import com.infamous.mm.te.TileEntityContainerNonOpaque;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.tileentity.TileEntity;

public class ContainerStripBoardStation extends Container implements IContainer{

	private TileEntityContainerNonOpaque te;
	private InventoryPlayer invPlayer;
	
	public ContainerStripBoardStation(){
		this(null,null);
	}
	
	
	public ContainerStripBoardStation(InventoryPlayer invPlayer, TileEntityContainerNonOpaque te){
		if(invPlayer != null && te != null){
			this.te = te;
			this.invPlayer = invPlayer;
			for(int x = 0; x < 9; x++){
				addSlotToContainer(new Slot(invPlayer, x, 8 + 18 * x, 142));
			}
			for(int y = 0; y < 3; y++){
				for(int x = 0; x < 9; x++){
					addSlotToContainer(new Slot(invPlayer, x + y * 9 + 9, 8 + 18 * x, 84 + y * 18));
				}
			}
			
		}
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object newInst(InventoryPlayer invPlayer, TileEntity te) {
		return new ContainerStripBoardStation(invPlayer, (TileEntityContainerNonOpaque) te);
	}
}

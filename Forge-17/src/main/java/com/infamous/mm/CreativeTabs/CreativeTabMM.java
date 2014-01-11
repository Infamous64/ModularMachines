package com.infamous.mm.CreativeTabs;

import com.infamous.mm.blocks.Blocks;
import com.infamous.mm.blocks.ItemBlockMain;
import com.infamous.mm.lib.BlockRef;
import com.infamous.mm.subblocks.StripBoardStation;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabMM extends CreativeTabs {

	public CreativeTabMM(int id) {
		super(id, "ModularMachines");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return new ItemBlockMain(Blocks.ContainerNonOpaque);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int func_151243_f() {
		return StripBoardStation.subId;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel() {
		return "Modular Machines";
	}
	
	
}

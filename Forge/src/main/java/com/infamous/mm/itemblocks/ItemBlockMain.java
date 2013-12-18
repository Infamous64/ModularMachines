package com.infamous.mm.itemblocks;


import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import com.infamous.mm.blocks.BlockMain;
import com.infamous.mm.blocks.Blocks;
import com.infamous.mm.core.lib.BlockRef;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlockMain extends ItemBlock {
	private Icon sbsicon;
	private Icon boardfabicon;
	public ItemBlockMain(int id) {
		super(id);
		setHasSubtypes(true);
		setUnlocalizedName("Base Block");
	}
	
	@Override
	public int getMetadata(int dmg){
		return dmg;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack){
		return BlockRef.BlockMainUnlocalizedNames.get(itemstack.getItemDamage());	
	}

//	@SideOnly(Side.CLIENT)
//	@Override
//	public Icon getIconFromDamage(int dmg){
//		return ((BlockMain) Blocks.BlockMain).getBlockIconFromSubId(dmg);
//	}
}

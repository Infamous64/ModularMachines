package com.infamous.mm.blocks;


import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import com.infamous.mm.core.MMLog;
import com.infamous.mm.lib.BlockRef;

public class ItemBlockMain extends ItemBlock {
	public ItemBlockMain(Block block) {
		super(block);
		setHasSubtypes(true);
		setUnlocalizedName(BlockRef.BLOCK_NAME);
	}
	
	@Override
	public int getMetadata(int dmg){
		return dmg;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack){
		return "tile." + BlockRef.ContainerNonOpaqueUnlocalizedNames.get(itemstack.getItemDamage());
		
	}

//	@SideOnly(Side.CLIENT)
//	@Override
//	public Icon getIconFromDamage(int dmg){
//		return ((BlockMain) Blocks.BlockMain).getBlockIconFromSubId(dmg);
//	}
}

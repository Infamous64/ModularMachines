package com.infamous.mm.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.infamous.mm.lib.BlockRef;

public class ItemBlockOres extends ItemBlock {
	private Block block;
	public ItemBlockOres(Block block) {
		super(block);
		this.block = block;
		setHasSubtypes(true);
	}

	@Override 
	public int getMetadata(int dmg){
		return dmg;
	}
	
	
	@Override
	public String getUnlocalizedName(ItemStack item){
		return "tile.ore." + BlockRef.OreUnlocalizedNames.get(item.getItemDamage());
	}
	
	
	@Override
	public IIcon getIconFromDamage(int dmg){
		return block.func_149691_a(dmg, 0); //getIcon
	}
}

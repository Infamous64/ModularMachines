package com.infamous.mm.recipes;
import net.minecraft.item.ItemStack;

import com.infamous.mm.blocks.Blocks;
import com.infamous.mm.core.MMLog;
import com.infamous.mm.items.Items;
import com.infamous.mm.lib.BlockRef;
import com.infamous.mm.lib.ItemRef;

import cpw.mods.fml.common.registry.GameRegistry;


public class Recipes {

	public static void init(){
		for(int i=0; i<ItemRef.shardNames.size(); i++){// 5 is the number of shards
			GameRegistry.addShapedRecipe(oreStack(ItemRef.shardNames.get(i)), "XXX","XXX","XXX",'X',shardStack(ItemRef.shardNames.get(i)));
		}
	}
	
	private static ItemStack oreStack(String shardName){
		ItemStack ore = new ItemStack(Blocks.blockOres, 1, BlockRef.OreMetasFromShardName.get(shardName));
		return ore;				
	}
	private static ItemStack shardStack(String shardName){
		return new ItemStack(Items.ItemMain, 1, ItemRef.itemDamages.get(shardName));
	}
	
}
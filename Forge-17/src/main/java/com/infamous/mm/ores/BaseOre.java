package com.infamous.mm.ores;

import net.minecraft.world.gen.feature.WorldGenerator;

import com.infamous.mm.lib.BlockRef;

public class BaseOre {
	
	public void init(int meta, int harvestLevel, String texture, boolean oreDropsItself, int itemDropDamage, int maxDrops, int minDrops, String unlocalizedName, int iterations, int minY, int maxY, WorldGenerator gen){
	
		BlockRef.OreHarvestLevels.put(meta, harvestLevel);
		BlockRef.OreTextures.put(meta, texture);
		BlockRef.OreDropsItself.put(meta, oreDropsItself);
		BlockRef.OreItemDropDamages.put(meta, itemDropDamage);
		BlockRef.OreMaxDrops.put(meta, maxDrops);
		BlockRef.OreMinDrops.put(meta, minDrops);
		BlockRef.OreUnlocalizedNames.put(meta, unlocalizedName);
		BlockRef.OreIterations.put(meta, iterations);
		BlockRef.OreMinY.put(meta,minY);
		BlockRef.OreMaxY.put(meta,maxY);
		BlockRef.OreWorldGens.put(meta, gen);
	}
	public void init(int meta, int harvestLevel, String texture, boolean oreDropsItself, int itemDropDamage, int maxDrops, int minDrops, String unlocalizedName, int iterations, int minY, int maxY, WorldGenerator gen, String shardName){
		
		BlockRef.OreHarvestLevels.put(meta, harvestLevel);
		BlockRef.OreTextures.put(meta, texture);
		BlockRef.OreDropsItself.put(meta, oreDropsItself);
		BlockRef.OreItemDropDamages.put(meta, itemDropDamage);
		BlockRef.OreMaxDrops.put(meta, maxDrops);
		BlockRef.OreMinDrops.put(meta, minDrops);
		BlockRef.OreUnlocalizedNames.put(meta, unlocalizedName);
		BlockRef.OreIterations.put(meta, iterations);
		BlockRef.OreMetasFromShardName.put(shardName, meta);
		BlockRef.OreMinY.put(meta,minY);
		BlockRef.OreMaxY.put(meta,maxY);
		BlockRef.OreWorldGens.put(meta, gen);
	}
}

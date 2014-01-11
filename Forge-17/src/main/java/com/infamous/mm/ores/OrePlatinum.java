package com.infamous.mm.ores;

import com.infamous.mm.blocks.BlockOres;
import com.infamous.mm.blocks.Blocks;
import com.infamous.mm.lib.ItemRef;

import net.minecraft.item.Item;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class OrePlatinum extends BaseOre{
	public static int meta = BlockOres.getNextSubId();
	private int harvestLevel = 3;
	private String texture = "orePlatinum";
	private boolean oreDropsItself = false;
	private String shardName = "platinumShard";
	private int itemDropDamage = ItemRef.itemDamages.get(shardName);
	private int maxDrops = 2;
	private int minDrops = 1;
	private String unlocalizedName = "platinum";
	private int minY = 0;
	private int maxY = 8;
	private int veinSize = 3;
	private int iterations = 2;
	private WorldGenerator gen = new WorldGenMinable(Blocks.blockOres, meta, veinSize, net.minecraft.init.Blocks.stone);	
	public void initialize(){
		super.init(meta, harvestLevel, texture, oreDropsItself, itemDropDamage, maxDrops, minDrops, unlocalizedName, iterations, minY, maxY, gen, shardName);
	}
}

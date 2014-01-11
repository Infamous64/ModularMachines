package com.infamous.mm.ores;

import com.infamous.mm.blocks.BlockOres;
import com.infamous.mm.blocks.Blocks;
import com.infamous.mm.lib.ItemRef;

import net.minecraft.item.Item;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class OreCadmium extends BaseOre{
	public static int meta = BlockOres.getNextSubId();
	private int harvestLevel = 3;
	private String texture = "oreCadmium";
	private boolean oreDropsItself = false;
	private String shardName = "cadmiumShard";
	private int itemDropDamage = ItemRef.itemDamages.get(shardName);
	private int maxDrops = 2;
	private int minDrops = 1;
	private String unlocalizedName = "cadmium";
	private int minY = 0;
	private int maxY = 12;
	private int veinSize = 3;
	private int iterations = 1;
	private WorldGenerator gen = new WorldGenMinable(Blocks.blockOres, meta, veinSize, net.minecraft.init.Blocks.stone);	
	public void initialize(){
		super.init(meta, harvestLevel, texture, oreDropsItself, itemDropDamage, maxDrops, minDrops, unlocalizedName, iterations, minY, maxY, gen, shardName);
	}
}

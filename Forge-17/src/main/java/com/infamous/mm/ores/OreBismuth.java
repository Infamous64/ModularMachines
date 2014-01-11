package com.infamous.mm.ores;

import com.infamous.mm.blocks.BlockOres;
import com.infamous.mm.blocks.Blocks;

import net.minecraft.item.Item;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class OreBismuth extends BaseOre{
	public static int meta = BlockOres.getNextSubId();
	private int harvestLevel = 1;
	private String texture = "oreBismuth";
	private boolean oreDropsItself = true;
	private int itemDropDamage = 0;
	private int maxDrops = 1;
	private int minDrops = 1;
	private String unlocalizedName = "bismuth";
	private int minY = 0;
	private int maxY = 33;
	private int veinSize = 6;
	private int iterations = 20;
	private WorldGenerator gen = new WorldGenMinable(Blocks.blockOres, meta, veinSize, net.minecraft.init.Blocks.stone);	
	public void initialize(){
		super.init(meta, harvestLevel, texture, oreDropsItself, itemDropDamage, maxDrops, minDrops, unlocalizedName, iterations, minY, maxY, gen);
	}
}

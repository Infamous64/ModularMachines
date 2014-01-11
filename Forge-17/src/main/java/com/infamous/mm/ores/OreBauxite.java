package com.infamous.mm.ores;

import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.infamous.mm.blocks.BlockOres;
import com.infamous.mm.blocks.Blocks;

public class OreBauxite extends BaseOre{
	public static int meta = BlockOres.getNextSubId();
	private int harvestLevel = 3;
	private String texture = "oreBauxite";
	private boolean oreDropsItself = true;
	private int itemDropDamage = 0;
	private int maxDrops = 1;
	private int minDrops = 1;
	private String unlocalizedName = "bauxite";
	private int minY = 0;
	private int maxY = 6;
	private int veinSize = 6;
	private int iterations = 1;
	private WorldGenerator gen = new WorldGenMinable(Blocks.blockOres, meta, veinSize, net.minecraft.init.Blocks.stone);	
	public void initialize(){
		super.init(meta, harvestLevel, texture, oreDropsItself, itemDropDamage, maxDrops, minDrops, unlocalizedName, iterations, minY, maxY, gen);
	}
}

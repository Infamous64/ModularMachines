package com.infamous.mm.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.infamous.mm.core.MMLog;
import com.infamous.mm.lib.BlockRef;
import com.infamous.mm.ores.OreBauxite;
import com.infamous.mm.ores.OreCopper;

import cpw.mods.fml.common.IWorldGenerator;

public class GenerationHandler implements IWorldGenerator {
	
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		if(world.provider.dimensionId == 0){
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}

	}

	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		spawnOreNearBedrock(random, chunkX*16, chunkZ*16, world, 2, 6, 20, com.infamous.mm.blocks.Blocks.blockOres, OreBauxite.meta, 6); //OreBauxite
		//for(int meta : BlockRef.OreMetas){
		//generateStandardOre(random, chunkX * 16, chunkZ * 16, world, BlockRef.OreIterations.get(OreCopper.meta), BlockRef.OreWorldGens.get(OreCopper.meta), BlockRef.OreMinY.get(OreCopper.meta), BlockRef.OreMaxY.get(OreCopper.meta), com.infamous.mm.blocks.Blocks.BlockOres, 1);
		//TODO Ore Generation
		
		//}
		
	}
	
	private void spawnOreNearBedrock(Random random, int startX, int startZ, World world, int minY, int maxY, int chancesToSpawn, Block blockToSpawn, int metadata, int maxNum1Bedrock){
		assert maxY > minY: "spawnOreNearBedrock: maxY is not greater than minY";
		assert minY < maxY: "spawnOreNearBedrock: minY is not less than maxY";
		
		for(int i = 0; i < chancesToSpawn; i++){
			int tempmaxNum1Bedrock = random.nextInt(maxNum1Bedrock);
			int x = startX + random.nextInt(16);
			int y = random.nextInt(maxY-minY)+minY;
			int z = startZ + random.nextInt(16);
			int count = 0;
			
			if(world.func_147439_a(x, y, z)==Blocks.bedrock){
				for(int j = 0; j < 6; j++){
					int tempx = (j==0 || j==1) ? ((j|1)==0? x - 1 : x + 1): x; //complicated bit stuff to return x + 1 if j is 1 and x - 1 if j is 0
					int tempy = (j==2 || j==3) ? y - 1: y; //complicated bit stuff to return y - 1 if j is 2 or 3
					int tempz = (j==4 || j==5) ? ((j|1)==0? z - 1 : z + 1): z; //complicated bit stuff to return z + 1 if j is 5 and z - 1 if j is 4
					if(world.func_147439_a(tempx, tempy, tempz).isReplaceableOreGen(world, tempx, tempy, tempz, Blocks.stone)&&count<tempmaxNum1Bedrock){
						try{
							world.func_147465_d(tempx, tempy, tempz, blockToSpawn, metadata, 2);
							count++;
						}catch(Exception e){
							MMLog.log(e.toString());
						}
					}
				}
				
			}
		}	
	}
	private void generateStandardOre(Random rand, int startX, int startZ, World world, int iterations, WorldGenerator gen, int lowestY, int highestY, Block blockToSpawn, int metadata){
		MMLog.log("generating standard ore");
		for(int i = 0; i < iterations; i++){
			int x = startX + rand.nextInt(16);
			int y = rand.nextInt(highestY - lowestY) + lowestY;
			int z = startZ + rand.nextInt(16);
			
			boolean generated = gen.generate(world, rand, x, y, z);
			
			if(world.func_147439_a(x, y, z)==com.infamous.mm.blocks.Blocks.blockOres){
				MMLog.log("yay we generated some ore");
			}
		}
	}

}

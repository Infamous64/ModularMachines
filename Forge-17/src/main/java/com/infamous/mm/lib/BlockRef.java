package com.infamous.mm.lib;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.util.IIcon;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.infamous.mm.blocks.containers.IContainer;
import com.infamous.mm.client.gui.IGuiContainer;


public class BlockRef {
	
	public static final String BLOCK_TEXTURE_LOC = "textures/blocks/";
	public static final String BLOCK_NAME = "BaseBlock";
	public static final String BLOCK_ORES_NAME = "OresBlock";
	public static boolean SPAWN_ORES;
	
	public static Map<Integer, String> ContainerNonOpaqueUnlocalizedNames = new HashMap<Integer,String>();
	public static Map<Integer, String> ContainerNonOpaqueTextures = new HashMap<Integer,String>();
	public static HashMap<Integer, Float> ContainerNonOpaqueMinX = new HashMap<Integer,Float>();
	public static HashMap<Integer, Float> ContainerNonOpaqueMinY = new HashMap<Integer,Float>();
	public static HashMap<Integer, Float> ContainerNonOpaqueMinZ = new HashMap<Integer,Float>();	
	public static HashMap<Integer, Float> ContainerNonOpaqueMaxX = new HashMap<Integer,Float>();	
	public static HashMap<Integer, Float> ContainerNonOpaqueMaxY = new HashMap<Integer,Float>();	
	public static HashMap<Integer, Float> ContainerNonOpaqueMaxZ = new HashMap<Integer,Float>();
	public static Map<String, HashMap<Integer,Float>> ContainerNonOpaqueBounds = new HashMap<String,HashMap<Integer,Float>>();
	public static Map<Integer, Object> ContainerNonOpaqueClasses = new HashMap<Integer,Object>();
	public static Map<Integer, String> ContainerNonOpaqueRenderMethods = new HashMap<Integer,String>();
	public static Map<Integer, IGuiContainer> ContainerNonOpaqueGuiClasses = new HashMap<Integer, IGuiContainer>();
	public static Map<Integer, IContainer> ContainerNonOpaqueContainerClasses = new HashMap<Integer, IContainer>();

	public static Map<Integer, Object> OreSubClasses = new HashMap<Integer,Object>();
	public static Map<Integer, Integer> OreHarvestLevels = new HashMap<Integer,Integer>();
	public static Map<Integer, String> OreTextures = new HashMap<Integer, String>();
	public static Map<Integer, IIcon> OreIcons = new HashMap<Integer, IIcon>();
	public static Map<Integer, Boolean> OreDropsItself = new HashMap<Integer, Boolean>();
	public static Map<Integer, Integer> OreItemDropDamages = new HashMap<Integer, Integer>();
	public static Map<Integer, Integer> OreMaxDrops = new HashMap<Integer, Integer>();
	public static Map<Integer, Integer> OreMinDrops = new HashMap<Integer, Integer>();
	public static Map<Integer, String> OreUnlocalizedNames = new HashMap<Integer, String>();
	public static Map<String, Integer> OreMetasFromShardName = new HashMap<String, Integer>();
	public static Map<Integer, Integer> OreIterations = new HashMap<Integer,Integer>();
	public static Map<Integer, Integer> OreMinY = new HashMap<Integer,Integer>();
	public static Map<Integer, Integer> OreMaxY = new HashMap<Integer,Integer>();
	public static final int[] OreMetas = {0,1,2,3,4,5,6,8,9,10,11};
	public static Map<Integer, WorldGenerator> OreWorldGens = new HashMap<Integer, WorldGenerator>();

	public static Map<Integer, String> ContainerOpaqueUnlocalizedNames = new HashMap<Integer,String>();
	public static Map<Integer, String> ContainerOpaqueTextures = new HashMap<Integer,String>();
	public static HashMap<Integer, Float> ContainerOpaqueMinX = new HashMap<Integer,Float>();
	public static HashMap<Integer, Float> ContainerOpaqueMinY = new HashMap<Integer,Float>();
	public static HashMap<Integer, Float> ContainerOpaqueMinZ = new HashMap<Integer,Float>();	
	public static HashMap<Integer, Float> ContainerOpaqueMaxX = new HashMap<Integer,Float>();	
	public static HashMap<Integer, Float> ContainerOpaqueMaxY = new HashMap<Integer,Float>();	
	public static HashMap<Integer, Float> ContainerOpaqueMaxZ = new HashMap<Integer,Float>();
	public static Map<String, HashMap<Integer,Float>> ContainerOpaqueBounds = new HashMap<String,HashMap<Integer,Float>>();
	public static Map<Integer, Object> ContainerOpaqueClasses = new HashMap<Integer,Object>();
	public static Map<Integer, String> ContainerOpaqueRenderMethods = new HashMap<Integer,String>();
	
	public static Map<Integer, String> BlockNonOpaqueUnlocalizedNames = new HashMap<Integer,String>();
	public static Map<Integer, String> BlockNonOpaqueTextures = new HashMap<Integer,String>();
	public static HashMap<Integer, Float> BlockNonOpaqueMinX = new HashMap<Integer,Float>();
	public static HashMap<Integer, Float> BlockNonOpaqueMinY = new HashMap<Integer,Float>();
	public static HashMap<Integer, Float> BlockNonOpaqueMinZ = new HashMap<Integer,Float>();	
	public static HashMap<Integer, Float> BlockNonOpaqueMaxX = new HashMap<Integer,Float>();	
	public static HashMap<Integer, Float> BlockNonOpaqueMaxY = new HashMap<Integer,Float>();	
	public static HashMap<Integer, Float> BlockNonOpaqueMaxZ = new HashMap<Integer,Float>();
	public static Map<String, HashMap<Integer,Float>> BlockNonOpaqueBounds = new HashMap<String,HashMap<Integer,Float>>();
	public static Map<Integer, Object> BlockNonOpaqueClasses = new HashMap<Integer,Object>();
	public static Map<Integer, String> BlockNonOpaqueRenderMethods = new HashMap<Integer,String>();
	

}

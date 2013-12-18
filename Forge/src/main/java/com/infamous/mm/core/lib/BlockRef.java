package com.infamous.mm.core.lib;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.material.Material;


public class BlockRef {
	
	public static int BlockMain_ID;
	public static final int BlockMain_DEFAULT = 1514;
	public static final String[] BlockMainKeys = {"StripBoardStation", "BoardFabricator"}; 
	public static final int[] BlockMainSubIDDefaults = {0, 1};
	public static final String BLOCK_TEXTURE_LOC = "textures/blocks/";
	
	
	public static Map<String, Integer> subIdMap = new HashMap<String,Integer>();
	public static Map<Integer, String> BlockMainUnlocalizedNames = new HashMap<Integer,String>();
	public static Map<Integer,String> BlockMainNames = new HashMap<Integer,String>();
	public static Map<Integer, String> BlockMainTextures = new HashMap<Integer,String>();
	public static Map<Integer, Float>  BlockHardnesses = new HashMap<Integer,Float>();
	public static HashMap<Integer, Float> minx = new HashMap<Integer,Float>();
	public static HashMap<Integer, Float> miny = new HashMap<Integer,Float>();
	public static HashMap<Integer, Float> minz = new HashMap<Integer,Float>();	
	public static HashMap<Integer, Float> maxx = new HashMap<Integer,Float>();	
	public static HashMap<Integer, Float> maxy = new HashMap<Integer,Float>();	
	public static HashMap<Integer, Float> maxz = new HashMap<Integer,Float>();
	public static Map<String, HashMap<Integer,Float>> BlockBounds = new HashMap<String,HashMap<Integer,Float>>();
	public static Map<Integer, Material> BlockMaterial = new HashMap<Integer,Material>();
	public static Map<Integer, Object> sub_classes = new HashMap<Integer,Object>();
	public static Map<Integer, String> renderMethods = new HashMap<Integer,String>();

	





}

package com.infamous.mm.blocks;

import net.minecraft.block.material.Material;

import com.infamous.mm.core.lib.BlockRef;

public class BaseSubBlock {

	public void init(String unlocalized_name, String texture, float hardness, float minx, float miny, float minz, 
			float maxx, float maxy, float maxz, Material material, String renderMethod, int subId, String name){
		BlockRef.BlockMainUnlocalizedNames.put(subId, unlocalized_name);
		BlockRef.BlockMainTextures.put(subId, texture);
		BlockRef.BlockHardnesses.put(subId, hardness);
		BlockRef.minx.put(subId, minx);
		BlockRef.miny.put(subId, miny);
		BlockRef.minz.put(subId, minz);
		BlockRef.maxx.put(subId, maxx);
		BlockRef.maxy.put(subId, maxy);
		BlockRef.maxz.put(subId, maxz);
		BlockRef.BlockBounds.put("minx", BlockRef.minx);
		BlockRef.BlockBounds.put("miny", BlockRef.miny);
		BlockRef.BlockBounds.put("minz", BlockRef.minz);
		BlockRef.BlockBounds.put("maxx", BlockRef.maxx);
		BlockRef.BlockBounds.put("maxy", BlockRef.maxy);
		BlockRef.BlockBounds.put("maxz", BlockRef.maxz);
		BlockRef.BlockMaterial.put(subId, material);
		BlockRef.renderMethods.put(subId, renderMethod);
		BlockRef.BlockMainNames.put(subId, name);
		
		
	}
	
	
}

package com.infamous.mm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockNonOpaqueMain extends Block {

	private static int nextSubId = 0;

	protected BlockNonOpaqueMain() {
		super(Material.field_151573_f);
	}

	public static int getNextSubId(){
		int ret = nextSubId;
		nextSubId++;
		return ret;
	}
	
}

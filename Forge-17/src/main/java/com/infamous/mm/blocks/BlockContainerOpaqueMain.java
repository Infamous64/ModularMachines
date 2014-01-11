package com.infamous.mm.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockContainerOpaqueMain extends BlockContainer {

	private static int nextSubId = 0;

	protected BlockContainerOpaqueMain() {
		super(Material.field_151573_f);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TileEntity func_149915_a(World var1, int var2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static int getNextSubId(){
		int ret = nextSubId ;
		nextSubId++;
		return ret;
	}
}

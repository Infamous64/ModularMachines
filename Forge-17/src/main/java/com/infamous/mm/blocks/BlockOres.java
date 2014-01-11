package com.infamous.mm.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.infamous.mm.core.MMLog;
import com.infamous.mm.core.ModularMachines;
import com.infamous.mm.items.Items;
import com.infamous.mm.lib.BlockRef;
import com.infamous.mm.lib.Reference;

public class BlockOres extends Block{
	private static int nextSubId = 0;

	public BlockOres() {
		super(Material.field_151576_e);//Material.rock
		func_149711_c(3.0F); //setBlockHardness
		func_149672_a(Block.field_149769_e);//setStepSound()  Block.soundTypeStone
		func_149647_a(ModularMachines.tabMM); //setcreativeTab
		for(int m = 0; m < BlockRef.OreSubClasses.size(); m++){
			setHarvestLevel("pickaxe",BlockRef.OreHarvestLevels.get(m), m);
		}
	}

	@Override
	public void func_149651_a(IIconRegister register){ //registerBlockIcons
		for(int m = 0; m < BlockRef.OreSubClasses.size(); m++){
			MMLog.log("registering ore icons");
			BlockRef.OreIcons.put(m, register.registerIcon(Reference.MOD_ID + ":" + BlockRef.OreTextures.get(m)));
		}
	}
	
	@Override
	public IIcon func_149691_a(int side, int meta){  //getIcon
		return BlockRef.OreIcons.get(meta);
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune){
		ArrayList<ItemStack> returnarray = new ArrayList<ItemStack>();
		
		if(BlockRef.OreDropsItself.get(metadata)){
			returnarray.add(new ItemStack(this, 1, metadata));
		}else{
			returnarray.add(new ItemStack(Items.ItemMain, this.quantityDropped(metadata, fortune, world.rand), BlockRef.OreItemDropDamages.get(metadata)));
		}
		return returnarray;
		
	}
	@Override
	public int func_149692_a(int meta){ //damageDropped
		return meta;
	}
	@Override
	public int quantityDropped(int metadata, int fortune, Random rand){
		int numChances = 2;
		int minDrops = BlockRef.OreMinDrops.get(metadata);
		int maxDrops = BlockRef.OreMaxDrops.get(metadata);
		int randInt = rand.nextInt() + 1;
		int randDiffMaxMin = rand.nextInt(maxDrops - minDrops + 1);
		int randBetweenMinMax = randDiffMaxMin + minDrops;
		int extra = 0;
		int modulo = randBetweenMinMax + fortune + rand.nextInt(fortune + 1);
		int ret = Math.abs(randInt % modulo) + 1;
		for(int j = 0; j < numChances; j++){
			if(ret < maxDrops + extra){
				extra += rand.nextInt(2);
			}
		}
		ret = ret + extra;
		return BlockRef.OreDropsItself.get(metadata)||ret==0? 1 : ret;
	}
	
	@Override
	public void func_149666_a(Item item, CreativeTabs tab, List list){
		
		for(int i = 0; i < BlockRef.OreSubClasses.size(); i++){
			list.add(new ItemStack(item, 1, i));
		}
		
	}

	public static int getNextSubId(){
		int ret = nextSubId ;
		nextSubId++;
		return ret;
	}


}

package com.infamous.mm.blocks;

import java.lang.reflect.InvocationTargetException;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import com.infamous.mm.core.Debug;
import com.infamous.mm.core.lib.BlockRef;
import com.infamous.mm.itemblocks.ItemBlockMain;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class Blocks {

	public static Block BlockMain;
	
	public static void init(){
		
		BlockRef.sub_classes.put(BlockRef.subIdMap.get(BlockRef.BlockMainKeys[0]), new StripBoardStation());
		BlockRef.sub_classes.put(BlockRef.subIdMap.get(BlockRef.BlockMainKeys[1]), new BoardFabricator());
		
		for (String key : BlockRef.BlockMainKeys){
			Object object = BlockRef.sub_classes.get(BlockRef.subIdMap.get(key));
			
			try {
				Debug.log("Initializing blocks");
				object.getClass().getMethod("initialize").invoke(object);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//StripBoardStation object = (StripBoardStation) BlockRef.sub_classes.get(BlockRef.subIdMap.get(key));
			//object.init();
		}
		
		Debug.log(BlockRef.subIdMap.get("StripBoardStation").toString());
		
		BlockMain = new BlockMain(BlockRef.BlockMain_ID);
		GameRegistry.registerBlock(BlockMain, ItemBlockMain.class, "Base Block");
		
		for (int i = 0; i < BlockRef.BlockMainKeys.length; i++){
			ItemStack blockstack = new ItemStack(BlockMain, 1, i);
			
			LanguageRegistry.addName(blockstack, BlockRef.BlockMainNames.get(i));
		}
	}
	
	
}

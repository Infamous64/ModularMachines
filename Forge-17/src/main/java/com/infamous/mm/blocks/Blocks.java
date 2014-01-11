package com.infamous.mm.blocks;

import java.lang.reflect.InvocationTargetException;

import net.minecraft.block.Block;
import net.minecraft.util.RegistryNamespaced;

import com.infamous.mm.core.MMLog;
import com.infamous.mm.lib.BlockRef;
import com.infamous.mm.ores.OreBauxite;
import com.infamous.mm.ores.OreBismuth;
import com.infamous.mm.ores.OreCadmium;
import com.infamous.mm.ores.OreCopper;
import com.infamous.mm.ores.OreIndium;
import com.infamous.mm.ores.OreLead;
import com.infamous.mm.ores.OreNickel;
import com.infamous.mm.ores.OrePlatinum;
import com.infamous.mm.ores.OreSelenium;
import com.infamous.mm.ores.OreTellurium;
import com.infamous.mm.ores.OreTin;
import com.infamous.mm.ores.OreZinc;
import com.infamous.mm.subblocks.BoardFabricator;
import com.infamous.mm.subblocks.StripBoardStation;

import cpw.mods.fml.common.registry.GameRegistry;


public class Blocks {

	public RegistryNamespaced blockRegistry = Block.field_149771_c;
	
	public static Block ContainerNonOpaque;
	public static Block blockOres;
	
	public static void init(){
		initContainerNonOpaque();
		initOres();
		
	}
	
	
	private static void initContainerNonOpaque(){
		BlockRef.ContainerNonOpaqueClasses.put(StripBoardStation.subId, new StripBoardStation());
		BlockRef.ContainerNonOpaqueClasses.put(BoardFabricator.subId, new BoardFabricator());
		
		for (int subId = 0; subId<BlockRef.ContainerNonOpaqueClasses.size(); subId++){
			Object object = BlockRef.ContainerNonOpaqueClasses.get(subId);
			
			try {
				MMLog.log("Initializing blocks");
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
		}
		
		ContainerNonOpaque = new BlockContainerNonOpaqueMain();
		GameRegistry.registerBlock(ContainerNonOpaque, ItemBlockMain.class, BlockRef.BLOCK_NAME);
	}
	
	private static void initOres(){
		BlockRef.OreSubClasses.put(OreNickel.meta, new OreNickel());
		BlockRef.OreSubClasses.put(OreCopper.meta, new OreCopper());
		BlockRef.OreSubClasses.put(OreTin.meta, new OreTin());
		BlockRef.OreSubClasses.put(OreLead.meta, new OreLead());
		BlockRef.OreSubClasses.put(OreZinc.meta, new OreZinc());
		BlockRef.OreSubClasses.put(OreBismuth.meta, new OreBismuth());
		BlockRef.OreSubClasses.put(OreIndium.meta, new OreIndium());
		BlockRef.OreSubClasses.put(OreBauxite.meta, new OreBauxite());
		BlockRef.OreSubClasses.put(OrePlatinum.meta, new OrePlatinum());
		BlockRef.OreSubClasses.put(OreTellurium.meta, new OreTellurium());
		BlockRef.OreSubClasses.put(OreSelenium.meta, new OreSelenium());
		BlockRef.OreSubClasses.put(OreCadmium.meta, new OreCadmium());
		
		
		
		for (int meta = 0; meta < BlockRef.OreSubClasses.size(); meta++){
			Object object = BlockRef.OreSubClasses.get(meta);
			try {
				MMLog.log("Initializing Ores");
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
		}
		
		
		blockOres = new BlockOres();
		GameRegistry.registerBlock(blockOres, ItemBlockOres.class, BlockRef.BLOCK_ORES_NAME);
	}
}

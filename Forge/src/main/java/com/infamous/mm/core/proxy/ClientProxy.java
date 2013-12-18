package com.infamous.mm.core.proxy;

import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import com.infamous.mm.core.lib.BlockRef;
import com.infamous.mm.render.ItemBlockRenderer;




public class ClientProxy extends CommonProxy{
//	private IModelCustom[] models = new IModelCustom[2]; 
	@Override
	public void initRenderers() {
//		String resourceName = "/assets/modularmachines/models/cube.obj";
//		models[BlockRef.subIdMap.get(BlockRef.BlockMainKeys[0])] = AdvancedModelLoader.loadModel(resourceName);
//		models[BlockRef.subIdMap.get(BlockRef.BlockMainKeys[0])] = AdvancedModelLoader.loadModel(resourceName);
//		MinecraftForgeClient.registerItemRenderer(BlockRef.BlockMain_ID, new ItemBlockRenderer(models));
		
	}
	@Override
	public void initSounds() {
		//TODO initialise sounds
		
	}

}

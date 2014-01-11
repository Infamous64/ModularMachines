package com.infamous.mm.client.render;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import com.infamous.mm.core.MMLog;
import com.infamous.mm.core.ParameterBuilder;
import com.infamous.mm.lib.BlockRef;
import com.infamous.mm.lib.Reference;
import com.infamous.mm.subblocks.BoardFabricator;
import com.infamous.mm.subblocks.StripBoardStation;

public class Renderers {
	private Map<Integer,IModelCustom> models= new HashMap<Integer, IModelCustom>();
	
	private ResourceLocation resourceName = new ResourceLocation(Reference.MOD_ID.toLowerCase(),"/models/cube.obj");
	
	
	public Renderers(){
		models.put(StripBoardStation.subId, AdvancedModelLoader.loadModel(resourceName));
		models.put(BoardFabricator.subId, AdvancedModelLoader.loadModel(resourceName));
	}

	public void renderStripBoardStation(ParameterBuilder params){

		
		if(params.getIsItemRenderFlag()){
			renderStripBoardStationItem(params);
		}else{
			renderStripBoardStationBlock(params);
		}
		
	}
	
	private void renderStripBoardStationBlock(ParameterBuilder params) {
		double[] coords = params.getDoubleCoords();
		GL11.glPushMatrix();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glTranslated(coords[0]+0.5D, coords[1]+0.5D, coords[2]+0.5D);
		ResourceLocation textures = (new ResourceLocation(Reference.MOD_ID.toLowerCase(),getResourceLocation(StripBoardStation.subId)));
		Minecraft.getMinecraft().renderEngine.bindTexture(textures);
		
		models.get(StripBoardStation.subId).renderAll();
		
		GL11.glPopMatrix();
		
	}

	private void renderStripBoardStationItem(ParameterBuilder params) {
		
		float[] coords = params.getFloatCoords();
		GL11.glPushMatrix();
		GL11.glScalef(1.0F, 1.0F, 1.0F);
		ResourceLocation textures = (new ResourceLocation(Reference.MOD_ID.toLowerCase(), getResourceLocation(StripBoardStation.subId)));
		Minecraft.getMinecraft().renderEngine.bindTexture(textures);
		GL11.glTranslatef(coords[0],coords[1],coords[2]);
		models.get(StripBoardStation.subId).renderAll();
		GL11.glPopMatrix();
	}

	public void renderBoardFabricator(ParameterBuilder params){
		if(params.getIsItemRenderFlag()){
			renderBoardFabricatorItem(params);
		}else{
			renderBoardFabricatorBlock(params);
		}
	}
	private void renderBoardFabricatorBlock(ParameterBuilder params) {
		
		double[] coords = params.getDoubleCoords();
		GL11.glPushMatrix();
		GL11.glTranslated(coords[0]+0.5D, coords[1]+0.5D, coords[2]+0.5D);
		ResourceLocation textures = (new ResourceLocation(Reference.MOD_ID.toLowerCase(),getResourceLocation(BoardFabricator.subId)));
		Minecraft.getMinecraft().renderEngine.bindTexture(textures);
		
		models.get(BoardFabricator.subId).renderAll();
		
		GL11.glPopMatrix();
		
	}

	private void renderBoardFabricatorItem(ParameterBuilder params) {
		float[] coords = params.getFloatCoords();
		
		GL11.glPushMatrix();
		GL11.glScalef(1.0F, 1.0F, 1.0F);
		
		ResourceLocation textures = (new ResourceLocation(Reference.MOD_ID.toLowerCase(), getResourceLocation(BoardFabricator.subId)));
		Minecraft.getMinecraft().renderEngine.bindTexture(textures);
		
		GL11.glTranslatef(coords[0],coords[1],coords[2]);
		
		models.get(BoardFabricator.subId).renderAll();
		
		GL11.glPopMatrix();
		
	}
	private String getResourceLocation(int subId){
		return BlockRef.BLOCK_TEXTURE_LOC + BlockRef.ContainerNonOpaqueTextures.get(subId);
	}
}

package com.infamous.mm.render;


/* 
 * For Now this File is not used until I get around to making models i will just render them as normal blocks
 * 
 * 
 * 
 * 
 * 
 * 
 */


import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import com.infamous.mm.core.lib.BlockRef;
import com.infamous.mm.core.lib.Ref;
import com.infamous.mm.tile_entities.TileEntityMain;

public class BlockTileEntityRenderer extends TileEntitySpecialRenderer{
	private IModelCustom[] models;
	
	public BlockTileEntityRenderer(IModelCustom[] models) {
		this.models = models;
	}
	
	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
		TileEntityMain teMain = (TileEntityMain) te;
		int subId = teMain.getSubId();
		GL11.glPushMatrix();
		GL11.glTranslated(x, y, z+ 1D);
		ResourceLocation textures = (new ResourceLocation(Ref.MOD_ID.toLowerCase(),BlockRef.BLOCK_TEXTURE_LOC + BlockRef.BlockMainTextures.get(subId)));
		Minecraft.getMinecraft().renderEngine.bindTexture(textures);
		this.models[subId].renderAll();
		GL11.glPopMatrix();
		
	}
	private void adjustLightFixture(World world, int i, int j, int k, Block block) {
        Tessellator tess = Tessellator.instance;
        float brightness = block.getBlockBrightness(world, i, j, k);
        int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
        int modulousModifier = skyLight % 65536;
        int divModifier = skyLight / 65536;
        tess.setColorOpaque_F(brightness, brightness, brightness);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  (float) modulousModifier,  divModifier);
	}

}

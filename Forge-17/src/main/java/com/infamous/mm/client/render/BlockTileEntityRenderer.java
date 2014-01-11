package com.infamous.mm.client.render;


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
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.infamous.mm.core.ClassFuncMapper;
import com.infamous.mm.core.ParameterBuilder;
import com.infamous.mm.lib.BlockRef;
import com.infamous.mm.te.TileEntityContainerNonOpaque;
	
public class BlockTileEntityRenderer extends TileEntitySpecialRenderer{
	private Renderers models;
	
	public BlockTileEntityRenderer(Renderers models) {
		this.models = models;
	}
	
	@Override
	public void func_147500_a(TileEntity te, double x, double y, double z, float scale) {//renderTileEntityAt
		TileEntityContainerNonOpaque teMain = (TileEntityContainerNonOpaque) te;
		int subId = teMain.getSubId();
		ClassFuncMapper.methodCaller(this.models, BlockRef.ContainerNonOpaqueRenderMethods.get(subId), new ParameterBuilder().setDoubleCoords(x, y, z));
		
	}
//	private void adjustLightFixture(World world, int i, int j, int k, Block block) {
//        Tessellator tess = Tessellator.instance;
//        float brightness = block.func_149677_c(world, i, j, k);
//        int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
//        int modulousModifier = skyLight % 65536;
//        int divModifier = skyLight / 65536;
//        tess.setColorOpaque_F(brightness, brightness, brightness);
//        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  (float) modulousModifier,  divModifier);
//	}

}

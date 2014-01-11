package com.infamous.mm.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.infamous.mm.blocks.containers.ContainerStripBoardStation;
import com.infamous.mm.core.MMLog;
import com.infamous.mm.lib.Reference;
import com.infamous.mm.te.TileEntityContainerNonOpaque;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiStripBoardStation extends GuiContainer implements IGuiContainer{
	
	public GuiStripBoardStation(){
		this(null,null);
	}
	
	
	public GuiStripBoardStation(InventoryPlayer invPlayer, TileEntityContainerNonOpaque te) {
		super(new ContainerStripBoardStation(invPlayer,te));
		this.field_146999_f = 176;
		this.field_147000_g = 166;
	}

	private static final ResourceLocation texture =  new ResourceLocation(Reference.MOD_ID.toLowerCase(), "textures/gui/basegui.png");
	
	@Override
	protected void func_146976_a(float f, int x, int y) { //drawGuiContainerBackgroundLayer
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		drawTexturedModalRect(this.field_147003_i, this.field_147009_r, 0, 0, this.field_146999_f, this.field_147000_g);
		
	}

	@Override
	public Object newInst(InventoryPlayer invPlayer, TileEntity te) {
		return new GuiStripBoardStation(invPlayer, (TileEntityContainerNonOpaque) te);
	}

}

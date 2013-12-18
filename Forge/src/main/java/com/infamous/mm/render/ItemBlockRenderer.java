package com.infamous.mm.render;


/*
 * 
 * For Now this is not used I will just render as normal block
 * 
 * 
 */




import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import com.infamous.mm.core.lib.BlockRef;
import com.infamous.mm.core.lib.Ref;

import cpw.mods.fml.client.FMLClientHandler;

public class ItemBlockRenderer implements IItemRenderer{
	
	private IModelCustom[] models;
	
	public ItemBlockRenderer(IModelCustom[] models) {
		this.models = models;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		int subId = item.getItemDamage();

        switch (type) {
            case ENTITY: {
                renderItemBlockMain(subId,0.0F, 0.0F, 0.0F);
                break;
            }
            case EQUIPPED: {
                renderItemBlockMain(subId,0.5F, 0.5F, 0.5F);
                break;
            }
            case EQUIPPED_FIRST_PERSON: {
                renderItemBlockMain(subId,0.25F, 0.5F, 0.5F);
                break;
            }
            case INVENTORY: {
            	renderItemBlockMain(subId, 0.0F,0.0F,0.0F);
                break;
            }
            default:
                break;
        }
		
		
		
	}
	
	public void renderItemBlockMain(int subId, float x, float y, float z){
		
		GL11.glPushMatrix();
		GL11.glScalef(1.0F, 1.0F, 1.0F);
		
		ResourceLocation textures = (new ResourceLocation(Ref.MOD_ID.toLowerCase(),BlockRef.BLOCK_TEXTURE_LOC + BlockRef.BlockMainTextures.get(subId)+".png"));
		Minecraft.getMinecraft().renderEngine.bindTexture(textures);
		
		GL11.glTranslatef(x,y,z);
		
		this.models[subId].renderAll();
		
		GL11.glPopMatrix();
		
	}

}

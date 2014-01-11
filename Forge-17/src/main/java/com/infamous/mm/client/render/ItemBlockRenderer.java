package com.infamous.mm.client.render;


/*
 * 
 * For Now this is not used I will just render as normal block
 * 
 * 
 */




import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import com.infamous.mm.core.ClassFuncMapper;
import com.infamous.mm.core.MMLog;
import com.infamous.mm.core.ParameterBuilder;
import com.infamous.mm.lib.BlockRef;

public class ItemBlockRenderer implements IItemRenderer{
	
	private Renderers models;
	
	public ItemBlockRenderer(Renderers models) {
		this.models = models;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		
		int subId = item.getItemDamage();

        switch (type) {
            case ENTITY: {
                ClassFuncMapper.methodCaller(this.models, BlockRef.ContainerNonOpaqueRenderMethods.get(subId), new ParameterBuilder().setFloatCoords(0.0F, 0.0F, 0.0F).setIsItemRenderFlag(true));
                break;
            }
            case EQUIPPED: {
                ClassFuncMapper.methodCaller(this.models, BlockRef.ContainerNonOpaqueRenderMethods.get(subId), new ParameterBuilder().setFloatCoords(0.5F, 0.5F, 0.5F).setIsItemRenderFlag(true));
                break;
            }
            case EQUIPPED_FIRST_PERSON: {
                ClassFuncMapper.methodCaller(this.models, BlockRef.ContainerNonOpaqueRenderMethods.get(subId), new ParameterBuilder().setFloatCoords(0.25F, 0.5F, 0.5F).setIsItemRenderFlag(true));
                break;
            }
            case INVENTORY: {
            	ClassFuncMapper.methodCaller(this.models, BlockRef.ContainerNonOpaqueRenderMethods.get(subId), new ParameterBuilder().setFloatCoords(0.0F,0.0F,0.0F).setIsItemRenderFlag(true));
                break;
            }
            default:
                break;
        }
		
		
		
	}
	

}

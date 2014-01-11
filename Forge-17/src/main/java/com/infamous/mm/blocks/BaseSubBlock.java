package com.infamous.mm.blocks;

import com.infamous.mm.blocks.containers.IContainer;
import com.infamous.mm.client.gui.IGuiContainer;
import com.infamous.mm.lib.BlockRef;


public class BaseSubBlock {

	public void init(String unlocalized_name, String texture, float minx, float miny, float minz, 
			float maxx, float maxy, float maxz, String renderMethod, int subId, IContainer containerClass, IGuiContainer guiClass){
		BlockRef.ContainerNonOpaqueUnlocalizedNames.put(subId, unlocalized_name);
		BlockRef.ContainerNonOpaqueTextures.put(subId, texture);
		BlockRef.ContainerNonOpaqueMinX.put(subId, minx);
		BlockRef.ContainerNonOpaqueMinY.put(subId, miny);
		BlockRef.ContainerNonOpaqueMinZ.put(subId, minz);
		BlockRef.ContainerNonOpaqueMaxX.put(subId, maxx);
		BlockRef.ContainerNonOpaqueMaxY.put(subId, maxy);
		BlockRef.ContainerNonOpaqueMaxZ.put(subId, maxz);
		BlockRef.ContainerNonOpaqueBounds.put("minx", BlockRef.ContainerNonOpaqueMinX);
		BlockRef.ContainerNonOpaqueBounds.put("miny", BlockRef.ContainerNonOpaqueMinY);
		BlockRef.ContainerNonOpaqueBounds.put("minz", BlockRef.ContainerNonOpaqueMinZ);
		BlockRef.ContainerNonOpaqueBounds.put("maxx", BlockRef.ContainerNonOpaqueMaxX);
		BlockRef.ContainerNonOpaqueBounds.put("maxy", BlockRef.ContainerNonOpaqueMaxY);
		BlockRef.ContainerNonOpaqueBounds.put("maxz", BlockRef.ContainerNonOpaqueMaxZ);
		BlockRef.ContainerNonOpaqueRenderMethods.put(subId, renderMethod);
		BlockRef.ContainerNonOpaqueGuiClasses.put(subId, guiClass);
		BlockRef.ContainerNonOpaqueContainerClasses.put(subId, containerClass);
	}
	
	
}

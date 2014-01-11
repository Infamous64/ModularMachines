package com.infamous.mm.items;

import java.lang.reflect.InvocationTargetException;

import com.infamous.mm.core.MMLog;
import com.infamous.mm.lib.BlockRef;
import com.infamous.mm.lib.ItemRef;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.Item;

public class Items {
	public static Item ItemMain;
	
	public static void init(){
		
		ItemRef.subClasses.put(0, new TelluriumShard());
		ItemRef.subClasses.put(1, new PlatinumShard());
		ItemRef.subClasses.put(2, new CadmiumShard());
		ItemRef.subClasses.put(3, new IndiumShard());
		ItemRef.subClasses.put(4, new SeleniumShard());
		
		for (int i = 0; i < 5; i++){
			Object object = ItemRef.subClasses.get(i);
			MMLog.log("trying to initialize items");
			try {
				MMLog.log("Initializing items");
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
		ItemMain = new ItemMain();
		GameRegistry.registerItem(ItemMain, ItemRef.ITEM_NAME);
	}
	
}

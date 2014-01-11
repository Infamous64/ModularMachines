package com.infamous.mm.items;

import com.infamous.mm.lib.ItemRef;

public class BaseItem {

	public void init(int dmg, String unlocalizedName){
		ItemRef.itemDamages.put(unlocalizedName, dmg);
		ItemRef.itemUnlocalizedNames.put(dmg, unlocalizedName);
	}
	
}

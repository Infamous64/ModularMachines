package com.infamous.mm.items;

import com.infamous.mm.lib.ItemRef;

public class BaseShard extends BaseItem {

	public void init(int dmg, String unlocalizedName){
		super.init(dmg, unlocalizedName);
		ItemRef.shardNames.put(dmg, unlocalizedName);
	}
	
}

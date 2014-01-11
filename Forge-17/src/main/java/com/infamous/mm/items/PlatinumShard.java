package com.infamous.mm.items;

public class PlatinumShard extends BaseShard {
	private int dmg = 1;
	private String unlocalizedName = "platinumShard";
	
	
	public void initialize(){
		super.init(dmg, unlocalizedName);
	}
	
}

package com.infamous.mm.items;

public class TelluriumShard extends BaseShard {
	private int dmg = 0;
	private String unlocalizedName = "telluriumShard";
	
	
	public void initialize(){
		super.init(dmg, unlocalizedName);
	}
	
}

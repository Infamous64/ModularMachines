package com.infamous.mm.items;

public class SeleniumShard extends BaseShard {
	private int dmg = 4;
	private String unlocalizedName = "seleniumShard";
	
	
	public void initialize(){
		super.init(dmg, unlocalizedName);
	}
	
}

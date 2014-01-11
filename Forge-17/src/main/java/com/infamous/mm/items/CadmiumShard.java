package com.infamous.mm.items;

public class CadmiumShard extends BaseShard {
	private int dmg = 2;
	private String unlocalizedName = "cadmiumShard";
	
	
	public void initialize(){
		super.init(dmg, unlocalizedName);
	}
	
}

package com.infamous.mm.items;

public class IndiumShard extends BaseShard {
	private int dmg = 3;
	private String unlocalizedName = "indiumShard";
	
	public void initialize(){
		super.init(dmg, unlocalizedName);
	}
	
}

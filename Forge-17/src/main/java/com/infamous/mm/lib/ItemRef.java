package com.infamous.mm.lib;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.util.IIcon;

public class ItemRef {
	
	public static final String ITEM_NAME = "ItemMain";
	
	public static Map<String, Integer> itemDamages = new HashMap<String, Integer>();
	public static Map<Integer, String> itemUnlocalizedNames = new HashMap<Integer, String>();
	public static Map<Integer, Object> subClasses = new HashMap<Integer, Object>();
	public static Map<Integer, IIcon> itemIcons = new HashMap<Integer, IIcon>();
	public static Map<Integer, String> shardNames = new HashMap<Integer, String>();
	
	
}

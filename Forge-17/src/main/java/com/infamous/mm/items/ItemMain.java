package com.infamous.mm.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.infamous.mm.core.ModularMachines;
import com.infamous.mm.lib.ItemRef;
import com.infamous.mm.lib.Reference;

public class ItemMain extends Item {

	public ItemMain(){
		this.setCreativeTab(ModularMachines.tabMM);
		this.setHasSubtypes(true);
	}
	
	@Override
	public void registerIcons(IIconRegister register){
		for(int dmg=0; dmg < ItemRef.itemDamages.size(); dmg++){
			ItemRef.itemIcons.put(dmg, register.registerIcon(Reference.MOD_ID + ":" + ItemRef.itemUnlocalizedNames.get(dmg)));
		}
		
		
	}
	
	
	@Override
	public IIcon getIconFromDamage(int dmg){
		return ItemRef.itemIcons.get(dmg);
	}

	@Override
	public String getUnlocalizedName(ItemStack item){
		return "item." + ItemRef.itemUnlocalizedNames.get(item.getItemDamage());
	}
	@Override
	public void func_150895_a(Item item, CreativeTabs tab, List list){
		for(int i = 0; i < ItemRef.itemDamages.size();i++){
			list.add(new ItemStack(this, 1, i));
		}
	}
	
	
}

package com.infamous.mm.core;

import net.minecraft.creativetab.CreativeTabs;

import com.infamous.mm.CreativeTabs.CreativeTabMM;
import com.infamous.mm.blocks.Blocks;
import com.infamous.mm.core.config.ConfigHandler;
import com.infamous.mm.core.proxy.CommonProxy;
import com.infamous.mm.items.Items;
import com.infamous.mm.lib.Reference;
import com.infamous.mm.recipes.Recipes;
import com.infamous.mm.te.TileEntityContainerNonOpaque;
import com.infamous.mm.world.GenerationHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;



@Mod(modid = Reference.MOD_ID, version = Reference.VERSION)
public class ModularMachines {

	@Instance(value = Reference.MOD_ID)
    public static ModularMachines instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY, serverSide=Reference.SERVER_PROXY)
    public static CommonProxy proxy;
	
	public static CreativeTabs tabMM = new CreativeTabMM(CreativeTabs.getNextID());

	GenerationHandler worldgen = new GenerationHandler();
	
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event){
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		Items.init();
		Blocks.init();
        proxy.initRenderers();
		GameRegistry.registerTileEntity(TileEntityContainerNonOpaque.class, "tileEntityMain");
        GameRegistry.registerWorldGenerator(worldgen, 1);
        Recipes.init();
        NetworkRegistry.INSTANCE.registerGuiHandler(this, proxy);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){

        
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event){
		
	}
	
	
}

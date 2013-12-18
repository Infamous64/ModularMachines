package com.infamous.mm.core;

import net.minecraft.creativetab.CreativeTabs;

import com.infamous.mm.CreativeTabs.CreativeTabMM;
import com.infamous.mm.blocks.Blocks;
import com.infamous.mm.core.config.ConfigHandler;
import com.infamous.mm.core.lib.Ref;
import com.infamous.mm.core.network.PacketHandler;
import com.infamous.mm.core.proxy.CommonProxy;
import com.infamous.mm.tile_entities.TileEntityMain;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid=Ref.MOD_ID, name=Ref.MOD_NAME, version=Ref.MOD_VERSION)
@NetworkMod(channels = {Ref.CHANNEL}, packetHandler = PacketHandler.class, serverSideRequired = false, clientSideRequired=true)
public class ModularMachines {

        @Instance(value = Ref.MOD_ID)
        public static ModularMachines instance;
       
        @SidedProxy(clientSide=Ref.CLIENT_PROXY, serverSide=Ref.SERVER_PROXY)
        public static CommonProxy proxy;

        public static CreativeTabs tabMM = new CreativeTabMM(CreativeTabs.getNextID(),Ref.MOD_NAME);
        
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                ConfigHandler.init(event.getSuggestedConfigurationFile());
                Blocks.init();
        		proxy.initSounds();
        		
        }
       
        @EventHandler 
        public void load(FMLInitializationEvent event) {
        	LanguageRegistry.instance().addStringLocalization("itemGroup."+Ref.MOD_NAME, "en_US",Ref.MOD_NAME);
            proxy.initRenderers();
            GameRegistry.registerTileEntity(TileEntityMain.class, "tileEntityMain");
        }
       
        @EventHandler 
        public void postInit(FMLPostInitializationEvent event) {
                
        }
}
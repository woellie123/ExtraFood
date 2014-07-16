package com.woellie123.ExtraFood;

import com.woellie123.ExtraFood.handler.ConfigurationHandler;
import com.woellie123.ExtraFood.proxy.IProxy;
import com.woellie123.ExtraFood.reference.Reference;
import com.woellie123.ExtraFood.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class ExtraFood
{
    @Mod.Instance("ExtraFood")
    public static ExtraFood instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        LogHelper.info("PreInitialization complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization complete!");
    }

    @Mod.EventHandler
    public void preInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("PostInitialization complete!");
    }
}

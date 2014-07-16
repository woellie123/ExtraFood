package com.woellie123.ExtraFood.handler;

import com.woellie123.ExtraFood.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{//testing if this works now
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        //                                    //name        //category                      //default //text
        testValue = configuration.getBoolean("configValue", configuration.CATEGORY_GENERAL, false, "This is an example configuration value");

        if (configuration.hasChanged())
            configuration.save();
    }
}

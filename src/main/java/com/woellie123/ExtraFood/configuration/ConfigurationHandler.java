package com.woellie123.ExtraFood.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try
        {
            configuration.load();

            //                              //category                      //name        //default //text                                  //default
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
        }
        catch (Exception ex)
        {

        }
        finally
        {
            configuration.save();
        }
    }
}

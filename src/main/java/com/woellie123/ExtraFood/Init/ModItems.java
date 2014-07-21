package com.woellie123.ExtraFood.Init;

import com.woellie123.ExtraFood.item.ItemExtraFood;
import com.woellie123.ExtraFood.item.ItemTestItem;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemExtraFood testItem = new ItemTestItem();

    public static void init()
    {
        GameRegistry.registerItem(testItem, "testItem");
    }
}

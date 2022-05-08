package com.craftyryte.item;

import com.craftyryte.item.custom.DowsingRod;
import com.craftyryte.modoffirst.ModOfFirst;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item CHEESE = registerItem("cheese",
            new Item(new FabricItemSettings().group(ItemGroup.DECORATIONS)));

    public static final Item SPICE = registerItem("spice",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRod(new FabricItemSettings().group(ItemGroup.COMBAT)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ModOfFirst.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ModOfFirst.LOGGER.info("Registering Mod Items For " + ModOfFirst.MOD_ID);
    }
}

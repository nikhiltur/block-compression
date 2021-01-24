package com.d3rpym00.blockCompression.registry;

import com.d3rpym00.blockCompression.blockCompression;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    
    public static final Item COMPRESSED_DIRT = new Item(new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_dirt"), COMPRESSED_DIRT);
    }
}

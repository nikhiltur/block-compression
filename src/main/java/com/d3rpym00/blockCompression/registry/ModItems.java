package com.d3rpym00.blockCompression.registry;

import com.d3rpym00.blockCompression.blockCompression;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    
    // Block Items
    public static final BlockItem COMPRESSED_DIRT = new BlockItem(ModBlocks.COMPRESSED_DIRT, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem COMPRESSED_COBBLESTONE = new BlockItem(ModBlocks.COMPRESSED_COBBLESTONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_dirt"), COMPRESSED_DIRT);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_cobblestone"), COMPRESSED_COBBLESTONE);

    }
}

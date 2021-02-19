package com.d3rpym00.blockCompression.registry;

import com.d3rpym00.blockCompression.blockCompression;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    
    // Block Items
    public static final BlockItem COMPRESSED_DIRT = new BlockItem(ModBlocks.COMPRESSED_DIRT, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem COMPRESSED_COBBLESTONE = new BlockItem(ModBlocks.COMPRESSED_COBBLESTONE, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem COMPRESSED_GRAVEL = new BlockItem(ModBlocks.COMPRESSED_GRAVEL, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem COMPRESSED_SAND = new BlockItem(ModBlocks.COMPRESSED_SAND, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem COMPRESSED_DIORITE = new BlockItem(ModBlocks.COMPRESSED_DIORITE, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem COMPRESSED_ANDESITE = new BlockItem(ModBlocks.COMPRESSED_ANDESITE, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem COMPRESSED_GRANITE = new BlockItem(ModBlocks.COMPRESSED_GRANITE, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem COMPRESSED_NETHERRACK = new BlockItem(ModBlocks.COMPRESSED_NETHERRACK, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem BAMBOO_BLOCK = new BlockItem(ModBlocks.BAMBOO_BLOCK, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem COMPRESSED_COAL_BLOCK = new BlockItem(ModBlocks.COMPRESSED_COAL_BLOCK, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem SUGARCANE_BLOCK = new BlockItem(ModBlocks.SUGARCANE_BLOCK, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem STICKY_SILK_BLOCK = new BlockItem(ModBlocks.STICKY_SILK_BLOCK, new Item.Settings().group(blockCompression.ITEM_GROUP));
    public static final BlockItem COMPRESSED_STONE = new BlockItem(ModBlocks.COMPRESSED_STONE, new Item.Settings().group(blockCompression.ITEM_GROUP));
    
    public static void registerItems() {
        // Item Registry
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_dirt"), COMPRESSED_DIRT);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_cobblestone"), COMPRESSED_COBBLESTONE);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_gravel"), COMPRESSED_GRAVEL);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_sand"), COMPRESSED_SAND);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_diorite"), COMPRESSED_DIORITE);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_andesite"), COMPRESSED_ANDESITE);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_granite"), COMPRESSED_GRANITE);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_netherrack"), COMPRESSED_NETHERRACK);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "bamboo_block"), BAMBOO_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_coal_block"), COMPRESSED_COAL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "sugarcane_block"), SUGARCANE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "sticky_silk_block"), STICKY_SILK_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(blockCompression.MOD_ID, "compressed_stone"), COMPRESSED_STONE);
    }
}

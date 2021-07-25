package com.d3rpym00.blockCompression.registry;

import com.d3rpym00.blockCompression.blockCompression;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    
    // Single compressed
    public static final Block COMPRESSED_DIRT = new Block(FabricBlockSettings
        .of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.SHOVELS).requiresTool().strength(1.0f, 5.0f).sounds(BlockSoundGroup.GRAVEL));
    public static final Block COMPRESSED_COBBLESTONE = new Block(FabricBlockSettings
        .of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(4.0f, 12.0f).sounds(BlockSoundGroup.STONE));
    public static final Block COMPRESSED_GRAVEL = new Block(FabricBlockSettings
        .of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.SHOVELS).requiresTool().strength(1.0f, 5.0f).sounds(BlockSoundGroup.GRAVEL));
    public static final Block COMPRESSED_SAND = new Block(FabricBlockSettings
        .of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.SHOVELS).requiresTool().strength(1.0f, 1.2f).sounds(BlockSoundGroup.GRAVEL));
    public static final Block COMPRESSED_DIORITE = new Block(FabricBlockSettings
        .of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool().strength(4.0f, 12.0f).sounds(BlockSoundGroup.STONE));
    public static final Block COMPRESSED_ANDESITE = new Block(FabricBlockSettings
        .of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool().strength(4.0f, 12.0f).sounds(BlockSoundGroup.STONE));
    public static final Block COMPRESSED_GRANITE = new Block(FabricBlockSettings
        .of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool().strength(4.0f, 12.0f).sounds(BlockSoundGroup.STONE));
    public static final Block COMPRESSED_NETHERRACK = new Block(FabricBlockSettings
        .of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool().strength(0.8f, 0.8f).sounds(BlockSoundGroup.NETHERRACK));
    public static final Block BAMBOO_BLOCK = new Block(FabricBlockSettings
        .of(Material.BAMBOO).breakByTool(FabricToolTags.AXES).requiresTool().strength(4.0f, 4.0f).sounds(BlockSoundGroup.BAMBOO));
    public static final Block COMPRESSED_COAL_BLOCK = new Block(FabricBlockSettings
        .of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool().strength(6.0f, 12.0f).sounds(BlockSoundGroup.STONE));
    public static final Block SUGARCANE_BLOCK = new Block(FabricBlockSettings
        .of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.HOES).strength(0.5f, 0.0f).sounds(BlockSoundGroup.GRASS));
    // public static final Block STICKY_SILK_BLOCK = new Block(FabricBlockSettings
    //     .of(Material.SOLID_ORGANIC).breakByHand(true).strength(0.25f, 0.0f).sounds(BlockSoundGroup.SLIME));
    public static final Block COMPRESSED_STONE = new Block(FabricBlockSettings
        .of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool().strength(4.0f, 12.0f).sounds(BlockSoundGroup.STONE));

    // Double compressed
    public static final Block COMPRESSED_DIRT_x2 = new Block(FabricBlockSettings
        .of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.SHOVELS).requiresTool().strength(2.0f, 10.0f).sounds(BlockSoundGroup.GRAVEL));
    public static final Block COMPRESSED_COBBLESTONE_x2 = new Block(FabricBlockSettings
        .of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(8.0f, 12.0f).sounds(BlockSoundGroup.STONE));
    public static final Block COMPRESSED_GRAVEL_x2 = new Block(FabricBlockSettings
        .of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.SHOVELS).requiresTool().strength(2.0f, 10.0f).sounds(BlockSoundGroup.GRAVEL));
    public static final Block COMPRESSED_SAND_x2 = new Block(FabricBlockSettings
        .of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.SHOVELS).requiresTool().strength(2.0f, 2.4f).sounds(BlockSoundGroup.GRAVEL));
    public static final Block COMPRESSED_DIORITE_x2 = new Block(FabricBlockSettings
        .of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool().strength(8.0f, 24.0f).sounds(BlockSoundGroup.STONE));
    public static final Block COMPRESSED_ANDESITE_x2 = new Block(FabricBlockSettings
        .of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool().strength(8.0f, 24.0f).sounds(BlockSoundGroup.STONE));
    public static final Block COMPRESSED_GRANITE_x2 = new Block(FabricBlockSettings
        .of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool().strength(8.0f, 24.0f).sounds(BlockSoundGroup.STONE));
    public static final Block COMPRESSED_NETHERRACK_x2 = new Block(FabricBlockSettings
        .of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool().strength(1.6f, 1.6f).sounds(BlockSoundGroup.NETHERRACK));
    public static final Block BAMBOO_BLOCK_x2 = new Block(FabricBlockSettings
        .of(Material.BAMBOO).breakByTool(FabricToolTags.AXES).requiresTool().strength(8.0f, 8.0f).sounds(BlockSoundGroup.BAMBOO));
    public static final Block COMPRESSED_COAL_BLOCK_x2 = new Block(FabricBlockSettings
        .of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool().strength(12.0f, 24.0f).sounds(BlockSoundGroup.STONE));
    public static final Block SUGARCANE_BLOCK_x2 = new Block(FabricBlockSettings
        .of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.HOES).strength(1.0f, 0.0f).sounds(BlockSoundGroup.GRASS));
    // public static final Block STICKY_SILK_BLOCK_x2 = new Block(FabricBlockSettings
    //     .of(Material.SOLID_ORGANIC).breakByHand(true).strength(0.5f, 0.0f).sounds(BlockSoundGroup.SLIME));
    public static final Block COMPRESSED_STONE_x2 = new Block(FabricBlockSettings
        .of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool().strength(8.0f, 24.0f).sounds(BlockSoundGroup.STONE));

    public static void registerBlocks() {
        // Block Registry
        
        // Single compressed
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_dirt"), COMPRESSED_DIRT);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_cobblestone"), COMPRESSED_COBBLESTONE);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_gravel"), COMPRESSED_GRAVEL);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_sand"), COMPRESSED_SAND);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_diorite"), COMPRESSED_DIORITE);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_andesite"), COMPRESSED_ANDESITE);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_granite"), COMPRESSED_GRANITE);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_netherrack"), COMPRESSED_NETHERRACK);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "bamboo_block"), BAMBOO_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_coal_block"), COMPRESSED_COAL_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "sugarcane_block"), SUGARCANE_BLOCK);
        // Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "sticky_silk_block"), STICKY_SILK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_stone"), COMPRESSED_STONE);

        // Double compressed
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_dirt_x2"), COMPRESSED_DIRT_x2);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_cobblestone_x2"), COMPRESSED_COBBLESTONE_x2);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_gravel_x2"), COMPRESSED_GRAVEL_x2);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_sand_x2"), COMPRESSED_SAND_x2);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_diorite_x2"), COMPRESSED_DIORITE_x2);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_andesite_x2"), COMPRESSED_ANDESITE_x2);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_granite_x2"), COMPRESSED_GRANITE_x2);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_netherrack_x2"), COMPRESSED_NETHERRACK_x2);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "bamboo_block_x2"), BAMBOO_BLOCK_x2);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_coal_block_x2"), COMPRESSED_COAL_BLOCK_x2);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "sugarcane_block_x2"), SUGARCANE_BLOCK_x2);
        // Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "sticky_silk_block_x2"), STICKY_SILK_BLOCK_x2);
        Registry.register(Registry.BLOCK, new Identifier(blockCompression.MOD_ID, "compressed_stone_x2"), COMPRESSED_STONE_x2);
        
        // Fuel Registry
        FuelRegistry.INSTANCE.add(BAMBOO_BLOCK, 600);
        FuelRegistry.INSTANCE.add(COMPRESSED_COAL_BLOCK, 20000);
    }
    
}

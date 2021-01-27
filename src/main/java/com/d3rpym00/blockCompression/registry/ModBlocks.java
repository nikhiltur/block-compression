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

    public static void registerBlocks() {
        // Block Registry
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
        
        // Fuel Registry
        FuelRegistry.INSTANCE.add(BAMBOO_BLOCK, 600);
        FuelRegistry.INSTANCE.add(COMPRESSED_COAL_BLOCK, 20000);
    }
    
}

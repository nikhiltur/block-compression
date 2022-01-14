package com.d3rpym00.blockCompression;

import com.d3rpym00.blockCompression.registry.ModBlocks;
import com.d3rpym00.blockCompression.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class blockCompression implements ModInitializer {

    public static final String MOD_ID = "blockcompression";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
        new Identifier(MOD_ID, "general"),
        () -> new ItemStack(ModBlocks.COMPRESSED_COBBLESTONE)
    );
    public static final Tag<Block> EXAMPLE_ORES = TagFactory.BLOCK.create(new Identifier("blockcompression", "pickaxe"));

	@Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}

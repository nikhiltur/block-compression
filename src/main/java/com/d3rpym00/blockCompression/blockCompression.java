package com.d3rpym00.blockCompression;

import com.d3rpym00.blockCompression.registry.ModBlocks;
import com.d3rpym00.blockCompression.registry.ModItems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class blockCompression implements ModInitializer {

    public static final String MOD_ID = "blockcompression";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
        new Identifier(MOD_ID, "general"),
        () -> new ItemStack(ModBlocks.COMPRESSED_COBBLESTONE)
    );

	@Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        
    }
    
}

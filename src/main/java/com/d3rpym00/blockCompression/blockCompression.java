package com.d3rpym00.blockCompression;

import com.d3rpym00.blockCompression.registry.ModBlocks;
import com.d3rpym00.blockCompression.registry.ModItems;

import net.fabricmc.api.ModInitializer;

public class blockCompression implements ModInitializer {

    public static final String MOD_ID = "blockcompression";

	@Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        
    }
    
}

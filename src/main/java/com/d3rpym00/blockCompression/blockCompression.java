package com.d3rpym00.blockCompression;

import net.fabricmc.api.ModInitializer;
import com.d3rpym00.blockCompression.registry.ModItems;
// import com.d3rpym00.blockCompression.registry.ModBlocks;

public class blockCompression implements ModInitializer {

    public static final String MOD_ID = "block_compression";

	@Override
    public void onInitialize() {
        ModItems.registerItems();
        
    }
    
}

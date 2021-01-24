package com.d3rpym00.blockCompression;

import net.fabricmc.api.ModInitializer;
import com.d3rpym00.blockCompression.registry.ModItems;

public class blockCompression implements ModInitializer{

    public static final String MOD_ID = null;

	@Override
    public void onInitialize() {
        ModItems.registerItems();
        
    }
    
}

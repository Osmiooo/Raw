package com.osmiooo.raw;

import com.osmiooo.raw.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Raw implements ModInitializer {

    public static final String MOD_ID = "raw";

    @Override
    public void onInitialize() {

        ModItems.registerItems();
    }
}

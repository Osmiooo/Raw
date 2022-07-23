package osmiooo.raw;

import osmiooo.raw.registry.RegisterBlocks;
import osmiooo.raw.registry.RegisterItems;
import net.fabricmc.api.ModInitializer;

public class Raw implements ModInitializer {

    public static final String MOD_ID = "raw";

    @Override
    public void onInitialize() {

        RegisterBlocks.registerBlocks();
        RegisterItems.registerItems();
    }
}
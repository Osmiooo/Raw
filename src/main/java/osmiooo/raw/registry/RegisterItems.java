package osmiooo.raw.registry;

import osmiooo.raw.Raw;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {

    public static final Item RAW_COAL = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item RAW_LAPIS = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item RAW_REDSTONE = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item RAW_DIAMOND = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item RAW_EMERALD = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Raw.MOD_ID,  "raw_coal"), RAW_COAL);
        Registry.register(Registry.ITEM, new Identifier(Raw.MOD_ID,  "raw_lapis"), RAW_LAPIS);
        Registry.register(Registry.ITEM, new Identifier(Raw.MOD_ID,  "raw_redstone"), RAW_REDSTONE);
        Registry.register(Registry.ITEM, new Identifier(Raw.MOD_ID,  "raw_diamond"), RAW_DIAMOND);
        Registry.register(Registry.ITEM, new Identifier(Raw.MOD_ID,  "raw_emerald"), RAW_EMERALD);
    }
}
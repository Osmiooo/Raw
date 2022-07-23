package osmiooo.raw.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import osmiooo.raw.Raw;

public class RegisterBlocks {

    public static final Block RAW_COAL_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(5f, 6f).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block RAW_LAPIS_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(5f, 6f).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block RAW_REDSTONE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(5f, 6f).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block RAW_DIAMOND_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(5f, 6f).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block RAW_EMERALD_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(5f, 6f).sounds(BlockSoundGroup.STONE).requiresTool());

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Raw.MOD_ID ,"raw_coal_block"), RAW_COAL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Raw.MOD_ID ,"raw_coal_block"), new BlockItem(RAW_COAL_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(Raw.MOD_ID ,"raw_lapis_block"), RAW_LAPIS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Raw.MOD_ID ,"raw_lapis_block"), new BlockItem(RAW_LAPIS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(Raw.MOD_ID ,"raw_redstone_block"), RAW_REDSTONE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Raw.MOD_ID ,"raw_redstone_block"), new BlockItem(RAW_REDSTONE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(Raw.MOD_ID ,"raw_diamond_block"), RAW_DIAMOND_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Raw.MOD_ID ,"raw_diamond_block"), new BlockItem(RAW_DIAMOND_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(Raw.MOD_ID ,"raw_emerald_block"), RAW_EMERALD_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Raw.MOD_ID ,"raw_emerald_block"), new BlockItem(RAW_EMERALD_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    }
}
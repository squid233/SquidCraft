package io.github.squid233.squidcraft.block;

import com.mojang.authlib.GameProfile;
import io.github.squid233.squidcraft.item.SettingsGroup;
import io.github.squid233.squidcraft.util.Identifier;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.UUID;

import static io.github.squid233.squidcraft.item.ItemGroups.SQUID_CRAFT;

/**
 * @author squid233
 * @date 2020/9/20
 */
public class Blocks {
    private static final HashMap<net.minecraft.util.Identifier, Block> MAP = new HashMap<>(20);
    private static final HashMap<net.minecraft.util.Identifier, Item> ITEM_MAP = new HashMap<>(20);

    public static final Block SQUID_BLOCK;
    public static final Block COMPRESS_SQUID_BLOCK;
    public static final Block LOW_SQUID_BLOCK;
    public static final Block LOW_COMPRESS_SQUID_BLOCK;
    public static final Block MEDIUM_SQUID_BLOCK;
    public static final Block MEDIUM_COMPRESS_SQUID_BLOCK;
    public static final Block HIGHER_SQUID_BLOCK;
    public static final Block HIGHER_COMPRESS_SQUID_BLOCK;
    public static final Block SUPER_SQUID_BLOCK;
    public static final Block SUPER_COMPRESS_SQUID_BLOCK;
    public static final Block ULTIMATE_SQUID_BLOCK;
    public static final Block ULTIMATE_COMPRESS_SQUID_BLOCK;
    public static final Block ONE_SQUID_BLOCK;
    public static final Block TWO_SQUID_BLOCK;
    public static final Block FOUR_SQUID_BLOCK;
    public static final Block EIGHT_SQUID_BLOCK;
    public static final Block SQUID_SIDE_BLOCK;
    public static final Block BIGGER_CHEST_BLOCK;
    public static final Block SOUL_JACK_O_LANTERN;
    public static final Block SHREDDED_SQUID_CROP;

    static {
        class FoodBlock extends io.github.squid233.squidcraft.block.FoodBlock {
            public FoodBlock(float hardness, int hunger, float saturation) {
                super(hardness, new SettingsGroup(SQUID_CRAFT), hunger, saturation);
            }

            public FoodBlock(float hardness, float resistance, int hunger, float saturation) {
                super(hardness, resistance, new SettingsGroup(SQUID_CRAFT), hunger, saturation);
            }
        }
        SQUID_BLOCK                   = regFood("squid_block",                   new FoodBlock(0.5f, 1000, 100));
        COMPRESS_SQUID_BLOCK          = regFood("compress_squid_block",          new FoodBlock(0.52f, 6000, 110));
        LOW_SQUID_BLOCK               = regFood("low_squid_block",               new FoodBlock(0.55f, 0.1f,  11000, 120));
        LOW_COMPRESS_SQUID_BLOCK      = regFood("low_compress_squid_block",      new FoodBlock(0.6f,  0.15f, 16000, 130));
        MEDIUM_SQUID_BLOCK            = regFood("medium_squid_block",            new FoodBlock(0.65f, 0.2f,  21000, 140));
        MEDIUM_COMPRESS_SQUID_BLOCK   = regFood("medium_compress_squid_block",   new FoodBlock(0.7f,  0.25f, 26000, 150));
        HIGHER_SQUID_BLOCK            = regFood("higher_squid_block",            new FoodBlock(0.75f, 0.3f,  31000, 160));
        HIGHER_COMPRESS_SQUID_BLOCK   = regFood("higher_compress_squid_block",   new FoodBlock(0.8f,  0.35f, 36000, 170));
        SUPER_SQUID_BLOCK             = regFood("super_squid_block",             new FoodBlock(0.85f, 0.4f,  41000, 180));
        SUPER_COMPRESS_SQUID_BLOCK    = regFood("super_compress_squid_block",    new FoodBlock(0.9f,  0.45f, 46000, 190));
        ULTIMATE_SQUID_BLOCK          = regFood("ultimate_squid_block",          new FoodBlock(0.95f, 0.5f,  51000, 200));
        ULTIMATE_COMPRESS_SQUID_BLOCK = regFood("ultimate_compress_squid_block", new FoodBlock(1,     0.55f, 56000, 210));
        ONE_SQUID_BLOCK               = regFood("one_squid_block",               new FoodBlock(1.5f,  0.6f,  61000, 220));
        TWO_SQUID_BLOCK               = regFood("two_squid_block",               new FoodBlock(2,     0.65f, 66000, 230));
        FOUR_SQUID_BLOCK              = regFood("four_squid_block",              new FoodBlock(2.5f,  0.7f,  71000, 240));
        EIGHT_SQUID_BLOCK             = regFood("eight_squid_block",             new FoodBlock(3,     0.75f, 76000, 250));
    }

    private static Block reg(String id, Block block, Item.Settings itemSettings, boolean hasItem) {
        MAP.put(new Identifier(id), block);
        if (hasItem) {
            ITEM_MAP.put(new Identifier(id), new BlockItem(block, itemSettings));
        }
        return block;
    }

    private static Block reg(String id, Block block, Item.Settings itemSettings) {
        return reg(id, block, itemSettings, true);
    }

    private static Block regFood(String id, FoodBlock foodBlock) {
        return reg(id, foodBlock, foodBlock.getItemSettings());
    }

    private static boolean initialized = false;
    public static void init() {
        if (!initialized) {
            initialized = true;
            MAP.forEach((identifier, block) -> Registry.register(Registry.BLOCK, identifier, block));
            ITEM_MAP.forEach((identifier, item) -> Registry.register(Registry.ITEM, identifier, item));
        }
    }
}

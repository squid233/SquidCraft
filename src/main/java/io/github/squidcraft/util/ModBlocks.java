package io.github.squidcraft.util;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.api.BlocksRegister;
import io.github.squidcraft.block.*;
import io.github.squidcraft.tile.BiggerChestBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class ModBlocks {
    public static final Block SQUID_BLOCK = new SquidBlock();
    public static final Block COMPRESS_SQUID_BLOCK = new CompressSquidBlock();
    public static final Block LOW_SQUID_BLOCK = new LowSquidBlock();

    public static final Block ANCIENT_DEBRIS = new AncientDebris();
    public static final Block NETHERITE_BLOCK = new NetheriteBlock();
    public static final Block LIGHT_PLANKS = new LightPlanks();

    public static final Identifier BIGGER_CHEST = new Identifier(SquidCraft.MODID, "bigger_chest_block");
    public static final Block BIGGER_CHEST_BLOCK = new BiggerChestBlock();
    public static final String BIGGER_CHEST_TRANSLATION_KEY = Util.createTranslationKey("container", BIGGER_CHEST);

    public static BlockEntityType<BiggerChestBlockEntity> BIGGER_CHEST_ENTITY_TYPE;

    public static void registerBlock(String blockName, Block block, Item.Settings settings) {
        BlocksRegister.registerBlock(SquidCraft.MODID, blockName, block, settings);
    }

}

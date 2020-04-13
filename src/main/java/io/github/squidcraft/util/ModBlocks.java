package io.github.squidcraft.util;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.api.BlocksRegister;
import io.github.squidcraft.block.AncientDebris;
import io.github.squidcraft.block.CompressSquidBlock;
import io.github.squidcraft.block.NetheriteBlock;
import io.github.squidcraft.block.SquidBlock;
import io.github.squidcraft.item.ItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class ModBlocks {
    public static final Block SQUID_BLOCK = new SquidBlock();
    public static final Block COMPRESS_SQUID_BLOCK = new CompressSquidBlock();
    public static final Block ANCIENT_DEBRIS = new AncientDebris();
    public static final Block NETHERITE_BLOCK = new NetheriteBlock();

    public ModBlocks() {
        registerBlock("squid_block", SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1458).saturationModifier(165.651f).meat().alwaysEdible().build()));
        registerBlock("compress_squid_block", COMPRESS_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(13122).saturationModifier(256.0f).meat().alwaysEdible().build()));

        registerBlock("ancient_debris", ANCIENT_DEBRIS, new Item.Settings().group(ItemGroups.SQUID_CRAFT));
        registerBlock("netherite_block", NETHERITE_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT));

    }

    private static void registerBlock(String blockName, Block block, Item.Settings settings) {
        BlocksRegister.registerBlock(SquidCraft.MODID, blockName, block, settings);
    }

}

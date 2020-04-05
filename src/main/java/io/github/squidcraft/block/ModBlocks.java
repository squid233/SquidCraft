package io.github.squidcraft.block;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.api.BlocksRegister;
import io.github.squidcraft.item.ItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class ModBlocks {
    public static final Block SQUID_BLOCK = new SquidBlock();
    public static final Block ANCIENT_DEBRIS = new AncientDebris();
    public static final Block NETHERITE_BLOCK = new NetheriteBlock();

    public ModBlocks() {
        registerBlock("squid_block", SQUID_BLOCK, new BlockItem(SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1458).saturationModifier(2.43576819f).meat().alwaysEdible().build())));
        registerBlock("ancient_debris", ANCIENT_DEBRIS, new BlockItem(ANCIENT_DEBRIS, new Item.Settings().group(ItemGroups.SQUID_CRAFT)));
        registerBlock("netherite_block", NETHERITE_BLOCK, new BlockItem(NETHERITE_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT)));

    }

    private static void registerBlock(String blockName, Block block, BlockItem blockItem) {
        BlocksRegister.registerBlock(SquidCraft.MODID, blockName, blockName, block, blockItem);
    }

}

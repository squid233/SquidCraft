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

    public ModBlocks() {

        registerBlock("squid_block",
                "squid_block",
                SQUID_BLOCK,
                new BlockItem(SQUID_BLOCK,
                        new Item.Settings()
                                .group(ItemGroups.SQUID_CRAFT)
                                .food(new FoodComponent.Builder()
                                        .hunger(1458)
                                        .saturationModifier(1.8287103012f)
                                        .meat().build())));
    }

    public static void registerBlock(String blockName, String blockItemName, Block block, BlockItem blockItem) {
        BlocksRegister.registerBlock(SquidCraft.MODID, blockName, blockItemName, block, blockItem);
    }
}

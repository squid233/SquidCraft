package io.github.squidcraft.util.registers;

import io.github.squidcraft.item.ItemGroups;
import io.github.squidcraft.util.ModBlocks;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class BlockRegister extends ModBlocks {
    public BlockRegister() {
        registerBlock("squid_block", SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1458).saturationModifier(165.651f).meat().alwaysEdible().build()));
        registerBlock("compress_squid_block", COMPRESS_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(13122).saturationModifier(256.0f).meat().alwaysEdible().build()));

        registerBlock("ancient_debris", ANCIENT_DEBRIS, new Item.Settings().group(ItemGroups.SQUID_CRAFT));
        registerBlock("netherite_block", NETHERITE_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT));

    }
}

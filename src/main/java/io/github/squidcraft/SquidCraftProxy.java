package io.github.squidcraft;

import io.github.squidcraft.biome.ModBiomes;
import io.github.squidcraft.block.ModBlocks;
import io.github.squidcraft.enchantment.EnchantmentRegister;
import io.github.squidcraft.feature.FeatureRegister;
import io.github.squidcraft.handle.LootTablesHandle;
import io.github.squidcraft.item.ModItems;

public class SquidCraftProxy {
    public SquidCraftProxy() {
        new ModItems();
        new ModBlocks();
        new EnchantmentRegister();
        new FeatureRegister();
        new ModBiomes();
        new LootTablesHandle();
    }
}
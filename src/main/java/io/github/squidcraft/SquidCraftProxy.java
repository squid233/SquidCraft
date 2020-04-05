package io.github.squidcraft;

import io.github.squidcraft.biome.ModBiomes;
import io.github.squidcraft.block.ModBlocks;
import io.github.squidcraft.enchantment.EnchantmentRegister;
import io.github.squidcraft.feature.FeatureRegister;
import io.github.squidcraft.handle.LootTablesHandle;
import io.github.squidcraft.item.ModItems;
import io.github.squidcraft.util.ModSounds;

public class SquidCraftProxy {
    public SquidCraftProxy() {
        new ModItems();
        new ModBlocks();
        new ModSounds();
        new EnchantmentRegister();
        new FeatureRegister();
        new ModBiomes();
        new LootTablesHandle();
    }
}
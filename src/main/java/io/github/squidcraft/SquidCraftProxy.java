package io.github.squidcraft;

import io.github.squidcraft.world.biome.ModBiomes;
import io.github.squidcraft.block.ModBlocks;
import io.github.squidcraft.enchantment.EnchantmentRegister;
import io.github.squidcraft.world.feature.FeatureRegister;
import io.github.squidcraft.handle.LootTablesHandle;
import io.github.squidcraft.item.ModItems;
import io.github.squidcraft.util.ModSounds;

public class SquidCraftProxy {
    public SquidCraftProxy() {
        // items registry
        new ModItems();
        // blocks registry
        new ModBlocks();
        // sounds registry
        new ModSounds();
        // enchanting registry
        new EnchantmentRegister();
        // feature registry
        new FeatureRegister();
        // biomes registry
        new ModBiomes();
        // loot_table registry handler
        new LootTablesHandle();
    }
}
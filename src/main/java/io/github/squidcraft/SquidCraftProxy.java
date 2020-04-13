package io.github.squidcraft;

import io.github.squidcraft.util.ModBiomes;
import io.github.squidcraft.util.ModBlocks;
import io.github.squidcraft.util.ModEnchantments;
import io.github.squidcraft.world.feature.FeatureRegister;
import io.github.squidcraft.handle.LootTablesHandle;
import io.github.squidcraft.util.*;

public class SquidCraftProxy {
    public SquidCraftProxy() {
        // items registry
        new ModItems();
        // blocks registry
        new ModBlocks();
        // sounds registry
        new ModSounds();
        // enchantments registry
        new ModEnchantments();
        // feature registry
        new FeatureRegister();
        // biomes registry
        new ModBiomes();
        // loot table registry handler
        new LootTablesHandle();
    }
}
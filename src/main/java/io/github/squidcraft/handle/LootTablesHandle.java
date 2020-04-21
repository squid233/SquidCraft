package io.github.squidcraft.handle;

import io.github.squidcraft.util.*;
import io.github.squidcraft.util.registers.BlockRegister;
import io.github.squidcraft.util.registers.ItemRegister;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.UniformLootTableRange;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.LootingEnchantLootFunction;
import net.minecraft.util.Identifier;

public class LootTablesHandle {
    private static final Identifier SQUID_LOOT_TABLE_ID = new Identifier("minecraft", "entities/squid");
    private static final Identifier CHESTS_LOOT_TABLE_ID = new Identifier("minecraft", "chests/spawn_bonus_chest");

    public LootTablesHandle() {
        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (SQUID_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .withRolls(ConstantLootTableRange.create(8))
                        .withEntry(ItemEntry.builder(ItemRegister.SHREDDED_SQUID))
                        .withFunction(LootingEnchantLootFunction.builder(UniformLootTableRange.between(0.0f, 1.0f)));
                supplier.withPool(poolBuilder);
            }
        });

    }
}

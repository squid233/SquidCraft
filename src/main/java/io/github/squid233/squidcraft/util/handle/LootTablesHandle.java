package io.github.squid233.squidcraft.util.handle;

import io.github.squid233.squidcraft.util.registers.ItemRegister;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.*;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.LootingEnchantLootFunction;
import net.minecraft.util.Identifier;

public class LootTablesHandle {
    private static final Identifier SQUID_LOOT_TABLE_ID = new Identifier("minecraft", "entities/squid");
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

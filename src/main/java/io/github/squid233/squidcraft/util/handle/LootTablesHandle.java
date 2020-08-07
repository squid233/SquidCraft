package io.github.squid233.squidcraft.util.handle;

import io.github.squid233.squidcraft.util.register.ItemRegister;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

public class LootTablesHandle {
    private static final Identifier SQUID_LOOT_TABLE_ID = new Identifier("minecraft", "entities/squid");
    public LootTablesHandle() {
        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (SQUID_LOOT_TABLE_ID.equals(id)) {
                LootPool poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(8))
                        .withEntry(ItemEntry.builder(ItemRegister.SHREDDED_SQUID).build())
                        .build();
                supplier.withPool(poolBuilder);
            }
        });

    }
}

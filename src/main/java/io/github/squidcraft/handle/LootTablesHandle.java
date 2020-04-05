package io.github.squidcraft.handle;

import io.github.squidcraft.item.ModItems;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

public class LootTablesHandle {
    private static final Identifier SQUID_LOOT_TABLE_ID = new Identifier("minecraft", "entities/squid");

    public LootTablesHandle() {
        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (SQUID_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .withRolls(ConstantLootTableRange.create(8))
                        .withEntry(ItemEntry.builder(ModItems.SHREDDED_SQUID));
                supplier.withPool(poolBuilder);
            }
        });
    }
}

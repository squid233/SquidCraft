package io.github.squidcraft.util.registers;

import io.github.squidcraft.item.ItemGroups;
import io.github.squidcraft.tile.BiggerChestBlockEntity;
import net.fabricmc.fabric.api.container.ContainerProviderRegistry;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static io.github.squidcraft.util.ModBlocks.*;
import static io.github.squidcraft.api.BlocksRegister.*;

public class BlockRegister {
    public BlockRegister() {
        registerBlock("squid_block", SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1458).saturationModifier(165.651f).meat().alwaysEdible().build()));
        registerBlock("compress_squid_block", COMPRESS_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(13122).saturationModifier(256.0f).meat().alwaysEdible().build()));
        registerBlock("low_squid_block", LOW_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(118098).saturationModifier(512.0f).meat().alwaysEdible().build()));


        registerBlock("ancient_debris", ANCIENT_DEBRIS, new Item.Settings().group(ItemGroups.SQUID_CRAFT));
        registerBlock("netherite_block", NETHERITE_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT));

        registerBlock("light_planks", LIGHT_PLANKS, new Item.Settings().group(ItemGroups.SQUID_CRAFT));

        registerBlock(BIGGER_CHEST, BIGGER_CHEST_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT));
        BIGGER_CHEST_ENTITY_TYPE = Registry.register(Registry.BLOCK_ENTITY_TYPE, BIGGER_CHEST, BlockEntityType.Builder.create(BiggerChestBlockEntity::new, BIGGER_CHEST_BLOCK).build(null));
        ContainerProviderRegistry.INSTANCE.registerFactory(BIGGER_CHEST, ((syncId, identifier, player, buf) -> {
            final BlockEntity blockEntity = player.world.getBlockEntity(buf.readBlockPos());
            return ((BiggerChestBlockEntity) blockEntity).createContainer(syncId, player.inventory);
        }));

    }
}

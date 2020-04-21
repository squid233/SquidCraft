package io.github.squidcraft.util.registers;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.api.BlocksRegister;
import io.github.squidcraft.block.*;
import io.github.squidcraft.item.ItemGroups;
import io.github.squidcraft.tile.BiggerChestBlockEntity;
import net.fabricmc.fabric.api.container.ContainerProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BlockRegister {
    public static final Block SQUID_BLOCK = new SquidBlock();
    public static final Block COMPRESS_SQUID_BLOCK = new CompressSquidBlock();
    public static final Block LOW_SQUID_BLOCK = new LowSquidBlock();
    public static final Block LOW_COMPRESS_SQUID_BLOCK = new LowCompressSquidBlock();

    public static final Block ANCIENT_DEBRIS = new AncientDebris();
    public static final Block NETHERITE_BLOCK = new NetheriteBlock();

    public static final Identifier BIGGER_CHEST = new Identifier(SquidCraft.MODID, "bigger_chest_block");
    public static final Block BIGGER_CHEST_BLOCK = new BiggerChestBlock();
    public static final String BIGGER_CHEST_TRANSLATION_KEY = Util.createTranslationKey("container", BIGGER_CHEST);

    public static BlockEntityType<BiggerChestBlockEntity> BIGGER_CHEST_ENTITY_TYPE;

    public BlockRegister() {
        registerBlock("squid_block", SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1458).saturationModifier(165.651f).meat().alwaysEdible().build()));
        registerBlock("compress_squid_block", COMPRESS_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(13122).saturationModifier(256.0f).meat().alwaysEdible().build()));
        registerBlock("low_squid_block", LOW_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(118098).saturationModifier(512.0f).meat().alwaysEdible().build()));
        registerBlock("low_compress_squid_block", LOW_COMPRESS_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1062882).saturationModifier(1024.0f).meat().alwaysEdible().build()));


        registerBlock("ancient_debris", ANCIENT_DEBRIS, new Item.Settings().group(ItemGroups.SQUID_CRAFT));
        registerBlock("netherite_block", NETHERITE_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT));

        registerContainer(BIGGER_CHEST, BIGGER_CHEST_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT));
        BIGGER_CHEST_ENTITY_TYPE = Registry.register(Registry.BLOCK_ENTITY_TYPE, BIGGER_CHEST, BlockEntityType.Builder.create(BiggerChestBlockEntity::new, BIGGER_CHEST_BLOCK).build(null));
        ContainerProviderRegistry.INSTANCE.registerFactory(BIGGER_CHEST, ((syncId, identifier, player, buf) -> {
            final BlockEntity blockEntity = player.world.getBlockEntity(buf.readBlockPos());
            return ((BiggerChestBlockEntity) blockEntity).createContainer(syncId, player.inventory);
        }));

    }

    public void registerBlock(String blockName, Block block, Item.Settings settings) {
        Logger logger = LogManager.getLogger("register block and block item");
        Registry.register(Registry.BLOCK, new Identifier(SquidCraft.MODID, blockName), block);
        logger.info("register " + blockName + " block");
        Registry.register(Registry.ITEM, new Identifier(SquidCraft.MODID, blockName), new BlockItem(block, settings));
        logger.info("register " + blockName + "block info item");
    }

    public static void registerContainer(Identifier id, Block block, Item.Settings settings) {
        Logger logger = LogManager.getLogger("register container");
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, settings));
        logger.info("register container");
    }
}

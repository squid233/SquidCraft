package io.github.squid233.squidcraft.util.registers;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.api.BlockRegisters;
import io.github.squid233.squidcraft.api.ItemRegisters;
import io.github.squid233.squidcraft.block.*;
import io.github.squid233.squidcraft.block.msb.Eight;
import io.github.squid233.squidcraft.block.msb.Four;
import io.github.squid233.squidcraft.block.msb.One;
import io.github.squid233.squidcraft.block.msb.Two;
import io.github.squid233.squidcraft.block.tile.BiggerChestBlockEntity;
import io.github.squid233.squidcraft.item.ItemGroups;
import net.fabricmc.fabric.api.container.ContainerProviderRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.registry.Registry;

import static io.github.squid233.squidcraft.SquidCraft.log;

/**
 * You always register block, add {@link ItemGroups}, add lang, add blockstates, add models, add textures, add loot tables and add recipes.
 */
public class BlockRegister {

    private static Block register(String name, Block block, BlockItem item) {
        String s = "register block and block item";
        ItemRegisters.register(SquidCraft.MODID, name, item);
        log(s, "register " + SquidCraft.MODID + ":" + name + " block success!");
        return Registry.register(Registry.BLOCK, new Identifier(SquidCraft.MODID, name), block);
    }
    private static Block register(String name, Block block, Item.Settings settings) {
        return BlockRegisters.register(SquidCraft.MODID, name, block, settings);
    }

    public static final Block

            SQUID_BLOCK, COMPRESS_SQUID_BLOCK, LOW_SQUID_BLOCK, LOW_COMPRESS_SQUID_BLOCK,
            MEDIUM_SQUID_BLOCK, MEDIUM_COMPRESS_SQUID_BLOCK, HIGHER_SQUID_BLOCK, HIGHER_COMPRESS_SQUID_BLOCK,
            SUPER_SQUID_BLOCK, SUPER_COMPRESS_SQUID_BLOCK, ULTIMATE_SQUID_BLOCK, ULTIMATE_COMPRESS_SQUID_BLOCK,

            ONE_SQUID_BLOCK, TWO_SQUID_BLOCK, FOUR_SQUID_BLOCK, EIGHT_SQUID_BLOCK,

            SQUID_SIDE_BLOCK,

            BIGGER_CHEST_BLOCK;

    public static final Identifier BIGGER_CHEST = new Identifier(SquidCraft.MODID, "bigger_chest_block");
    public static final String BIGGER_CHEST_TRANSLATION_KEY = Util.createTranslationKey("container", BIGGER_CHEST);

    public static BlockEntityType<BiggerChestBlockEntity> BIGGER_CHEST_ENTITY_TYPE;

    static
    {
        // Squid blocks begin
        SQUID_BLOCK = register("squid_block", new SquidBlock(FabricBlockSettings.of(Material.SOIL).hardness(0.5f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1458).saturationModifier(165.651f).meat().alwaysEdible().build()));
        COMPRESS_SQUID_BLOCK = register("compress_squid_block", new CompressSquidBlock(FabricBlockSettings.of(Material.SOIL).hardness(0.525f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(13122).saturationModifier(256.0f).meat().alwaysEdible().build()));
        LOW_SQUID_BLOCK = register("low_squid_block", new LowSquidBlock(FabricBlockSettings.of(Material.SOIL).strength(0.55f, 0.1f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(118098).saturationModifier(512.0f).meat().alwaysEdible().build()));
        LOW_COMPRESS_SQUID_BLOCK = register("low_compress_squid_block", new LowCompressSquidBlock(FabricBlockSettings.of(Material.SOIL).strength(0.6f, 0.15f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1062882).saturationModifier(1024.0f).meat().alwaysEdible().build()));
        MEDIUM_SQUID_BLOCK = register("medium_squid_block", new MediumSquidBlock(FabricBlockSettings.of(Material.SOIL).strength(0.65f, 0.2f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1417176).saturationModifier(1365.3f).meat().alwaysEdible().build()));
        MEDIUM_COMPRESS_SQUID_BLOCK = register("medium_compress_squid_block", new MediumCompressSquidBlock(FabricBlockSettings.of(Material.SOIL).strength(0.7f, 0.25f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1889568).saturationModifier(1820.4f).meat().alwaysEdible().build()));
        HIGHER_SQUID_BLOCK = register("higher_squid_block", new HigherSquidBlock(FabricBlockSettings.of(Material.SOIL).strength(0.75f, 0.3f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(2519424).saturationModifier(2427.2f).meat().alwaysEdible().build()));
        HIGHER_COMPRESS_SQUID_BLOCK = register("higher_compress_squid_block", new HigherCompressSquidBlock(FabricBlockSettings.of(Material.SOIL).strength(0.8f, 0.35f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(3359232).saturationModifier(3236.266666666666f).meat().alwaysEdible().build()));
        SUPER_SQUID_BLOCK = register("super_squid_block", new SuperSquidBlock(FabricBlockSettings.of(Material.SOIL).strength(0.85f, 0.4f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(4478976).saturationModifier(4315.023f).meat().alwaysEdible().build()));
        SUPER_COMPRESS_SQUID_BLOCK = register("super_compress_squid_block", new SuperCompressSquidBlock(FabricBlockSettings.of(Material.SOIL).strength(0.9f, 0.45f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(5971968).saturationModifier(5753.3629629629629629629629629631f).meat().alwaysEdible().build()));
        ULTIMATE_SQUID_BLOCK = register("ultimate_squid_block", new UltimateSquidBlock(FabricBlockSettings.of(Material.SOIL).strength(0.95f, 0.5f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(7962624).saturationModifier(7671.15061728395f).meat().alwaysEdible().build()));
        ULTIMATE_COMPRESS_SQUID_BLOCK = register("ultimate_compress_squid_block", new UltimateCompressSquidBlock(FabricBlockSettings.of(Material.SOIL).strength(1.0f, 0.55f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(10616832).saturationModifier(10228.200823045267489711934156379f).meat().alwaysEdible().build()));
        // Squid blocks end

        // Multi squid blocks begin
        ONE_SQUID_BLOCK = register("one_squid_block", new One(), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(14155776).saturationModifier(13637.601097393689f).meat().alwaysEdible().build()));
        TWO_SQUID_BLOCK = register("two_squid_block", new Two(), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(18874368).saturationModifier(18183.468129858253f).meat().alwaysEdible().build()));
        FOUR_SQUID_BLOCK = register("four_squid_block", new Four(), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(25165824).saturationModifier(24244.6241731443f).meat().alwaysEdible().build()));
        EIGHT_SQUID_BLOCK = register("eight_squid_block", new Eight(), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(33554432).saturationModifier(32326.165564192f).meat().alwaysEdible().build()));
        // Multi squid blocks end

        SQUID_SIDE_BLOCK = register("squid_side_block", new SquidSideBlock(FabricBlockSettings.of(Material.SOIL).hardness(1.5f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(729).saturationModifier(82.8255f).meat().alwaysEdible().build()));

        BIGGER_CHEST_BLOCK = new BiggerChestBlock();
    }

    public BlockRegister()
    {
        registerContainer(BIGGER_CHEST, BIGGER_CHEST_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT));
        BIGGER_CHEST_ENTITY_TYPE = Registry.register(Registry.BLOCK_ENTITY_TYPE, BIGGER_CHEST, BlockEntityType.Builder.create(BiggerChestBlockEntity::new, BIGGER_CHEST_BLOCK).build(null));
        ContainerProviderRegistry.INSTANCE.registerFactory(BIGGER_CHEST, ((syncId, identifier, player, buf) -> {
            final BlockEntity blockEntity = player.world.getBlockEntity(buf.readBlockPos());
            assert blockEntity != null;
            return ((BiggerChestBlockEntity) blockEntity).createScreenHandler(syncId, player.inventory);
        }));
    }

    private void registerContainer(Identifier id, Block block, Item.Settings settings) {
        String s = "register container";
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, settings));
        log(s, "register container");
    }

}
package io.github.squidcraft.util.registers;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.api.BlocksRegister;
import io.github.squidcraft.block.*;
import io.github.squidcraft.block.blockItem.SquidBlockItem;
import io.github.squidcraft.item.ItemGroups;
import io.github.squidcraft.tile.BiggerChestBlockEntity;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.container.ContainerProviderRegistry;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.registry.Registry;

/**
 * You always register block, add {@link ItemGroups}, add lang, add blockstates, add models, add textures, add loot tables and add recipes.
 */
public class BlockRegister {
    // TODO Always register block, add item group, add lang, add blockstates, add models, add textures, add loot tables and add recipes.
    // TODO Squid blocks

    public static final Block COPPER_ORE = new CopperOre(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).breakByTool(FabricToolTags.PICKAXES, 3).build());
    public static final Block COPPER_BLOCK = new CopperBlock(FabricBlockSettings.of(Material.METAL).strength(5.0f, 6.0f).breakByTool(FabricToolTags.PICKAXES, 3).sounds(BlockSoundGroup.METAL).build());

    // Squid blocks begin
    public static final Block SQUID_BLOCK = new SquidBlock(FabricBlockSettings.of(Material.EARTH).hardness(0.5f).build());
    public static final Block COMPRESS_SQUID_BLOCK = new CompressSquidBlock(FabricBlockSettings.of(Material.EARTH).hardness(0.525f).build());
    public static final Block LOW_SQUID_BLOCK = new LowSquidBlock(FabricBlockSettings.of(Material.EARTH).strength(0.55f, 0.1f).build());
    public static final Block LOW_COMPRESS_SQUID_BLOCK = new LowCompressSquidBlock(FabricBlockSettings.of(Material.EARTH).strength(0.6f, 0.15f).build());
    public static final Block MEDIUM_SQUID_BLOCK = new MediumSquidBlock(FabricBlockSettings.of(Material.EARTH).strength(0.65f, 0.2f).build());
    public static final Block MEDIUM_COMPRESS_SQUID_BLOCK = new MediumCompressSquidBlock(FabricBlockSettings.of(Material.EARTH).strength(0.7f, 0.25f).build());
    public static final Block HIGHER_SQUID_BLOCK = new HigherSquidBlock(FabricBlockSettings.of(Material.EARTH).strength(0.75f, 0.3f).build());
    public static final Block HIGHER_COMPRESS_SQUID_BLOCK = new HigherCompressSquidBlock(FabricBlockSettings.of(Material.EARTH).strength(0.8f, 0.35f).build());
    public static final Block SUPER_SQUID_BLOCK = new SuperSquidBlock(FabricBlockSettings.of(Material.EARTH).strength(0.85f, 0.4f).build());
    public static final Block SUPER_COMPRESS_SQUID_BLOCK = new SuperCompressSquidBlock(FabricBlockSettings.of(Material.EARTH).strength(0.9f, 0.45f).build());
    public static final Block ULTIMATE_SQUID_BLOCK = new UltimateSquidBlock(FabricBlockSettings.of(Material.EARTH).strength(0.95f, 0.5f).build());
    public static final Block ULTIMATE_COMPRESS_SQUID_BLOCK = new UltimateCompressSquidBlock(FabricBlockSettings.of(Material.EARTH).strength(1.0f, 0.55f).build());
    // Squid blocks end

    // Multi squid blocks begin
    public static final Block ONE_SQUID_BLOCK = new MultiSquidBlock().one();
    public static final Block TWO_SQUID_BLOCK = new MultiSquidBlock().two();
    public static final Block FOUR_SQUID_BLOCK = new MultiSquidBlock().four();
    public static final Block EIGHT_SQUID_BLOCK = new MultiSquidBlock().eight();
    // Multi squid blocks end

    public static final Block ANCIENT_DEBRIS = new AncientDebris();
    public static final Block NETHERITE_BLOCK = new NetheriteBlock();

    public static final Identifier BIGGER_CHEST = new Identifier(SquidCraft.MODID, "bigger_chest_block");
    public static final Block BIGGER_CHEST_BLOCK = new BiggerChestBlock();
    public static final String BIGGER_CHEST_TRANSLATION_KEY = Util.createTranslationKey("container", BIGGER_CHEST);

    public static BlockEntityType<BiggerChestBlockEntity> BIGGER_CHEST_ENTITY_TYPE;

    public BlockRegister() {
        registerBlock("copper_ore", COPPER_ORE, new Item.Settings().group(ItemGroups.SQUID_CRAFT));
        registerBlock("copper_block", COPPER_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT));

        // Register squid blocks begin
        registerBlock("squid_block", SQUID_BLOCK, new SquidBlockItem(SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1458).saturationModifier(165.651f).meat().alwaysEdible().build())));
        registerBlock("compress_squid_block", COMPRESS_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(13122).saturationModifier(256.0f).meat().alwaysEdible().build()));
        registerBlock("low_squid_block", LOW_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(118098).saturationModifier(512.0f).meat().alwaysEdible().build()));
        registerBlock("low_compress_squid_block", LOW_COMPRESS_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1062882).saturationModifier(1024.0f).meat().alwaysEdible().build()));
        registerBlock("medium_squid_block", MEDIUM_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1417176).saturationModifier(1365.3f).meat().alwaysEdible().build()));
        registerBlock("medium_compress_squid_block", MEDIUM_COMPRESS_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1889568).saturationModifier(1820.4f).meat().alwaysEdible().build()));
        registerBlock("higher_squid_block", HIGHER_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(2519424).saturationModifier(2427.2f).meat().alwaysEdible().build()));
        registerBlock("higher_compress_squid_block", HIGHER_COMPRESS_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(3359232).saturationModifier(3236.2666666666666666666666666667f).meat().alwaysEdible().build()));
        registerBlock("super_squid_block", SUPER_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(4478976).saturationModifier(4315.0222222222222222222222222223f).meat().alwaysEdible().build()));
        registerBlock("super_compress_squid_block", SUPER_COMPRESS_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(5971968).saturationModifier(5753.3629629629629629629629629631f).meat().alwaysEdible().build()));
        registerBlock("ultimate_squid_block", ULTIMATE_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(7962624).saturationModifier(7671.1506172839506172839506172841f).meat().alwaysEdible().build()));
        registerBlock("ultimate_compress_squid_block", ULTIMATE_COMPRESS_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(10616832).saturationModifier(10228.200823045267489711934156379f).meat().alwaysEdible().build()));
        // Register squid blocks end

        // Register multi squid blocks begin
        registerBlock("one_squid_block", ONE_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(14155776).saturationModifier(13637.601097393689986282578875172f).meat().alwaysEdible().build()));
        registerBlock("two_squid_block", TWO_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(18874368).saturationModifier(18183.468129858253315043438500229f).meat().alwaysEdible().build()));
        registerBlock("four_squid_block", FOUR_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(25165824).saturationModifier(24244.624173144337753391251333639f).meat().alwaysEdible().build()));
        registerBlock("eight_squid_block", EIGHT_SQUID_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(33554432).saturationModifier(32326.165564192450337855001778185f).meat().alwaysEdible().build()));
        // Register multi squid blocks end

        registerBlock("ancient_debris", ANCIENT_DEBRIS, new Item.Settings().group(ItemGroups.NETHERITE_MOD));
        registerBlock("netherite_block", NETHERITE_BLOCK, new Item.Settings().group(ItemGroups.NETHERITE_MOD));

        registerContainer(BIGGER_CHEST, BIGGER_CHEST_BLOCK, new Item.Settings().group(ItemGroups.SQUID_CRAFT));
        BIGGER_CHEST_ENTITY_TYPE = Registry.register(Registry.BLOCK_ENTITY_TYPE, BIGGER_CHEST, BlockEntityType.Builder.create(BiggerChestBlockEntity::new, BIGGER_CHEST_BLOCK).build(null));
        ContainerProviderRegistry.INSTANCE.registerFactory(BIGGER_CHEST, ((syncId, identifier, player, buf) -> {
            final BlockEntity blockEntity = player.world.getBlockEntity(buf.readBlockPos());
            assert blockEntity != null;
            return ((BiggerChestBlockEntity) blockEntity).createContainer(syncId, player.inventory);
        }));

    }

    private void registerBlock(String blockName, Block block, BlockItem blockItem) {
        BlocksRegister.registerBlock(SquidCraft.MODID, blockName, block, blockItem);
    }

    private void registerBlock(String blockName, Block block, Item.Settings settings) {
        BlocksRegister.registerBlock(SquidCraft.MODID, blockName, block, settings);
    }

    private static void registerContainer(Identifier id, Block block, Item.Settings settings) {
        BlocksRegister.registerContainer(id, block, settings);
    }
}

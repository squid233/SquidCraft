package io.github.squid233.squidcraft.util.registers;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.api.BlockRegisters;
import io.github.squid233.squidcraft.block.BiggerChestBlock;
import io.github.squid233.squidcraft.block.SquidSideBlock;
import io.github.squid233.squidcraft.block.tile.BiggerChestBlockEntity;
import io.github.squid233.squidcraft.block.tile.BiggerChestScreenHandler;
import io.github.squid233.squidcraft.item.ItemGroups;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.*;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.squid233.squidcraft.api.util.Loggers.log;

/**
 * You always register block, add {@link ItemGroups}, add lang, add blockstates, add models, add textures, add loot tables and add recipes.
 */
public class BlockRegister {

    private static Block register(String name, Block block, Item.Settings settings) {
        return BlockRegisters.register(SquidCraft.MODID, name, block, settings);
    }

    private static Block register(String name, Block block, ItemGroup group) {
        return register(name, block, new Item.Settings().group(group));
    }

    private static Block register(String name, Block block) {
        return BlockRegisters.register(SquidCraft.MODID, name, block);
    }

    public static final Block SQUID_BLOCK;
    public static final Block COMPRESS_SQUID_BLOCK;
    public static final Block LOW_SQUID_BLOCK;
    public static final Block LOW_COMPRESS_SQUID_BLOCK;
    public static final Block MEDIUM_SQUID_BLOCK;
    public static final Block MEDIUM_COMPRESS_SQUID_BLOCK;
    public static final Block HIGHER_SQUID_BLOCK;
    public static final Block HIGHER_COMPRESS_SQUID_BLOCK;
    public static final Block SUPER_SQUID_BLOCK;
    public static final Block SUPER_COMPRESS_SQUID_BLOCK;
    public static final Block ULTIMATE_SQUID_BLOCK;
    public static final Block ULTIMATE_COMPRESS_SQUID_BLOCK;
    public static final Block ONE_SQUID_BLOCK;
    public static final Block TWO_SQUID_BLOCK;
    public static final Block FOUR_SQUID_BLOCK;
    public static final Block EIGHT_SQUID_BLOCK;
    public static final Block SQUID_SIDE_BLOCK;
    public static final Block BIGGER_CHEST_BLOCK;
    public static final Block SOUL_JACK_O_LANTERN;
    public static final Block SHREDDED_SQUID_CROP;

    public static final Identifier BIGGER_CHEST = new Identifier(SquidCraft.MODID, "bigger_chest_block");
    //public static final String BIGGER_CHEST_TRANSLATION_KEY = Util.createTranslationKey("container", BIGGER_CHEST);
    public static final ScreenHandlerType<BiggerChestScreenHandler> BIGGER_CHEST_SCREEN_HANDLER_TYPE = ScreenHandlerRegistry.registerSimple(BIGGER_CHEST, BiggerChestScreenHandler::new);

    public static BlockEntityType<BiggerChestBlockEntity> BIGGER_CHEST_ENTITY_TYPE;

    static {
        // Squid blocks begin
        SQUID_BLOCK = register("squid_block", new Block(FabricBlockSettings.of(Material.SOIL).hardness(0.5f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1458).saturationModifier(165.651f).meat().alwaysEdible().build()));
        COMPRESS_SQUID_BLOCK = register("compress_squid_block", new Block(FabricBlockSettings.of(Material.SOIL).hardness(0.525f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(13122).saturationModifier(256.0f).meat().alwaysEdible().build()));
        LOW_SQUID_BLOCK = register("low_squid_block", new Block(FabricBlockSettings.of(Material.SOIL).strength(0.55f, 0.1f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(118098).saturationModifier(512.0f).meat().alwaysEdible().build()));
        LOW_COMPRESS_SQUID_BLOCK = register("low_compress_squid_block", new Block(FabricBlockSettings.of(Material.SOIL).strength(0.6f, 0.15f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1062882).saturationModifier(1024.0f).meat().alwaysEdible().build()));
        MEDIUM_SQUID_BLOCK = register("medium_squid_block", new Block(FabricBlockSettings.of(Material.SOIL).strength(0.65f, 0.2f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1417176).saturationModifier(1365.3f).meat().alwaysEdible().build()));
        MEDIUM_COMPRESS_SQUID_BLOCK = register("medium_compress_squid_block", new Block(FabricBlockSettings.of(Material.SOIL).strength(0.7f, 0.25f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1889568).saturationModifier(1820.4f).meat().alwaysEdible().build()));
        HIGHER_SQUID_BLOCK = register("higher_squid_block", new Block(FabricBlockSettings.of(Material.SOIL).strength(0.75f, 0.3f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(2519424).saturationModifier(2427.2f).meat().alwaysEdible().build()));
        HIGHER_COMPRESS_SQUID_BLOCK = register("higher_compress_squid_block", new Block(FabricBlockSettings.of(Material.SOIL).strength(0.8f, 0.35f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(3359232).saturationModifier(3236.266666666666f).meat().alwaysEdible().build()));
        SUPER_SQUID_BLOCK = register("super_squid_block", new Block(FabricBlockSettings.of(Material.SOIL).strength(0.85f, 0.4f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(4478976).saturationModifier(4315.023f).meat().alwaysEdible().build()));
        SUPER_COMPRESS_SQUID_BLOCK = register("super_compress_squid_block", new Block(FabricBlockSettings.of(Material.SOIL).strength(0.9f, 0.45f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(5971968).saturationModifier(5753.3629629629629629629629629631f).meat().alwaysEdible().build()));
        ULTIMATE_SQUID_BLOCK = register("ultimate_squid_block", new Block(FabricBlockSettings.of(Material.SOIL).strength(0.95f, 0.5f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(7962624).saturationModifier(7671.15061728395f).meat().alwaysEdible().build()));
        ULTIMATE_COMPRESS_SQUID_BLOCK = register("ultimate_compress_squid_block", new Block(FabricBlockSettings.of(Material.SOIL).strength(1.0f, 0.55f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(10616832).saturationModifier(10228.200823045267489711934156379f).meat().alwaysEdible().build()));
        // Squid blocks end

        // Multi squid blocks begin
        ONE_SQUID_BLOCK = register("one_squid_block", new Block(FabricBlockSettings.of(Material.SOIL).strength(1.5f, 0.6f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(14155776).saturationModifier(13637.601097393689f).meat().alwaysEdible().build()));
        TWO_SQUID_BLOCK = register("two_squid_block", new Block(FabricBlockSettings.of(Material.SOIL).strength(2.0f, 0.65f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(18874368).saturationModifier(18183.468129858253f).meat().alwaysEdible().build()));
        FOUR_SQUID_BLOCK = register("four_squid_block", new Block(FabricBlockSettings.of(Material.SOIL).strength(2.5f, 0.7f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(25165824).saturationModifier(24244.6241731443f).meat().alwaysEdible().build()));
        EIGHT_SQUID_BLOCK = register("eight_squid_block", new Block(FabricBlockSettings.of(Material.SOIL).strength(3.0f, 0.75f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(33554432).saturationModifier(32326.165564192f).meat().alwaysEdible().build()));
        // Multi squid blocks end

        SQUID_SIDE_BLOCK = register("squid_side_block", new SquidSideBlock(FabricBlockSettings.of(Material.SOIL).hardness(1.5f)), new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(729).saturationModifier(82.8255f).meat().alwaysEdible().build()));

        BIGGER_CHEST_BLOCK = new BiggerChestBlock();

        SOUL_JACK_O_LANTERN = register("soul_jack_o_lantern", new CarvedPumpkinBlock(AbstractBlock.Settings.copy(Blocks.JACK_O_LANTERN)){}, ItemGroups.SQUID_CRAFT);

        SHREDDED_SQUID_CROP = register("shredded_squid_crop", new CarrotsBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)) {
            @Override
            protected ItemConvertible getSeedsItem() {
                return ItemRegister.SHREDDED_SQUID;
            }
        });
    }

    public BlockRegister() {
        registerContainer(new Item.Settings().group(ItemGroups.SQUID_CRAFT));
        BIGGER_CHEST_ENTITY_TYPE = Registry.register(Registry.BLOCK_ENTITY_TYPE, BIGGER_CHEST, BlockEntityType.Builder.create(BiggerChestBlockEntity::new, BIGGER_CHEST_BLOCK).build(null));
        /*ContainerProviderRegistry.INSTANCE.registerFactory(BIGGER_CHEST, ((syncId, identifier, player, buf) -> {
            final BlockEntity blockEntity = player.world.getBlockEntity(buf.readBlockPos());
            assert blockEntity != null;
            return ((BiggerChestBlockEntity) blockEntity).createScreenHandler(syncId, player.inventory);
        }));*/

    }

    private void registerContainer(Item.Settings settings) {
        String s = "register container";
        Registry.register(Registry.BLOCK, BIGGER_CHEST, BIGGER_CHEST_BLOCK);
        Registry.register(Registry.ITEM, BIGGER_CHEST, new BlockItem(BIGGER_CHEST_BLOCK, settings));
        log(s, "register container");
    }

}
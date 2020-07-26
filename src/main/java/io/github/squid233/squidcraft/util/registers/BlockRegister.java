package io.github.squid233.squidcraft.util.registers;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.api.BlockRegisters;
import io.github.squid233.squidcraft.api.ItemRegisters;
import io.github.squid233.squidcraft.api.block.BlockFood.SquidCraftFood;
import io.github.squid233.squidcraft.api.block.BlockFood.SquidCraftFood.ItemBlock;
import io.github.squid233.squidcraft.api.util.Loggers;
import io.github.squid233.squidcraft.block.BiggerChestBlock;
import io.github.squid233.squidcraft.block.SquidSideBlock;
import io.github.squid233.squidcraft.block.tile.BiggerChestBlockEntity;
import io.github.squid233.squidcraft.item.ItemGroups;
import net.fabricmc.fabric.api.container.ContainerProviderRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;

import java.util.Objects;

import static io.github.squid233.squidcraft.item.ItemGroups.SQUID_CRAFT;

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

    private void register(String name, Block block, ItemBlock itemBlock) {
        ItemRegisters.register(SquidCraft.MODID, name, itemBlock);
        if (Loggers.enableRegisterLog) {
            SquidCraft.logInfo("register " + SquidCraft.MODID + ":" + name + " block success!");
        }
        Registry.register(Registry.BLOCK, new Identifier(SquidCraft.MODID, name),
                block);
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
    public static final String BIGGER_CHEST_TRANSLATION_KEY = Util.createTranslationKey("container", BIGGER_CHEST);
    /*public static final ScreenHandlerType<BiggerChestScreenHandler> BIGGER_CHEST_SCREEN_HANDLER_TYPE =
        ScreenHandlerRegistry.registerSimple(BIGGER_CHEST, BiggerChestScreenHandler::new); */

    public static BlockEntityType<BiggerChestBlockEntity> BIGGER_CHEST_ENTITY_TYPE;

    static {
        // Squid blocks begin
        SQUID_BLOCK = new SquidCraftFood(0.5f, 1400, 128);
        COMPRESS_SQUID_BLOCK = new SquidCraftFood(0.525f, 6300, 192);
        LOW_SQUID_BLOCK = new SquidCraftFood(0.55f, 0.1f, 28350, 288);
        LOW_COMPRESS_SQUID_BLOCK = new SquidCraftFood(0.6f, 0.15f, 127575, 432);
        MEDIUM_SQUID_BLOCK = new SquidCraftFood(0.65f, 0.2f, 574088, 648);
        MEDIUM_COMPRESS_SQUID_BLOCK = new SquidCraftFood(0.7f, 0.25f, 1148175, 972);
        HIGHER_SQUID_BLOCK = new SquidCraftFood(0.75f, 0.3f, 1722262, 1458);
        HIGHER_COMPRESS_SQUID_BLOCK = new SquidCraftFood(0.8f, 0.35f, 2583394, 2187);
        SUPER_SQUID_BLOCK = new SquidCraftFood(0.85f, 0.4f, 3875091, 3281);
        SUPER_COMPRESS_SQUID_BLOCK = new SquidCraftFood(0.9f, 0.45f, 5812636, 4921);
        ULTIMATE_SQUID_BLOCK = new SquidCraftFood(0.95f, 0.5f, 6393900, 7381);
        ULTIMATE_COMPRESS_SQUID_BLOCK = new SquidCraftFood(1, 0.55f, 7033289, 11072);
        // Squid blocks end

        // Multi squid blocks begin
        ONE_SQUID_BLOCK = new SquidCraftFood(1.5f, 0.6f, 7384954, 12179);
        TWO_SQUID_BLOCK = new SquidCraftFood(2, 0.65f, 7754202, 13397);
        FOUR_SQUID_BLOCK = new SquidCraftFood(2.5f, 0.7f, 8141912, 14736);
        EIGHT_SQUID_BLOCK = new SquidCraftFood(3, 0.75f, 8549007, 16210);
        // Multi squid blocks end

        SQUID_SIDE_BLOCK = register("squid_side_block", new SquidSideBlock(FabricBlockSettings.of(Material.SOIL).hardness(0.5f)),
                new Item.Settings().group(SQUID_CRAFT).food(
                        new FoodComponent.Builder().hunger(700).saturationModifier(64).meat().alwaysEdible().build()));

        BIGGER_CHEST_BLOCK = new BiggerChestBlock(FabricBlockSettings.of(Material.METAL));

        SOUL_JACK_O_LANTERN = register("soul_jack_o_lantern", new CarvedPumpkinBlock(AbstractBlock.Settings.copy(Blocks.JACK_O_LANTERN)) {
        }, SQUID_CRAFT);

        SHREDDED_SQUID_CROP = register("shredded_squid_crop", new CarrotsBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)) {
            @Override
            protected ItemConvertible getSeedsItem() {
                return ItemRegister.SHREDDED_SQUID;
            }
        });
    }

    public BlockRegister() {
        registerContainer(new Item.Settings().group(SQUID_CRAFT));
        BIGGER_CHEST_ENTITY_TYPE = Registry.register(Registry.BLOCK_ENTITY_TYPE, BIGGER_CHEST,
                BlockEntityType.Builder.create(BiggerChestBlockEntity::new, BIGGER_CHEST_BLOCK).build(null));

        ContainerProviderRegistry.INSTANCE.registerFactory(BIGGER_CHEST, (syncId, identifier, player, buf) -> {
            final BlockPos pos = buf.readBlockPos();
            return Objects.requireNonNull(player.world.getBlockState(pos).createScreenHandlerFactory(player.world, pos))
                    .createMenu(syncId, player.inventory, player);
        });

        register("squid_block", SQUID_BLOCK, new ItemBlock(SQUID_BLOCK));
        register("compress_squid_block", COMPRESS_SQUID_BLOCK, new ItemBlock(COMPRESS_SQUID_BLOCK));
        register("low_squid_block", LOW_SQUID_BLOCK, new ItemBlock(LOW_SQUID_BLOCK));
        register("low_compress_squid_block", LOW_COMPRESS_SQUID_BLOCK, new ItemBlock(LOW_COMPRESS_SQUID_BLOCK));
        register("medium_squid_block", MEDIUM_SQUID_BLOCK, new ItemBlock(MEDIUM_SQUID_BLOCK));
        register("medium_compress_squid_block", MEDIUM_COMPRESS_SQUID_BLOCK, new ItemBlock(MEDIUM_COMPRESS_SQUID_BLOCK));
        register("higher_squid_block", HIGHER_SQUID_BLOCK, new ItemBlock(HIGHER_SQUID_BLOCK));
        register("higher_compress_squid_block", HIGHER_COMPRESS_SQUID_BLOCK, new ItemBlock(HIGHER_COMPRESS_SQUID_BLOCK));
        register("super_squid_block", SUPER_SQUID_BLOCK, new ItemBlock(SUPER_SQUID_BLOCK));
        register("super_compress_squid_block", SUPER_COMPRESS_SQUID_BLOCK, new ItemBlock(SUPER_COMPRESS_SQUID_BLOCK));
        register("ultimate_squid_block", ULTIMATE_SQUID_BLOCK, new ItemBlock(ULTIMATE_SQUID_BLOCK));
        register("ultimate_compress_squid_block", ULTIMATE_COMPRESS_SQUID_BLOCK, new ItemBlock(ULTIMATE_COMPRESS_SQUID_BLOCK));

        register("one_squid_block", ONE_SQUID_BLOCK, new ItemBlock(ONE_SQUID_BLOCK));
        register("two_squid_block", TWO_SQUID_BLOCK, new ItemBlock(TWO_SQUID_BLOCK));
        register("four_squid_block", FOUR_SQUID_BLOCK, new ItemBlock(FOUR_SQUID_BLOCK));
        register("eight_squid_block", EIGHT_SQUID_BLOCK, new ItemBlock(EIGHT_SQUID_BLOCK));


    }

    private void registerContainer(Item.Settings settings) {
        Registry.register(Registry.BLOCK, BIGGER_CHEST, BIGGER_CHEST_BLOCK);
        Registry.register(Registry.ITEM, BIGGER_CHEST, new BlockItem(BIGGER_CHEST_BLOCK, settings));
        SquidCraft.logInfo("register container");
    }

}
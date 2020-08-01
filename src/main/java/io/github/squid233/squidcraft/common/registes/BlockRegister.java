package io.github.squid233.squidcraft.common.registes;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.api.block.BlockFood.SquidCraftFood;
import io.github.squid233.squidcraft.api.block.BlockFood.SquidCraftFood.ItemBlock;
import io.github.squid233.squidcraft.common.block.SquidSideBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static io.github.squid233.squidcraft.common.item.ItemGroups.squidCraft;

/**
 * @author squid233
 */
public class BlockRegister {

    private static void register(String name, Block block, BlockItem blockItem) {
        BLOCKS.register(name, () -> block);
        ItemRegister.ITEMS.register(name, () -> blockItem);
    }

    private static RegistryObject<Block> register(String name, Block block, Item.Properties properties) {
        ItemRegister.ITEMS.register(name, () -> new BlockItem(block, properties));
        return BLOCKS.register(name, () -> block);
    }

    private static RegistryObject<Block> register(String name, Block block, ItemGroup itemGroup) {
        ItemRegister.ITEMS.register(name, () -> new BlockItem(block, new Item.Properties().group(itemGroup)));
        return BLOCKS.register(name, () -> block);
    }

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, SquidCraft.MODID);

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
    public static final RegistryObject<Block> SQUID_SIDE_BLOCK;
    public static final RegistryObject<Block> SOUL_JACK_O_LANTERN;

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

        SQUID_SIDE_BLOCK = register("squid_side_block", new SquidSideBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.5f, 0)),
                new Item.Properties().group(squidCraft).food(
                        new Food.Builder().hunger(700).saturation(64).meat().setAlwaysEdible().build()));

        SOUL_JACK_O_LANTERN = register("soul_jack_o_lantern", new CarvedPumpkinBlock(Block.Properties.from(Blocks.JACK_O_LANTERN)) {}, squidCraft);

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

}

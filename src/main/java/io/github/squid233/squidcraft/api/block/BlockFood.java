package io.github.squid233.squidcraft.api.block;

import io.github.squid233.squidcraft.common.item.ItemGroups;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

public class BlockFood {

    public static class SquidCraftFood extends Block {

        private final int hunger;
        private final float saturationModifier;

        public SquidCraftFood(float hardness, float resistance, int hunger, float saturation) {
            super(Properties.create(Material.EARTH).hardnessAndResistance(hardness, resistance));
            this.hunger = hunger;
            this.saturationModifier = saturation;
        }

        public SquidCraftFood(float hardness, int hunger, float saturation) {
            this(hardness, 0, hunger, saturation);
        }

        @Override
        @OnlyIn(Dist.CLIENT)
        @ParametersAreNonnullByDefault
        public void addInformation(ItemStack stack,
                                 @Nullable IBlockReader world,
                                 List<ITextComponent> tooltip,
                                 ITooltipFlag options) {
            tooltip.add(new TranslationTextComponent("item.food.hunger", hunger));
            tooltip.add(new TranslationTextComponent(
                    "item.food.saturation", saturationModifier));
            tooltip.add(new TranslationTextComponent("item.food.isWolfFood", true));
        }

        public static class ItemBlock extends BlockItem {

            private final int hunger;
            private final float saturationModifier;

            public ItemBlock(SquidCraftFood block) {
                super(block,
                        new Properties()
                                .group(ItemGroups.squidCraft)
                                .food(
                                        new Food.Builder()
                                                .hunger(block.hunger)
                                                .saturation(block.saturationModifier)
                                                .meat().setAlwaysEdible().build()));
                hunger = block.hunger;
                saturationModifier = block.saturationModifier;
            }

            public ItemBlock(Block block) {
                this((SquidCraftFood) block);
            }

            @Override
            @OnlyIn(Dist.CLIENT)
            @ParametersAreNonnullByDefault
            public void addInformation(ItemStack stack,
                                      @Nullable World world,
                                      List<ITextComponent> tooltip,
                                      ITooltipFlag context) {
                tooltip.add(new TranslationTextComponent("item.food.hunger", hunger));
                tooltip.add(new TranslationTextComponent(
                        "item.food.saturation", saturationModifier));
                tooltip.add(new TranslationTextComponent("item.food.isWolfFood", true));
            }
        }
    }
}

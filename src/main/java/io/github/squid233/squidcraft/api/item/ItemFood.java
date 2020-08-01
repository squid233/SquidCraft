package io.github.squid233.squidcraft.api.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

/**
 * @author squid233
 */
public class ItemFood {

    public static class Meat extends Item {

        private final int hunger;
        private final float saturation;

        public Meat(Properties properties, int hunger, float saturation) {
            super(properties.food(new Food.Builder().hunger(hunger).saturation(saturation).meat().build()));
            this.hunger = hunger;
            this.saturation = saturation;
        }

        public Meat(ItemGroup itemGroup, int hunger, float saturation) {
            this(new Properties().group(itemGroup), hunger, saturation);
        }

        @Override
        @ParametersAreNonnullByDefault
        public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
            tooltip.add(new TranslationTextComponent("item.food.hunger", hunger));
            tooltip.add(new TranslationTextComponent("item.food.saturation", saturation));
            tooltip.add(new TranslationTextComponent("item.food.isWolfFood", true));
        }

        public static class Big extends Item {

            private final int hunger;
            private final float saturation;

            public Big(Properties properties, int hunger, float saturation) {
                super(properties.food(
                        new Food.Builder()
                                .hunger(hunger).saturation(saturation).meat().setAlwaysEdible().build()));
                this.hunger = hunger;
                this.saturation = saturation;
            }

            public Big(ItemGroup itemGroup, int hunger, float saturation) {
                this(new Properties().group(itemGroup), hunger, saturation);
            }

            @Override
            @ParametersAreNonnullByDefault
            public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                tooltip.add(new TranslationTextComponent("item.food.hunger", hunger));
                tooltip.add(new TranslationTextComponent("item.food.saturation", saturation));
                tooltip.add(new TranslationTextComponent("item.food.isWolfFood", true));
            }
        }
    }
}

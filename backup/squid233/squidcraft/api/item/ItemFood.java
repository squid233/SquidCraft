package io.github.squid233.squidcraft.api.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

/**
 * Extends this class to new your food.
 */
public class ItemFood extends Item {
    private final int hunger;
    private final float saturation;

    public ItemFood(Settings settings, int hunger, float saturation) {
        super(settings.food(new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation).build()));
        this.hunger = hunger;
        this.saturation = saturation;
    }

    /*public ItemFood(Settings settings, int hunger) {
        this(settings, hunger, 0.8F);
    }*/

    public static void addFoodTip(List<Text> tooltip, int hunger, float saturation, boolean isWolfFood) {
        tooltip.add(new TranslatableText("item.food.hunger", hunger));
        tooltip.add(new TranslatableText("item.food.saturation", saturation));
        tooltip.add(new TranslatableText("item.food.isWolfFood", isWolfFood));
    }

    /**
     * In game, your item will be display like this below:<pre>
     * |------------------------|
     * | Item name              |
     * |                        |
     * | Hunger: 1              |
     * | Saturation: 0.8        |
     * | Can feed the wolf: true|
     * |------------------------|</pre>
     *
     * @param stack   Stack
     * @param world   World
     * @param tooltip Tooltip list
     * @param context Tooltip Context
     */
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        addFoodTip(tooltip, hunger, saturation, false);
    }

    /**
     * This class is same as {@link ItemFood} but it can feed the wolves.
     */
    public static class Meat extends Item {
        private final int hunger;
        private final float saturation;

        public Meat(Settings settings, int hunger, float saturation) {
            super(settings.food(new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation).meat().build()));
            this.hunger = hunger;
            this.saturation = saturation;
        }

        public Meat(ItemGroup itemGroup, int hunger, float saturation) {
            this(new Settings().group(itemGroup), hunger, saturation);
        }

        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            ItemFood.addFoodTip(tooltip, hunger, saturation, true);
        }

        public static class Big extends Item {
            private final int hunger;
            private final float saturation;

            public Big(Settings settings, int hunger, float saturation) {
                super(settings.food(new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation).meat().alwaysEdible().build()));
                this.hunger = hunger;
                this.saturation = saturation;
            }

            public Big(ItemGroup itemGroup, int hunger, float saturation) {
                this(new Settings().group(itemGroup), hunger, saturation);
            }

            @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                ItemFood.addFoodTip(tooltip, hunger, saturation, true);
                tooltip.add(new TranslatableText("item.food.alwaysEdible"));
            }
        }
    }
}

package io.github.squid233.squidcraft.item;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @author squid233
 * @date 2020/9/20
 */
public class FoodItem {
    private final Item.Settings settings;
    private int hunger;
    private float saturation;
    private boolean isMeat;
    private boolean isSnack;
    private boolean isAlwaysEdible;
    private StatusEffectInstance statusEffect;
    private float chance;

    public FoodItem(Item.Settings settings) {
        this.settings = settings;
    }

    public FoodItem(Item.Settings settings, int hunger, float saturation) {
        this(settings);
        hunger(hunger).saturation(saturation);
    }

    public FoodItem hunger(int hunger) {
        this.hunger = hunger;
        return this;
    }

    public FoodItem saturation(float saturation) {
        this.saturation = saturation;
        return this;
    }

    public FoodItem meat() {
        isMeat = true;
        return this;
    }

    public FoodItem snack() {
        isSnack = true;
        return this;
    }

    public FoodItem alwaysEdible() {
        isAlwaysEdible = true;
        return this;
    }

    public FoodItem statusEffect(StatusEffectInstance effect, float chance) {
        statusEffect = effect;
        this.chance = chance;
        return this;
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("item.food.hunger", hunger));
        tooltip.add(new TranslatableText("item.food.saturation", saturation));
        tooltip.add(new TranslatableText("item.food.isWolfFood", isMeat));
        if (isAlwaysEdible) {
            tooltip.add(new TranslatableText("item.food.alwaysEdible"));
        }
    }

    public Item build() {
        FoodComponent.Builder b = new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation);
        if (isMeat) {
            b.meat();
        }
        if (isSnack) {
            b.snack();
        }
        if (isAlwaysEdible) {
            b.alwaysEdible();
        }
        if (statusEffect != null) {
            b.statusEffect(statusEffect, chance);
        }
        return new Item(settings.food(b.build())) {
            @Override
            @Environment(EnvType.CLIENT)
            public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                FoodItem.this.appendTooltip(stack, world, tooltip, context);
            }
        };
    }
}

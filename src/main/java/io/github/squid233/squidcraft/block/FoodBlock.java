package io.github.squid233.squidcraft.block;

import io.github.squid233.squidcraft.item.FoodItem;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;

/**
 * @author squid233
 * @date 2020/9/20
 */
public class FoodBlock extends Block {
    private Item cachedItem;
    private final Item.Settings settings;
    private int hunger;
    private float saturation;
    private boolean isMeat;
    private boolean isSnack;
    private boolean isAlwaysEdible;
    private StatusEffectInstance statusEffect;
    private float chance;

    public FoodBlock(Settings settings, Item.Settings itemSettings, int hunger, float saturation) {
        super(settings);
        this.settings = itemSettings;
        this.hunger = hunger;
        this.saturation = saturation;
    }

    public FoodBlock(float hardness, float resistance, Item.Settings itemSettings, int hunger, float saturation) {
        this(FabricBlockSettings.of(Material.SOIL).strength(hardness, resistance), itemSettings, hunger, saturation);
    }

    public FoodBlock(float hardness, Item.Settings itemSettings, int hunger, float saturation) {
        this(hardness, 0, itemSettings, hunger, saturation);
    }

    public FoodBlock setHunger(int hunger) {
        this.hunger = hunger;
        return this;
    }

    public FoodBlock setSaturation(float saturation) {
        this.saturation = saturation;
        return this;
    }

    public FoodBlock setMeat(boolean meat) {
        isMeat = meat;
        return this;
    }

    public FoodBlock setSnack(boolean snack) {
        isSnack = snack;
        return this;
    }

    public FoodBlock setAlwaysEdible(boolean alwaysEdible) {
        isAlwaysEdible = alwaysEdible;
        return this;
    }

    public FoodBlock setStatusEffect(StatusEffectInstance statusEffect, float chance) {
        this.statusEffect = statusEffect;
        this.chance = chance;
        return this;
    }

    public Item.Settings getItemSettings() {
        return settings;
    }

    @Override
    public Item asItem() {
        if (cachedItem == null) {
            FoodItem fi = new FoodItem(settings).hunger(hunger).saturation(saturation);
            if (isMeat) {
                fi.meat();
            }
            if (isSnack) {
                fi.snack();
            }
            if (isAlwaysEdible) {
                fi.alwaysEdible();
            }
            if (statusEffect != null) {
                fi.statusEffect(statusEffect, chance);
            }
            cachedItem = fi.build();
        }
        return cachedItem;
    }
}

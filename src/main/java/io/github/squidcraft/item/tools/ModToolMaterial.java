package io.github.squidcraft.item.tools;

import io.github.squidcraft.item.ItemGroups;
import io.github.squidcraft.item.ModItems;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    NETHERITE(4062, 20.0f, 20.0f, 9, 44, () -> {return Ingredient.ofItems(ModItems.NETHERITE_INGOT);});

    private final int durability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int miningLevel;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterial(int durability, float miningSpeed, float attackDamage, int miningLevel, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.durability = durability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.miningLevel = miningLevel;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeed() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public static class NetheriteAxe extends AxeItem {
        public NetheriteAxe() {
            super(NETHERITE, -0, -0, new Settings().group(ItemGroups.SQUID_CRAFT));
        }
    }
    public static class NetheriteHoe extends HoeItem {
        public NetheriteHoe() {
            super(NETHERITE, -0, new Settings().group(ItemGroups.SQUID_CRAFT));
        }
    }
    public static class NetheritePickaxe extends AxeItem {
        public NetheritePickaxe() {
            super(NETHERITE, -0, -0, new Settings().group(ItemGroups.SQUID_CRAFT));
        }
    }
    public static class NetheriteShovel extends AxeItem {
        public NetheriteShovel() {
            super(NETHERITE, -0, -0, new Settings().group(ItemGroups.SQUID_CRAFT));
        }
    }
    public static class NetheriteSword extends AxeItem {
        public NetheriteSword() {
            super(NETHERITE, -0, -0, new Settings().group(ItemGroups.SQUID_CRAFT));
        }
    }
}

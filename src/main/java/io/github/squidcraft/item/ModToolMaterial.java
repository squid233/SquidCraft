package io.github.squidcraft.item;

import io.github.squidcraft.util.registers.ItemRegister;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    SQUID(250, 10, 7, 4, 15, () -> {
        return Ingredient.ofItems(ItemRegister.SQUID_COOKIE);
    }),
    NETHERITE(4062, 20.0f, 20.0f, 9, 44, () -> {
        return Ingredient.ofItems(ItemRegister.NETHERITE_INGOT);
    });

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
        this.repairIngredient = new Lazy<>(repairIngredient);
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

    public static class SquidAxe extends AxeItem {
        public SquidAxe() {
            super(SQUID, -0, -2.2f, new Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS));
        }
    }
    public static class SquidHoe extends HoeItem {
        public SquidHoe() {
            super(SQUID, -4, new Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS));
        }
    }
    public static class SquidPickaxe extends PickaxeItem {
        public SquidPickaxe() {
            super(SQUID, -1, -1, new Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS));
        }
    }
    public static class SquidShovel extends ShovelItem {
        public SquidShovel() {
            super(SQUID, -2, -2, new Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS));
        }
    }
    public static class SquidSword extends SwordItem {
        public SquidSword() {
            super(SQUID, +1, -0, new Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS));
        }
    }

    public static class NetheriteAxe extends AxeItem {
        public NetheriteAxe() {
            super(NETHERITE, -0, -0, new Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS));
        }
    }
    public static class NetheriteHoe extends HoeItem {
        public NetheriteHoe() {
            super(NETHERITE, -0, new Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS));
        }
    }
    public static class NetheritePickaxe extends PickaxeItem {
        public NetheritePickaxe() {
            super(NETHERITE, -0, -0, new Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS));
        }
    }
    public static class NetheriteShovel extends ShovelItem {
        public NetheriteShovel() {
            super(NETHERITE, -0, -0, new Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS));
        }
    }
    public static class NetheriteSword extends SwordItem {
        public NetheriteSword() {
            super(NETHERITE, -0, -0, new Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS));
        }
    }
}

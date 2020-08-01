package io.github.squid233.squidcraft.common.tools;

import io.github.squid233.squidcraft.common.registes.ItemRegister;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

/**
 * @author squid233
 */
public enum ToolMaterials implements IItemTier {
    /**
     *
     */
    SQUID(250, 10, 7, 4, 15, () ->
         Ingredient.fromItems(ItemRegister.SQUID_COOKIE.get())
    );

    private final int durability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int miningLevel;
    private final int enchantability;
    private final LazyValue<Ingredient> repairIngredient;

    ToolMaterials(int durability,
                  float miningSpeed,
                  float attackDamage,
                  int miningLevel,
                  int enchantability,
                  Supplier<Ingredient> repairIngredient)
    {
        this.durability = durability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.miningLevel = miningLevel;
        this.enchantability = enchantability;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    @Override
    public int getMaxUses() {
        return durability;
    }

    @Override
    public float getEfficiency() {
        return miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return miningLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairIngredient.getValue();
    }
}

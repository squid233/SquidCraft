package io.github.squid233.squidcraft.item;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

/**
 * @author squid233
 * @date 2020/9/20
 */
public class ArmorMaterialBuilder {
    private static final int[] BASE_DURABILITY = {13, 15, 16, 11};
    private final String name;
    private int durability;
    private final int[] protectionAmounts = new int[4];
    private int enchantability;
    private SoundEvent equipSound;
    private Lazy<Ingredient> repairIngredient;
    private float toughness;
    private float knockbackResistance;

    public ArmorMaterialBuilder(String name) {
        this.name = name;
    }

    public ArmorMaterialBuilder durability(int durabilityMultiplier) {
        this.durability = durabilityMultiplier;
        return this;
    }

    public ArmorMaterialBuilder protectionAmounts(int head, int chest, int legs, int feet) {
        protectionAmounts[0] = feet;
        protectionAmounts[1] = legs;
        protectionAmounts[2] = chest;
        protectionAmounts[3] = head;
        return this;
    }

    public ArmorMaterialBuilder enchantability(int enchantability) {
        this.enchantability = enchantability;
        return this;
    }

    public ArmorMaterialBuilder equipSound(SoundEvent equipSound) {
        this.equipSound = equipSound;
        return this;
    }

    public ArmorMaterialBuilder repairIngredient(Supplier<Ingredient> repairIngredient) {
        this.repairIngredient = new Lazy<>(repairIngredient);
        return this;
    }

    public ArmorMaterialBuilder toughness(float toughness) {
        this.toughness = toughness;
        return this;
    }

    public ArmorMaterialBuilder knockbackResistance(float knockbackResistance) {
        this.knockbackResistance = knockbackResistance;
        return this;
    }

    public ArmorMaterial build() {
        if (name == null) {
            throw new IllegalStateException("Cannot build ArmorMaterial - name is null");
        }
        return new ArmorMaterial() {
            @Override
            public int getDurability(EquipmentSlot slot) {
                return BASE_DURABILITY[slot.getEntitySlotId()] * durability;
            }

            @Override
            public int getProtectionAmount(EquipmentSlot slot) {
                return protectionAmounts[slot.getEntitySlotId()];
            }

            @Override
            public int getEnchantability() {
                return enchantability;
            }

            @Override
            public SoundEvent getEquipSound() {
                if (equipSound == null) {
                    return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
                }
                return equipSound;
            }

            @Override
            public Ingredient getRepairIngredient() {
                if (repairIngredient == null) {
                    return Ingredient.EMPTY;
                }
                return repairIngredient.get();
            }

            @Override
            @Environment(EnvType.CLIENT)
            public String getName() {
                return name;
            }

            @Override
            public float getToughness() {
                return toughness;
            }

            @Override
            public float getKnockbackResistance() {
                return knockbackResistance;
            }
        };
    }
}

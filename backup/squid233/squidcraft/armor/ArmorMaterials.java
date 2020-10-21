package io.github.squid233.squidcraft.armor;

import io.github.squid233.squidcraft.util.register.ItemRegister;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ArmorMaterials implements ArmorMaterial {
    SQUID("squid", 5, new int[]{5, 8, 7, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0, 0.5f, () -> {
        return Ingredient.ofItems(ItemRegister.SQUID_COOKIE);
    });

    private static final int[] BASE_DURABILITY = {13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float knockBackResistance;
    private final float toughness;
    private final Lazy<Ingredient> repairIngredient;

    ArmorMaterials(String name, int durabilityMultiplier, int[] armorValueArr, int enchantability, SoundEvent soundEvent, float knockBackResistance, float toughness, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = armorValueArr;
        this.enchantability = enchantability;
        this.equipSound = soundEvent;
        this.knockBackResistance = knockBackResistance;
        this.toughness = toughness;
        this.repairIngredient = new Lazy<>(repairIngredient);
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Environment(EnvType.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockBackResistance;
    }
}

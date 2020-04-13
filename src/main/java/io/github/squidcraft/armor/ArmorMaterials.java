package io.github.squidcraft.armor;

import io.github.squidcraft.util.ModItems;
import io.github.squidcraft.util.ModSounds;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.Lazy;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.function.Supplier;

import static io.github.squidcraft.item.ItemGroups.SQUID_CRAFT;

public enum ArmorMaterials implements ArmorMaterial {
    SQUID("squid", 5, new int[]{5, 8, 7, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.5f, () -> {
        return Ingredient.ofItems(ModItems.SQUID_COOKIE);
    }),
    NETHERITE("netherite", 100, new int[]{6, 12, 16, 6}, 30, ModSounds.ITEM_ARMOR_EQUIP_NETHERITE, 6, () -> {
        return Ingredient.ofItems(ModItems.NETHERITE_INGOT);
    });

    private static final int[] baseDurability = {13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final Lazy<Ingredient> repairIngredient;

    ArmorMaterials(String name, int durabilityMultiplier, int[] armorValueArr, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = armorValueArr;
        this.enchantability = enchantability;
        this.equipSound = soundEvent;
        this.toughness = toughness;
        this.repairIngredient = new Lazy<>(repairIngredient);
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return baseDurability[slot.getEntitySlotId()] * this.durabilityMultiplier;
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

    public static class SquidHelmet extends ArmorItem {
        public SquidHelmet() {
            super(ArmorMaterials.SQUID, EquipmentSlot.HEAD, new Item.Settings().group(SQUID_CRAFT));
        }

        @Override
        public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 999999));
            return TypedActionResult.success(new ItemStack(this));
        }
    }
    public static class NetheriteHelmet extends ArmorItem {
        public NetheriteHelmet() {
            super(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, new Item.Settings().group(SQUID_CRAFT));
        }

        @Override
        public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1000000));
            return TypedActionResult.success(new ItemStack(this));
        }
    }
}

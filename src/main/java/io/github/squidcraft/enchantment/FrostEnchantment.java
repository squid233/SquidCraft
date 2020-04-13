package io.github.squidcraft.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FrostEnchantment extends Enchantment {
    public FrostEnchantment(Weight weight, EnchantmentTarget target, EquipmentSlot[] slots) {
        super(weight, target, slots);
    }

    @Override
    public int getMinimumPower(int int_1) {
        return 3;
    }

    @Override
    public int getMaximumLevel() {
        return 10;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity) {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 3 * level, level - 1));
        }
        super.onTargetDamaged(user, target, level);
    }
}

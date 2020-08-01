package io.github.squid233.squidcraft.enchantment;

import io.github.squid233.squidcraft.config.Configs;
import io.github.squid233.squidcraft.config.CreateConfig;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ElectricPowerEnchantment extends Enchantment {
    public ElectricPowerEnchantment(Rarity rarity, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(rarity, type, slotTypes);
    }

    @Override
    public int getMinPower(int level) {
        return 5;
    }

    @Override
    public int getMaxLevel() {
        return CreateConfig.getInt(Configs.ELECTRIC_POWER_MAX_LEVEL);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity) {
            if (level > 5) {
                target.kill();
            } else {
                ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 20 * 2 * level, level - 1));
            }
        }
        super.onTargetDamaged(user, target, level);
    }

    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        if (attacker instanceof LivingEntity) {
            if (level > 5) {
                attacker.kill();
            } else {
                ((LivingEntity) attacker).addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 20 * 2 * level, level - 1));
            }
        }
        super.onUserDamaged(user, attacker, level);
    }
}

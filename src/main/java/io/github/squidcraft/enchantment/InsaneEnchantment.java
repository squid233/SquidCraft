package io.github.squidcraft.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class InsaneEnchantment extends Enchantment {
    public InsaneEnchantment(Weight weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public int getMinimumPower(int level) {
        return 29;
    }

    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION));user.addStatusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS));user.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE));user.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING));user.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST));user.addStatusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER));user.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH));user.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST));user.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK));user.addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA));user.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON));user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE));user.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING));user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED));user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.UNLUCK));user.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS));user.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER));
        super.onUserDamaged(user, attacker, level);
    }
}

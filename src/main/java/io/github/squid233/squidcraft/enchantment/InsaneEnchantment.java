package io.github.squid233.squidcraft.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;

import static net.minecraft.entity.effect.StatusEffects.*;

public class InsaneEnchantment extends Enchantment {
    public InsaneEnchantment(Rarity rarity, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(rarity, type, slotTypes);
    }

    @Override
    public int getMinPower(int level) {
        return 29;
    }

    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        user.addStatusEffect(new StatusEffectInstance(ABSORPTION));user.addStatusEffect(new StatusEffectInstance(BAD_OMEN));
        user.addStatusEffect(new StatusEffectInstance(BLINDNESS));user.addStatusEffect(new StatusEffectInstance(CONDUIT_POWER));
        user.addStatusEffect(new StatusEffectInstance(DOLPHINS_GRACE));user.addStatusEffect(new StatusEffectInstance(FIRE_RESISTANCE));
        user.addStatusEffect(new StatusEffectInstance(GLOWING));user.addStatusEffect(new StatusEffectInstance(HASTE));
        user.addStatusEffect(new StatusEffectInstance(HEALTH_BOOST));user.addStatusEffect(new StatusEffectInstance(HERO_OF_THE_VILLAGE));
        user.addStatusEffect(new StatusEffectInstance(HUNGER));user.addStatusEffect(new StatusEffectInstance(INSTANT_DAMAGE));
        user.addStatusEffect(new StatusEffectInstance(INSTANT_HEALTH));user.addStatusEffect(new StatusEffectInstance(INVISIBILITY));
        user.addStatusEffect(new StatusEffectInstance(JUMP_BOOST));user.addStatusEffect(new StatusEffectInstance(LEVITATION));
        user.addStatusEffect(new StatusEffectInstance(LUCK));user.addStatusEffect(new StatusEffectInstance(MINING_FATIGUE));
        user.addStatusEffect(new StatusEffectInstance(NAUSEA));user.addStatusEffect(new StatusEffectInstance(NIGHT_VISION));
        user.addStatusEffect(new StatusEffectInstance(POISON));user.addStatusEffect(new StatusEffectInstance(REGENERATION));
        user.addStatusEffect(new StatusEffectInstance(RESISTANCE));user.addStatusEffect(new StatusEffectInstance(SATURATION));
        user.addStatusEffect(new StatusEffectInstance(SLOW_FALLING));user.addStatusEffect(new StatusEffectInstance(SLOWNESS));
        user.addStatusEffect(new StatusEffectInstance(SPEED));user.addStatusEffect(new StatusEffectInstance(STRENGTH));
        user.addStatusEffect(new StatusEffectInstance(UNLUCK));user.addStatusEffect(new StatusEffectInstance(WATER_BREATHING));
        user.addStatusEffect(new StatusEffectInstance(WEAKNESS));user.addStatusEffect(new StatusEffectInstance(WITHER));
    }
}

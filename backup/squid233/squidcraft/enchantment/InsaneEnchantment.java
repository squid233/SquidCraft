package io.github.squid233.squidcraft.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

import static io.github.squid233.squidcraft.enchantment.StatusEffectInstances.*;

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
        user.addStatusEffect(ABSORPTION_INSTANCE);
        user.addStatusEffect(BAD_OMEN_INSTANCE);
        user.addStatusEffect(BLINDNESS_INSTANCE);
        user.addStatusEffect(CONDUIT_POWER_INSTANCE);
        user.addStatusEffect(DOLPHINS_GRACE_INSTANCE);
        user.addStatusEffect(FIRE_RESISTANCE_INSTANCE);
        user.addStatusEffect(GLOWING_INSTANCE);
        user.addStatusEffect(HASTE_INSTANCE);
        user.addStatusEffect(HEALTH_BOOST_INSTANCE);
        user.addStatusEffect(HERO_OF_THE_VILLAGE_INSTANCE);
        user.addStatusEffect(HUNGER_INSTANCE);
        user.addStatusEffect(INSTANT_DAMAGE_INSTANCE);
        user.addStatusEffect(INSTANT_HEALTH_INSTANCE);
        user.addStatusEffect(INVISIBILITY_INSTANCE);
        user.addStatusEffect(JUMP_BOOST_INSTANCE);
        user.addStatusEffect(LEVITATION_INSTANCE);
        user.addStatusEffect(LUCK_INSTANCE);
        user.addStatusEffect(MINING_FATIGUE_INSTANCE);
        user.addStatusEffect(NAUSEA_INSTANCE);
        user.addStatusEffect(NIGHT_VISION_INSTANCE);
        user.addStatusEffect(POISON_INSTANCE);
        user.addStatusEffect(REGENERATION_INSTANCE);
        user.addStatusEffect(RESISTANCE_INSTANCE);
        user.addStatusEffect(SATURATION_INSTANCE);
        user.addStatusEffect(SLOW_FALLING_INSTANCE);
        user.addStatusEffect(SLOWNESS_INSTANCE);
        user.addStatusEffect(SPEED_INSTANCE);
        user.addStatusEffect(STRENGTH_INSTANCE);
        user.addStatusEffect(UNLUCK_INSTANCE);
        user.addStatusEffect(WATER_BREATHING_INSTANCE);
        user.addStatusEffect(WEAKNESS_INSTANCE);
        user.addStatusEffect(WITHER_INSTANCE);
    }
}

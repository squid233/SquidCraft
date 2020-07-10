package io.github.squid233.squidcraft.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class FireBoomEnchantment extends Enchantment {
    public FireBoomEnchantment(Rarity rarity, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(rarity, type, slotTypes);
    }

    @Override
    public int getMinPower(int level) {
        return 2;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            World world = user.world;
            boolean bl = world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING);
            world.createExplosion(target, target.prevX, target.prevY, target.prevZ, level, bl, bl ? Explosion.DestructionType.DESTROY : Explosion.DestructionType.NONE);
            world.spawnEntity(target);
        }
        super.onTargetDamaged(user, target, level);
    }
}

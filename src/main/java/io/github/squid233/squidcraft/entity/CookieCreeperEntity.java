package io.github.squid233.squidcraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.world.World;

@SuppressWarnings("EntityConstructor")
public class CookieCreeperEntity extends CreeperEntity {
    public CookieCreeperEntity(EntityType<? extends CreeperEntity> entityType, World world) {
        super(entityType, world);
    }
}

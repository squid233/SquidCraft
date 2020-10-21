package io.github.squid233.squidcraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.world.World;

@SuppressWarnings("EntityConstructor")
public class LavaSquidEntity extends SquidEntity {

    public LavaSquidEntity(EntityType<? extends SquidEntity> entityType, World world) {
        super(entityType, world);
    }

}

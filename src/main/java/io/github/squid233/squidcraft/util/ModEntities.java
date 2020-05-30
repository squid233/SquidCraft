package io.github.squid233.squidcraft.util;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.entity.CookieCreeperEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<CookieCreeperEntity> COOKIE_CREEPER =
            Registry.register(
                    Registry.ENTITY_TYPE,
                    new Identifier(SquidCraft.MODID, "cookie_creeper"),
                    FabricEntityTypeBuilder.create(SpawnGroup.AMBIENT, CookieCreeperEntity::new).dimensions(EntityDimensions.fixed(1, 2)).build()
            );
}

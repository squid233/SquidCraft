package io.github.squidcraft.util;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.entity.CookieCreeperEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<CookieCreeperEntity> COOKIE_CREEPER =
            Registry.register(
                    Registry.ENTITY_TYPE,
                    new Identifier(SquidCraft.MODID, "cookie_creeper"),
                    FabricEntityTypeBuilder.create(EntityCategory.AMBIENT, CookieCreeperEntity::new).dimensions(EntityDimensions.fixed(1, 2)).build()
            );
}

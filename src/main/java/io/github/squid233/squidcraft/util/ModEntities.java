package io.github.squid233.squidcraft.util;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.entity.CookieCreeperEntity;
import io.github.squid233.squidcraft.entity.CubeEntity;
import io.github.squid233.squidcraft.entity.LavaSquidEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;

public class ModEntities {

    /*
     * Registers our Cube Entity under the ID "squidcraft:cube".
     *
     * The entity is registered under the SpawnGroup#CREATURE category, which is what most animals and passive/neutral mobs use.
     * It has a hitbox size of .75x.75, or 12 "pixels" wide (3/4ths of a block).
     */
    public static final EntityType<CubeEntity> CUBE = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(SquidCraft.MODID, "cube"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CubeEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );

    public static final EntityType<CookieCreeperEntity> COOKIE_CREEPER = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(SquidCraft.MODID, "cookie_creeper"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, CookieCreeperEntity::new).dimensions(EntityDimensions.fixed(1, 2)).build()
    );

    public static final EntityType<LavaSquidEntity> LAVA_SQUID = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(SquidCraft.MODID, "lava_squid"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, LavaSquidEntity::new).dimensions(EntityDimensions.fixed(0.8F, 0.8F)).build()
    );

    public ModEntities() {
        add();
        Biomes.PLAINS.getEntitySpawnList(SpawnGroup.MONSTER).add(new Biome.SpawnEntry(ModEntities.COOKIE_CREEPER, 30, 1, 2));
        Biomes.PLAINS.getEntitySpawnList(SpawnGroup.CREATURE).add(new Biome.SpawnEntry(ModEntities.CUBE, 30, 1, 2));
        Biomes.NETHER_WASTES.getEntitySpawnList(SpawnGroup.CREATURE).add(new Biome.SpawnEntry(ModEntities.LAVA_SQUID, 35, 2, 3));
    }

    public void add() {
        /*
         * Register our Cube Entity's default attributes.
         * Attributes are properties or stats of the mobs, including things like attack damage and health.
         * The game will crash if the entity doesn't have the proper attributes registered in time.
         *
         * In 1.16, this was done by a method override inside the entity class.
         * Most vanilla entities have a static method (eg. ZombieEntity#createZombieAttributes) for initializing their attributes.
         */
        FabricDefaultAttributeRegistry.register(CUBE, CubeEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(COOKIE_CREEPER, CookieCreeperEntity.createCreeperAttributes());
        FabricDefaultAttributeRegistry.register(LAVA_SQUID, LavaSquidEntity.createSquidAttributes());
    }
}

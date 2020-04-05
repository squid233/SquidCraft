package io.github.squidcraft.biome;

import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

public class SquidBiome extends Biome {
    public SquidBiome() {
        super(new Settings().configureSurfaceBuilder(
                SurfaceBuilder.SWAMP,
                SurfaceBuilder.GRASS_CONFIG
        ).precipitation(Precipitation.RAIN)
                .category(Category.OCEAN)
                .depth(0.24f)
                .scale(0.2f)
                .temperature(0.6f)
                .downfall(0.7f)
                .waterColor(4159204)
                .waterFogColor(329011)
                .parent(null)
        );

        DefaultBiomeFeatures.addDefaultOres(this);
        this.addSpawn(EntityCategory.WATER_CREATURE, new SpawnEntry(EntityType.SQUID, 12, 4, 4));
    }
}

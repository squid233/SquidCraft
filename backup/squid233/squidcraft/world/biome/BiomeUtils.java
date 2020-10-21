package io.github.squid233.squidcraft.world.biome;

import io.github.squid233.squidcraft.world.Features;
import io.github.squid233.squidcraft.world.feature.OreFeature;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.DecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.MineshaftFeature;
import net.minecraft.world.gen.feature.MineshaftFeatureConfig;
import net.minecraft.world.gen.feature.ShipwreckFeatureConfig;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

import static net.minecraft.entity.EntityType.*;
import static net.minecraft.entity.SpawnGroup.WATER_CREATURE;
import static net.minecraft.world.gen.GenerationStep.Feature.VEGETAL_DECORATION;
import static net.minecraft.world.gen.feature.DefaultBiomeFeatures.*;
import static net.minecraft.world.gen.feature.StructureFeature.MINESHAFT;
import static net.minecraft.world.gen.feature.StructureFeature.SHIPWRECK;

public class BiomeUtils {

    protected static void adds(GenerationSettings.Builder b) {
        addOceanCarvers(b);
        addDefaultLakes(b);
        addDungeons(b);
        addDefaultOres(b);
        addDefaultDisks(b);
        addMineables(b);
        addWaterBiomeOakTrees(b);
        addDefaultFlowers(b);
        addDefaultGrass(b);
        addDefaultMushrooms(b);
        addDefaultVegetation(b);
        addSprings(b);
        addSeagrassOnStone(b);
        addKelp(b);
        addFrozenTopLayer(b);
        addClay(b);
        addDefaultUndergroundStructures(b);
    }

    public static void spawnWaterCreature(SpawnSettings.Builder b, EntityType<? extends Entity> entityType, int w, int min, int max) {
        b.spawn(WATER_CREATURE, new SpawnSettings.SpawnEntry(entityType, w, min, max));
    }

    public static GenerationSettings.Builder buildGrassSurface(GenerationSettings.Builder anotherGenSet, SurfaceBuilder<TernarySurfaceConfig> surfaceBuilder) {
        return anotherGenSet.surfaceBuilder(new ConfiguredSurfaceBuilder<>(surfaceBuilder, SurfaceBuilder.GRASS_CONFIG));
    }

    public static Biome createSquidBiome(SurfaceBuilder<TernarySurfaceConfig> surfaceBuilder,
                                         Biome.Precipitation precipitation,
                                         float temperature,
                                         float downfall,
                                         BiomeMoodSound moodSound) {
        SpawnSettings.Builder b = new SpawnSettings.Builder();
        GenerationSettings.Builder bb = buildGrassSurface(new GenerationSettings.Builder().feature(GenerationStep.Feature.UNDERGROUND_ORES, OreFeature.SQUID_BLOCK_OVERWORLD)
                .feature(GenerationStep.Feature.SURFACE_STRUCTURES,
                Features.SQUID_SPIRAL.configure(FeatureConfig.DEFAULT).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(100)))), surfaceBuilder);
        bb.structureFeature(MINESHAFT.configure(new MineshaftFeatureConfig(0.004F, MineshaftFeature.Type.NORMAL)));
        bb.structureFeature(SHIPWRECK.configure(new ShipwreckFeatureConfig(false)));
        adds(bb);
        bb.feature(VEGETAL_DECORATION, Feature.SEAGRASS.configure(new ProbabilityConfig(0.3F)).decorate(Decorator.TOP_SOLID_HEIGHTMAP.configure(DecoratorConfig.DEFAULT)));
        spawnWaterCreature(b, SQUID, 96, 4, 6);
        spawnWaterCreature(b, COD, 10, 3, 6);
        spawnWaterCreature(b, DOLPHIN, 2, 1, 2);
        return new Biome.Builder()
                .spawnSettings(b.build())
                .generationSettings(bb.build())
                .precipitation(precipitation)
                .category(Biome.Category.OCEAN)
                .depth(0.125F)
                .scale(0.05F)
                .temperature(temperature)
                .downfall(downfall)
                .effects(new BiomeEffects.Builder()
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .fogColor(12638463)
                        .moodSound(moodSound)
                        .build())
                .build();
    }
}
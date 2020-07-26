package io.github.squid233.squidcraft.world.biome;

import com.google.common.collect.ImmutableList;
import io.github.squid233.squidcraft.util.ModEntities;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.gen.feature.MineshaftFeatureConfig;
import net.minecraft.world.gen.feature.SeagrassFeatureConfig;
import net.minecraft.world.gen.feature.ShipwreckFeatureConfig;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

import static net.minecraft.entity.EntityType.*;
import static net.minecraft.entity.SpawnGroup.WATER_CREATURE;
import static net.minecraft.world.gen.GenerationStep.Feature.VEGETAL_DECORATION;
import static net.minecraft.world.gen.decorator.Decorator.TOP_SOLID_HEIGHTMAP;
import static net.minecraft.world.gen.decorator.DecoratorConfig.DEFAULT;
import static net.minecraft.world.gen.feature.DefaultBiomeFeatures.*;
import static net.minecraft.world.gen.feature.Feature.SEAGRASS;
import static net.minecraft.world.gen.feature.MineshaftFeature.Type.NORMAL;
import static net.minecraft.world.gen.feature.StructureFeature.MINESHAFT;
import static net.minecraft.world.gen.feature.StructureFeature.SHIPWRECK;

public class SquidBiome extends Biome {
    public SquidBiome() {
        super((new Biome.Settings()).configureSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG).precipitation(Biome.Precipitation.RAIN).category(Category.OCEAN).depth(0.125F).scale(0.05F).temperature(0.8F).downfall(0.4F).effects((new BiomeEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(12638463).moodSound(BiomeMoodSound.CAVE).build()).parent(null).noises(ImmutableList.of(new Biome.MixedNoisePoint(0.0F, 0.0F, 0.0F, 0.0F, 1.0F))));
        this.addStructureFeature(MINESHAFT.configure(new MineshaftFeatureConfig(0.004D, NORMAL)));
        this.addStructureFeature(SHIPWRECK.configure(new ShipwreckFeatureConfig(false)));
        adds(this);
        this.addFeature(VEGETAL_DECORATION, SEAGRASS.configure(new SeagrassFeatureConfig(48, 0.3D)).createDecoratedFeature(TOP_SOLID_HEIGHTMAP.configure(DEFAULT)));
        spawn(SQUID, 96, 4, 6);
        spawn(COD, 10, 3, 6);
        spawn(DOLPHIN, 2, 1, 2);

    }

    protected void adds(Biome b) {
        addOceanCarvers(b);addDefaultLakes(b);
        addDungeons(b);addDefaultOres(b);
        addDefaultDisks(b);addMineables(b);
        addWaterBiomeOakTrees(b);addDefaultFlowers(b);
        addDefaultGrass(b);addDefaultMushrooms(b);
        addDefaultVegetation(b);addSprings(b);
        addSeagrassOnStone(b);addKelp(b);
        addFrozenTopLayer(b);addClay(b);
        addDefaultUndergroundStructures(b);
    }
    protected void spawn(EntityType<? extends Entity> entityType, int w, int min, int max) {
        this.addSpawn(WATER_CREATURE, new SpawnEntry(entityType, w, min, max));
    }
}

/*package io.github.squid233.squidcraft.world.biome;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.biome.source.BiomeAccess;
import net.minecraft.world.gen.feature.MineshaftFeatureConfig;
import net.minecraft.world.gen.feature.SeagrassFeature;
import net.minecraft.world.gen.feature.SeagrassFeatureConfig;
import net.minecraft.world.gen.feature.ShipwreckFeatureConfig;

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

public class BiomeUtils extends Biome {
    protected BiomeUtils(Biome.Builder builder) {
        init();
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
        this.feature(WATER_CREATURE, new SpawnSettings.SpawnEntry(entityType, w, min, max));
    }

    protected void init() {
        this.addStructureFeature(MINESHAFT.configure(new MineshaftFeatureConfig(0.004D, NORMAL)));
        this.addStructureFeature(SHIPWRECK.configure(new ShipwreckFeatureConfig(false)));
        adds(this);
        this.addFeature(VEGETAL_DECORATION, SEAGRASS.configure(new SeagrassFeatureConfig(48, 0.3D)).createDecoratedFeature(TOP_SOLID_HEIGHTMAP.configure(DEFAULT)));
        spawn(SQUID, 96, 4, 6);
        spawn(COD, 10, 3, 6);
        spawn(DOLPHIN, 2, 1, 2);
    }
}





fixme 2020/8/13
*/
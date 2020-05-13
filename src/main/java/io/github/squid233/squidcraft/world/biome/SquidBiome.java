package io.github.squid233.squidcraft.world.biome;

import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.surfacebuilder.*;

import static net.minecraft.block.Blocks.WATER;
import static net.minecraft.entity.EntityCategory.WATER_CREATURE;
import static net.minecraft.entity.EntityType.*;
import static net.minecraft.world.biome.Biome.Category.OCEAN;
import static net.minecraft.world.biome.Biome.Precipitation.RAIN;
import static net.minecraft.world.biome.DefaultBiomeFeatures.*;
import static net.minecraft.world.gen.GenerationStep.Feature.VEGETAL_DECORATION;
import static net.minecraft.world.gen.decorator.Decorator.TOP_SOLID_HEIGHTMAP;
import static net.minecraft.world.gen.decorator.DecoratorConfig.DEFAULT;
import static net.minecraft.world.gen.feature.Feature.*;
import static net.minecraft.world.gen.feature.MineshaftFeature.Type.NORMAL;
import static net.minecraft.world.gen.surfacebuilder.SurfaceBuilder.SWAMP;

public class SquidBiome extends Biome {

    public SquidBiome() {
        super(new Settings().configureSurfaceBuilder(SWAMP, new TernarySurfaceConfig(WATER.getDefaultState(), WATER.getDefaultState(), WATER.getDefaultState())).precipitation(RAIN).category(OCEAN).depth(0.24f).scale(0.2f).temperature(0.6f).downfall(0.5f).waterColor(4159204).waterFogColor(329011).parent(null));

        this.addStructureFeature(MINESHAFT.configure(new MineshaftFeatureConfig(0.004D, NORMAL)));
        this.addStructureFeature(SHIPWRECK.configure(new ShipwreckFeatureConfig(false)));
        adds(this);
        this.addFeature(VEGETAL_DECORATION, SEAGRASS.configure(new SeagrassFeatureConfig(48, 0.3D)).createDecoratedFeature(TOP_SOLID_HEIGHTMAP.configure(DEFAULT)));
        Spawn(SQUID, 96, 4, 6);
        Spawn(COD, 10, 3, 6);
        Spawn(DOLPHIN, 1, 1, 2);
    }

    public static void adds(Biome b) {
        addOceanCarvers(b);addDefaultStructures(b);
        addDefaultLakes(b);addDungeons(b);
        addDefaultOres(b);addDefaultDisks(b);
        addMineables(b);addWaterBiomeOakTrees(b);
        addDefaultFlowers(b);addDefaultGrass(b);
        addDefaultMushrooms(b);addDefaultVegetation(b);
        addSprings(b);addSeagrassOnStone(b);
        addKelp(b);addFrozenTopLayer(b);
        addClay(b);
    }
    public void Spawn(EntityType entityType,int w, int min, int max) {
        this.addSpawn(WATER_CREATURE, new SpawnEntry(entityType, w, min, max));
    }
}

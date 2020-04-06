package io.github.squidcraft.world.biome;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.DecoratorConfig;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class SquidBiome extends Biome {
    public SquidBiome() {
        super(new Settings().configureSurfaceBuilder(SurfaceBuilder.SWAMP, new TernarySurfaceConfig(Blocks.WATER.getDefaultState(), Blocks.WATER.getDefaultState(), Blocks.WATER.getDefaultState())).precipitation(Precipitation.RAIN).category(Category.OCEAN).depth(0.24f).scale(0.2f).temperature(0.6f).downfall(0.5f).waterColor(4159204).waterFogColor(329011).parent((String)null));

        this.addStructureFeature(Feature.MINESHAFT.configure(new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL)));
        this.addStructureFeature(Feature.SHIPWRECK.configure(new ShipwreckFeatureConfig(false)));
        DefaultBiomeFeatures.addOceanCarvers(this);
        DefaultBiomeFeatures.addDefaultStructures(this);
        DefaultBiomeFeatures.addDefaultLakes(this);
        DefaultBiomeFeatures.addDungeons(this);
        DefaultBiomeFeatures.addDefaultOres(this);
        DefaultBiomeFeatures.addDefaultDisks(this);
        DefaultBiomeFeatures.addMineables(this);
        DefaultBiomeFeatures.addWaterBiomeOakTrees(this);
        DefaultBiomeFeatures.addDefaultFlowers(this);
        DefaultBiomeFeatures.addDefaultGrass(this);
        DefaultBiomeFeatures.addDefaultMushrooms(this);
        DefaultBiomeFeatures.addDefaultVegetation(this);
        DefaultBiomeFeatures.addSprings(this);
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.SEAGRASS.configure(new SeagrassFeatureConfig(48, 0.3D)).createDecoratedFeature(Decorator.TOP_SOLID_HEIGHTMAP.configure(DecoratorConfig.DEFAULT)));
        DefaultBiomeFeatures.addSeagrassOnStone(this);
        DefaultBiomeFeatures.addKelp(this);
        DefaultBiomeFeatures.addFrozenTopLayer(this);
        DefaultBiomeFeatures.addClay(this);
        this.addSpawn(EntityCategory.WATER_CREATURE, new SpawnEntry(EntityType.SQUID, 96, 4, 6));
        this.addSpawn(EntityCategory.WATER_CREATURE, new Biome.SpawnEntry(EntityType.COD, 10, 3, 6));
        this.addSpawn(EntityCategory.WATER_CREATURE, new Biome.SpawnEntry(EntityType.DOLPHIN, 1, 1, 2));
    }
}

package io.github.squid233.squidcraft.world.biome;

import io.github.squid233.squidcraft.util.ModEntities;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.surfacebuilder.*;

import static net.minecraft.block.Blocks.WATER;
import static net.minecraft.entity.SpawnGroup.WATER_CREATURE;
import static net.minecraft.entity.EntityType.*;
import static net.minecraft.world.biome.Biome.Category.OCEAN;
import static net.minecraft.world.biome.Biome.Precipitation.RAIN;
import static net.minecraft.world.biome.DefaultBiomeFeatures.*;
import static net.minecraft.world.gen.GenerationStep.Feature.VEGETAL_DECORATION;
import static net.minecraft.world.gen.decorator.Decorator.TOP_SOLID_HEIGHTMAP;
import static net.minecraft.world.gen.decorator.DecoratorConfig.DEFAULT;
import static net.minecraft.world.gen.feature.Feature.*;
import static net.minecraft.world.gen.feature.MineshaftFeature.Type.NORMAL;
import static net.minecraft.world.gen.feature.StructureFeature.MINESHAFT;
import static net.minecraft.world.gen.feature.StructureFeature.SHIPWRECK;

public class SquidBiome extends Biome {

    public SquidBiome() {
        super(new Settings().configureSurfaceBuilder(SurfaceBuilder.DEFAULT, new TernarySurfaceConfig(WATER.getDefaultState(), WATER.getDefaultState(), WATER.getDefaultState())).precipitation(RAIN).category(OCEAN).depth(0.24f).scale(0.2f).temperature(0.6f).downfall(0.5f).effects(new BiomeEffects.Builder().waterColor(4159204).waterFogColor(329011).fogColor(0).build()).parent(null));

        this.addStructureFeature(MINESHAFT.configure(new MineshaftFeatureConfig(0.004D, NORMAL)));
        this.addStructureFeature(SHIPWRECK.configure(new ShipwreckFeatureConfig(false)));
        adds(this);
        this.addFeature(VEGETAL_DECORATION, SEAGRASS.configure(new SeagrassFeatureConfig(48, 0.3D)).createDecoratedFeature(TOP_SOLID_HEIGHTMAP.configure(DEFAULT)));
        spawn(SQUID, 96, 4, 6);
        spawn(COD, 10, 3, 6);
        spawn(DOLPHIN, 2, 1, 2);
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(ModEntities.COOKIE_CREEPER, 1, 1, 2));

    }

    private void adds(Biome b) {
        addOceanCarvers(b);addDefaultLakes(b);
        addDungeons(b);addDefaultOres(b);
        addDefaultDisks(b);addMineables(b);
        addWaterBiomeOakTrees(b);addDefaultFlowers(b);
        addDefaultGrass(b);addDefaultMushrooms(b);
        addDefaultVegetation(b);addSprings(b);
        addSeagrassOnStone(b);addKelp(b);
        addFrozenTopLayer(b);addClay(b);
    }
    public void spawn(EntityType<? extends Entity> entityType, int w, int min, int max) {
        this.addSpawn(WATER_CREATURE, new SpawnEntry(entityType, w, min, max));
    }
}

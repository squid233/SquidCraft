package io.github.squid233.squidcraft.mixin;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.*;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.world.biome.BiomeEffects.Builder;

import static net.minecraft.entity.EntityType.*;
import static net.minecraft.entity.SpawnGroup.*;
import static net.minecraft.world.biome.Biome.Category.OCEAN;
import static net.minecraft.world.biome.Biome.Precipitation.RAIN;
import static net.minecraft.world.biome.DefaultBiomeFeatures.*;
import static net.minecraft.world.gen.decorator.Decorator.TOP_SOLID_HEIGHTMAP;
import static net.minecraft.world.gen.feature.MineshaftFeature.Type.NORMAL;
import static net.minecraft.world.gen.feature.OceanRuinFeature.BiomeType.COLD;
import static net.minecraft.world.gen.feature.StructureFeature.*;
import static net.minecraft.world.gen.surfacebuilder.SurfaceBuilder.DEFAULT;
import static net.minecraft.world.gen.surfacebuilder.SurfaceBuilder.GRASS_CONFIG;

@Mixin(OceanBiome.class)
public final class OceanBiomeMixin extends Biome {
    protected OceanBiomeMixin() {
        super((new Settings()).configureSurfaceBuilder(DEFAULT, GRASS_CONFIG).precipitation(RAIN).category(OCEAN).depth(-1.0F).scale(0.1F).temperature(0.5F).downfall(0.5F).effects((new Builder()).waterColor(4159204).waterFogColor(329011).build()).parent(null));
        this.addStructureFeature(MINESHAFT.method_28659(new MineshaftFeatureConfig(0.004D, NORMAL)));
        this.addStructureFeature(SHIPWRECK.method_28659(new ShipwreckFeatureConfig(false)));
        this.addStructureFeature(OCEAN_RUIN.method_28659(new OceanRuinFeatureConfig(COLD, 0.3F, 0.9F)));
        adds(this);
        this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.SEAGRASS.configure(new SeagrassFeatureConfig(48, 0.3D)).createDecoratedFeature(TOP_SOLID_HEIGHTMAP.configure(DecoratorConfig.DEFAULT)));
        Spawn(WATER_CREATURE, SQUID, 10, 2, 5);
        Spawn(WATER_CREATURE, COD, 5, 1, 4);
        Spawn(WATER_CREATURE, DOLPHIN, 6, 1, 3);
        Spawn(AMBIENT, BAT, 10, 8, 8);
        Spawn(MONSTER, SPIDER, 100, 4, 4);
        Spawn(MONSTER, ZOMBIE, 95, 4, 4);
        Spawn(MONSTER, DROWNED, 5, 1, 1);
        Spawn(MONSTER, ZOMBIE_VILLAGER, 5, 1, 1);
        Spawn(MONSTER, SKELETON, 100, 4, 4);
        Spawn(MONSTER, CREEPER, 100, 4, 4);
        Spawn(MONSTER, SLIME, 100, 4, 4);
        Spawn(MONSTER, ENDERMAN, 10, 1, 4);
        Spawn(MONSTER, WITCH, 5, 1, 1);
    }
    private static void adds(Biome b) {
        addOceanCarvers(b);
        addDefaultLakes(b);addDungeons(b);
        addMineables(b);addDefaultOres(b);
        addDefaultDisks(b);addWaterBiomeOakTrees(b);
        addDefaultFlowers(b);addDefaultGrass(b);
        addDefaultMushrooms(b);addDefaultVegetation(b);
        addSprings(b);addSeagrassOnStone(b);
        addKelp(b);addFrozenTopLayer(b);
    }
    public void Spawn(SpawnGroup g, EntityType<? extends Entity> et, int w, int min, int max) {
        this.addSpawn(g, new SpawnEntry(et, w, min, max));
    }
}

package io.github.squid233.squidcraft.world.biome;

import net.minecraft.world.biome.BiomeEffects.Builder;

import static com.google.common.collect.ImmutableList.of;
import static net.minecraft.sound.BiomeMoodSound.CAVE;
import static net.minecraft.world.biome.Biome.Category.OCEAN;
import static net.minecraft.world.biome.Biome.Precipitation.RAIN;
import static net.minecraft.world.gen.surfacebuilder.SurfaceBuilder.GRASS_CONFIG;
import static net.minecraft.world.gen.surfacebuilder.SurfaceBuilder.SWAMP;

public class ChaosSquidBiome extends BiomeUtils {
    public ChaosSquidBiome() {
        super(new Settings().configureSurfaceBuilder(SWAMP, GRASS_CONFIG).precipitation(RAIN).category(OCEAN).depth(0.125F).scale(0.05F).temperature(0.6F).downfall(0.4F).effects(new Builder().waterColor(4159204).waterFogColor(329011).fogColor(12638463).moodSound(CAVE).build()).parent(null).noises(of(new MixedNoisePoint(0.0F, 0.0F, 0.0F, 0.0F, 1.0F))));
    }
}

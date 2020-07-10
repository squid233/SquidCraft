package io.github.squid233.squidcraft.util.registers;

import io.github.squid233.squidcraft.util.ModBiomes;
import io.github.squid233.squidcraft.world.Features;
import io.github.squid233.squidcraft.world.feature.*;
import net.fabricmc.fabric.api.biomes.v1.*;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.FeatureConfig;

public class WorldGenRegister {
    public WorldGenRegister() {
        OverworldBiomes.addContinentalBiome(ModBiomes.SQUID_BIOME, OverworldClimate.TEMPERATE, 3d);
        OverworldBiomes.addShoreBiome(ModBiomes.SQUID_BIOME, Biomes.BEACH, 1);
        FabricBiomes.addSpawnBiome(ModBiomes.SQUID_BIOME);

        OverworldBiomes.addContinentalBiome(ModBiomes.CHAOS_SQUID_BIOME, OverworldClimate.TEMPERATE, 3d);
        OverworldBiomes.addShoreBiome(ModBiomes.CHAOS_SQUID_BIOME, Biomes.BEACH, 1);
        FabricBiomes.addSpawnBiome(ModBiomes.CHAOS_SQUID_BIOME);

        Registry.BIOME.forEach(biome -> biome.addFeature(
                GenerationStep.Feature.RAW_GENERATION,
                Features.SQUID_SPIRAL.configure(
                        FeatureConfig.DEFAULT
                ).createDecoratedFeature(
                        Decorator.CHANCE_HEIGHTMAP.configure(new ChanceDecoratorConfig(100))
                )
        ));

        Registry.BIOME.forEach(OreFeature::spawnSquidBlock);
        RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> OreFeature.spawnSquidBlock(biome));

    }
}

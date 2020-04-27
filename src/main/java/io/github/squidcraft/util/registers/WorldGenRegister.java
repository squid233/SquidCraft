package io.github.squidcraft.util.registers;

import io.github.squidcraft.util.ModBiomes;
import io.github.squidcraft.world.feature.OreFeature;
import io.github.squidcraft.world.feature.SquidSpiralFeature;
import net.fabricmc.fabric.api.biomes.v1.FabricBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldClimate;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.FeatureConfig;

public class WorldGenRegister {
    public WorldGenRegister() {
        OverworldBiomes.addContinentalBiome(ModBiomes.SQUID_BIOME, OverworldClimate.TEMPERATE, 3d);

        OverworldBiomes.addShoreBiome(ModBiomes.SQUID_BIOME, Biomes.BEACH, 1);

        FabricBiomes.addSpawnBiome(ModBiomes.SQUID_BIOME);

        Registry.BIOME.forEach(biome -> biome.addFeature(
                GenerationStep.Feature.RAW_GENERATION,
                SquidSpiralFeature.SQUID_SPIRAL.configure(
                        FeatureConfig.DEFAULT
                ).createDecoratedFeature(
                        Decorator.CHANCE_HEIGHTMAP.configure(new ChanceDecoratorConfig(100))
                )
        ));

        Registry.BIOME.forEach(OreFeature::spawnSquidBlock);
        RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> OreFeature.spawnSquidBlock(biome));

        Registry.BIOME.forEach(OreFeature::spawnCopperOre);
        RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> OreFeature.spawnCopperOre(biome));

        Registry.BIOME.forEach(OreFeature::spawnAncientDebris);
        RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> OreFeature.spawnAncientDebris(biome));
    }
}

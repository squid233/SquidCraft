package io.github.squidcraft.world.feature;

import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

public class FeatureRegister {
    public FeatureRegister() {
        Registry.BIOME.forEach(biome -> biome.addFeature(
                GenerationStep.Feature.SURFACE_STRUCTURES,
                Feature.BLUE_ICE.configure(
                        new DefaultFeatureConfig()
                ).createDecoratedFeature(
                        Decorator.CHANCE_HEIGHTMAP.configure(new ChanceDecoratorConfig(100))
                )
        ));

        Registry.BIOME.forEach(OreFeature::spawnSquidBlock);
        Registry.BIOME.forEach(OreFeature::spawnAncientDebris);

        RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> OreFeature.spawnSquidBlock(biome));
    }
}

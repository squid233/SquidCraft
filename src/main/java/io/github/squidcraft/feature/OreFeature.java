package io.github.squidcraft.feature;

import io.github.squidcraft.block.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.Random;

public class OreFeature {
    public static void spawnSquidBlock(Biome biome) {
        if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Feature.ORE.configure(
                            new OreFeatureConfig(
                                    OreFeatureConfig.Target.NATURAL_STONE,
                                    ModBlocks.SQUID_BLOCK.getDefaultState(),
                                    2 // Vein size
                            )).createDecoratedFeature(
                            Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                    4, // Vein count of per chunk
                                    0, // Bottom offset
                                    32, // Minimum y level
                                    64 // Maximum y level
                            ))));
        }
    }

    public static void spawnAncientDebris(Biome biome) {
        Random random = new Random();
        if (biome.getCategory() == Biome.Category.NETHER) {
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Feature.ORE.configure(
                            new OreFeatureConfig(
                                    OreFeatureConfig.Target.NETHERRACK,
                                    ModBlocks.ANCIENT_DEBRIS.getDefaultState(),
                                    random.nextInt(4)
                            )).createDecoratedFeature(
                            Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                    1,
                                    0,
                                    8,
                                    22
                            ))));
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Feature.ORE.configure(
                            new OreFeatureConfig(
                                    OreFeatureConfig.Target.NETHERRACK,
                                    ModBlocks.ANCIENT_DEBRIS.getDefaultState(),
                                    random.nextInt(3)
                            )).createDecoratedFeature(
                            Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                    1,
                                    0,
                                    8,
                                    119
                            ))
                    )
            );
        }
    }
}

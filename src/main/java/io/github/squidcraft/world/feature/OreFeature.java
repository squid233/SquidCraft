package io.github.squidcraft.world.feature;

import io.github.squidcraft.config.CreateConfig;
import io.github.squidcraft.util.registers.BlockRegister;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreFeature {
    public static void spawnSquidBlock(Biome biome) {
        if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Feature.ORE.configure(
                            new OreFeatureConfig(
                                    OreFeatureConfig.Target.NATURAL_STONE,
                                    BlockRegister.SQUID_BLOCK.getDefaultState(),
                                    Integer.parseInt(CreateConfig.properties.getProperty("squidBlockSpawnSize")) // Vein size
                            )).createDecoratedFeature(
                            Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                    Integer.parseInt(CreateConfig.properties.getProperty("squidBlockPerChunkSpawnCount")), // Vein count of per chunk
                                    0, // Bottom offset
                                    Integer.parseInt(CreateConfig.properties.getProperty("squidBlockSpawnMinYLevel")), // Minimum y level
                                    Integer.parseInt(CreateConfig.properties.getProperty("squidBlockSpawnMaxYLevel")) // Maximum y level
                            ))));
        }
    }

    public static void spawnAncientDebris(Biome biome) {
        if (biome.getCategory() == Biome.Category.NETHER) {
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Feature.ORE.configure(
                            new OreFeatureConfig(
                                    OreFeatureConfig.Target.NETHERRACK,
                                    BlockRegister.ANCIENT_DEBRIS.getDefaultState(),
                                    5
                            )).createDecoratedFeature(
                            Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                    1,
                                    0,
                                    8,
                                    22
                            ))));
        }
    }

    public static void spawnCopperOre(Biome biome) {
        if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Feature.ORE.configure(
                            new OreFeatureConfig(
                                    OreFeatureConfig.Target.NATURAL_STONE,
                                    BlockRegister.COPPER_ORE.getDefaultState(),
                                    8
                            )).createDecoratedFeature(
                            Decorator.COUNT_RANGE.configure(
                                    new RangeDecoratorConfig(
                                            2,
                                            0,
                                            0,
                                            64
                                    )
                            )
                    )
            );
        }
    }
}

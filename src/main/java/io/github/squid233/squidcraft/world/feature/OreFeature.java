package io.github.squid233.squidcraft.world.feature;

import io.github.squid233.squidcraft.config.Configs;
import io.github.squid233.squidcraft.config.CreateConfig;
import io.github.squid233.squidcraft.util.register.BlockRegister;
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
                                    CreateConfig.getInt(Configs.SQUID_BLOCK_SPAWN_SIZE) // Vein size
                            )).createDecoratedFeature(
                            Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                    CreateConfig.getInt(Configs.SQUID_BLOCK_PER_CHUNK_SPAWN_COUNT), // Vein count of per chunk
                                    0, // Bottom offset
                                    CreateConfig.getInt(Configs.SQUID_BLOCK_SPAWN_MIN_Y_LEVEL), // Minimum y level
                                    CreateConfig.getInt(Configs.SQUID_BLOCK_SPAWN_MAX_Y_LEVEL) // Maximum y level
                            ))));
        }
    }
}

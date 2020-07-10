package io.github.squid233.squidcraft.world.feature;

import io.github.squid233.squidcraft.config.CreateConfig;
import io.github.squid233.squidcraft.util.registers.BlockRegister;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.*;
import static java.lang.Integer.parseInt;

public class OreFeature {
    public static void spawnSquidBlock(Biome biome) {
        if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Feature.ORE.configure(
                            new OreFeatureConfig(
                                    OreFeatureConfig.Target.NATURAL_STONE,
                                    BlockRegister.SQUID_BLOCK.getDefaultState(),
                                    parseInt(CreateConfig.PROPERTIES.getProperty("squidBlockSpawnSize")) // Vein size
                            )).createDecoratedFeature(
                            Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                    parseInt(CreateConfig.PROPERTIES.getProperty("squidBlockPerChunkSpawnCount")), // Vein count of per chunk
                                    0, // Bottom offset
                                    parseInt(CreateConfig.PROPERTIES.getProperty("squidBlockSpawnMinYLevel")), // Minimum y level
                                    parseInt(CreateConfig.PROPERTIES.getProperty("squidBlockSpawnMaxYLevel")) // Maximum y level
                            ))));
        }
    }
}

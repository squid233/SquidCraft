package io.github.squid233.squidcraft.world.feature;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.config.Configs;
import io.github.squid233.squidcraft.config.CreateConfig;
import io.github.squid233.squidcraft.util.register.BlockRegister;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreFeature {
    public static ConfiguredFeature<?, ?> SQUID_BLOCK_OVERWORLD = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
            new Identifier(SquidCraft.MODID, "squid_block_overworld"), Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    BlockRegister.SQUID_BLOCK.getDefaultState(),
                    // vein size
                    CreateConfig.getInt(Configs.SQUID_BLOCK_SPAWN_SIZE)
            ))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    // bottom offset
                    0,
                    // min y level
                    CreateConfig.getInt(Configs.SQUID_BLOCK_SPAWN_MIN_Y_LEVEL),
                    // max y level
                    CreateConfig.getInt(Configs.SQUID_BLOCK_SPAWN_MAX_Y_LEVEL)
            )))
            .spreadHorizontally()
            // number of veins per chunk
            .repeat(CreateConfig.getInt(Configs.SQUID_BLOCK_PER_CHUNK_SPAWN_COUNT)));
}

package io.github.squid233.squidcraft.world;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.world.feature.SquidSpiralFeature;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

public class Features {
    public static final Feature<DefaultFeatureConfig> SQUID_SPIRAL = Registry.register(
            Registry.FEATURE,
            new Identifier(SquidCraft.MODID, "squid_spiral"),
            new SquidSpiralFeature(DefaultFeatureConfig.CODEC)
    );
}

package io.github.squidcraft.util;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.world.biome.SquidBiome;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public class ModBiomes {
    public static final Biome SQUID_BIOME = Registry.register(Registry.BIOME, new Identifier(SquidCraft.MODID, "squid_biome"), new SquidBiome());

}

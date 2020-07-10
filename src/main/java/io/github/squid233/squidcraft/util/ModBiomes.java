package io.github.squid233.squidcraft.util;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.world.biome.ChaosSquidBiome;
import io.github.squid233.squidcraft.world.biome.SquidBiome;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public class ModBiomes {
    public static final Biome SQUID_BIOME = Registry.register(Registry.BIOME, new Identifier(SquidCraft.MODID, "squid_biome"), new SquidBiome());
    public static final Biome CHAOS_SQUID_BIOME = Registry.register(Registry.BIOME, new Identifier(SquidCraft.MODID, "chaos_squid_biome"), new ChaosSquidBiome());

}

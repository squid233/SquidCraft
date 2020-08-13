/*package io.github.squid233.squidcraft.util;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.world.biome.ChaosSquidBiome;
import io.github.squid233.squidcraft.world.biome.SquidBiome;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeCreator;

public class ModBiomes {
    public static final RegistryKey<Biome> SQUID_BIOME_KEY = register("squid_biome");
    public static final RegistryKey<Biome> CHAOS_SQUID_BIOME_KEY = register("chaos_squid_biome");
    public static final Biome SQUID_BIOME;
    public static final Biome CHAOS_SQUID_BIOME = Registry.register(Registry.BIOME, new Identifier(SquidCraft.MODID, "chaos_squid_biome"), new ChaosSquidBiome());

    static {
        SQUID_BIOME = register(SQUID_BIOME_KEY, new Biome.Builder().);
    }

    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier(SquidCraft.MODID, name));
    }

    private static Biome register(RegistryKey<Biome> registryKey, Biome biome) {
        return BuiltinRegistries.add(BuiltinRegistries.BIOME, registryKey.getValue(), biome);
    }
}





fixme 2020/8/13
*/

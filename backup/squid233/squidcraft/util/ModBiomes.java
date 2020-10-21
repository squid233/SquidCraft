package io.github.squid233.squidcraft.util;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.mixin.BuiltinBiomesAccessor;
import io.github.squid233.squidcraft.util.register.SoundsRegister;
import io.github.squid233.squidcraft.world.biome.BiomeUtils;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

public class ModBiomes {
    public static final RegistryKey<Biome> SQUID_BIOME_KEY = register("squid_biome");
    public static final RegistryKey<Biome> CHAOS_SQUID_BIOME_KEY = register("chaos_squid_biome");
    public static final Biome SQUID_BIOME;
    public static final Biome CHAOS_SQUID_BIOME;

    static {
        SQUID_BIOME = register(SQUID_BIOME_KEY,
                BiomeUtils.createSquidBiome(SurfaceBuilder.DEFAULT, Biome.Precipitation.NONE, 0.8F, 0.4F, SoundsRegister.MUSIC_SOUND));
        CHAOS_SQUID_BIOME = register(CHAOS_SQUID_BIOME_KEY,
                BiomeUtils.createSquidBiome(SurfaceBuilder.SWAMP, Biome.Precipitation.RAIN, 0.6F, 0.6F, BiomeMoodSound.CAVE));
    }

    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier(SquidCraft.MODID, name));
    }

    private static Biome register(RegistryKey<Biome> registryKey, Biome biome) {
        Registry.register(BuiltinRegistries.BIOME, registryKey.getValue(), biome);
        BuiltinBiomesAccessor.getRawIdMap().put(BuiltinRegistries.BIOME.getRawId(biome), registryKey);
        return biome;
    }
}
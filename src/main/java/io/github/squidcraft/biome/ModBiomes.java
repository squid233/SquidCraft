package io.github.squidcraft.biome;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.api.BiomesRegister;
import net.fabricmc.fabric.api.biomes.v1.FabricBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldClimate;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;

public class ModBiomes {
    public static final Biome SQUID_BIOME = registerBiome("squid_biome", new SquidBiome());

    private static Biome registerBiome(String biomeName, Biome biome) {
        BiomesRegister.registerBiome(SquidCraft.MODID, biomeName, biome);
        return biome;
    }

    public ModBiomes() {
        OverworldBiomes.addContinentalBiome(ModBiomes.SQUID_BIOME, OverworldClimate.TEMPERATE, 2d);

        OverworldBiomes.addShoreBiome(ModBiomes.SQUID_BIOME, Biomes.BEACH, 1);

        FabricBiomes.addSpawnBiome(ModBiomes.SQUID_BIOME);
    }
}

package io.github.squidcraft.util;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.world.biome.SquidBiome;
import net.fabricmc.fabric.api.biomes.v1.FabricBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldClimate;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.util.registry.Registry;

public class ModBiomes {
    public static final Biome SQUID_BIOME = Registry.register(Registry.BIOME, new Identifier(SquidCraft.MODID, "squid_biome"), new SquidBiome());

    public ModBiomes() {

        OverworldBiomes.addContinentalBiome(ModBiomes.SQUID_BIOME, OverworldClimate.TEMPERATE, 3d);

        OverworldBiomes.addShoreBiome(ModBiomes.SQUID_BIOME, Biomes.BEACH, 1);

        FabricBiomes.addSpawnBiome(ModBiomes.SQUID_BIOME);
    }
}

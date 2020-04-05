package io.github.squidcraft.api;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public interface BiomesRegister {
    static Biome registerBiome(String modid, String biomeName, Biome biome) {
        Registry.register(Registry.BIOME, new Identifier(modid, biomeName), biome);
        return biome;
    }
}

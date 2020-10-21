package io.github.squid233.squidcraft.util.register;

/*import io.github.squid233.squidcraft.util.ModBiomes;
 *import net.fabricmc.fabric.api.biomes.v1.FabricBiomes;
 *import net.fabricmc.fabric.api.biomes.v1.OverworldBiomes;
 *import net.fabricmc.fabric.api.biomes.v1.OverworldClimate;
 */

import io.github.squid233.squidcraft.mixin.VanillaLayeredBiomeSourceAccessor;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

import java.util.ArrayList;
import java.util.List;

import static io.github.squid233.squidcraft.util.ModBiomes.*;

public class WorldGenRegister {

    public WorldGenRegister() {

        /*
        OverworldBiomes.addContinentalBiome(ModBiomes.SQUID_BIOME, OverworldClimate.TEMPERATE, 3d);
        OverworldBiomes.addShoreBiome(ModBiomes.SQUID_BIOME, Biomes.BEACH, 1);
        FabricBiomes.addSpawnBiome(ModBiomes.SQUID_BIOME);

        OverworldBiomes.addContinentalBiome(ModBiomes.CHAOS_SQUID_BIOME, OverworldClimate.TEMPERATE, 3d);
        OverworldBiomes.addShoreBiome(ModBiomes.CHAOS_SQUID_BIOME, Biomes.BEACH, 1);
        FabricBiomes.addSpawnBiome(ModBiomes.CHAOS_SQUID_BIOME);
         */

        List<RegistryKey<Biome>> biomes = new ArrayList<>(VanillaLayeredBiomeSourceAccessor.getBiomes());
        biomes.add(SQUID_BIOME_KEY);
        biomes.add(CHAOS_SQUID_BIOME_KEY);
        VanillaLayeredBiomeSourceAccessor.setBiomes(biomes);
    }
}

package io.github.squidcraft.api;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.Nullable;


/**
 * @author squid233
 * @Nullable interface Bimes Register
 */
@Nullable
public interface BiomesRegister {
    static void registerBiome(String modid, String biomeName, Biome biome) {
        Logger logger = LogManager.getLogger("register biome");
        Registry.register(Registry.BIOME, new Identifier(modid, biomeName), biome);
        logger.info("register " + biomeName + " biome");
    }
}

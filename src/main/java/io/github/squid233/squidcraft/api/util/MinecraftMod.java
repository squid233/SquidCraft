package io.github.squid233.squidcraft.api.util;

import net.fabricmc.api.ModInitializer;

public interface MinecraftMod extends ModInitializer {

    /**
     * {@link Loggers} will use this method.
     * @return the mod name.
     */
    String getModName();

}

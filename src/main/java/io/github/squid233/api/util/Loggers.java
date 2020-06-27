package io.github.squid233.api.util;

import org.apache.logging.log4j.LogManager;
import org.jetbrains.annotations.NotNull;

public class Loggers {
    /**
     * @param senderName logger name
     * @param message logger info
     */
    public static void log(String senderName, String message) {
        LogManager.getLogger(senderName).info(message);
    }

    public static void log(@NotNull MinecraftMod mod, String message) {
        log(mod.getModName(), message);
    }

}

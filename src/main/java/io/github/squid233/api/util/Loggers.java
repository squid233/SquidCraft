package io.github.squid233.api.util;

import io.github.squid233.squidcraft.config.CreateConfig;
import org.apache.logging.log4j.LogManager;
import org.jetbrains.annotations.NotNull;

public class Loggers {
    /** Default false */
    public static boolean enableRegisterLog = Boolean.parseBoolean(CreateConfig.PROPERTIES.getProperty("enableRegisterLog"));

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

package io.github.squid233.squidcraft.api.util;

import io.github.squid233.squidcraft.config.CreateConfig;
import org.apache.logging.log4j.LogManager;

import java.util.Arrays;

public class Loggers {
    /** Default false */
    public static boolean enableRegisterLog = Boolean.parseBoolean(CreateConfig.PROPERTIES.getProperty("enableRegisterLog"));

    /**
     * @param senderName logger name
     * @param info logger info
     */
    public static void logInfo(String senderName, String info) {
        LogManager.getLogger(senderName).info(info);
    }

    @SuppressWarnings("rawtypes")
    public static void logInfo(Class minecraftMod, String info) {
        Arrays.asList(minecraftMod.getDeclaredAnnotationsByType(MinecraftMod.class)).forEach(annotation -> {
            if (annotation instanceof MinecraftMod) {
                logInfo(((MinecraftMod) annotation).modid(), info);
            }
        });

    }
}

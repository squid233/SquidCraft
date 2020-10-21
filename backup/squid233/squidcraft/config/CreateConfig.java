package io.github.squid233.squidcraft.config;

import org.intellij.lang.annotations.MagicConstant;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static io.github.squid233.squidcraft.config.Configs.*;

/**
 *@author baka4n
 * <p> 对 properties 进行有序排列</p>
 * <p> windows about SEPARATOR → \\ , linux about SEPARATOR → // , you can to linux server to running it. </p>
 */
public class CreateConfig {
    public static final String SEPARATOR = File.separator + File.separator;
	public static final MyProperties PROPERTIES = new MyProperties();

    public static void create() {
        File configs = new File("config");
        File squidcraft = new File("config" + SEPARATOR + "squidcraft");
        if (!configs.exists() && !configs.isDirectory()) {
            configs.mkdir();
        }
        if (!squidcraft.exists() && !squidcraft.isDirectory()) {
            squidcraft.mkdir();
        }
        try {
            PROPERTIES.load(new BufferedInputStream(new FileInputStream("config" + SEPARATOR + "squidcraft" + SEPARATOR + "config.properties")));
        } catch (FileNotFoundException e) {
            putIn2(HIDE_MAIN_SCREEN_BUTTON, "false", SQUID_BLOCK_SPAWN_SIZE, "3");
            putIn2(SQUID_BLOCK_PER_CHUNK_SPAWN_COUNT, "8", SQUID_BLOCK_SPAWN_MIN_Y_LEVEL, "16");
            putIn2(SQUID_BLOCK_SPAWN_MAX_Y_LEVEL, "64", ELECTRIC_POWER_MAX_LEVEL, "5");
            putIn2(YOUR_ITEM_MAX_COUNT, "64", YOUR_ITEM_2_MAX_VALUE, "64");
            put(ENABLE_REGISTER_LOG, "false");
            try {
                PROPERTIES.store(new BufferedOutputStream(
                        new FileOutputStream("config" + SEPARATOR + "squidcraft" + SEPARATOR + "config.properties")),
                        "save Config File.");
            } catch (IOException f) {
                f.printStackTrace();
            }
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void put(String k, String v) {
        PROPERTIES.put(k, v);
    }

    public static void putIn2(String k1, String v1, String k2, String v2) {
        put(k1, v1);
        put(k2, v2);
    }

    public static String get(@MagicConstant(flagsFromClass = Configs.class) String cfg) {
        try {
            return PROPERTIES.getProperty(cfg);
        } catch (ArrayIndexOutOfBoundsException e) {
            return PROPERTIES.getProperty(HIDE_MAIN_SCREEN_BUTTON);
        }
    }

    public static int getInt(@MagicConstant(flagsFromClass = Configs.class) String cfg) {
        return Integer.parseInt(get(cfg));
    }

    public static boolean getBoolean(@MagicConstant(flagsFromClass = Configs.class) String cfg) {
        return Boolean.parseBoolean(get(cfg));
    }
}

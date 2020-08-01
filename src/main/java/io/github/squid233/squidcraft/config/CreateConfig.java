package io.github.squid233.squidcraft.config;

import org.intellij.lang.annotations.MagicConstant;

import java.io.*;

import static io.github.squid233.squidcraft.config.Configs.*;

/**
 *@author baka4n
 * <p> 对 properties 进行有序排列</p>
 * <p> windows about SEPARATOR → \\ , linux about SEPARATOR → // , you can to linux server to running it. </p>
 */
public class CreateConfig {
    public static final String SEPARATOR = File.separator + File.separator;
	public static final MyProperties PROPERTIES = new MyProperties();

	public static final String[] configs = {
	        "hideMainScreenButton", "squidBlockSpawnSize", "squidBlockPerChunkSpawnCount", "squidBlockSpawnMinYLevel",
            "squidBlockSpawnMaxYLevel", "electricPowerMaxLevel", "yourItemMaxCount", "yourItemTwoMaxCount",
            "enableRegisterLog"
    };

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
            putIn2("hideMainScreenButton", "false", "squidBlockSpawnSize", "3");
            putIn2("squidBlockPerChunkSpawnCount", "8", "squidBlockSpawnMinYLevel", "16");
            putIn2("squidBlockSpawnMaxYLevel", "64", "electricPowerMaxLevel", "5");
            putIn2("yourItemMaxCount", "64", "yourItemTwoMaxCount", "64");
            putIn("enableRegisterLog", "false");
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

    public static void putIn(String s1, String s2) {
        PROPERTIES.put(s1, s2);
    }

    public static void putIn2(String s1, String s2, String s3, String s4) {
        putIn(s1, s2);
        putIn(s3, s4);
    }

    public static String get(@MagicConstant(intValues = {
            HIDE_MAIN_SCREEN_BUTTON, SQUID_BLOCK_SPAWN_SIZE, SQUID_BLOCK_PER_CHUNK_SPAWN_COUNT, SQUID_BLOCK_SPAWN_MIN_Y_LEVEL,
            SQUID_BLOCK_SPAWN_MAX_Y_LEVEL, ELECTRIC_POWER_MAX_LEVEL, YOUR_ITEM_MAX_COUNT, YOUR_ITEM_2_MAX_VALUE,
            ENABLE_REGISTER_LOG
    }) int index) {
        try {
            return PROPERTIES.getProperty(configs[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            return PROPERTIES.getProperty(configs[0]);
        }
    }

    public static int getInt(@MagicConstant(intValues = {
            HIDE_MAIN_SCREEN_BUTTON, SQUID_BLOCK_SPAWN_SIZE, SQUID_BLOCK_PER_CHUNK_SPAWN_COUNT, SQUID_BLOCK_SPAWN_MIN_Y_LEVEL,
            SQUID_BLOCK_SPAWN_MAX_Y_LEVEL, ELECTRIC_POWER_MAX_LEVEL, YOUR_ITEM_MAX_COUNT, YOUR_ITEM_2_MAX_VALUE,
            ENABLE_REGISTER_LOG
    }) int index) {
        return Integer.parseInt(get(index));
    }

    public static boolean getBoolean(@MagicConstant(intValues = {
            HIDE_MAIN_SCREEN_BUTTON, SQUID_BLOCK_SPAWN_SIZE, SQUID_BLOCK_PER_CHUNK_SPAWN_COUNT, SQUID_BLOCK_SPAWN_MIN_Y_LEVEL,
            SQUID_BLOCK_SPAWN_MAX_Y_LEVEL, ELECTRIC_POWER_MAX_LEVEL, YOUR_ITEM_MAX_COUNT, YOUR_ITEM_2_MAX_VALUE,
            ENABLE_REGISTER_LOG
    }) int index) {
        return Boolean.parseBoolean(get(index));
    }
}

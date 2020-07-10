package io.github.squid233.squidcraft.config;

import java.io.*;

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
            putIn2("hideMainScreenButton", "false", "squidBlockSpawnSize", "3");
            putIn2("squidBlockPerChunkSpawnCount", "8", "squidBlockSpawnMinYLevel", "16");
            putIn2("squidBlockSpawnMaxYLevel", "64", "electricPowerMaxLevel", "5");
            putIn2("yourItemMaxCount", "64", "yourItemTwoMaxCount", "64");
            putIn("enableRegisterLog", "false");
            try {
                PROPERTIES.store(new BufferedOutputStream(new FileOutputStream("config" + SEPARATOR + "squidcraft" + SEPARATOR + "config.properties")), "save Config File.");
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
        PROPERTIES.put(s3, s4);
    }
}

package io.github.squid233.squidcraft.config;

import java.io.*;

/**
 *@author baka4n
 * <p> 对 properties 进行有序排列</p>
 * <p> windows about s → \\ , linux about s → // , you can to linux server to running it. </p>
 */
public class CreateConfig {
    public static final String s = File.separator + File.separator;
	public static final MyProperties properties = new MyProperties();
    public static void config() {
        File configs = new File("config");
        File squidcraft = new File("config" + s + "squidcraft");
        if (!configs.exists() && !configs.isDirectory()) configs.mkdir();
        if (!squidcraft.exists() && !squidcraft.isDirectory()) squidcraft.mkdir();
        try {
            properties.load(new BufferedInputStream(new FileInputStream("config" + s + "squidcraft" + s + "config.properties")));
        } catch (FileNotFoundException e) {
            putin("hideMainScreenButton", "false", "squidBlockSpawnSize", "3");
            putin("squidBlockPerChunkSpawnCount", "8", "squidBlockSpawnMinYLevel", "16");
            putin("squidBlockSpawnMaxYLevel", "64", "electricPowerMaxLevel", "5");
            putin("yourItemMaxCount", "64", "yourItemTwoMaxCount", "64");
            try {
                properties.store(new BufferedOutputStream(new FileOutputStream("config" + s + "squidcraft" + s + "config.properties")), "save Config File.");
            } catch (IOException f) { f.printStackTrace(); }
        } catch (IOException i) { i.printStackTrace(); }
    }
    public static void putin(String s1, String s2, String s3, String s4)
    {
        properties.put(s1, s2);
        if (!s3.equals("null"))
            properties.put(s3, s4);
    }
}

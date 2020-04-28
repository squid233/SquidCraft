package io.github.squidcraft.config;

import java.io.*;
import java.util.Properties;
/**
 *@author baka4n
 */
public class CreateConfig {
	public static final Properties properties = new Properties();
    public static void main(String... args) {
        try {
            properties.load(new BufferedInputStream(new FileInputStream("config/squidcraft/config.properties")));
        } catch (FileNotFoundException e) {
            properties.put("hideMainScreenButton", false);
            properties.put("squidBlockSpawnSize", 3);
            properties.put("squidBlockPerChunkSpawnCount", 8);
            properties.put("squidBlockSpawnMinYLevel", 16);
            properties.put("squidBlockSpawnMaxYLevel", 64);
            properties.put("electricPowerMaxLevel", 5);

            try {
                properties.store(new BufferedOutputStream(new FileOutputStream("config/squidcraft/config.properties")), "save Config File.");
            } catch (IOException f) {
                f.printStackTrace();
            }
        } catch (IOException i) {
            i.printStackTrace();
        }

    }

}

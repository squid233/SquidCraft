package io.github.squidcraft.config;

import java.io.*;
import java.util.Properties;

public class CreateConfig {
	/**
	 *@author baka4n
	 */
	public static final Properties properties = new Properties();
    public static void main(String... args) throws IOException {

        FileInputStream fis = new FileInputStream("config/squidcraft/config.properties");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("config/squidcraft/config.properties");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        try {
            properties.load(bis);
        } catch (FileNotFoundException e) {
            properties.put("hideMainScreenButton", "false");

            try {
                properties.store(bos, "save Config File.");
            } catch (IOException f) {
                f.printStackTrace();
            }
        } catch (IOException i) {
            i.printStackTrace();
        }

        fis.close();
        bis.close();
        fos.close();
        bos.close();

    }

}

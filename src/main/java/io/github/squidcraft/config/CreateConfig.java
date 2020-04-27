package io.github.squidcraft.config;

import java.io.*;
import java.util.Properties;

public class CreateConfig {
	/**
	 *@author baka4n
	 */
	public static final Properties properties = new Properties();
    public CreateConfig() {
        try {
            properties.load(new BufferedInputStream(new FileInputStream("config.sc")));
        } catch (FileNotFoundException e) {
            properties.put("test", "test1");

            try {
                properties.store(new BufferedOutputStream(new FileOutputStream("config.sc")), "save Config File.");
            } catch (IOException f) {
                f.printStackTrace();
            }
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

}

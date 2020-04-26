package io.github.squidcraft.config;

import java.io.*;
import java.util.Properties;

public class CreateConfig {
    // TODO WIP
    public CreateConfig() {
		Properties properties = new Properties();
		properties.put("test","test1");
		properties.store(new BufferedOutputStream(new FileOutputStream("test.json")), "Save Config File.");
	}
}

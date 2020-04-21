package io.github.squidcraft.config;

import java.io.File;
import java.io.IOException;

public class CreateConfig {
    private File getFile(String filePath) {
        File file = new File(filePath);
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }
}

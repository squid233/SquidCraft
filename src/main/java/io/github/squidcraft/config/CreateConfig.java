package io.github.squidcraft.config;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CreateConfig {
    // TODO WIP
    private File getFile(String filePath) throws IOException {
        File file = new File(filePath);

        OutputStream f = new FileOutputStream(file);

        OutputStreamWriter writer = new OutputStreamWriter(f, StandardCharsets.UTF_8);

        writer.append("");

        return file;
    }
}

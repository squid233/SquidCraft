package io.github.squidcraft.api;

import org.jetbrains.annotations.Nullable;

import java.util.logging.Logger;

/**
 * @author squid233
 * @Nullable block setting
 */
@Nullable
public class Block extends net.minecraft.block.Block {
    private String registryName;

    public Block(Settings settings) {
        super(settings);
    }

    public Block setRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    public String getRegistryName() {
        return this.registryName;
    }

}

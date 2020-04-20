package io.github.squidcraft.api;

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

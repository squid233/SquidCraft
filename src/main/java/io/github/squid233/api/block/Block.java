package io.github.squid233.api.block;

public abstract class Block extends net.minecraft.block.Block {

    public Block(Settings settings) {
        super(settings);
    }

    public abstract String getRegistryName();

}

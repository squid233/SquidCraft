package io.github.squid233.squidcraft.util;

import io.github.squid233.squidcraft.SquidCraft;

/**
 * @author squid233
 */
public class Identifier extends net.minecraft.util.Identifier {
    public Identifier(String path) {
        super(SquidCraft.MODID, path);
    }
}

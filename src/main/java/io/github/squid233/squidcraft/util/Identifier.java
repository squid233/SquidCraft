package io.github.squid233.squidcraft.util;

import io.github.squid233.squidcraft.SquidCraft;

/**
 * @author squid233
 * @date 2020/9/20
 */
public class Identifier extends net.minecraft.util.Identifier {
    public Identifier(String path) {
        super(SquidCraft.MODID, path);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

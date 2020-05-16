package io.github.squid233.squidcraft.block.msb;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class One extends Block {
    public One() {
        super(FabricBlockSettings.of(Material.EARTH).strength(1.5f, 0.6f));
    }
}

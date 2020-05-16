package io.github.squid233.squidcraft.block.msb;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class Two extends Block {
    public Two() {
        super(FabricBlockSettings.of(Material.EARTH).strength(2.0f, 0.65f));
    }
}

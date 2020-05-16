package io.github.squid233.squidcraft.block.msb;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class Eight extends Block {
    public Eight() {
        super(FabricBlockSettings.of(Material.EARTH).strength(3.0f, 0.75f));
    }
}

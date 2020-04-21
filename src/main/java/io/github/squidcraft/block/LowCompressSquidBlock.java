package io.github.squidcraft.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class LowCompressSquidBlock extends Block {
    public LowCompressSquidBlock() {
        super(FabricBlockSettings.of(Material.EARTH).strength(0.6f, 0.15f).build());
    }
}

package io.github.squidcraft.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class CompressSquidBlock extends Block {
    public CompressSquidBlock() {
        super(FabricBlockSettings.of(Material.EARTH).hardness(0.525f).build());
    }
}

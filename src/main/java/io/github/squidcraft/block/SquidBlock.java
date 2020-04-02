package io.github.squidcraft.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class SquidBlock extends Block {
    public SquidBlock() {
        super(FabricBlockSettings.of(Material.EARTH).build());
    }
}

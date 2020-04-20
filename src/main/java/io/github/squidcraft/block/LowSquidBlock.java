package io.github.squidcraft.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class LowSquidBlock extends Block {
    public LowSquidBlock() {
        super(FabricBlockSettings.of(Material.EARTH).strength(0.55f, 0.1f).build());
    }
}

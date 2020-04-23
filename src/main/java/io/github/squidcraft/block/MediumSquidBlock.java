package io.github.squidcraft.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class MediumSquidBlock extends Block {
    public MediumSquidBlock() {
        super(FabricBlockSettings.of(Material.EARTH).strength(0.65f, 0.2f).build());
    }
}

package io.github.squidcraft.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class AncientDebris extends Block {
    public AncientDebris() {
        super(FabricBlockSettings.of(Material.STONE).hardness(30).build());
    }
}

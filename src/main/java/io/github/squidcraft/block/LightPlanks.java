package io.github.squidcraft.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class LightPlanks extends Block {
    public LightPlanks() {
        super(FabricBlockSettings.of(Material.WOOD).strength(2.0f, 3.0f).lightLevel(16).build());
    }
}

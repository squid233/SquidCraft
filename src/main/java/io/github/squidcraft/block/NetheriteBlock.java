package io.github.squidcraft.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class NetheriteBlock extends Block {
    public NetheriteBlock() {
        super(FabricBlockSettings.of(Material.METAL).strength(50, 1200).breakByTool(FabricToolTags.PICKAXES, 4));
    }
}

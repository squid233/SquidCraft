package io.github.squidcraft.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.RedstoneWireBlock;
import net.minecraft.sound.BlockSoundGroup;

public class CopperOre extends Block {
    public CopperOre() {
        super(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).breakByTool(FabricToolTags.PICKAXES, 3).build());
    }

    public CopperBlock block() {
        return new CopperBlock();
    }
}

class CopperBlock extends RedstoneWireBlock {
    public CopperBlock() {
        super(FabricBlockSettings.of(Material.METAL).strength(5.0f, 6.0f).breakByTool(FabricToolTags.PICKAXES, 3).sounds(BlockSoundGroup.METAL).build());
    }
}

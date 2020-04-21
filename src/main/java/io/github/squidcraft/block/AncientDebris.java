package io.github.squidcraft.block;

import io.github.squidcraft.util.ModSounds;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class AncientDebris extends Block {
    public AncientDebris() {
        super(FabricBlockSettings.of(Material.METAL).strength(30, 1200).sounds(ModSounds.ANCIENT_DEBRIS).breakByTool(FabricToolTags.PICKAXES, 4).build());
    }
}

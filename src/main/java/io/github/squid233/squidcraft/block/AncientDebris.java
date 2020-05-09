package io.github.squid233.squidcraft.block;

import io.github.squid233.squidcraft.util.ModSounds;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;

public class AncientDebris extends OreBlock {
    public AncientDebris() {
        super(FabricBlockSettings.of(Material.STONE).strength(30, 1200).sounds(ModSounds.ANCIENT_DEBRIS).breakByTool(FabricToolTags.PICKAXES, 4));
    }
}

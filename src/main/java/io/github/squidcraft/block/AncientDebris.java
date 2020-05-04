package io.github.squidcraft.block;

import io.github.squidcraft.util.ModSounds;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.*;

public class AncientDebris extends OreBlock {
    public AncientDebris() {
        super(FabricBlockSettings.of(Material.STONE).strength(30, 1200).sounds(ModSounds.ANCIENT_DEBRIS).breakByTool(FabricToolTags.PICKAXES, 4).build());
    }
}

package io.github.squidcraft.item.tools.squid;

import io.github.squidcraft.item.ItemGroups;
import io.github.squidcraft.item.ModToolMaterial;
import net.minecraft.item.AxeItem;

public class SquidAxe extends AxeItem {
    public SquidAxe() {
        super(ModToolMaterial.SQUID, -0, -2.2f, new Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS));
    }
}

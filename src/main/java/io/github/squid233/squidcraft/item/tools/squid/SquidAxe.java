package io.github.squid233.squidcraft.item.tools.squid;

import io.github.squid233.squidcraft.item.ItemGroups;
import io.github.squid233.squidcraft.item.ModToolMaterial;
import net.minecraft.item.AxeItem;

public class SquidAxe extends AxeItem {
    public SquidAxe() {
        super(ModToolMaterial.SQUID, -0, -2.2f, new Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS));
    }
}

package io.github.squidcraft.item.tools.squid;

import io.github.squidcraft.item.ItemGroups;
import io.github.squidcraft.item.ModToolMaterial;
import net.minecraft.item.ShovelItem;

public class SquidShovel extends ShovelItem {
    public SquidShovel() {
        super(ModToolMaterial.SQUID, -2, -2, new Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS));
    }
}

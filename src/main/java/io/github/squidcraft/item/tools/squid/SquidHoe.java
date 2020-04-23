package io.github.squidcraft.item.tools.squid;

import io.github.squidcraft.item.ItemGroups;
import io.github.squidcraft.item.ModToolMaterial;
import net.minecraft.item.HoeItem;

public class SquidHoe extends HoeItem {
    public SquidHoe() {
        super(ModToolMaterial.SQUID, -4, new Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS));
    }
}

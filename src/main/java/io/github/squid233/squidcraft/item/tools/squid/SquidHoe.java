package io.github.squid233.squidcraft.item.tools.squid;

import io.github.squid233.squidcraft.item.ItemGroups;
import io.github.squid233.squidcraft.item.ModToolMaterial;
import net.minecraft.item.HoeItem;

public class SquidHoe extends HoeItem {
    public SquidHoe() {
        super(ModToolMaterial.SQUID, -4, -2.4f, new Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS));
    }
}

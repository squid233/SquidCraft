package io.github.squid233.squidcraft.item.tools.netherite;

import io.github.squid233.squidcraft.item.ItemGroups;
import io.github.squid233.squidcraft.item.ModToolMaterial;
import net.minecraft.item.HoeItem;

public class NetheriteHoe extends HoeItem {
    public NetheriteHoe() {
        super(ModToolMaterial.NETHERITE, -0, new Settings().group(ItemGroups.NETHERITE_MOD));
    }
}

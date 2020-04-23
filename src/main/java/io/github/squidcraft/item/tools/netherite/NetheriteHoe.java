package io.github.squidcraft.item.tools.netherite;

import io.github.squidcraft.item.ItemGroups;
import io.github.squidcraft.item.ModToolMaterial;
import net.minecraft.item.HoeItem;

public class NetheriteHoe extends HoeItem {
    public NetheriteHoe() {
        super(ModToolMaterial.NETHERITE, -0, new Settings().group(ItemGroups.NETHERITE_MOD));
    }
}

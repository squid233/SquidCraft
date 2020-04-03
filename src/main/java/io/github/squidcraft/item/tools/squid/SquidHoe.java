package io.github.squidcraft.item.tools.squid;

import io.github.squidcraft.item.ItemGroups;
import io.github.squidcraft.item.tools.SquidToolMaterial;
import net.minecraft.item.HoeItem;

public class SquidHoe extends HoeItem {
    public SquidHoe() {
        super(new SquidToolMaterial(), -4, new Settings().group(ItemGroups.SQUID_CRAFT));
    }
}

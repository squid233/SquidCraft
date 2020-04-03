package io.github.squidcraft.item.tools.squid;

import io.github.squidcraft.item.ItemGroups;
import io.github.squidcraft.item.tools.SquidToolMaterial;
import net.minecraft.item.ShovelItem;

public class SquidShovel extends ShovelItem {
    public SquidShovel() {
        super(new SquidToolMaterial(), -2, -2, new Settings().group(ItemGroups.SQUID_CRAFT));
    }
}

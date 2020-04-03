package io.github.squidcraft.item.tools.squid;

import io.github.squidcraft.item.ItemGroups;
import io.github.squidcraft.item.tools.SquidToolMaterial;
import net.minecraft.item.AxeItem;

public class SquidAxe extends AxeItem {
    public SquidAxe() {
        super(new SquidToolMaterial(), -0, -2.2f, new Settings().group(ItemGroups.SQUID_CRAFT));
    }
}

package io.github.squidcraft.item.tools.squid;

import io.github.squidcraft.item.ItemGroups;
import io.github.squidcraft.item.tools.SquidToolMaterial;
import net.minecraft.item.SwordItem;

public class SquidSword extends SwordItem {
    public SquidSword() {
        super(new SquidToolMaterial(), +1, -0, new Settings().group(ItemGroups.SQUID_CRAFT));
    }
}

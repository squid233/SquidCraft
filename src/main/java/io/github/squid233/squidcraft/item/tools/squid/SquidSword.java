package io.github.squid233.squidcraft.item.tools.squid;

import io.github.squid233.squidcraft.item.ItemGroups;
import io.github.squid233.squidcraft.item.ModToolMaterial;
import net.minecraft.item.SwordItem;

public class SquidSword extends SwordItem {
    public SquidSword() {
        super(ModToolMaterial.SQUID, +1, -0, new Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS));
    }
}

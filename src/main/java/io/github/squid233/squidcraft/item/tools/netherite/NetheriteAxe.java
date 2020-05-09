package io.github.squid233.squidcraft.item.tools.netherite;

import io.github.squid233.squidcraft.item.ItemGroups;
import io.github.squid233.squidcraft.item.ModToolMaterial;
import net.minecraft.item.AxeItem;

public class NetheriteAxe extends AxeItem {
    public NetheriteAxe() {
        super(ModToolMaterial.NETHERITE, -0, -0, new Settings().group(ItemGroups.NETHERITE_MOD));
    }
}

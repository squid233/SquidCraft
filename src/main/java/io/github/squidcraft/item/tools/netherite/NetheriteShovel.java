package io.github.squidcraft.item.tools.netherite;

import io.github.squidcraft.item.ItemGroups;
import io.github.squidcraft.item.ModToolMaterial;
import net.minecraft.item.ShovelItem;

public class NetheriteShovel extends ShovelItem {
    public NetheriteShovel() {
        super(ModToolMaterial.NETHERITE, -0, -0, new Settings().group(ItemGroups.NETHERITE_MOD));
    }
}

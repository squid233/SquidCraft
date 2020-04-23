package io.github.squidcraft.item.tools.netherite;

import io.github.squidcraft.item.ItemGroups;
import io.github.squidcraft.item.ModToolMaterial;
import net.minecraft.item.SwordItem;

public class NetheriteSword extends SwordItem {
    public NetheriteSword() {
        super(ModToolMaterial.NETHERITE, -0, -0, new Settings().group(ItemGroups.NETHERITE_MOD));
    }
}

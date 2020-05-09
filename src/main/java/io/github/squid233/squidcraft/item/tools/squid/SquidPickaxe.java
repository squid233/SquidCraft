package io.github.squid233.squidcraft.item.tools.squid;

import io.github.squid233.squidcraft.item.ItemGroups;
import io.github.squid233.squidcraft.item.ModToolMaterial;
import net.minecraft.item.PickaxeItem;

public class SquidPickaxe extends PickaxeItem {
    public SquidPickaxe() {
        super(ModToolMaterial.SQUID, -1, -1, new Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS));
    }
}

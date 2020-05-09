package io.github.squid233.squidcraft.item.tools.netherite;

import io.github.squid233.squidcraft.item.ItemGroups;
import io.github.squid233.squidcraft.item.ModToolMaterial;
import net.minecraft.item.PickaxeItem;

public class NetheritePickaxe extends PickaxeItem {
    public NetheritePickaxe() {
        super(ModToolMaterial.NETHERITE, -0, -0, new Settings().group(ItemGroups.NETHERITE_MOD));
    }
}

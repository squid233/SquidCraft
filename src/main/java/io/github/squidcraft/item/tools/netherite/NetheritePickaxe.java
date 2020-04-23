package io.github.squidcraft.item.tools.netherite;

import io.github.squidcraft.item.ItemGroups;
import io.github.squidcraft.item.ModToolMaterial;
import net.minecraft.item.PickaxeItem;

public class NetheritePickaxe extends PickaxeItem {
    public NetheritePickaxe() {
        super(ModToolMaterial.NETHERITE, -0, -0, new Settings().group(ItemGroups.NETHERITE_MOD));
    }
}

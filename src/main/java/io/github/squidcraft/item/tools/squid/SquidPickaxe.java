package io.github.squidcraft.item.tools.squid;

import io.github.squidcraft.item.ItemGroups;
import io.github.squidcraft.item.tools.SquidToolMaterial;
import net.minecraft.item.PickaxeItem;

public class SquidPickaxe extends PickaxeItem {
    public SquidPickaxe() {
        super(new SquidToolMaterial(), -1, -1, new Settings().group(ItemGroups.SQUID_CRAFT));
    }
}

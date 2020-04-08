package io.github.squidcraft.common.item;

import io.github.squidcraft.SquidCraft;
import net.minecraft.item.ItemFood;

public class ItemCookedShreddedSquid extends ItemFood {
    public ItemCookedShreddedSquid() {
        super(2, 0.6f, true);
        this.setRegistryName("cooked_shredded_squid").setUnlocalizedName(SquidCraft.MODID+"."+"cooked_shredded_squid").setCreativeTab(ItemGroups.SQUID_CRAFT);
    }
}

package io.github.squidcraft.common.item;

import io.github.squidcraft.SquidCraft;
import net.minecraft.item.ItemFood;

public class ItemAPileCookedShreddedSquid extends ItemFood {
    public ItemAPileCookedShreddedSquid() {
        super(18, 0.7f, true);
        this.setRegistryName("a_pile_cooked_shredded_squid").setUnlocalizedName(SquidCraft.MODID+"."+"a_pile_cooked_shredded_squid").setCreativeTab(ItemGroups.SQUID_CRAFT);
    }
}

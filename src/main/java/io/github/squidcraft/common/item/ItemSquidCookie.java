package io.github.squidcraft.common.item;

import io.github.squidcraft.SquidCraft;
import net.minecraft.item.ItemFood;

public class ItemSquidCookie extends ItemFood {
    public ItemSquidCookie() {
        super(162, 0.99f, true);
        this.setRegistryName("squid_cookie").setUnlocalizedName(SquidCraft.MODID+"."+"squid_cookie").setCreativeTab(ItemGroups.SQUID_CRAFT);
        this.setAlwaysEdible();
    }
}

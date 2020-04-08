package io.github.squidcraft.common.item;

import io.github.squidcraft.SquidCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemShreddedSquid extends ItemFood {
    public ItemShreddedSquid() {
        super(1, 0.4f, true);
        this.setRegistryName("shredded_squid").setUnlocalizedName(SquidCraft.MODID+"."+"shredded_squid").setCreativeTab(ItemGroups.SQUID_CRAFT);
    }
}

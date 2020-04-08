package io.github.squidcraft.common.item;

import io.github.squidcraft.common.register.BlocksRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ItemGroups {
    public static final CreativeTabs SQUID_CRAFT = new CreativeTabs("squid_craft") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(BlocksRegister.SQUID_BLOCK);
        }
    };
}

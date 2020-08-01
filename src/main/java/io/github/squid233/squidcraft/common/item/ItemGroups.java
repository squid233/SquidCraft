package io.github.squid233.squidcraft.common.item;

import io.github.squid233.squidcraft.common.registes.ItemRegister;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

/**
 * @author squid233
 */
public class ItemGroups {

    public static ItemGroup squidCraft = new ItemGroup("squid_craft") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemRegister.SQUID_COOKIE.get());
        }
    };

    public static ItemGroup squidCraftCombatAndTools = new ItemGroup("sc_combat_and_tools") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemRegister.SQUID_SWORD.get());
        }
    };

}

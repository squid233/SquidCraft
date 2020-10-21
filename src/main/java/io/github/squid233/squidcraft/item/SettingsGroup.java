package io.github.squid233.squidcraft.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

/**
 * @author squid233
 * @date 2020/9/20
 */
public class SettingsGroup extends Item.Settings {
    public SettingsGroup(ItemGroup group) {
        super();
        group(group);
    }
}

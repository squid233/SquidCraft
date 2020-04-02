package io.github.squidcraft.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SquidCookie extends Item {
    public SquidCookie() {
        super(new Settings()
                .group(ItemGroups.SQUID_CRAFT)
                .food(new FoodComponent.Builder().hunger(162).saturationModifier(0.99f).meat().build())
        );
    }
}

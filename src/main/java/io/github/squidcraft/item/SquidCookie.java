package io.github.squidcraft.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class SquidCookie extends Item {
    public SquidCookie() {
        super(new Settings()
                .group(ItemGroups.SQUID_CRAFT)
                .food(new FoodComponent.Builder().hunger(162).saturationModifier(3.1415926535897932384626f).meat().alwaysEdible().build())
        );
    }
}

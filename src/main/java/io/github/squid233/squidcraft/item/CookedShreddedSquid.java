package io.github.squid233.squidcraft.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class CookedShreddedSquid extends Item {
    public CookedShreddedSquid() {
        super(new Settings()
                .group(ItemGroups.SQUID_CRAFT)
                .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).meat().build())
        );
    }
}

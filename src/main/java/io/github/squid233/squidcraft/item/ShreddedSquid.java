package io.github.squid233.squidcraft.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class ShreddedSquid extends Item {
    public ShreddedSquid() {
        super(new Settings()
                .group(ItemGroups.SQUID_CRAFT)
                .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).meat().build())
        );
    }
}

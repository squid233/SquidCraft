package io.github.squidcraft.item;

import net.minecraft.item.*;

public class ShreddedSquid extends Item {
    public ShreddedSquid() {
        super(new Settings()
                .group(ItemGroups.SQUID_CRAFT)
                .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).meat().build())
        );
    }
}

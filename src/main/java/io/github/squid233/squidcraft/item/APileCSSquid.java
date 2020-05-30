package io.github.squid233.squidcraft.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class APileCSSquid extends Item {
    public APileCSSquid() {
        super(new Settings()
                .group(ItemGroups.SQUID_CRAFT)
                .food(new FoodComponent.Builder().hunger(18).saturationModifier(0.7f).meat().build())
        );
    }
}

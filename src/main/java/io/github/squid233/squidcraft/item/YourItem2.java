package io.github.squid233.squidcraft.item;

import io.github.squid233.squidcraft.api.item.Item;
import io.github.squid233.squidcraft.config.Configs;
import io.github.squid233.squidcraft.config.CreateConfig;

public class YourItem2 extends Item {
    public YourItem2() {
        super(new Settings().group(ItemGroups.SQUID_CRAFT).maxCount(CreateConfig.getInt(Configs.YOUR_ITEM_2_MAX_VALUE)));
    }

    @Override
    public String getRegistryName() {
        return "your_item_2";
    }
}

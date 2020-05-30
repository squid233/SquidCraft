package io.github.squid233.squidcraft.item;

import io.github.squid233.api.item.Item;
import io.github.squid233.squidcraft.config.CreateConfig;

public class YourItem2 extends Item {
    public YourItem2() {
        super(new Settings().group(ItemGroups.SQUID_CRAFT).maxCount(Integer.parseInt(CreateConfig.properties.getProperty("yourItemTwoMaxCount"))));
    }

    @Override
    public String getRegistryName() {
        return "your_item_2";
    }
}

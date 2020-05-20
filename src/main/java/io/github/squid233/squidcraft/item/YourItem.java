package io.github.squid233.squidcraft.item;

import io.github.squid233.squidcraft.api.item.Item;
import io.github.squid233.squidcraft.config.CreateConfig;

public class YourItem extends Item {
    public YourItem() {
        super(new Settings().group(ItemGroups.SQUID_CRAFT).maxCount(Integer.parseInt(CreateConfig.properties.getProperty("yourItemMaxCount"))));
    }

    @Override
    public String getRegistryName() {
        return "your_item";
    }
}

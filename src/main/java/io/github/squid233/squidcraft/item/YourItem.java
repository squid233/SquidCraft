package io.github.squid233.squidcraft.item;

import io.github.squid233.api.item.Item;
import io.github.squid233.squidcraft.config.CreateConfig;

import static java.lang.Integer.parseInt;

public class YourItem extends Item {
    public YourItem() {
        super(new Settings().group(ItemGroups.SQUID_CRAFT).maxCount(parseInt(CreateConfig.PROPERTIES.getProperty("yourItemMaxCount"))));
    }

    @Override
    public String getRegistryName() {
        return "your_item";
    }
}

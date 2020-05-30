package io.github.squid233.api.item;

public abstract class Item extends net.minecraft.item.Item {

    public Item(Settings settings) {
        super(settings);
    }

    public abstract String getRegistryName();

}

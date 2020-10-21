package io.github.squid233.squidcraft.util;

import net.minecraft.item.Item;

import java.util.HashMap;
import java.util.Map;

/**
 * @author squid233
 */
public class Registry {
    public static final Map<String, Item> ITEMS = new HashMap<>();

    public static Item item(String name, Item item) {
        ITEMS.put(name, item);
        return item;
    }
}

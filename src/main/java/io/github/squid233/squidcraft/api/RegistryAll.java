package io.github.squid233.squidcraft.api;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistryAll {

    public static void registerItems(String namespace, String[] itemsName, Item... items) {
        for (int i = 0; i < itemsName.length; i++) {
            Registry.register(Registry.ITEM, new Identifier(namespace, itemsName[i]), items[i]);
        }
    }
}

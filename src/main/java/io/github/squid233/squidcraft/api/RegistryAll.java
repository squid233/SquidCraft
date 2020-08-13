package io.github.squid233.squidcraft.api;

import net.minecraft.item.Item;

public class RegistryAll {

    public static void registerItems(String namespace, String[] itemsName, Item... items) {
        for (int i = 0; i < itemsName.length; i++) {
            ItemRegisters.register(namespace, itemsName[i], items[i]);
        }
    }
}

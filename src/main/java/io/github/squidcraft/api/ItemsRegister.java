package io.github.squidcraft.api;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public interface ItemsRegister {
    static void registerItem(String modid, String itemName, Item item) {
        Registry.register(Registry.ITEM, new Identifier(modid, itemName), item);
    }
}

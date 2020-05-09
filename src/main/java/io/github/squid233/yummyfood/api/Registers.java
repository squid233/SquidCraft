package io.github.squid233.yummyfood.api;

import io.github.squid233.squidcraft.SquidCraft;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Registers {
    public static Item registerItem(String itemName, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SquidCraft.MODID, itemName), item);
    }
}

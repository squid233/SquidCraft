package io.github.squidcraft.util;

import io.github.squidcraft.SquidCraft;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AutoRegisterItem extends Item {
    public AutoRegisterItem(String name, Item item , Settings settings) {
        super(settings);
        Registry.register(Registry.ITEM, new Identifier(SquidCraft.MODID, name), item);
    }
}

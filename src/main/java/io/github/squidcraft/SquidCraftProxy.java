package io.github.squidcraft;

import io.github.squidcraft.block.ModBlocks;
import io.github.squidcraft.item.ModItems;

public class SquidCraftProxy {
    public SquidCraftProxy() {
        new ModItems();
        new ModBlocks();
    }
}
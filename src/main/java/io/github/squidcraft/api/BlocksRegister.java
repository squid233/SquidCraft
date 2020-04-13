package io.github.squidcraft.api;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlocksRegister {
    /**
     *
     * @param modid Your mod's identifier
     * @param blockName The block's name
     * @param block A block
     */
    @Deprecated
    public static void registerBlock(String modid, String blockName, Block block) {
        Registry.register(Registry.BLOCK, new Identifier(modid, blockName), block);
    }

    public static void registerBlock(String modid, String blockName, Block block, Item.Settings settings) {
        Registry.register(Registry.BLOCK, new Identifier(modid, blockName), block);
        Registry.register(Registry.ITEM, new Identifier(modid, blockName), new BlockItem(block, settings));
    }
}

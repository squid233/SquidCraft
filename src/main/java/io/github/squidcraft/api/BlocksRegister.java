package io.github.squidcraft.api;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public interface BlocksRegister {
    /**
     *
     * @param modid Your mod's identifier
     * @param blockName The block's name
     * @param block A block
     */
    static void registerBlock(String modid, String blockName, Block block) {
        Registry.register(Registry.BLOCK, new Identifier(modid, blockName), block);
    }

    static void registerBlock(String modid, String blockName, String blockItemName, Block block, BlockItem blockItem) {
        Registry.register(Registry.BLOCK, new Identifier(modid, blockName), block);
        Registry.register(Registry.ITEM, new Identifier(modid, blockItemName), blockItem);
    }
}

package io.github.squidcraft.api;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/**
 * @author squid233
 * @Nullable register blocks api
 */
@Nullable
public class BlocksRegister {
    /**
     *
     * @param modid Your mod's identifier
     * @param blockName The block's name
     * @param block A block
     */
    @Deprecated
    public static void registerBlock(String modid, String blockName, Block block) {
        Logger logger = LogManager.getLogger("register block");
        Registry.register(Registry.BLOCK, new Identifier(modid, blockName), block);
        logger.info("register " + blockName + " block");
    }

    public static void registerBlock(String modid, String blockName, Block block, Item.Settings settings) {
        Logger logger = LogManager.getLogger("register block and block item");
        Registry.register(Registry.BLOCK, new Identifier(modid, blockName), block);
        logger.info("register " + blockName + " block");
        Registry.register(Registry.ITEM, new Identifier(modid, blockName), new BlockItem(block, settings));
        logger.info("register " + blockName + "block info item");
    }

    public static void registerBlock(Identifier id, Block block, Item.Settings settings) {
        Logger logger = LogManager.getLogger("register block settings");
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, settings));
        logger.info("register block settings");
    }

    /**
     *
     * @param modid Mod identifier.
     * @param block Block.
     * @param settings Item block settings.
     * <p>This method only can applied to SquidCraft block.</p>
     */
    public static void registerBlock(String modid, io.github.squidcraft.api.Block block, Item.Settings settings) {
        Registry.register(Registry.BLOCK, new Identifier(modid, block.getRegistryName()), block);
        Registry.register(Registry.ITEM, new Identifier(modid, block.getRegistryName()), new BlockItem(block, settings));
    }

}

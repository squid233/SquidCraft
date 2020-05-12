package io.github.squid233.squidcraft.api;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.squid233.squidcraft.SquidCraft.log;

/**
 * <p>register blocks api</p>
 * @author squid233
 */
public class BlocksRegister {
    public static void registerBlock(String modid, String blockName, Block block, Item.Settings settings) {
        String s = "register block and block item";
        Registry.register(Registry.BLOCK, new Identifier(modid, blockName), block);
        log(s, "register " + blockName + " block");
        Registry.register(Registry.ITEM, new Identifier(modid, blockName), new BlockItem(block, settings));
        log(s, "register " + blockName + " block info item");
    }
    public static void registerBlock(String modid, String blockName, Block block, BlockItem blockItem) {
        String s = "register block and block item";
        Registry.register(Registry.BLOCK, new Identifier(modid, blockName), block);
        log(s, "register " + blockName + " block");
        Registry.register(Registry.ITEM, new Identifier(modid, blockName), blockItem);
        log(s, "register " + blockName + " block info item");
    }

    public static void registerContainer(Identifier id, Block block, Item.Settings settings) {
        String s = "register container";
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, settings));
        log(s, "register container");
    }

}
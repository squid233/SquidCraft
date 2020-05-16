package io.github.squid233.squidcraft.api;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.squid233.squidcraft.SquidCraft.log;

/**
 * This is the new API!!!
 * <p>You can copy these code.</p>
 * <p>To see more information, please look at the old API: {@link ItemsRegister}</p>
 * @author squid233
 * @since 0.4.6
 */
public class Registers
{

    /**
     * See {@link Registers}
     * <h1>The register method</h1>
     * <p>You can use this method just like this below:</p>
     * <code>public static final {@link Item} EXAMPLE_ITEM = register("modid", "example", new {@link Item}(new {@link Item.Settings}());</code>
     * <p>After register, log4j will be remind you: "register modid:example success!"</p>
     * @param modid Mod identifier.
     * @param name Item registry name.
     * @param item Item.
     * @return Registry item.
     */
    public static Item register(String modid, String name, Item item)
    {
        log("Items Register", "register " + modid + ":" + name + " success!");
        return Registry.register(Registry.ITEM, new Identifier(modid, name), item);
    }

    /**
     * <h1>The register method</h1>
     * <p>You can use this method just like this below:</p>
     * <code>public static final {@link Block} EXAMPLE_BLOCK = register("modid", "example", new {@link Block}(new {@link Block.Settings}()), new {@link Item.Settings}());</code>
     * <p>After register, log4j will be remind you:</p>
     * <code>"register modid:example success!"<br>
     * "register modid:example block success!"</code>
     * @param modid Mod identifier.
     * @param name Block registry name.
     * @param block Block.
     * @param settings Block item settings.
     * @return Registry block.
     */
    public static Block register(String modid, String name, Block block, Item.Settings settings)
    {
        String s = "register block and block item";
        register(modid, name, new BlockItem(block, settings));
        log(s, "register " + modid + ":" + name + " block success!");
        return Registry.register(Registry.BLOCK, new Identifier(modid, name), block);
    }

}

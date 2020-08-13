package io.github.squid233.squidcraft.api;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.api.util.Loggers;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegisters {
    /**
     * <h1>The register method</h1>
     * <p>You can use this method just like this below:</p>
     * <code>public static final {@link Block} EXAMPLE_BLOCK = register("modid", "example", new {@link Block}(new {@link Block.Settings}()), new {@link Item.Settings}());</code>
     * <p>After register, log4j will be tell you:</p>
     * <code>"register modid:example success!"<br>
     * "register modid:example block success!"</code>
     *
     * @param modid    Mod identifier.
     * @param name     Block registry name.
     * @param block    Block.
     * @param settings Block item settings.
     * @return Register block.
     */
    public static Block register(String modid, String name, Block block, Item.Settings settings) {
        ItemRegisters.register(modid, name, new BlockItem(block, settings));
        if (Loggers.enableRegisterLog) {
            SquidCraft.debug("register " + modid + ":" + name + " block success!");
        }
        return Registry.register(Registry.BLOCK, new Identifier(modid, name), block);
    }

    public static Block register(String modid, String name, Block block) {
        if (Loggers.enableRegisterLog) {
            SquidCraft.debug("register " + modid + ":" + name + " block success!");
        }
        return Registry.register(Registry.BLOCK, new Identifier(modid, name), block);
    }
}

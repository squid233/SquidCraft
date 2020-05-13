package io.github.squid233.squidcraft.api;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.squid233.squidcraft.SquidCraft.log;

/**
 * This is the new API!!!
 * <p>You can copy these code.</p>
 * <p>To see more information, please look at the old API: {@link ItemsRegister}</p>
 * @since 0.4.6
 */
public class Registers
{

    /**
     * See {@link Registers}
     */
    public static Item register(String modid, String name, Item item)
    {
        log("Items Register", "register " + name + " success!");
        return Registry.register(Registry.ITEM, new Identifier(modid, name), item);
    }

}

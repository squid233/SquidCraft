package io.github.squid233.squidcraft.api;

import io.github.squid233.api.util.Loggers;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.squid233.api.util.Loggers.log;

/**
 * items register api → (item, tool and armor) register.
 */
public class ItemRegisters {

    /**
     * <h1>The register method</h1>
     * <p>You can use this method just like this below:</p>
     * <code>public static final {@link Item} EXAMPLE_ITEM = register("modid", "example", new {@link Item}(new {@link Item.Settings}());</code>
     * <p>After register, log4j will be remind you: "register modid:example success!"</p>
     * @param modid Mod identifier.
     * @param name Item registry name.
     * @param item Item.
     * @return Register item.
     */
    public static Item register(String modid, String name, Item item) {
        if (Loggers.enableRegisterLog) {
            log("Items Register", "register " + modid + ":" + name + " success!");
        }
        return Registry.register(Registry.ITEM, new Identifier(modid, name), item);
    }

    /**
     * @param modid Mod identifier.
     * @param name Helmet prefix.
     * @param item Helmet item.
     * @return Register item.
     */
    public static Item registerHelmet(String modid, String name, Item item) {
        return register(modid, name + "_helmet", item);
    }

    /**
     * @param modid Mod identifier.
     * @param name Chestplate prefix.
     * @param item Chestplate item.
     * @return Register item.
     */
    public static Item registerChestplate(String modid, String name, Item item) {
        return register(modid, name + "_chestplate", item);
    }

    /**
     * @param modid Mod identifier.
     * @param name Leggings prefix.
     * @param item Leggings item.
     * @return Register item.
     */
    public static Item registerLeggings(String modid, String name, Item item) {
        return register(modid, name + "_leggings", item);
    }

    /**
     * @param modid Mod identifier.
     * @param name Boots prefix.
     * @param item Boots item.
     * @return Register item.
     */
    public static Item registerBoots(String modid, String name, Item item) {
        return register(modid, name + "_boots", item);
    }

    /**
     * @param modid Mod identifier.
     * @param name Axe prefix.
     * @param item Axe item.
     * @return Register item.
     */
    public static Item registerAxe(String modid, String name, Item item) {
        return register(modid, name + "_axe", item);
    }

    /**
     * @param modid Mod identifier.
     * @param name Hoe prefix.
     * @param item Hoe item.
     * @return Register item.
     */
    public static Item registerHoe(String modid, String name, Item item) {
        return register(modid, name + "_hoe", item);
    }

    /**
     * @param modid Mod identifier.
     * @param name Pickaxe prefix.
     * @param item Pickaxe item.
     * @return Register item.
     */
    public static Item registerPickaxe(String modid, String name, Item item) {
        return register(modid, name + "_pickaxe", item);
    }

    /**
     * @param modid Mod identifier.
     * @param name Shovel prefix.
     * @param item Shovel item.
     * @return Register item.
     */
    public static Item registerShovel(String modid, String name, Item item) {
        return register(modid, name + "_shovel", item);
    }

    /**
     * @param modid Mod identifier.
     * @param name Sword prefix.
     * @param item Sword item.
     * @return Register item.
     */
    public static Item registerSword(String modid, String name, Item item) {
        return register(modid, name + "_sword", item);
    }

    /**
     * <p>This method can collect {@linkplain io.github.squid233.api.item.Item items} and register.</p>
     * @param modid Mod identifier.
     * @param items The items.
     */
    public static void registerAll(String modid, io.github.squid233.api.item.Item... items) {
        for (io.github.squid233.api.item.Item item : items) {
            register(modid, item.getRegistryName(), item);
        }
    }

}

package io.github.squid233.squidcraft.api;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.squid233.squidcraft.SquidCraft.log;

/**
 * items register api -> (item, tool and armor) register
 */
public class ItemsRegister {

    /**
     * Let it cannot constructing
     */
    private ItemsRegister() {

    }

    /**
     * <p>add info () - > message debug register logger.</p>
     * @param modid Mod identifier.
     * @param itemName Item name.
     * @param item Item.
     * @author squid233
     * @since 0.1.0
     */
    public static void registerItem(String modid, String itemName, Item item) {
        String s = "items register";
        Registry.register(Registry.ITEM, new Identifier(modid, itemName), item);
        log(s, "register " + itemName + " success!");
    }

    /**
     * <p>This method can register armor.</p>
     * @param modid Mod identifier.
     * @param armorName Armor's prefix. e.g. squid, they will be auto add "_helmet", "_chestplate", "_leggings" and "_boots",
     *                  then your armor item name are "squid_helmet", "squid_chestplate", "squid_leggings" and "squid_boots".
     * @param helmet Helmet item.
     * @param chestplate Chestplate item.
     * @param leggings Leggings item.
     * @param boots Boots item.
     * @author squid233
     * @since 0.5.0
     * <p>add info() -> message debug register armor register</p>
     */
    public static void registerArmor(String modid, String armorName, Item helmet, Item chestplate, Item leggings, Item boots) {
        String s = "Armor register";
        Registry.register(Registry.ITEM, new Identifier(modid, armorName + "_helmet"), helmet);
        log(s, "register " + armorName + "_helmet" + " register");
        Registry.register(Registry.ITEM, new Identifier(modid, armorName + "_chestplate"), chestplate);
        log(s, "register " + armorName + "_chestplate" + " register");
        Registry.register(Registry.ITEM, new Identifier(modid, armorName + "_leggings"), leggings);
        log(s, "register " + armorName + "_leggings" + " register");
        Registry.register(Registry.ITEM, new Identifier(modid, armorName + "_boots"), boots);
        log(s, "register " + armorName + "_boots" + " register");
    }

    /**
     * <p>This method can register axe and hoe.</p>
     * @param modid Mod identifier.
     * @param toolName Tool's prefix. e.g. squid, they will be auto add "_axe" and "_hoe",
     *                 then your tool item name are "squid_axe" and "squid_hoe".
     * @param axe Axe item.
     * @param hoe Hoe item.
     * @author squid233
     * @since 0.5.0
     */
    public static void registerTool(String modid, String toolName, Item axe, Item hoe) {
        String s = "tool register";
        registerItem(modid, toolName + "_axe", axe);log(s, "register " + toolName + "_axe" + " register");
        registerItem(modid, toolName + "_hoe", hoe);log(s, "register " + toolName + "_hoe" + " register");
    }

    /**
     * <p>This method can register axe, hoe, pickaxe, shovel and sword.</p>
     * @param modid Mod identifier.
     * @param toolName Tool's prefix. e.g. squid, they will be auto add "_pickaxe", "_shovel" and "_sword",
     *                 then your tool item name are "squid_pickaxe", "squid_shovel" and "squid_sword".
     * @param pickaxe Pickaxe item.
     * @param shovel Shovel item.
     * @param sword Sword item.
     * @author squid233
     * @since 0.5.0
     */
    public static void registerTool(String modid, String toolName, Item pickaxe, Item shovel, Item sword) {
        String s = "tool register";
        registerItem(modid, toolName + "_pickaxe", pickaxe);log(s, "register " + toolName + "_pickaxe" + " register");
        registerItem(modid, toolName + "_shovel", shovel);log(s, "register " + toolName + "_shovel" + " register");
        registerItem(modid, toolName + "_sword", sword);log(s, "register " + toolName + "_sword" + " register");
    }

    public static void registerAll(String modid, String[] itemNames, Item[] items) {
        for (int i = 0; i < itemNames.length; i++) {
            registerItem(modid, itemNames[i], items[i]);
        }
    }
}

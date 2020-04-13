package io.github.squidcraft.api;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

public class ItemsRegister {
    /**
     *
     * @param modid Mod identifier.
     * @param itemName Item name.
     * @param item Item.
     */
    public static void registerItem(String modid, String itemName, Item item) {
        Registry.register(Registry.ITEM, new Identifier(modid, itemName), item);
    }

    /**
     *
     * @param modid Mod identifier.
     * @param armorName Armor's prefix. e.g. squid, they will be auto add "_helmet", "_chestplate", "_leggings" and "_boots",
     *                  then your armor item name are "squid_helmet", "squid_chestplate", "squid_leggings" and "squid_boots".
     * @param helmet Helmet item.
     * @param chestplate Chestplate item.
     * @param leggings Leggings item.
     * @param boots Boots item.
     * <p>This method can register armor.</p>
     */
    public static void registerArmor(String modid, String armorName, Item helmet, Item chestplate, Item leggings, Item boots) {
        Registry.register(Registry.ITEM, new Identifier(modid, armorName+"_helmet"), helmet);
        Registry.register(Registry.ITEM, new Identifier(modid, armorName+"_chestplate"), chestplate);
        Registry.register(Registry.ITEM, new Identifier(modid, armorName+"_leggings"), leggings);
        Registry.register(Registry.ITEM, new Identifier(modid, armorName+"_boots"), boots);
    }

    /**
     *
     * @param modid Mod identifier.
     * @param toolName Tool's prefix. e.g. squid, they will be auto add "_axe", "_hoe", "_pickaxe", "_shovel" and "_sword",
     *                 then your tool item name are "squid_axe", "squid_hoe", "squid_pickaxe", "squid_shovel" and "squid_sword".
     * @param axe Axe item.
     * @param hoe Hoe item.
     * @param pickaxe Pickaxe item.
     * @param shovel Shovel item.
     * @param sword Sword item.
     * <p>This method can register axe, hoe, pickaxe, shovel and sword.</p>
     */
    public static void registerTool(String modid, String toolName, Item axe, Item hoe, Item pickaxe, Item shovel, Item sword) {
        Registry.register(Registry.ITEM, new Identifier(modid, toolName+"_axe"), axe);
        Registry.register(Registry.ITEM, new Identifier(modid, toolName+"_hoe"), hoe);
        Registry.register(Registry.ITEM, new Identifier(modid, toolName+"_pickaxe"), pickaxe);
        Registry.register(Registry.ITEM, new Identifier(modid, toolName+"_shovel"), shovel);
        Registry.register(Registry.ITEM, new Identifier(modid, toolName+"_sword"), sword);
    }

    public static void registerAllItems(String modid, String[] itemNames, @NotNull Item... items) {
        int length = 0;
        for (Item item : items) {
            Registry.register(Registry.ITEM, new Identifier(modid, itemNames[length]), item);
            length++;
        }
    }
}

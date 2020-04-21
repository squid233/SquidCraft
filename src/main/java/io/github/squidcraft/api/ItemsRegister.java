package io.github.squidcraft.api;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/**
 * @Nullable items reggister api -> (item. tool armor) register
 */
@Nullable
public class ItemsRegister {
    /**
     *
     * @param modid Mod identifier.
     * @param itemName Item name.
     * @param item Item.
     * @author squid233
     * @since 0.1.0
	 * @Nullable add info () - > message debug reigister logger. 
     */
    @Nullable
    public static void registerItem(String modid, String itemName, Item item) {
		Logger logger = LogManager.getLogger("items register");
		logger.info("register " + itemName + " success!");
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
     * @author squid233
     * @since 0.5.0
     * <p>This method can register armor.</p>
     * @Nullable add info() -> message debug register armor register
     */
    @Nullable
    public static void registerArmor(String modid, String armorName, Item helmet, Item chestplate, Item leggings, Item boots) {
        Logger logger = LogManager.getLogger("Armor register");
        Registry.register(Registry.ITEM, new Identifier(modid, armorName + "_helmet"), helmet);
        logger.info("register" + armorName + "_helmet" + " register");
        Registry.register(Registry.ITEM, new Identifier(modid, armorName + "_chestplate"), chestplate);
        logger.info("register" + armorName + "_chestplate" + " register");
        Registry.register(Registry.ITEM, new Identifier(modid, armorName + "_leggings"), leggings);
        logger.info("register" + armorName + "_leggings" + " register");
        Registry.register(Registry.ITEM, new Identifier(modid, armorName + "_boots"), boots);
        logger.info("register" + armorName + "_boots" + " register");
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
     * @author squid233
     * @since 0.5.0
     * <p>This method can register axe, hoe, pickaxe, shovel and sword.</p>
     * @Nullable add info() -> message debug register toll register
     */
    @Nullable
    public static void registerTool(String modid, String toolName, Item axe, Item hoe, Item pickaxe, Item shovel, Item sword) {
        Logger logger = LogManager.getLogger("tool register");
        Registry.register(Registry.ITEM, new Identifier(modid, toolName+"_axe"), axe);
        logger.info("register " + toolName + "_axe" + " register");
        Registry.register(Registry.ITEM, new Identifier(modid, toolName+"_hoe"), hoe);
        logger.info("register " + toolName + "_pickaxe" + " register");
        Registry.register(Registry.ITEM, new Identifier(modid, toolName+"_pickaxe"), pickaxe);
        logger.info("register " + toolName + "_shovel" + " register");
        Registry.register(Registry.ITEM, new Identifier(modid, toolName+"_shovel"), shovel);
        logger.info("register " + toolName + "_sword" + " register");
        Registry.register(Registry.ITEM, new Identifier(modid, toolName+"_sword"), sword);
    }
}

package io.github.squidcraft.util.registers;

import io.github.squidcraft.armor.ArmorMaterials;
import io.github.squidcraft.item.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.github.squidcraft.SquidCraft.MODID;
import static io.github.squidcraft.item.ItemGroups.*;

public class ItemRegister {
    public static final Item SHREDDED_SQUID = new ShreddedSquid();
    public static final Item COOKED_SHREDDED_SQUID = new CookedShreddedSquid();
    public static final Item A_PILE_COOKED_SHREDDED_SQUID = new APileCSSquid();
    public static final Item SQUID_COOKIE = new SquidCookie();
    public static final Item NETHERITE_SCRAP = new NetheriteScrap();
    public static final Item NETHERITE_INGOT = new NetheriteIngot();

    public static final Item SQUID_HELMET = new ArmorMaterials.SquidHelmet();
    public static final Item SQUID_CHESTPLATE = new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.CHEST, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS));
    public static final Item SQUID_LEGGINGS = new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.LEGS, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS));
    public static final Item SQUID_BOOTS = new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.FEET, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS));

    public static final Item SQUID_AXE = new ModToolMaterial.SquidAxe();
    public static final Item SQUID_HOE = new ModToolMaterial.SquidHoe();
    public static final Item SQUID_PICKAXE = new ModToolMaterial.SquidPickaxe();
    public static final Item SQUID_SHOVEL = new ModToolMaterial.SquidShovel();
    public static final Item SQUID_SWORD = new ModToolMaterial.SquidSword();

    public static final Item NETHERITE_HELMET = new ArmorMaterials.NetheriteHelmet();
    public static final Item NETHERITE_CHESTPLATE = new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.CHEST, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS));
    public static final Item NETHERITE_LEGGINGS = new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.LEGS, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS));
    public static final Item NETHERITE_BOOTS = new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.FEET, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS));

    public static final Item NETHERITE_AXE = new ModToolMaterial.NetheriteAxe();
    public static final Item NETHERITE_HOE = new ModToolMaterial.NetheriteHoe();
    public static final Item NETHERITE_PICKAXE = new ModToolMaterial.NetheritePickaxe();
    public static final Item NETHERITE_SHOVEL = new ModToolMaterial.NetheriteShovel();
    public static final Item NETHERITE_SWORD = new ModToolMaterial.NetheriteSword();

    public ItemRegister() {
        registerItem("shredded_squid", SHREDDED_SQUID);
        registerItem("cooked_shredded_squid", COOKED_SHREDDED_SQUID);
        registerItem("a_pile_cooked_shredded_squid", A_PILE_COOKED_SHREDDED_SQUID);
        registerItem("squid_cookie", SQUID_COOKIE);
        registerItem("netherite_scrap", NETHERITE_SCRAP);
        registerItem("netherite_ingot", NETHERITE_INGOT);

        registerArmor("squid", SQUID_HELMET, SQUID_CHESTPLATE, SQUID_LEGGINGS, SQUID_BOOTS);
        registerArmor("netherite", NETHERITE_HELMET, NETHERITE_CHESTPLATE, NETHERITE_LEGGINGS, NETHERITE_BOOTS);

        registerTool("squid", SQUID_AXE, SQUID_HOE, SQUID_PICKAXE, SQUID_SHOVEL, SQUID_SWORD);
        registerTool("netherite", NETHERITE_AXE, NETHERITE_HOE, NETHERITE_PICKAXE, NETHERITE_SHOVEL, NETHERITE_SWORD);
    }

    public void registerItem(String itemName, Item item) {
        Logger logger = LogManager.getLogger("items register");
        logger.info("register " + itemName + " success!");
        Registry.register(Registry.ITEM, new Identifier(MODID, itemName), item);
    }

    public void registerArmor(String armorName, Item helmet, Item chestplate, Item leggings, Item boots) {
        Logger logger = LogManager.getLogger("Armor register");
        Registry.register(Registry.ITEM, new Identifier(MODID, armorName+"_helmet"), helmet);
        logger.info("register" + armorName + "_helmet" + " register");
        Registry.register(Registry.ITEM, new Identifier(MODID, armorName+"_chestplate"), chestplate);
        logger.info("register" + armorName + "_chestplate" + " register");
        Registry.register(Registry.ITEM, new Identifier(MODID, armorName+"_leggings"), leggings);
        logger.info("register" + armorName + "_leggings" + " register");
        Registry.register(Registry.ITEM, new Identifier(MODID, armorName+"_boots"), boots);
        logger.info("register" + armorName + "_boots" + " register");

    }

    public void registerTool(String toolName, Item axe, Item hoe, Item pickaxe, Item shovel, Item sword) {
        Logger logger = LogManager.getLogger("tool register");
        Registry.register(Registry.ITEM, new Identifier(MODID, toolName+"_axe"), axe);
        logger.info("register " + toolName + "_axe" + " register");
        Registry.register(Registry.ITEM, new Identifier(MODID, toolName+"_hoe"), hoe);
        logger.info("register " + toolName + "_hoe" + " register");
        Registry.register(Registry.ITEM, new Identifier(MODID, toolName+"_pickaxe"), pickaxe);
        logger.info("register " + toolName + "_pickaxe" + " register");
        Registry.register(Registry.ITEM, new Identifier(MODID, toolName+"_shovel"), shovel);
        logger.info("register " + toolName + "_shovel" + " register");
        Registry.register(Registry.ITEM, new Identifier(MODID, toolName+"_sword"), sword);
        logger.info("register " + toolName + "_sword" + " register");

    }
}

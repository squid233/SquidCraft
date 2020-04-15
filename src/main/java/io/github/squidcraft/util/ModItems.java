package io.github.squidcraft.util;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.api.ItemsRegister;
import io.github.squidcraft.armor.*;
import io.github.squidcraft.item.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

import static io.github.squidcraft.item.ModToolMaterial.*;
import static io.github.squidcraft.item.ItemGroups.*;

public class ModItems {

    public static final Item SHREDDED_SQUID = new ShreddedSquid();
    public static final Item COOKED_SHREDDED_SQUID = new CookedShreddedSquid();
    public static final Item A_PILE_COOKED_SHREDDED_SQUID = new APileCSSquid();
    public static final Item SQUID_COOKIE = new SquidCookie();
    public static final Item NETHERITE_SCRAP = new NetheriteScrap();
    public static final Item NETHERITE_INGOT = new NetheriteIngot();

    public static final Item SQUID_HELMET = new ArmorMaterials.SquidHelmet();
    public static final Item SQUID_CHESTPLATE = new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.CHEST, new Item.Settings().group(SQUID_CRAFT));
    public static final Item SQUID_LEGGINGS = new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.LEGS, new Item.Settings().group(SQUID_CRAFT));
    public static final Item SQUID_BOOTS = new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.FEET, new Item.Settings().group(SQUID_CRAFT));

    public static final Item SQUID_AXE = new SquidAxe();
    public static final Item SQUID_HOE = new SquidHoe();
    public static final Item SQUID_PICKAXE = new SquidPickaxe();
    public static final Item SQUID_SHOVEL = new SquidShovel();
    public static final Item SQUID_SWORD = new SquidSword();

    public static final Item NETHERITE_HELMET = new ArmorMaterials.NetheriteHelmet();
    public static final Item NETHERITE_CHESTPLATE = new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.CHEST, new Item.Settings().group(SQUID_CRAFT));
    public static final Item NETHERITE_LEGGINGS = new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.LEGS, new Item.Settings().group(SQUID_CRAFT));
    public static final Item NETHERITE_BOOTS = new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.FEET, new Item.Settings().group(SQUID_CRAFT));

    public static final Item NETHERITE_AXE = new NetheriteAxe();
    public static final Item NETHERITE_HOE = new NetheriteHoe();
    public static final Item NETHERITE_PICKAXE = new NetheritePickaxe();
    public static final Item NETHERITE_SHOVEL = new NetheriteShovel();
    public static final Item NETHERITE_SWORD = new NetheriteSword();

    public static void registerItem(String itemName, Item item) {
        ItemsRegister.registerItem(SquidCraft.MODID, itemName, item);
    }

    public static void registerArmor(String armorName, Item helmet, Item chestplate, Item leggings, Item boots) {
        ItemsRegister.registerArmor(SquidCraft.MODID, armorName, helmet, chestplate, leggings, boots);
    }

    public static void registerTool(String toolName, Item axe, Item hoe, Item pickaxe, Item shovel, Item sword) {
        ItemsRegister.registerTool(SquidCraft.MODID, toolName, axe, hoe, pickaxe, shovel, sword);
    }

}

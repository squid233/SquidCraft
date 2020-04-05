package io.github.squidcraft.item;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.api.ItemsRegister;
import io.github.squidcraft.armor.SquidArmorMaterial;
import io.github.squidcraft.item.tools.squid.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class ModItems implements ItemsRegister {
    public static final Item SHREDDED_SQUID = new ShreddedSquid();
    public static final Item COOKED_SHREDDED_SQUID = new CookedShreddedSquid();
    public static final Item A_PILE_COOKED_SHREDDED_SQUID = new APileCSSquid();
    public static final Item SQUID_COOKIE = new SquidCookie();
    public static final Item NETHERITE_SCRAP = new NetheriteScrap();
    public static final Item NETHERITE_INGOT = new NetheriteIngot();

    public static final Item SQUID_HELMET = new ArmorItem(SquidArmorMaterial.SQUID, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroups.SQUID_CRAFT));
    public static final Item SQUID_CHESTPLATE = new ArmorItem(SquidArmorMaterial.SQUID, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroups.SQUID_CRAFT));
    public static final Item SQUID_LEGGINGS = new ArmorItem(SquidArmorMaterial.SQUID, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroups.SQUID_CRAFT));
    public static final Item SQUID_BOOTS = new ArmorItem(SquidArmorMaterial.SQUID, EquipmentSlot.FEET, new Item.Settings().group(ItemGroups.SQUID_CRAFT));

    public static final Item SQUID_AXE = new SquidAxe();
    public static final Item SQUID_HOE = new SquidHoe();
    public static final Item SQUID_PICKAXE = new SquidPickaxe();
    public static final Item SQUID_SHOVEL = new SquidShovel();
    public static final Item SQUID_SWORD = new SquidSword();

    public ModItems() {
        registerItem("shredded_squid", SHREDDED_SQUID);
        registerItem("cooked_shredded_squid", COOKED_SHREDDED_SQUID);
        registerItem("a_pile_cooked_shredded_squid", A_PILE_COOKED_SHREDDED_SQUID);
        registerItem("squid_cookie", SQUID_COOKIE);
        registerItem("netherite_scrap", NETHERITE_SCRAP);
        registerItem("netherite_ingot", NETHERITE_INGOT);

        registerItem("squid_helmet", SQUID_HELMET);
        registerItem("squid_chestplate", SQUID_CHESTPLATE);
        registerItem("squid_leggings", SQUID_LEGGINGS);
        registerItem("squid_boots", SQUID_BOOTS);

        registerItem("squid_axe", SQUID_AXE);
        registerItem("squid_hoe", SQUID_HOE);
        registerItem("squid_pickaxe", SQUID_PICKAXE);
        registerItem("squid_shovel", SQUID_SHOVEL);
        registerItem("squid_sword", SQUID_SWORD);

    }

    private static void registerItem(String itemName, Item item) {
        ItemsRegister.registerItem(SquidCraft.MODID, itemName, item);
    }

}

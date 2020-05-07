package io.github.squidcraft.util.registers;

import io.github.squidcraft.api.ItemsRegister;
import io.github.squidcraft.armor.ArmorMaterials;
import io.github.squidcraft.armor.NetheriteHelmet;
import io.github.squidcraft.armor.SquidHelmet;
import io.github.squidcraft.item.*;
import io.github.squidcraft.item.tools.netherite.*;
import io.github.squidcraft.item.tools.squid.*;
import io.github.squidcraft.util.ModEntities;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;

import static io.github.squidcraft.SquidCraft.MODID;
import static io.github.squidcraft.item.ItemGroups.NETHERITE_MOD;
import static io.github.squidcraft.item.ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS;

public class ItemRegister {
    // TODO Always register item, add item group, add models, add textures and add recipes.
    public static final Item SHREDDED_SQUID = new ShreddedSquid();
    public static final Item COOKED_SHREDDED_SQUID = new CookedShreddedSquid();
    public static final Item A_PILE_COOKED_SHREDDED_SQUID = new APileCSSquid();
    public static final Item SQUID_COOKIE = new SquidCookie();
    public static final Item NETHERITE_SCRAP = new NetheriteScrap();
    public static final Item NETHERITE_INGOT = new NetheriteIngot();

    public static final Item SQUID_HELMET = new SquidHelmet();
    public static final Item SQUID_CHESTPLATE = new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.CHEST, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS));
    public static final Item SQUID_LEGGINGS = new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.LEGS, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS));
    public static final Item SQUID_BOOTS = new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.FEET, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS));

    public static final Item SQUID_AXE = new SquidAxe();
    public static final Item SQUID_HOE = new SquidHoe();
    public static final Item SQUID_PICKAXE = new SquidPickaxe();
    public static final Item SQUID_SHOVEL = new SquidShovel();
    public static final Item SQUID_SWORD = new SquidSword();

    public static final Item NETHERITE_HELMET = new NetheriteHelmet();
    public static final Item NETHERITE_CHESTPLATE = new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.CHEST, new Item.Settings().group(NETHERITE_MOD));
    public static final Item NETHERITE_LEGGINGS = new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.LEGS, new Item.Settings().group(NETHERITE_MOD));
    public static final Item NETHERITE_BOOTS = new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.FEET, new Item.Settings().group(NETHERITE_MOD));

    public static final Item NETHERITE_AXE = new NetheriteAxe();
    public static final Item NETHERITE_HOE = new NetheriteHoe();
    public static final Item NETHERITE_PICKAXE = new NetheritePickaxe();
    public static final Item NETHERITE_SHOVEL = new NetheriteShovel();
    public static final Item NETHERITE_SWORD = new NetheriteSword();

    public static final Item COPPER_NUGGET = new CopperNugget();
    public static final Item COPPER_INGOT = new CopperIngot();

    public static final Item COOKIE_CREEPER_SPAWN_EGG = new SpawnEggItem(ModEntities.COOKIE_CREEPER, 0x0DA70B, 0x73420E, new Item.Settings().group(ItemGroups.SQUID_CRAFT));

    public ItemRegister() {

        registerAll(
                new String[]{"shredded_squid",
                        "cooked_shredded_squid",
                        "a_pile_cooked_shredded_squid",
                        "squid_cookie"
                },
                new Item[]{SHREDDED_SQUID,
                        COOKED_SHREDDED_SQUID,
                        A_PILE_COOKED_SHREDDED_SQUID,
                        SQUID_COOKIE
                });

        /*registerItem("shredded_squid", SHREDDED_SQUID);
        registerItem("cooked_shredded_squid", COOKED_SHREDDED_SQUID);
        registerItem("a_pile_cooked_shredded_squid", A_PILE_COOKED_SHREDDED_SQUID);
        registerItem("squid_cookie", SQUID_COOKIE);*/

        registerItem("netherite_scrap", NETHERITE_SCRAP);
        registerItem("netherite_ingot", NETHERITE_INGOT);

        registerItem("copper_nugget", COPPER_NUGGET);
        registerItem("copper_ingot", COPPER_INGOT);

        registerItem("cookie_creeper_spawn_egg", COOKIE_CREEPER_SPAWN_EGG);

        registerArmor("squid", SQUID_HELMET, SQUID_CHESTPLATE, SQUID_LEGGINGS, SQUID_BOOTS);
        registerArmor("netherite", NETHERITE_HELMET, NETHERITE_CHESTPLATE, NETHERITE_LEGGINGS, NETHERITE_BOOTS);

        registerTool("squid", SQUID_AXE, SQUID_HOE);
        registerTool("squid", SQUID_PICKAXE, SQUID_SHOVEL, SQUID_SWORD);
        registerTool("netherite", NETHERITE_AXE, NETHERITE_HOE);
        registerTool("netherite", NETHERITE_PICKAXE, NETHERITE_SHOVEL, NETHERITE_SWORD);

    }

    private void registerItem(String itemName, Item item) {
        ItemsRegister.registerItem(MODID, itemName, item);
    }

    private void registerArmor(String armorName, Item helmet, Item chestplate, Item leggings, Item boots) {
        ItemsRegister.registerArmor(MODID, armorName, helmet, chestplate, leggings, boots);
    }

    private void registerTool(String toolName, Item axe, Item hoe) {
        ItemsRegister.registerTool(MODID, toolName, axe, hoe);
    }

    private void registerTool(String toolName, Item pickaxe, Item shovel, Item sword) {
        ItemsRegister.registerTool(MODID, toolName, pickaxe, shovel, sword);
    }

    private void registerAll(String[] itemNames, Item[] items) {
        ItemsRegister.registerAll(MODID, itemNames, items);
    }
}

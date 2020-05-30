package io.github.squid233.squidcraft.util.registers;

import io.github.squid233.squidcraft.api.ItemRegisters;
import io.github.squid233.squidcraft.armor.ArmorMaterials;
import io.github.squid233.squidcraft.armor.SquidHelmet;
import io.github.squid233.squidcraft.item.*;
import io.github.squid233.squidcraft.item.tools.squid.*;
import io.github.squid233.squidcraft.util.ModEntities;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;

import static io.github.squid233.squidcraft.SquidCraft.MODID;
import static io.github.squid233.squidcraft.item.ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS;

public class ItemRegister {
    // TODO Always register item, add item group, add models, add textures and add recipes.
    public static final Item
            SHREDDED_SQUID, COOKED_SHREDDED_SQUID, A_PILE_COOKED_SHREDDED_SQUID, SQUID_COOKIE,
            SQUID_HELMET, SQUID_CHESTPLATE, SQUID_LEGGINGS, SQUID_BOOTS,
            SQUID_AXE, SQUID_HOE, SQUID_PICKAXE, SQUID_SHOVEL, SQUID_SWORD,
            COOKIE_CREEPER_SPAWN_EGG;

    public static final io.github.squid233.api.item.Item
            YOUR_ITEM = new YourItem(),
            YOUR_ITEM_2 = new YourItem2();

    static {
        SHREDDED_SQUID = register("shredded_squid", new ShreddedSquid());
        COOKED_SHREDDED_SQUID = register("cooked_shredded_squid", new CookedShreddedSquid());
        A_PILE_COOKED_SHREDDED_SQUID = register("a_pile_cooked_shredded_squid", new APileCSSquid());
        SQUID_COOKIE = register("squid_cookie", new SquidCookie());

        SQUID_HELMET = registerHelmet("squid", new SquidHelmet());
        SQUID_CHESTPLATE = registerChestplate("squid", new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.CHEST, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)));
        SQUID_LEGGINGS = registerLeggings("squid", new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.LEGS, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)));
        SQUID_BOOTS = registerBoots("squid", new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.FEET, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)));

        SQUID_AXE = registerAxe("squid", new SquidAxe());
        SQUID_HOE = registerHoe("squid", new SquidHoe());
        SQUID_PICKAXE = registerPickaxe("squid", new SquidPickaxe());
        SQUID_SHOVEL = registerShovel("squid", new SquidShovel());
        SQUID_SWORD = registerSword("squid", new SquidSword());

        COOKIE_CREEPER_SPAWN_EGG = register("cookie_creeper_spawn_egg", new SpawnEggItem(ModEntities.COOKIE_CREEPER, 0x0DA70B, 0x73420E, new Item.Settings().group(ItemGroups.SQUID_CRAFT)));
    }

    public ItemRegister() {
        registerAll(YOUR_ITEM, YOUR_ITEM_2);
    }


    /**
     * This method only suppress warning.
     */
    @SuppressWarnings("unused")
    private void IRegister() {

    }

    private static Item register(String itemName, Item item) {
        return ItemRegisters.register(MODID, itemName, item);
    }

    public static Item registerHelmet(String name, Item item) {
        return ItemRegisters.registerHelmet(MODID, name, item);
    }

    public static Item registerChestplate(String name, Item item) {
        return ItemRegisters.registerChestplate(MODID, name, item);
    }

    public static Item registerLeggings(String name, Item item) {
        return ItemRegisters.registerLeggings(MODID, name, item);
    }

    public static Item registerBoots(String name, Item item) {
        return ItemRegisters.registerBoots(MODID, name, item);
    }

    public static Item registerAxe(String name, Item item) {
        return ItemRegisters.registerAxe(MODID, name, item);
    }

    public static Item registerHoe(String name, Item item) {
        return ItemRegisters.registerHoe(MODID, name, item);
    }

    public static Item registerPickaxe(String name, Item item) {
        return ItemRegisters.registerPickaxe(MODID, name, item);
    }

    public static Item registerShovel(String name, Item item) {
        return ItemRegisters.registerShovel(MODID, name, item);
    }

    public static Item registerSword(String name, Item item) {
        return ItemRegisters.registerSword(MODID, name, item);
    }

    private static void registerAll(io.github.squid233.api.item.Item... items) {
        ItemRegisters.registerAll(MODID, items);
    }
}

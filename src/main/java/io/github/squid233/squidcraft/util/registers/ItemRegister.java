package io.github.squid233.squidcraft.util.registers;

import io.github.squid233.squidcraft.api.ItemRegisters;
import io.github.squid233.squidcraft.armor.ArmorMaterials;
import io.github.squid233.squidcraft.item.ItemGroups;
import io.github.squid233.squidcraft.item.ModToolMaterial;
import io.github.squid233.squidcraft.item.YourItem;
import io.github.squid233.squidcraft.item.YourItem2;
import io.github.squid233.squidcraft.util.ModEntities;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

import static io.github.squid233.squidcraft.SquidCraft.MODID;
import static io.github.squid233.squidcraft.item.ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS;

public class ItemRegister {
    // TODO Always register item, add item group, add models, add textures and add recipes.
    public static final Item SHREDDED_SQUID;
    public static final Item COOKED_SHREDDED_SQUID;
    public static final Item A_PILE_COOKED_SHREDDED_SQUID;
    public static final Item SQUID_COOKIE;
    public static final Item SQUID_HELMET;
    public static final Item SQUID_CHESTPLATE;
    public static final Item SQUID_LEGGINGS;
    public static final Item SQUID_BOOTS;
    public static final Item SQUID_AXE;
    public static final Item SQUID_HOE;
    public static final Item SQUID_PICKAXE;
    public static final Item SQUID_SHOVEL;
    public static final Item SQUID_SWORD;
    public static final Item COOKIE_CREEPER_SPAWN_EGG;
    public static final Item MILK_BUCKET;

    public static final io.github.squid233.api.item.Item
            YOUR_ITEM = new YourItem(),
            YOUR_ITEM_2 = new YourItem2();

    static {
        SHREDDED_SQUID = register("shredded_squid", new Item(new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).meat().build())));
        COOKED_SHREDDED_SQUID = register("cooked_shredded_squid", new Item(new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).meat().build())));
        A_PILE_COOKED_SHREDDED_SQUID = register("a_pile_cooked_shredded_squid", new Item(new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(18).saturationModifier(0.7f).meat().build())));
        SQUID_COOKIE = register("squid_cookie", new Item(new Item.Settings().group(ItemGroups.SQUID_CRAFT).food(new FoodComponent.Builder().hunger(162).saturationModifier(3.1415926535897932384626f).meat().alwaysEdible().build())) {
            @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(new TranslatableText("item.squidcraft.squid_cookie.tooltip"));
            }
        });

        SQUID_HELMET = registerHelmet("squid", new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroups.SQUID_CRAFT)));
        SQUID_CHESTPLATE = registerChestplate("squid", new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.CHEST, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)));
        SQUID_LEGGINGS = registerLeggings("squid", new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.LEGS, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)));
        SQUID_BOOTS = registerBoots("squid", new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.FEET, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)));

        SQUID_AXE = registerAxe("squid", new AxeItem(ModToolMaterial.SQUID, -0, -2.2f, new Item.Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS)) {
        });
        SQUID_HOE = registerHoe("squid", new HoeItem(ModToolMaterial.SQUID, -4, -2.4f, new Item.Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS)) {
        });
        SQUID_PICKAXE = registerPickaxe("squid", new PickaxeItem(ModToolMaterial.SQUID, -1, -1, new Item.Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS)) {
        });
        SQUID_SHOVEL = registerShovel("squid", new ShovelItem(ModToolMaterial.SQUID, -2, -2, new Item.Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS)));
        SQUID_SWORD = registerSword("squid", new SwordItem(ModToolMaterial.SQUID, +1, -0, new Item.Settings().group(ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS)));

        COOKIE_CREEPER_SPAWN_EGG = register("cookie_creeper_spawn_egg", new SpawnEggItem(ModEntities.COOKIE_CREEPER, 0x0DA70B, 0x73420E, new Item.Settings().group(ItemGroups.SQUID_CRAFT)));
        MILK_BUCKET = register("milk_bucket", new Item(new Item.Settings().group(ItemGroups.SQUID_CRAFT)));
    }

    public ItemRegister() {
        registerAll(YOUR_ITEM, YOUR_ITEM_2);
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

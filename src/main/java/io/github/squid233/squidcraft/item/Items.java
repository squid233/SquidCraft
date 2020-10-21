package io.github.squid233.squidcraft.item;

import io.github.squid233.squidcraft.util.Identifier;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;

import static io.github.squid233.squidcraft.item.ItemGroups.SQUID_CRAFT;
import static io.github.squid233.squidcraft.item.ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS;

/**
 * @author squid233
 * @date 2020/9/20
 */
public class Items {
    private static final HashMap<net.minecraft.util.Identifier, Item> MAP = new HashMap<>(19);
    public static final Item.Settings SQUID_CRAFT_SETTING = new SettingsGroup(SQUID_CRAFT);

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

    static {
        SHREDDED_SQUID = reg("shredded_squid", new FoodItem(SQUID_CRAFT_SETTING, 1, 0.4f).meat().build());
        COOKED_SHREDDED_SQUID = reg("cooked_shredded_squid", new FoodItem(SQUID_CRAFT_SETTING, 2, 0.6f).meat().build());
        A_PILE_COOKED_SHREDDED_SQUID = reg("a_pile_cooked_shredded_squid", new FoodItem(SQUID_CRAFT_SETTING, 18, 0.8f).meat().build());
        SQUID_COOKIE = reg("squid_cookie", new FoodItem(SQUID_CRAFT_SETTING, 162, 3.2f) {
            @Override
            public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                super.appendTooltip(stack, world, tooltip, context);
                tooltip.add(new TranslatableText("item.squidcraft.squid_cookie.tooltip"));
            }
        }.meat().alwaysEdible().build());
        SQUID_HELMET = regArmor(ArmorMaterials.SQUID, EquipmentSlot.HEAD, new SettingsGroup(SQUID_CRAFT_COMBAT_AND_TOOLS));
        SQUID_CHESTPLATE = regArmor(ArmorMaterials.SQUID, EquipmentSlot.CHEST, new SettingsGroup(SQUID_CRAFT_COMBAT_AND_TOOLS));
        SQUID_LEGGINGS = regArmor(ArmorMaterials.SQUID, EquipmentSlot.LEGS, new SettingsGroup(SQUID_CRAFT_COMBAT_AND_TOOLS));
        SQUID_BOOTS = regArmor(ArmorMaterials.SQUID, EquipmentSlot.FEET, new SettingsGroup(SQUID_CRAFT_COMBAT_AND_TOOLS));
        SQUID_AXE = reg("squid_axe", new AxeItem(ToolMaterials.SQUID, 0, -2.2f, new SettingsGroup(SQUID_CRAFT_COMBAT_AND_TOOLS)));
        SQUID_HOE = reg("squid_hoe", new HoeItem(ToolMaterials.SQUID, -4, -2.4f, new SettingsGroup(SQUID_CRAFT_COMBAT_AND_TOOLS)));
        SQUID_PICKAXE = reg("squid_pickaxe", new PickaxeItem(ToolMaterials.SQUID, -1, -1, new SettingsGroup(SQUID_CRAFT_COMBAT_AND_TOOLS)));
        SQUID_SHOVEL = reg("squid_shovel", new ShovelItem(ToolMaterials.SQUID, -2, -2, new SettingsGroup(SQUID_CRAFT_COMBAT_AND_TOOLS)));
        SQUID_SWORD = reg("squid_sword", new SwordItem(ToolMaterials.SQUID, -1, 0, new SettingsGroup(SQUID_CRAFT_COMBAT_AND_TOOLS)));
    }

    private static Item reg(String id, Item item) {
        MAP.put(new Identifier(id), item);
        return item;
    }

    private static Item regArmor(ArmorMaterial material, EquipmentSlot slot, Item.Settings settings) {
        String type;
        switch (slot.getName()) {
            case "head":
                type = "helmet";
                break;
            case "chest":
                type = "chestplate";
                break;
            case "legs":
                type = "leggings";
                break;
            case "feet":
                type = "boots";
                break;
            default:
                type = "";
        }
        return reg(material.getName() + "_" + type, new ArmorItem(material, slot, settings));
    }

    private static boolean initialized = false;
    public static void init() {
        if (!initialized) {
            initialized = true;
            MAP.forEach((identifier, item) -> Registry.register(Registry.ITEM, identifier, item));
        }
    }
}

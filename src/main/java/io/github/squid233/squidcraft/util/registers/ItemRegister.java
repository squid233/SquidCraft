package io.github.squid233.squidcraft.util.registers;

import io.github.squid233.squidcraft.api.ItemRegisters;
import io.github.squid233.squidcraft.api.item.ItemFood;
import io.github.squid233.squidcraft.armor.ArmorMaterials;
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
import static io.github.squid233.squidcraft.item.ItemGroups.SQUID_CRAFT;
import static io.github.squid233.squidcraft.item.ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS;

public class ItemRegister {
    // Always register item, add item group, add models, add textures and add recipes.
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
    public static final Item CUBE_SPAWN_EGG;
    public static final Item MILK_BUCKET;
    public static final io.github.squid233.squidcraft.api.item.Item
            YOUR_ITEM = new YourItem(),
            YOUR_ITEM_2 = new YourItem2();

    static {
        SHREDDED_SQUID = register("shredded_squid",
                new ItemFood.Meat(SQUID_CRAFT, 1, 0.4f));
        COOKED_SHREDDED_SQUID = register("cooked_shredded_squid",
                new ItemFood.Meat(SQUID_CRAFT, 2, 0.6f));
        A_PILE_COOKED_SHREDDED_SQUID = register("a_pile_cooked_shredded_squid",
                new ItemFood.Meat(SQUID_CRAFT, 18, 0.8f));
        SQUID_COOKIE = register("squid_cookie",
                new ItemFood.Meat.Big(SQUID_CRAFT, 162, 3.2f) {
                    @Override
                    public void appendTooltip(ItemStack stack, World world,
                                              List<Text> tooltip, TooltipContext context) {
                        super.appendTooltip(stack, world, tooltip, context);
                        tooltip.add(new TranslatableText(
                                "item.squidcraft.squid_cookie.tooltip"));
                    }
                });

        SQUID_HELMET = registerHelmet(new ArmorItem(ArmorMaterials.SQUID,
                EquipmentSlot.HEAD,
                new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)));
        SQUID_CHESTPLATE = registerChestplate(new ArmorItem(
                ArmorMaterials.SQUID, EquipmentSlot.CHEST,
                new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)));
        SQUID_LEGGINGS = registerLeggings(new ArmorItem(ArmorMaterials.SQUID,
                EquipmentSlot.LEGS,
                new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)));
        SQUID_BOOTS = registerBoots(new ArmorItem(ArmorMaterials.SQUID,
                EquipmentSlot.FEET,
                new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)));

        SQUID_AXE = registerAxe(new AxeItem(ModToolMaterial.SQUID,
                -0, -2.2f,
                new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)) {
        });
        SQUID_HOE = registerHoe(new HoeItem(ModToolMaterial.SQUID,
                -4, -2.4f,
                new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)) {
        });
        SQUID_PICKAXE = registerPickaxe(new PickaxeItem(ModToolMaterial.SQUID,
                -1, -1,
                new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)) {
        });
        SQUID_SHOVEL = registerShovel(new ShovelItem(ModToolMaterial.SQUID, -2,
                -2, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)));
        SQUID_SWORD = registerSword(new SwordItem(ModToolMaterial.SQUID,
                1, -0,
                new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)));

        COOKIE_CREEPER_SPAWN_EGG = register("cookie_creeper_spawn_egg",
                new SpawnEggItem(ModEntities.COOKIE_CREEPER, 0x0DA70B,
                        0x73420E, new Item.Settings().group(SQUID_CRAFT)));
        CUBE_SPAWN_EGG = register("cube_spawn_egg",
                new SpawnEggItem(ModEntities.CUBE, 0xFFA7A4, 0x7BD4FF,
                        new Item.Settings().group(SQUID_CRAFT)));

        MILK_BUCKET = register("milk_bucket",
                new BucketItem(FluidRegister.STILL_MILK,
                        new Item.Settings().group(SQUID_CRAFT)
                                .recipeRemainder(Items.BUCKET).maxCount(1)));
    }

    public ItemRegister() {
        registerAll(YOUR_ITEM, YOUR_ITEM_2);
    }

    private static Item register(String itemName, Item item) {
        return ItemRegisters.register(MODID, itemName, item);
    }

    private static Item registerHelmet(Item item) {
        return ItemRegisters.registerHelmet(MODID, "squid", item);
    }

    private static Item registerChestplate(Item item) {
        return ItemRegisters.registerChestplate(MODID, "squid", item);
    }

    private static Item registerLeggings(Item item) {
        return ItemRegisters.registerLeggings(MODID, "squid", item);
    }

    private static Item registerBoots(Item item) {
        return ItemRegisters.registerBoots(MODID, "squid", item);
    }

    private static Item registerAxe(Item item) {
        return ItemRegisters.registerAxe(MODID, "squid", item);
    }

    private static Item registerHoe(Item item) {
        return ItemRegisters.registerHoe(MODID, "squid", item);
    }

    private static Item registerPickaxe(Item item) {
        return ItemRegisters.registerPickaxe(MODID, "squid", item);
    }

    private static Item registerShovel(Item item) {
        return ItemRegisters.registerShovel(MODID, "squid", item);
    }

    private static Item registerSword(Item item) {
        return ItemRegisters.registerSword(MODID, "squid", item);
    }

    private void registerAll(
            io.github.squid233.squidcraft.api.item.Item... items) {
        ItemRegisters.registerAll(MODID, items);
    }
}

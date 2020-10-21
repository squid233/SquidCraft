package io.github.squid233.squidcraft.util.register;

import io.github.squid233.squidcraft.api.ItemRegistries;
import io.github.squid233.squidcraft.api.item.ItemFood;
import io.github.squid233.squidcraft.armor.ArmorMaterials;
import io.github.squid233.squidcraft.item.ModToolMaterial;
import io.github.squid233.squidcraft.item.YourItem;
import io.github.squid233.squidcraft.item.YourItem2;
import io.github.squid233.squidcraft.util.Identifier;
import io.github.squid233.squidcraft.util.ModEntities;
import io.github.squid233.squidcraft.util.Registry;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

import static io.github.squid233.squidcraft.SquidCraft.MODID;
import static io.github.squid233.squidcraft.item.ItemGroups.SQUID_CRAFT;
import static io.github.squid233.squidcraft.item.ItemGroups.SQUID_CRAFT_COMBAT_AND_TOOLS;
import static io.github.squid233.squidcraft.util.Registry.item;

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
    public static final Item MUSIC_RECORD;
    public static final io.github.squid233.squidcraft.api.item.Item
            YOUR_ITEM = new YourItem(),
            YOUR_ITEM_2 = new YourItem2();

    static {
        SHREDDED_SQUID = item("shredded_squid", new ItemFood.Meat(SQUID_CRAFT, 1, 0.4f));
        COOKED_SHREDDED_SQUID = item("cooked_shredded_squid", new ItemFood.Meat(SQUID_CRAFT, 2, 0.6f));
        A_PILE_COOKED_SHREDDED_SQUID = item("a_pile_cooked_shredded_squid", new ItemFood.Meat(SQUID_CRAFT, 18, 0.8f));
        SQUID_COOKIE = item("squid_cookie",
                new ItemFood.Meat.Big(SQUID_CRAFT, 162, 3.2f) {
                    @Override
                    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                        super.appendTooltip(stack, world, tooltip, context);
                        tooltip.add(new TranslatableText("item.squidcraft.squid_cookie.tooltip"));
                    }
                });

        SQUID_HELMET = helmet(ArmorMaterials.SQUID, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS));
        SQUID_CHESTPLATE = chestplate(new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.CHEST, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)));
        SQUID_LEGGINGS = leggings(new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.LEGS, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)));
        SQUID_BOOTS = boots(new ArmorItem(ArmorMaterials.SQUID, EquipmentSlot.FEET, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)));

        SQUID_AXE = axe(new AxeItem(ModToolMaterial.SQUID, -0, -2.2f, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)) {});
        SQUID_HOE = hoe(new HoeItem(ModToolMaterial.SQUID, -4, -2.4f, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)) {});
        SQUID_PICKAXE = pickaxe(new PickaxeItem(ModToolMaterial.SQUID, -1, -1, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)) {});
        SQUID_SHOVEL = shovel(new ShovelItem(ModToolMaterial.SQUID, -2, -2, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)));
        SQUID_SWORD = sword(new SwordItem(ModToolMaterial.SQUID, 1, -0, new Item.Settings().group(SQUID_CRAFT_COMBAT_AND_TOOLS)));

        COOKIE_CREEPER_SPAWN_EGG = item("cookie_creeper_spawn_egg",
                new SpawnEggItem(ModEntities.COOKIE_CREEPER, 0x0DA70B, 0x73420E, new Item.Settings().group(SQUID_CRAFT)));
        CUBE_SPAWN_EGG = item("cube_spawn_egg",
                new SpawnEggItem(ModEntities.CUBE, 0xFFA7A4, 0x7BD4FF, new Item.Settings().group(SQUID_CRAFT)));

        MILK_BUCKET = item("milk_bucket",
                new BucketItem(FluidRegister.STILL_MILK, new Item.Settings().group(SQUID_CRAFT).recipeRemainder(Items.BUCKET).maxCount(1)));
        MUSIC_RECORD = item("music_record", new Item(new Item.Settings().group(SQUID_CRAFT)) {
            @Override
            public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
                if (!world.isClient) {
                    world.playSound(user, user.getBlockPos(), SoundsRegister.MUSIC_EVENT, SoundCategory.RECORDS, 0.5f, 0.5f);
                }
                return TypedActionResult.success(user.getStackInHand(hand));
            }
        });
    }

    public ItemRegister() {
        registerAll(YOUR_ITEM, YOUR_ITEM_2);

        for (String nm : Registry.ITEMS.keySet()) {
            net.minecraft.util.registry.Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier(nm), Registry.ITEMS.get(nm));
        }
    }

    private static Item register(String name, Item item) {
        return ItemRegistries.register(MODID, name, item);
    }

    private static Item helmet(ArmorMaterial material, Item.Settings settings) {
        return ItemRegistries.registerHelmet(MODID, "squid", new ArmorItem(material, EquipmentSlot.HEAD, settings));
    }

    private static Item chestplate(Item item) {
        return ItemRegistries.registerChestplate(MODID, "squid", item);
    }

    private static Item leggings(Item item) {
        return ItemRegistries.registerLeggings(MODID, "squid", item);
    }

    private static Item boots(Item item) {
        return ItemRegistries.registerBoots(MODID, "squid", item);
    }

    private static Item axe(Item item) {
        return ItemRegistries.registerAxe(MODID, "squid", item);
    }

    private static Item hoe(Item item) {
        return ItemRegistries.registerHoe(MODID, "squid", item);
    }

    private static Item pickaxe(Item item) {
        return ItemRegistries.registerPickaxe(MODID, "squid", item);
    }

    private static Item shovel(Item item) {
        return ItemRegistries.registerShovel(MODID, "squid", item);
    }

    private static Item sword(Item item) {
        return ItemRegistries.registerSword(MODID, "squid", item);
    }

    private void registerAll(io.github.squid233.squidcraft.api.item.Item... items) {
        ItemRegistries.registerAll(MODID, items);
    }
}

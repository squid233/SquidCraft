package io.github.squid233.squidcraft.common.registes;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.api.item.ItemFood;
import io.github.squid233.squidcraft.common.armor.ArmorMaterials;
import io.github.squid233.squidcraft.common.tools.ToolMaterials;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

import static io.github.squid233.squidcraft.common.item.ItemGroups.*;

/**
 * @author squid233
 */
public class ItemRegister {

    private static RegistryObject<Item> register(String name, Item item) {
        return ITEMS.register(name, () -> item);
    }

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SquidCraft.MODID);

    public static final RegistryObject<Item> SHREDDED_SQUID;
    public static final RegistryObject<Item> COOKED_SHREDDED_SQUID;
    public static final RegistryObject<Item> A_PILE_COOKED_SHREDDED_SQUID;
    public static final RegistryObject<Item> SQUID_COOKIE;
    public static final RegistryObject<Item> SQUID_HELMET;
    public static final RegistryObject<Item> SQUID_CHESTPLATE;
    public static final RegistryObject<Item> SQUID_LEGGINGS;
    public static final RegistryObject<Item> SQUID_BOOTS;
    public static final RegistryObject<Item> SQUID_AXE;
    public static final RegistryObject<Item> SQUID_HOE;
    public static final RegistryObject<Item> SQUID_PICKAXE;
    public static final RegistryObject<Item> SQUID_SHOVEL;
    public static final RegistryObject<Item> SQUID_SWORD;

    static {
        SHREDDED_SQUID = register("shredded_squid", new ItemFood.Meat(squidCraft, 1, 0.4f));
        COOKED_SHREDDED_SQUID = register("cooked_shredded_squid", new ItemFood.Meat(squidCraft, 2, 0.6f));
        A_PILE_COOKED_SHREDDED_SQUID = register("a_pile_cooked_shredded_squid", new ItemFood.Meat(squidCraft, 18, 0.8f));
        SQUID_COOKIE = register("squid_cookie",
                new ItemFood.Meat.Big(squidCraft, 162, 3.2f) {
                    @Override
                    @ParametersAreNonnullByDefault
                    public void addInformation(ItemStack stack,
                                               @Nullable World worldIn,
                                               List<ITextComponent> tooltip,
                                               ITooltipFlag flagIn) {
                        super.addInformation(stack, worldIn, tooltip, flagIn);
                        tooltip.add(new TranslationTextComponent("item.squidcraft.squid_cookie.tooltip"));
                    }
                });
        SQUID_HELMET = register("squid_helmet", new ArmorItem(ArmorMaterials.SQUID, EquipmentSlotType.HEAD, new Item.Properties().group(squidCraftCombatAndTools)));
        SQUID_CHESTPLATE = register("squid_chestplate", new ArmorItem(ArmorMaterials.SQUID, EquipmentSlotType.CHEST, new Item.Properties().group(squidCraftCombatAndTools)));
        SQUID_LEGGINGS = register("squid_leggings", new ArmorItem(ArmorMaterials.SQUID, EquipmentSlotType.LEGS, new Item.Properties().group(squidCraftCombatAndTools)));
        SQUID_BOOTS = register("squid_boots", new ArmorItem(ArmorMaterials.SQUID, EquipmentSlotType.FEET, new Item.Properties().group(squidCraftCombatAndTools)));
        SQUID_AXE = register("squid_axe", new AxeItem(ToolMaterials.SQUID, -0, -2.2f, new Item.Properties().group(squidCraftCombatAndTools)));
        SQUID_HOE = register("squid_hoe", new HoeItem(ToolMaterials.SQUID, -2.4f, new Item.Properties().group(squidCraftCombatAndTools)));
        SQUID_PICKAXE = register("squid_pickaxe", new PickaxeItem(ToolMaterials.SQUID, -1, -1, new Item.Properties().group(squidCraftCombatAndTools)));
        SQUID_SHOVEL = register("squid_shovel", new ShovelItem(ToolMaterials.SQUID, -2, -2, new Item.Properties().group(squidCraftCombatAndTools)));
        SQUID_SWORD = register("squid_sword", new SwordItem(ToolMaterials.SQUID, 1, -0, new Item.Properties().group(squidCraftCombatAndTools)));

    }
}

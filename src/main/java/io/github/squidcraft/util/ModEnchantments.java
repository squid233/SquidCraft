package io.github.squidcraft.util;

import io.github.squidcraft.enchantment.FireBoomEnchantment;
import io.github.squidcraft.enchantment.FrostEnchantment;
import io.github.squidcraft.enchantment.InsaneEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static io.github.squidcraft.SquidCraft.MODID;

public class ModEnchantments {
    public static final Enchantment FROST;
    public static final Enchantment FIRE_BOOM;
    public static final Enchantment INSANE;

    static {
        FROST = Registry.register(
                Registry.ENCHANTMENT,
                new Identifier(MODID, "frost"),
                new FrostEnchantment(
                        Enchantment.Weight.RARE,
                        EnchantmentTarget.WEAPON,
                        new EquipmentSlot[] {
                                EquipmentSlot.MAINHAND
                        }
                )
        );
        FIRE_BOOM = Registry.register(
                Registry.ENCHANTMENT,
                new Identifier(MODID, "fire_boom"),
                new FireBoomEnchantment(
                        Enchantment.Weight.RARE,
                        EnchantmentTarget.WEAPON,
                        new EquipmentSlot[] {
                                EquipmentSlot.MAINHAND
                        }
                )
        );
        INSANE = Registry.register(
                Registry.ENCHANTMENT,
                new Identifier(MODID, "insane"),
                new InsaneEnchantment(
                        Enchantment.Weight.VERY_RARE,
                        EnchantmentTarget.ARMOR,
                        new EquipmentSlot[] {
                                EquipmentSlot.HEAD,
                                EquipmentSlot.CHEST,
                                EquipmentSlot.LEGS,
                                EquipmentSlot.FEET
                        }
                )
        );
    }
}

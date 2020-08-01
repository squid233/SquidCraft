package io.github.squid233.squidcraft.util.register;

import io.github.squid233.squidcraft.enchantment.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.*;
import net.minecraft.util.registry.Registry;
import static io.github.squid233.squidcraft.SquidCraft.MODID;
import static io.github.squid233.squidcraft.util.ModEnchantments.*;

public class EnchantmentRegister {
    public EnchantmentRegister() {
        FROST = Registry.register(
                Registry.ENCHANTMENT,
                new Identifier(MODID, "frost"),
                new FrostEnchantment(
                        Enchantment.Rarity.RARE,
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
                        Enchantment.Rarity.RARE,
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
                        Enchantment.Rarity.VERY_RARE,
                        EnchantmentTarget.ARMOR,
                        new EquipmentSlot[] {
                                EquipmentSlot.HEAD,
                                EquipmentSlot.CHEST,
                                EquipmentSlot.LEGS,
                                EquipmentSlot.FEET
                        }
                )
        );
        ELECTRIC_POWER = Registry.register(
                Registry.ENCHANTMENT,
                new Identifier(MODID, "electric_power"),
                new ElectricPowerEnchantment(
                        Enchantment.Rarity.RARE,
                        EnchantmentTarget.WEAPON,
                        new EquipmentSlot[] {
                                EquipmentSlot.MAINHAND,
                                EquipmentSlot.OFFHAND
                        }
                )
        );
    }
}

package io.github.squidcraft.util.registers;

import io.github.squidcraft.enchantment.ElectricPowerEnchantment;
import io.github.squidcraft.enchantment.FireBoomEnchantment;
import io.github.squidcraft.enchantment.FrostEnchantment;
import io.github.squidcraft.enchantment.InsaneEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.squidcraft.SquidCraft.MODID;

public class EnchantmentRegister {
    public static Enchantment FROST;
    public static Enchantment FIRE_BOOM;
    public static Enchantment INSANE;
    public static Enchantment ElectricPower;

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
        ElectricPower = Registry.register(
                Registry.ENCHANTMENT,
                new Identifier(MODID, "electric_power"),
                new ElectricPowerEnchantment(
                        Enchantment.Weight.RARE,
                        EnchantmentTarget.ALL,
                        new EquipmentSlot[] {
                                EquipmentSlot.MAINHAND,
                                EquipmentSlot.OFFHAND
                        }
                )
        );
    }
}

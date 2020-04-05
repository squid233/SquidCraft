package io.github.squidcraft.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static io.github.squidcraft.SquidCraft.MODID;

public class EnchantmentRegister {
    public static Enchantment FROST;

    public EnchantmentRegister() {
        FROST = Registry.register(
                Registry.ENCHANTMENT,
                new Identifier(MODID, "frost"),
                new FrostEnchantment(
                        Enchantment.Weight.VERY_RARE,
                        EnchantmentTarget.WEAPON,
                        new EquipmentSlot[] {
                                EquipmentSlot.MAINHAND
                        }
                )
        );
    }
}

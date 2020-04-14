package io.github.squidcraft.util.registers;

import io.github.squidcraft.util.ModItems;

import static io.github.squidcraft.util.ModItems.*;

public class ItemRegister {
    ModItems modItems;
    public ItemRegister() {
        modItems.registerItem("shredded_squid", SHREDDED_SQUID);
        modItems.registerItem("cooked_shredded_squid", COOKED_SHREDDED_SQUID);
        modItems.registerItem("a_pile_cooked_shredded_squid", A_PILE_COOKED_SHREDDED_SQUID);
        modItems.registerItem("squid_cookie", SQUID_COOKIE);
        modItems.registerItem("netherite_scrap", NETHERITE_SCRAP);
        modItems.registerItem("netherite_ingot", NETHERITE_INGOT);
        modItems.registerItem("samsung_galaxy_note_seven", SAMSUNG_GALAXY_NOTE_SEVEN);

        modItems.registerArmor("squid", SQUID_HELMET, SQUID_CHESTPLATE, SQUID_LEGGINGS, SQUID_BOOTS);
        modItems.registerArmor("netherite", NETHERITE_HELMET, NETHERITE_CHESTPLATE, NETHERITE_LEGGINGS, NETHERITE_BOOTS);

        modItems.registerTool("squid", SQUID_AXE, SQUID_HOE, SQUID_PICKAXE, SQUID_SHOVEL, SQUID_SWORD);
        modItems.registerTool("netherite", NETHERITE_AXE, NETHERITE_HOE, NETHERITE_PICKAXE, NETHERITE_SHOVEL, NETHERITE_SWORD);
    }
}

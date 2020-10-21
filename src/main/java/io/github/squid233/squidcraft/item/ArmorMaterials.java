package io.github.squid233.squidcraft.item;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvents;

/**
 * @author squid233
 * @date 2020/9/20
 */
public class ArmorMaterials {
    public static final ArmorMaterial SQUID = new ArmorMaterialBuilder("squid")
            .durability(5)
            .protectionAmounts(5, 8, 7, 4)
            .enchantability(15)
            .equipSound(SoundEvents.ITEM_ARMOR_EQUIP_LEATHER)
            .toughness(0.5f)
            .knockbackResistance(0)
            .repairIngredient(() -> Ingredient.ofItems(Items.SQUID_COOKIE))
            .build();
}

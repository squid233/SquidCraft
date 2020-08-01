package io.github.squid233.squidcraft.common.armor;

import io.github.squid233.squidcraft.common.registes.ItemRegister;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

/**
 * @author squid233
 */
public enum ArmorMaterials implements IArmorMaterial {
    /**
     *
     */
    SQUID("squid", 5, new int[]{5, 8, 7, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.5f, () -> {
        return Ingredient.fromItems(ItemRegister.SQUID_COOKIE.get());
    });

    private static final int[] BASE_DURABILITY = {13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final LazyValue<Ingredient> repairIngredient;

    ArmorMaterials(String name,
                   int durabilityMultiplier,
                   int[] armorValueArr,
                   int enchantability,
                   SoundEvent soundEvent,
                   float toughness,
                   Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = armorValueArr;
        this.enchantability = enchantability;
        this.equipSound = soundEvent;
        this.toughness = toughness;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    @Override
    public int getDurability(EquipmentSlotType slot) {
        return BASE_DURABILITY[slot.getSlotIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slot) {
        return this.protectionAmounts[slot.getSlotIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    @MethodsReturnNonnullByDefault
    public SoundEvent getSoundEvent() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairIngredient.getValue();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    @MethodsReturnNonnullByDefault
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

}

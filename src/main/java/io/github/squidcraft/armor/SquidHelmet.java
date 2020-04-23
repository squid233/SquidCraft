package io.github.squidcraft.armor;

import io.github.squidcraft.item.ItemGroups;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class SquidHelmet extends ArmorItem {
    public SquidHelmet() {
        super(ArmorMaterials.SQUID, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroups.NETHERITE_MOD));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 999999));
        return TypedActionResult.success(new ItemStack(this));
    }
}

package io.github.squid233.squidcraft.armor;

import io.github.squid233.squidcraft.item.ItemGroups;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class SquidHelmet extends ArmorItem {
    public SquidHelmet() {
        super(ArmorMaterials.SQUID, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroups.SQUID_CRAFT));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 999999));
        return TypedActionResult.success(new ItemStack(this));
    }
}

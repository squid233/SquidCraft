package io.github.squid233.squidcraft.armor;

import io.github.squid233.squidcraft.item.ItemGroups;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class NetheriteHelmet extends ArmorItem {
    public NetheriteHelmet() {
        super(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroups.NETHERITE_MOD));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1000000));
        return TypedActionResult.success(new ItemStack(this));
    }
}

package io.github.squidcraft.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

import java.util.Objects;

import static io.github.squidcraft.item.ItemGroups.SQUID_CRAFT;

public class NetheriteHelmet extends ArmorItem {
    public NetheriteHelmet() {
        super(NetheriteArmorMaterial.NETHERITE, EquipmentSlot.HEAD, new Item.Settings().group(SQUID_CRAFT));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        Objects.requireNonNull(context.getPlayer()).addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 999999));
        return ActionResult.SUCCESS;
    }
}

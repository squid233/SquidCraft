package io.github.squid233.squidcraft.mixin;

import io.github.squid233.squidcraft.util.register.ItemRegister;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {
    @Shadow
    public abstract void addExperience(int experience);

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "tick", at = @At("HEAD"))
    private void tick(CallbackInfo c) {
        Item helmet = this.getEquippedStack(EquipmentSlot.HEAD).getItem();
        Item chestplate = this.getEquippedStack(EquipmentSlot.CHEST).getItem();
        Item leggings = this.getEquippedStack(EquipmentSlot.LEGS).getItem();
        Item boots = this.getEquippedStack(EquipmentSlot.FEET).getItem();

        if (helmet.equals(ItemRegister.SQUID_HELMET) && chestplate.equals(ItemRegister.SQUID_CHESTPLATE) && leggings.equals(ItemRegister.SQUID_LEGGINGS) && boots.equals(ItemRegister.SQUID_BOOTS)) {
            this.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 20 * 3, 0));
        }
    }

}

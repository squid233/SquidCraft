package io.github.squidcraft.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class SamsungGalaxyNoteSeven extends Item {
    public SamsungGalaxyNoteSeven() {
        super(new Settings().group(ItemGroups.SQUID_CRAFT));
    }

    // TODO texture

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        world = user.world;
        boolean bl = world.getGameRules().getBoolean(GameRules.MOB_GRIEFING);
        world.createExplosion(user, user.prevX, user.prevY, user.prevZ, 5.0f, bl, bl ? Explosion.DestructionType.DESTROY : Explosion.DestructionType.NONE);
        world.spawnEntity(user);
        return TypedActionResult.success(new ItemStack(this));
    }
}

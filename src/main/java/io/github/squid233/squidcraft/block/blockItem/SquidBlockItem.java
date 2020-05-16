package io.github.squid233.squidcraft.block.blockItem;

import io.github.squid233.squidcraft.util.registers.BlockRegister;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class SquidBlockItem extends BlockItem {
    public SquidBlockItem(Settings settings) {
        super(BlockRegister.SQUID_BLOCK, settings);
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        if (player != null) {
            player.giveItemStack(new ItemStack(BlockRegister.ANCIENT_DEBRIS, new Random().nextInt(1)));
        }
    }
}

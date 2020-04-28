package io.github.squidcraft.block.blockItem;

import io.github.squidcraft.util.registers.BlockRegister;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class SquidBlockItem extends BlockItem {
    public SquidBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        Random random;
        if (player != null) {
            random = new Random();
            player.giveItemStack(new ItemStack(BlockRegister.ANCIENT_DEBRIS, random.nextInt(16)));
        }
    }
}

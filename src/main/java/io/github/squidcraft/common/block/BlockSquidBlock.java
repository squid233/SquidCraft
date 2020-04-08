package io.github.squidcraft.common.block;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.common.item.ItemGroups;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.ParametersAreNonnullByDefault;

public class BlockSquidBlock extends Block {
    public BlockSquidBlock() {
        super(Material.GROUND);
        this.setRegistryName("squid_block").setUnlocalizedName(SquidCraft.MODID+"."+"squid_block").setCreativeTab(ItemGroups.SQUID_CRAFT).setHardness(0.5f);
    }

    @ParametersAreNonnullByDefault
    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        Item.getItemFromBlock(this);
    }
}

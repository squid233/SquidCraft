package io.github.squidcraft.item;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroups {
    public static final ItemGroup SQUID_CRAFT = FabricItemGroupBuilder.create(
            new Identifier(SquidCraft.MODID, "squid_craft"))
            .icon(() -> new ItemStack(ModBlocks.SQUID_BLOCK))
            .appendItems(stacks ->
            {
                stacks.add(new ItemStack(ModItems.SHREDDED_SQUID));
                stacks.add(new ItemStack(ModItems.COOKED_SHREDDED_SQUID));
                stacks.add(new ItemStack(ModItems.A_PILE_COOKED_SHREDDED_SQUID));
                stacks.add(new ItemStack(ModItems.SQUID_COOKIE));

                stacks.add(new ItemStack(ModBlocks.SQUID_BLOCK));

                stacks.add(new ItemStack(ModItems.SQUID_HELMET));
                stacks.add(new ItemStack(ModItems.SQUID_CHESTPLATE));
                stacks.add(new ItemStack(ModItems.SQUID_LEGGINGS));
                stacks.add(new ItemStack(ModItems.SQUID_BOOTS));

                stacks.add(new ItemStack(ModItems.SQUID_AXE));
                stacks.add(new ItemStack(ModItems.SQUID_HOE));
                stacks.add(new ItemStack(ModItems.SQUID_PICKAXE));
                stacks.add(new ItemStack(ModItems.SQUID_SHOVEL));
                stacks.add(new ItemStack(ModItems.SQUID_SWORD));

            })
            .build();
}

package io.github.squidcraft.item;

import io.github.squidcraft.SquidCraft;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static io.github.squidcraft.util.ModItems.*;
import static io.github.squidcraft.util.ModBlocks.*;

public class ItemGroups {
    public static final ItemGroup SQUID_CRAFT = FabricItemGroupBuilder.create(
            new Identifier(SquidCraft.MODID, "squid_craft"))
            .icon(() -> new ItemStack(SQUID_BLOCK))
            .appendItems(stacks ->
            {
                stacks.add(new ItemStack(SHREDDED_SQUID));
                stacks.add(new ItemStack(COOKED_SHREDDED_SQUID));
                stacks.add(new ItemStack(A_PILE_COOKED_SHREDDED_SQUID));
                stacks.add(new ItemStack(SQUID_COOKIE));

                stacks.add(new ItemStack(SQUID_BLOCK));
                stacks.add(new ItemStack(COMPRESS_SQUID_BLOCK));

                stacks.add(new ItemStack(SQUID_HELMET));
                stacks.add(new ItemStack(SQUID_CHESTPLATE));
                stacks.add(new ItemStack(SQUID_LEGGINGS));
                stacks.add(new ItemStack(SQUID_BOOTS));

                stacks.add(new ItemStack(SQUID_AXE));
                stacks.add(new ItemStack(SQUID_HOE));
                stacks.add(new ItemStack(SQUID_PICKAXE));
                stacks.add(new ItemStack(SQUID_SHOVEL));
                stacks.add(new ItemStack(SQUID_SWORD));

                stacks.add(new ItemStack(ANCIENT_DEBRIS));
                stacks.add(new ItemStack(NETHERITE_SCRAP));
                stacks.add(new ItemStack(NETHERITE_INGOT));
                stacks.add(new ItemStack(NETHERITE_BLOCK));

                stacks.add(new ItemStack(NETHERITE_HELMET));
                stacks.add(new ItemStack(NETHERITE_CHESTPLATE));
                stacks.add(new ItemStack(NETHERITE_LEGGINGS));
                stacks.add(new ItemStack(NETHERITE_BOOTS));

                stacks.add(new ItemStack(NETHERITE_SWORD));
                stacks.add(new ItemStack(NETHERITE_AXE));
                stacks.add(new ItemStack(NETHERITE_PICKAXE));
                stacks.add(new ItemStack(NETHERITE_SHOVEL));
                stacks.add(new ItemStack(NETHERITE_HOE));

                stacks.add(new ItemStack(SAMSUNG_GALAXY_NOTE_SEVEN));

            })
            .build();
}

package io.github.squid233.yummyfood.item;

import io.github.squid233.squidcraft.SquidCraft;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static io.github.squid233.yummyfood.YummyFood.*;

public class ItemGroup {
    public static final net.minecraft.item.ItemGroup YUMMYFOOD = FabricItemGroupBuilder.create(
            new Identifier(SquidCraft.MODID, "yummyfood"))
            .icon(() -> new ItemStack(HOT_DOG))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(PINEAPPLE));
                stacks.add(new ItemStack(TOMATO));
                stacks.add(new ItemStack(SAUSAGE));
                stacks.add(new ItemStack(COOKED_SAUSAGE));
                stacks.add(new ItemStack(HOT_DOG));
            })
            .build();
}

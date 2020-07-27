package io.github.squid233.squidcraft.item;

import io.github.squid233.squidcraft.SquidCraft;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static io.github.squid233.squidcraft.util.registers.ItemRegister.*;
import static io.github.squid233.squidcraft.util.registers.BlockRegister.*;

public class ItemGroups {
    /**
     * Let it cannot constructing
     */
    private ItemGroups() {

    }

    public static final ItemGroup SQUID_CRAFT = FabricItemGroupBuilder.create(
            new Identifier(SquidCraft.MODID, "squid_craft"))
            .icon(() -> new ItemStack(SQUID_BLOCK))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(SHREDDED_SQUID));
                stacks.add(new ItemStack(COOKED_SHREDDED_SQUID));
                stacks.add(new ItemStack(A_PILE_COOKED_SHREDDED_SQUID));
                stacks.add(new ItemStack(SQUID_COOKIE));

                stacks.add(new ItemStack(SQUID_BLOCK));
                stacks.add(new ItemStack(COMPRESS_SQUID_BLOCK));
                stacks.add(new ItemStack(LOW_SQUID_BLOCK));
                stacks.add(new ItemStack(LOW_COMPRESS_SQUID_BLOCK));
                stacks.add(new ItemStack(MEDIUM_SQUID_BLOCK));
                stacks.add(new ItemStack(MEDIUM_COMPRESS_SQUID_BLOCK));
                stacks.add(new ItemStack(HIGHER_SQUID_BLOCK));
                stacks.add(new ItemStack(HIGHER_COMPRESS_SQUID_BLOCK));
                stacks.add(new ItemStack(SUPER_SQUID_BLOCK));
                stacks.add(new ItemStack(SUPER_COMPRESS_SQUID_BLOCK));
                stacks.add(new ItemStack(ULTIMATE_SQUID_BLOCK));
                stacks.add(new ItemStack(ULTIMATE_COMPRESS_SQUID_BLOCK));

                stacks.add(new ItemStack(ONE_SQUID_BLOCK));
                stacks.add(new ItemStack(TWO_SQUID_BLOCK));
                stacks.add(new ItemStack(FOUR_SQUID_BLOCK));
                stacks.add(new ItemStack(EIGHT_SQUID_BLOCK));

                stacks.add(new ItemStack(SQUID_SIDE_BLOCK));

                stacks.add(new ItemStack(BIGGER_CHEST_BLOCK));

                stacks.add(new ItemStack(COOKIE_CREEPER_SPAWN_EGG));
                stacks.add(new ItemStack(CUBE_SPAWN_EGG));
                stacks.add(new ItemStack(YOUR_ITEM));
                stacks.add(new ItemStack(YOUR_ITEM_2));

                stacks.add(new ItemStack(SOUL_JACK_O_LANTERN));
                stacks.add(new ItemStack(MILK_BUCKET));
            })
            .build();



    public static final ItemGroup SQUID_CRAFT_COMBAT_AND_TOOLS = FabricItemGroupBuilder.create(
            new Identifier(SquidCraft.MODID, "sc_combat_and_tools"))
            .icon(() -> new ItemStack(SQUID_SWORD))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(SQUID_HELMET));
                stacks.add(new ItemStack(SQUID_CHESTPLATE));
                stacks.add(new ItemStack(SQUID_LEGGINGS));
                stacks.add(new ItemStack(SQUID_BOOTS));

                stacks.add(new ItemStack(SQUID_AXE));
                stacks.add(new ItemStack(SQUID_HOE));
                stacks.add(new ItemStack(SQUID_PICKAXE));
                stacks.add(new ItemStack(SQUID_SHOVEL));
                stacks.add(new ItemStack(SQUID_SWORD));

            })
            .build();

}

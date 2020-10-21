package io.github.squid233.squidcraft.item;

import io.github.squid233.squidcraft.util.Identifier;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

/**
 * @author squid233
 * @date 2020/9/20
 */
public class ItemGroups {
    public static final ItemGroup SQUID_CRAFT = FabricItemGroupBuilder.build(new Identifier("squid_craft"), () -> new ItemStack(Items.SQUID_COOKIE));

    public static final ItemGroup SQUID_CRAFT_COMBAT_AND_TOOLS = FabricItemGroupBuilder.build(new Identifier("squid_craft"), () -> new ItemStack(Items.SQUID_HELMET));
}

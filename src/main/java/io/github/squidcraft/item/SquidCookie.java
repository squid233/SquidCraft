package io.github.squidcraft.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

public class SquidCookie extends Item {
    public SquidCookie() {
        super(new Settings()
                .group(ItemGroups.SQUID_CRAFT)
                .food(new FoodComponent.Builder().hunger(162).saturationModifier(3.1415926535897932384626f).meat().alwaysEdible().build())
        );
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("item.squidcraft.squid_cookie.tooltip"));
    }
}

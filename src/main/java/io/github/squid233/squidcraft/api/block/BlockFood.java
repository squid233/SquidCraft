package io.github.squid233.squidcraft.api.block;

import io.github.squid233.squidcraft.item.ItemGroups;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.BlockView;

import javax.annotation.Nullable;
import java.util.List;

public class BlockFood {

    public static class SquidCraftFood extends Block {

        private final int hunger;
        private final float saturationModifier;

        public SquidCraftFood(float hardness, float resistance, int hunger, float saturation) {
            super(FabricBlockSettings.of(Material.SOIL).strength(hardness, resistance));
            this.hunger = hunger;
            this.saturationModifier = saturation;
        }

        public SquidCraftFood(float hardness, int hunger, float saturation) {
            this(hardness, 0, hunger, saturation);
        }

        @Override
        public void buildTooltip(ItemStack stack,
                                 @Nullable BlockView world,
                                 List<Text> tooltip,
                                 TooltipContext options) {
            tooltip.add(new TranslatableText("item.food.hunger", hunger));
            tooltip.add(new TranslatableText("item.food.saturation", saturationModifier));
            tooltip.add(new TranslatableText("item.food.isWolfFood", true));
            tooltip.add(new TranslatableText("item.food.alwaysEdible"));
        }

        public static class ItemBlock extends BlockItem {

            public ItemBlock(SquidCraftFood block) {
                super(block,
                        new Settings()
                                .group(ItemGroups.SQUID_CRAFT)
                                .food(
                                        new FoodComponent.Builder()
                                                .hunger(block.hunger)
                                                .saturationModifier(block.saturationModifier)
                                                .meat().alwaysEdible().build()));
            }

            public ItemBlock(Block block) {
                this((SquidCraftFood) block);
            }

        }
    }
}

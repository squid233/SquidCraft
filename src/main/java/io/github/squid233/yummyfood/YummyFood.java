package io.github.squid233.yummyfood;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.api.ItemRegisters;
import io.github.squid233.yummyfood.item.ItemGroup;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.time.LocalDateTime;
import java.util.List;

public final class YummyFood implements ModInitializer {

    public static final Item PINEAPPLE = register("pineapple", new Item(new Item.Settings().group(ItemGroup.YUMMYFOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build())));
    public static final Item TOMATO = register("tomato", new Item(new Item.Settings().group(ItemGroup.YUMMYFOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build())) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            int currentEra, currentYear, currentMonth, currentDay;
            LocalDateTime time = LocalDateTime.now();
            currentEra = time.toLocalDate().getEra().getValue();
            currentYear = time.getYear();
            currentMonth = time.getMonthValue();
            currentDay = time.getDayOfMonth();
            tooltip.add(new TranslatableText(this.getTranslationKey() + ".tooltip", currentEra, currentYear, currentMonth, currentDay));
        }
    });

    private static Item register(String name, Item item) {
        return ItemRegisters.register(SquidCraft.MODID, name, item);
    }

    @Override
    public void onInitialize() {
    }

}

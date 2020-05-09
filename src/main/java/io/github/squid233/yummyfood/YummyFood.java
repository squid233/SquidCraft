package io.github.squid233.yummyfood;

import io.github.squid233.yummyfood.api.Registers;
import io.github.squid233.yummyfood.item.ItemGroup;
import io.github.squid233.yummyfood.item.Pineapple;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class YummyFood implements ModInitializer {

    public static final Item PINEAPPLE = new Pineapple(new Item.Settings().group(ItemGroup.YUMMYFOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));

    private static Item register(String name, Item item) {
        return Registers.registerItem(name, item);
    }

    @Override
    public void onInitialize() {
        register("pineapple", PINEAPPLE);
    }

}

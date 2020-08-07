package io.github.squid233.yummyfood;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.api.ItemRegisters;
import io.github.squid233.squidcraft.api.item.ItemFood;
import io.github.squid233.yummyfood.item.ItemGroup;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;

public final class YummyFood implements ModInitializer {

    public static final Item PINEAPPLE = register("pineapple", new ItemFood(new Item.Settings().group(ItemGroup.YUMMYFOOD), 4, 0.4f));
    public static final Item TOMATO = register("tomato", new ItemFood(new Item.Settings().group(ItemGroup.YUMMYFOOD), 2, 0.5f));
    public static final Item SAUSAGE = register("sausage", new ItemFood.Meat(new Item.Settings().group(ItemGroup.YUMMYFOOD), 9, 0.9f));
    public static final Item COOKED_SAUSAGE = register("cooked_sausage", new ItemFood.Meat(new Item.Settings().group(ItemGroup.YUMMYFOOD), 24, 2.4f));
    public static final Item HOT_DOG = register("hot_dog", new ItemFood(new Item.Settings().group(ItemGroup.YUMMYFOOD), 31, 3.5f));

    private static Item register(String name, Item item) {
        return ItemRegisters.register(SquidCraft.MODID, name, item);
    }

    @Override
    public void onInitialize() {
    }

}

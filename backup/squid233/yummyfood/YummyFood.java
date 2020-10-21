package io.github.squid233.yummyfood;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.api.RegistryAll;
import io.github.squid233.squidcraft.api.item.ItemFood;
import io.github.squid233.yummyfood.item.ItemGroup;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;

public final class YummyFood implements ModInitializer {

    private static final String[] itemsName = {"pineapple", "tomato" , "sausage", "cooked_sausage", "hot_dog"};

    public static final Item PINEAPPLE = new ItemFood(new Item.Settings().group(ItemGroup.YUMMYFOOD), 4, 0.4f);
    public static final Item TOMATO = new ItemFood(new Item.Settings().group(ItemGroup.YUMMYFOOD), 2, 0.5f);
    public static final Item SAUSAGE = new ItemFood.Meat(new Item.Settings().group(ItemGroup.YUMMYFOOD), 9, 0.9f);
    public static final Item COOKED_SAUSAGE = new ItemFood.Meat(new Item.Settings().group(ItemGroup.YUMMYFOOD), 24, 2.4f);
    public static final Item HOT_DOG = new ItemFood(new Item.Settings().group(ItemGroup.YUMMYFOOD), 31, 3.5f);

    private static final Item[] items = {
            PINEAPPLE, TOMATO, SAUSAGE, COOKED_SAUSAGE, HOT_DOG
    };

    private static void register(Item... items) {
        RegistryAll.registerItems(SquidCraft.MODID, itemsName, items);
    }

    @Override
    public void onInitialize() {
        register(items);
    }

}

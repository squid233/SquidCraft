package io.github.squid233.yummyfood;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.api.ItemRegisters;
import io.github.squid233.yummyfood.item.ItemGroup;
import io.github.squid233.yummyfood.item.Pineapple;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public final class YummyFood implements ModInitializer {

    public static final Item PINEAPPLE = register("pineapple", new Pineapple(new Item.Settings().group(ItemGroup.YUMMYFOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build())));

    private static Item register(String name, Item item) {
        return ItemRegisters.register(SquidCraft.MODID, name, item);
    }

    @Override
    public void onInitialize() {
    }

}

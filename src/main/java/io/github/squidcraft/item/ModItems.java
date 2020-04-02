package io.github.squidcraft.item;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.api.ItemsRegister;
import net.minecraft.item.Item;

public class ModItems implements ItemsRegister {
    public static final Item SHREDDED_SQUID = new ShreddedSquid();
    public static final Item COOKED_SHREDDED_SQUID = new CookedShreddedSquid();
    public static final Item A_PILE_COOKED_SHREDDED_SQUID = new APileCSSquid();
    public static final Item SQUID_COOKIE = new SquidCookie();

    public ModItems() {
        registerItem("shredded_squid", SHREDDED_SQUID);
        registerItem("cooked_shredded_squid", COOKED_SHREDDED_SQUID);
        registerItem("a_pile_cooked_shredded_squid", A_PILE_COOKED_SHREDDED_SQUID);
        registerItem("squid_cookie", SQUID_COOKIE);
    }


    private static void registerItem(String itemName, Item item) {
        ItemsRegister.registerItem(SquidCraft.MODID, itemName, item);
    }
}

package io.github.squidcraft.common.register;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.common.item.*;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = SquidCraft.MODID)
public class ItemsRegister {
    /**
     * This is MinecraftForge's event bus
     */
    public ItemsRegister() { MinecraftForge.EVENT_BUS.register(this); }

    // Here is mod's items BEGIN.
    public static final Item SHREDDED_SQUID = new ItemShreddedSquid();
    public static final Item COOKED_SHREDDED_SQUID = new ItemCookedShreddedSquid();
    public static final Item A_PILE_SHREDDED_SQUID = new ItemAPileCookedShreddedSquid();
    public static final Item SQUID_COOKIE = new ItemSquidCookie();

    /**
     *
     * @param event Item's RegisterEvent.
     * You can input some items into registerAll() method to register item.
     *
     */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                SHREDDED_SQUID, COOKED_SHREDDED_SQUID, A_PILE_SHREDDED_SQUID,
                SQUID_COOKIE
        );
    }
}

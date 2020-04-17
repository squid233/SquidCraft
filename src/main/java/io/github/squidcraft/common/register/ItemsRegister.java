package io.github.squidcraft.common.register;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.common.item.*;
import io.github.squidcraft.common.item.tool.ItemToolSquidTool;
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
    public static final Item SQUID_AXE = new ItemToolSquidTool.SquidAxe();
    public static final Item SQUID_HOE = new ItemToolSquidTool.SquidHoe();
    public static final Item SQUID_PICKAXE = new ItemToolSquidTool.SquidPickaxe();
    public static final Item SQUID_SHOVEL = new ItemToolSquidTool.SquidShovel();
    public static final Item SQUID_SWORD = new ItemToolSquidTool.SquidSword();

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
                SQUID_COOKIE,
                SQUID_AXE, SQUID_HOE, SQUID_PICKAXE, SQUID_SHOVEL, SQUID_SWORD // Squid Tool
        );
    }
}

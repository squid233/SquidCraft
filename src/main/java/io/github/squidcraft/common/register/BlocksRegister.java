package io.github.squidcraft.common.register;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.common.block.BlockSquidBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = SquidCraft.MODID)
public class BlocksRegister {

    public BlocksRegister() { MinecraftForge.EVENT_BUS.register(this); }

    // Here is mod's blocks BEGIN.
    public static final Block SQUID_BLOCK = new BlockSquidBlock();

    // Here is mod's item blocks BEGIN.
    public static final Item SQUID_BLOCK_ITEM = new ItemBlock(SQUID_BLOCK).setRegistryName(Objects.requireNonNull(SQUID_BLOCK.getRegistryName()));

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                SQUID_BLOCK
        );
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                SQUID_BLOCK_ITEM
        );
    }

}

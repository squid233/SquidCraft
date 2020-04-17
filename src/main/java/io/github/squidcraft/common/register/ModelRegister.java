package io.github.squidcraft.common.register;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static io.github.squidcraft.common.register.ItemsRegister.*;
import static io.github.squidcraft.common.register.BlocksRegister.*;

public class ModelRegister {
    public ModelRegister() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void registerModels(ModelRegistryEvent event) {
        registerItemModel(SHREDDED_SQUID);
        registerItemModel(COOKED_SHREDDED_SQUID);
        registerItemModel(A_PILE_SHREDDED_SQUID);
        registerItemModel(SQUID_COOKIE);
        registerItemModel(SQUID_AXE);
        registerItemModel(SQUID_HOE);
        registerItemModel(SQUID_PICKAXE);
        registerItemModel(SQUID_SHOVEL);
        registerItemModel(SQUID_SWORD);

        registerBlockModel(SQUID_BLOCK, SQUID_BLOCK_ITEM);

    }

    private static void registerItemModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
    private static void registerItemModel(Item item, String path) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(path, "inventory"));
    }
    private static void registerItemModel(Item item, ItemStack itemStack, String path) {
        ModelLoader.setCustomModelResourceLocation(item, itemStack.getMetadata(), new ModelResourceLocation(path, "inventory"));
    }
    private static void registerItemModel(Item item, int metadata, String path) {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(path, "inventory"));
    }

    private static void registerBlockModel(Block block, Item itemBlock) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemBlock, 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}

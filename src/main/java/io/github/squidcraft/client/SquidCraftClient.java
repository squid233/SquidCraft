package io.github.squidcraft.client;

import io.github.squidcraft.util.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.KeyBindingRegistry;
import net.fabricmc.fabric.api.event.client.ClientTickCallback;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

import static io.github.squidcraft.util.KeyBindings.*;

public class SquidCraftClient implements ClientModInitializer {
    PlayerEntity player;
    @Override
    public void onInitializeClient() {
        KeyBindingRegistry.INSTANCE.addCategory("SquidCraft");
        KeyBindingRegistry.INSTANCE.register(keyBinding_0);

        ClientTickCallback.EVENT.register(e -> {
            if (keyBinding_0.isPressed()) {
                System.out.println("was pressed!");
                player.giveItemStack(new ItemStack(ModItems.SQUID_COOKIE));
            }
        });
    }

}

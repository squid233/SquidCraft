package io.github.squidcraft.client;

import io.github.squidcraft.util.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.KeyBindingRegistry;
import net.fabricmc.fabric.api.event.client.ClientTickCallback;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;

import java.util.Objects;

import static io.github.squidcraft.util.KeyBindings.*;

public class SquidCraftClient implements ClientModInitializer {
    ItemUsageContext context;
    @Override
    public void onInitializeClient() {
        KeyBindingRegistry.INSTANCE.register(keyBinding_0);
        KeyBindingRegistry.INSTANCE.addCategory("SquidCraft");

        ClientTickCallback.EVENT.register(e -> {
            if (keyBinding_0.isPressed()) {
                System.out.println("was pressed!");
                Objects.requireNonNull(context.getPlayer()).giveItemStack(new ItemStack(ModItems.SQUID_COOKIE));
            }
        });
    }

}

package io.github.squidcraft.client;

import io.github.squidcraft.client.gui.BiggerChestScreen;
import io.github.squidcraft.tile.BiggerChestContainer;
import io.github.squidcraft.util.registers.BlockRegister;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screen.ScreenProviderRegistry;
import net.fabricmc.fabric.api.event.client.ClientTickCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.TranslatableText;
import static io.github.squidcraft.util.KeyBindings.*;
import static net.fabricmc.fabric.api.client.keybinding.KeyBindingRegistry.INSTANCE;

public final class SquidCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        INSTANCE.addCategory("SquidCraft");
        INSTANCE.register(keyBinding_0);
        ClientTickCallback.EVENT.register(e -> {
            if (keyBinding_0.isPressed()) System.out.println("was pressed!");
        });
        ScreenProviderRegistry.INSTANCE.<BiggerChestContainer>registerFactory(BlockRegister.BIGGER_CHEST, (container -> {
            assert MinecraftClient.getInstance().player != null;
            return new BiggerChestScreen(container, MinecraftClient.getInstance().player.inventory, new TranslatableText(BlockRegister.BIGGER_CHEST_TRANSLATION_KEY));
        }));
    }
}

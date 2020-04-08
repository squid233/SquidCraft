package io.github.squidcraft.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.KeyBindingRegistry;
import net.fabricmc.fabric.api.event.client.ClientTickCallback;

import static io.github.squidcraft.util.KeyBindings.*;

public class SquidCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyBindingRegistry.INSTANCE.register(keyBinding_0);

        ClientTickCallback.EVENT.register(e -> {
            if (keyBinding_0.isPressed()) {
                System.out.println("was pressed!");
            }
        });
    }

}

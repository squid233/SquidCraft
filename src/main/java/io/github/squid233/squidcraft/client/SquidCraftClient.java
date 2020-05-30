package io.github.squid233.squidcraft.client;

import io.github.squid233.squidcraft.client.gui.BiggerChestScreen;
import io.github.squid233.squidcraft.entity.CookieCreeperRenderer;
import io.github.squid233.squidcraft.block.tile.BiggerChestScreenHandler;
import io.github.squid233.squidcraft.util.ModEntities;
import io.github.squid233.squidcraft.util.registers.BlockRegister;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.screen.ScreenProviderRegistry;
import net.fabricmc.fabric.api.event.client.ClientTickCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.TranslatableText;

import static io.github.squid233.squidcraft.util.KeyBindings.keyBinding_0;
import static net.fabricmc.fabric.api.client.keybinding.KeyBindingRegistry.INSTANCE;

@SuppressWarnings("unused")
public final class SquidCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        INSTANCE.addCategory("SquidCraft");
        INSTANCE.register(keyBinding_0);
        ClientTickCallback.EVENT.register(e -> {
            if (keyBinding_0.isPressed()) System.out.println("was pressed!");
        });
        ScreenProviderRegistry.INSTANCE.<BiggerChestScreenHandler>registerFactory(BlockRegister.BIGGER_CHEST, (container -> {
            assert MinecraftClient.getInstance().player != null;
            return new BiggerChestScreen(container, MinecraftClient.getInstance().player.inventory, new TranslatableText(BlockRegister.BIGGER_CHEST_TRANSLATION_KEY));
        }));

        EntityRendererRegistry.INSTANCE.register(ModEntities.COOKIE_CREEPER, (entityRenderDispatcher, context) -> new CookieCreeperRenderer(entityRenderDispatcher));
    }
}

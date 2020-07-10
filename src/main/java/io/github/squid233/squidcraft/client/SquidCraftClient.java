package io.github.squid233.squidcraft.client;

import io.github.squid233.squidcraft.client.gui.BiggerChestScreen;
import io.github.squid233.squidcraft.entity.CookieCreeperRenderer;
import io.github.squid233.squidcraft.util.ModEntities;
import io.github.squid233.squidcraft.util.registers.BlockRegister;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.impl.client.keybinding.KeyBindingRegistryImpl;
import net.minecraft.client.render.RenderLayer;

import static io.github.squid233.squidcraft.util.KeyBindings.KEY_BINDING_0;

@SuppressWarnings("unused")
public final class SquidCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyBindingRegistryImpl.addCategory("SquidCraft");
        KeyBindingHelper.registerKeyBinding(KEY_BINDING_0);
        ClientTickEvents.END_CLIENT_TICK.register(e -> {
            if (KEY_BINDING_0.isPressed()) {
                System.out.println("was pressed!");
            }
        });

        ScreenRegistry.register(BlockRegister.BIGGER_CHEST_SCREEN_HANDLER_TYPE, BiggerChestScreen::new);

        EntityRendererRegistry.INSTANCE.register(ModEntities.COOKIE_CREEPER, (entityRenderDispatcher, context) -> new CookieCreeperRenderer(entityRenderDispatcher));

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegister.SHREDDED_SQUID_CROP, RenderLayer.getCutout());
    }
}

package io.github.squid233.squidcraft.client;

import io.github.squid233.squidcraft.client.gui.BiggerChestScreen;
import io.github.squid233.squidcraft.entity.CookieCreeperRenderer;
import io.github.squid233.squidcraft.entity.CubeEntityRenderer;
import io.github.squid233.squidcraft.entity.LavaSquidRenderer;
import io.github.squid233.squidcraft.util.ModEntities;
import io.github.squid233.squidcraft.util.register.BlockRegister;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;

import static io.github.squid233.squidcraft.util.KeyBindings.KEY_BINDING_0;

@SuppressWarnings("unused")
@Environment(EnvType.CLIENT)
public final class SquidCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyBindingHelper.registerKeyBinding(KEY_BINDING_0);
        ClientTickEvents.END_CLIENT_TICK.register(e -> {
            if (KEY_BINDING_0.isPressed()) {
                System.out.println("was pressed!");
            }
        });

        /*ScreenProviderRegistry.INSTANCE.<BiggerChestScreenHandler>registerFactory(BlockRegister.BIGGER_CHEST, (container) -> {
            assert MinecraftClient.getInstance().player != null;
            return new BiggerChestScreen(container, MinecraftClient.getInstance().player.inventory, new TranslatableText(BlockRegister.BIGGER_CHEST_TRANSLATION_KEY));
        });*/

        ScreenRegistry.register(null, BiggerChestScreen::new);

        EntityRendererRegistry.INSTANCE.register(ModEntities.COOKIE_CREEPER, (entityRenderDispatcher, context) -> new CookieCreeperRenderer(entityRenderDispatcher));

        EntityRendererRegistry.INSTANCE.register(ModEntities.LAVA_SQUID, ((entityRenderDispatcher, context) -> new LavaSquidRenderer(entityRenderDispatcher)));

        /*
         * Registers our Cube Entity's renderer, which provides a model and texture for the entity.
         *
         * Entity Renderers can also manipulate the model before it renders based on entity context (EndermanEntityRenderer#render).
         */
        EntityRendererRegistry.INSTANCE.register(ModEntities.CUBE, (dispatcher, context) -> new CubeEntityRenderer(dispatcher));

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegister.SHREDDED_SQUID_CROP, RenderLayer.getCutout());
    }
}

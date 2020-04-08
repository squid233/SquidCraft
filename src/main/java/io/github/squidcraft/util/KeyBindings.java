package io.github.squidcraft.util;

import io.github.squidcraft.SquidCraft;
import net.fabricmc.fabric.api.client.keybinding.FabricKeyBinding;
import net.fabricmc.fabric.api.client.keybinding.KeyBindingRegistry;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {
    public static FabricKeyBinding keyBinding_0;

    public KeyBindings() {
        keyBinding_0 = FabricKeyBinding.Builder.create(
                new Identifier(SquidCraft.MODID, "night_vision_key"),
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_RIGHT_SHIFT,
                "Keybind"
        ).build();

        KeyBindingRegistry.INSTANCE.addCategory("Keybind");
    }
}

package io.github.squidcraft.util;

import io.github.squidcraft.SquidCraft;
import net.fabricmc.fabric.api.client.keybinding.FabricKeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {
    public static final FabricKeyBinding keyBinding_0 = FabricKeyBinding.Builder.create(
            new Identifier(SquidCraft.MODID, "useless_key"),
    InputUtil.Type.KEYSYM,
    GLFW.GLFW_KEY_CAPS_LOCK,
            "SquidCraft"
            ).build();
}

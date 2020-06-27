package io.github.squid233.squidcraft.util;

import io.github.squid233.squidcraft.SquidCraft;
import net.minecraft.client.options.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {
    public static final KeyBinding KEY_BINDING_0 = new KeyBinding(
            "key" + SquidCraft.MODID + "." + "useless_key",
    InputUtil.Type.KEYSYM,
    GLFW.GLFW_KEY_CAPS_LOCK,
            "SquidCraft"
            );

}

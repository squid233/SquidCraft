package io.github.squid233.squidcraft.api;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static io.github.squid233.squidcraft.SquidCraft.log;

public class SoundsRegister {
    public static void registerSound(Identifier soundID, SoundEvent sound) {
        Registry.register(Registry.SOUND_EVENT, soundID, sound);
        log("register sounds", "register " + soundID + " success");
    }
}

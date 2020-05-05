package io.github.squidcraft.api;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static io.github.squidcraft.SquidCraft.log;

public interface SoundsRegister {
    static void registerSound(Identifier soundID, SoundEvent sound) {
        Registry.register(Registry.SOUND_EVENT, soundID, sound);
        log("register sounds", "register " + soundID + "success");
    }
}

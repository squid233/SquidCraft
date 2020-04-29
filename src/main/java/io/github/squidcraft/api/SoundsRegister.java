package io.github.squidcraft.api;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface SoundsRegister {
    static void registerSound(Identifier soundID, SoundEvent sound) {
        Logger logger = LogManager.getLogger("register sounds");
        Registry.register(Registry.SOUND_EVENT, soundID, sound);
        logger.info("register " + soundID + " success");
    }
}

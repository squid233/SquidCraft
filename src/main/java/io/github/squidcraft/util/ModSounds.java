package io.github.squidcraft.util;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import static io.github.squidcraft.api.SoundsRegister.registerSound;
import static net.minecraft.sound.BlockSoundGroup.METAL;

public class ModSounds {
    public static final Identifier ANCIENT_DEBRIS_BREAK = new Identifier("block.ancient_debris.break");

    public static SoundEvent ANCIENT_DEBRIS_BREAK_EVENT = new SoundEvent(ANCIENT_DEBRIS_BREAK);

    public static final BlockSoundGroup ANCIENT_DEBRIS = new BlockSoundGroup(1.0f, 1.5f, ANCIENT_DEBRIS_BREAK_EVENT, METAL.getStepSound(), METAL.getPlaceSound(), METAL.getHitSound(), METAL.getFallSound());

    public ModSounds() {
        registerSound(ANCIENT_DEBRIS_BREAK, ANCIENT_DEBRIS_BREAK_EVENT);
    }

}

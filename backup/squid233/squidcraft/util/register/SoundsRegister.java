package io.github.squid233.squidcraft.util.register;

import io.github.squid233.squidcraft.SquidCraft;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SoundsRegister {

    public static final Identifier MUSIC_ID = new Identifier(SquidCraft.MODID, "music");
    public static SoundEvent MUSIC_EVENT = Registry.register(Registry.SOUND_EVENT, MUSIC_ID, new SoundEvent(MUSIC_ID));
    public static final BiomeMoodSound MUSIC_SOUND = new BiomeMoodSound(MUSIC_EVENT, 24000, 1, 0);

}

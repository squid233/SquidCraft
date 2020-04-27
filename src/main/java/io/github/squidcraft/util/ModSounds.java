package io.github.squidcraft.util;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final Identifier ANCIENT_DEBRIS_BREAK = new Identifier("squidcraft:block.ancient_debris.break");
    public static final Identifier ANCIENT_DEBRIS_PLACE = new Identifier("squidcraft:block.ancient_debris.place");

    public static final Identifier ITEM_ARMOR_EQUIP_NETHERITE_ID = new Identifier("squidcraft:item.armor.equip_netherite");

    public static final SoundEvent ANCIENT_DEBRIS_BREAK_EVENT = new SoundEvent(ANCIENT_DEBRIS_BREAK);
    public static final SoundEvent ANCIENT_DEBRIS_PLACE_EVENT = new SoundEvent(ANCIENT_DEBRIS_PLACE);

    public static final SoundEvent ITEM_ARMOR_EQUIP_NETHERITE = new SoundEvent(ITEM_ARMOR_EQUIP_NETHERITE_ID);

    public static final BlockSoundGroup ANCIENT_DEBRIS = new BlockSoundGroup(1.0f, 1.5f, ANCIENT_DEBRIS_BREAK_EVENT, SoundEvents.BLOCK_METAL_STEP, ANCIENT_DEBRIS_PLACE_EVENT, SoundEvents.BLOCK_METAL_HIT, SoundEvents.BLOCK_METAL_FALL);

}

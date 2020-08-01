package io.github.squid233.squidcraft.client.gui;

import io.github.squid233.squidcraft.SquidCraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

import javax.annotation.Nullable;

public class BiggerChestFactory implements NamedScreenHandlerFactory {

    @Override
    public Text getDisplayName() {
        return new TranslatableText("container." + SquidCraft.MODID + ".bigger_chest");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new BiggerChestScreenHandler(syncId, inv);
    }

}

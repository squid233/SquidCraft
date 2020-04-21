package io.github.squidcraft.mixin;

import io.github.squidcraft.client.gui.*;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerWarningScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.realms.RealmsBridge;
import net.minecraft.text.Text;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


/**
 * @author baka4n and squid233
 * @Nullable Mixin inject,Inserts afer the value specified by the code!
 */
@Mixin(TitleScreen.class)
@Nullable
public class SquidCraftMixin extends Screen {
    public Logger logger = LogManager.getLogger("SquidCraft");

    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {

    }

    /**
     * @author baka4n
     * @reason Add mod button
     * @Nullable int y
     * @Nullable int spacingY
     */
    @Overwrite
    private void initWidgetsNormal(@Nullable int y,@Nullable int spacingY) {
        this.addButton(new ButtonWidget(this.width / 2 - 100, y, 200, 20, I18n.translate("squidcraft.SquidCraft"), (action) -> {
            MinecraftClient.getInstance().openScreen(new AuthorsGUI(this));
            logger.info(I18n.translate("By Squid233 & baka4n"));
        }));
        this.addButton(new ButtonWidget(this.width / 2 - 100, y + spacingY, 100, 20, I18n.translate("menu.singleplayer"), (buttonWidget) -> this.minecraft.openScreen(new SelectWorldScreen(this))));
        this.addButton(new ButtonWidget(this.width / 2, y + spacingY, 100, 20, I18n.translate("menu.multiplayer"), (buttonWidget) -> {
            if (this.minecraft.options.skipMultiplayerWarning) {
                this.minecraft.openScreen(new MultiplayerScreen(this));
            } else {
                this.minecraft.openScreen(new MultiplayerWarningScreen(this));
            }

        }));
        this.addButton(new ButtonWidget(this.width / 2 - 100, y + spacingY * 2, 200, 20, I18n.translate("menu.online"), (buttonWidget) -> this.switchToRealms()));
    }

    /**
     * @author baka4n
     * @reason Add realms button
     * @Nullable import minecraft switch To Realms to overwrite
     */
    @Overwrite
    @Nullable
    private void switchToRealms() {
        RealmsBridge realmsBridge = new RealmsBridge();
        realmsBridge.switchToRealms(this);
    }

    /**
     * @autor squid233 and baka4n
     * @param title
     * @Nullable Mixin SquidCraftMixin to Title Screen!
     */
    @Nullable
    protected SquidCraftMixin(Text title) {
        super(title);
    }

}

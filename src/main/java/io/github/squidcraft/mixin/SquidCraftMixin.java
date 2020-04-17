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
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


// Mixin inject,Inserts afer the value specified by the code!
@Mixin(TitleScreen.class)
public class SquidCraftMixin extends Screen {
    public Logger logger = LogManager.getLogger("test");

    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {

    }

    /**
     * @author baka4n
     * @reason Add mod button
     */
    @Overwrite
    private void initWidgetsNormal(int y, int spacingY) {
        this.addButton(new ButtonWidget(this.width / 2 - 110, y, 230, 20, I18n.translate("squidcraft.SquidCraft"), (action) -> {
            MinecraftClient.getInstance().openScreen(new AuthorsGUI(this));
            logger.info(I18n.translate("By Squid233 & baka4n"));
        }));
        this.addButton(new ButtonWidget(this.width / 2 - 110, y + spacingY, 110, 20, I18n.translate("menu.singleplayer"), (buttonWidget) -> this.minecraft.openScreen(new SelectWorldScreen(this))));
        this.addButton(new ButtonWidget(this.width / 2 + 10, y + spacingY, 110, 20, I18n.translate("menu.multiplayer"), (buttonWidget) -> {
            if (this.minecraft.options.skipMultiplayerWarning) {
                this.minecraft.openScreen(new MultiplayerScreen(this));
            } else {
                this.minecraft.openScreen(new MultiplayerWarningScreen(this));
            }

        }));
        this.addButton(new ButtonWidget(this.width / 2 - 110, y + spacingY * 2, 230, 20, I18n.translate("menu.online"), (buttonWidget) -> this.switchToRealms()));
    }

    /**
     * @author baka4n
     * @reason Add realms button
     */
    @Overwrite
    private void switchToRealms() {
        RealmsBridge realmsBridge = new RealmsBridge();
        realmsBridge.switchToRealms(this);
    }

    protected SquidCraftMixin(Text title) {
        super(title);
    }

}

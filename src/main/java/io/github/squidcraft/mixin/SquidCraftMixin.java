package io.github.squidcraft.mixin;

import io.github.squidcraft.client.gui.AuthorsGUI;
import io.github.squidcraft.config.CreateConfig;
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


/**
 * @author baka4n and squid233
 * <p>Mixin inject, Inserts atfer the value specified by the code!</p>
 */
@Mixin(TitleScreen.class)
public final class SquidCraftMixin extends Screen {
    private final Logger logger = LogManager.getLogger("SquidCraft");

    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        logger.info("This line is print by SquidCraft mod!");
    }

    /**
     * @author baka4n
     * @reason Add mod button
     * int y
     * int spacingY
     */
    @Overwrite
    private void initWidgetsNormal(int y, int spacingY) {
        if (CreateConfig.properties.getProperty("hideMainScreenButton").equals("false")) {
            this.addButton(new ButtonWidget(this.width / 2 - 100, y, 200, 20, I18n.translate("squidcraft.button.text"), (action) -> {
                MinecraftClient.getInstance().openScreen(new AuthorsGUI(this));
                logger.info("By Squid233 & baka4n");
            }));
        }
        this.addButton(new ButtonWidget(this.width / 2 - 100, y + spacingY, 100, 20, I18n.translate("menu.singleplayer"), (buttonWidget) -> {
            assert this.minecraft != null;
            this.minecraft.openScreen(new SelectWorldScreen(this));
        }));
        this.addButton(new ButtonWidget(this.width / 2, y + spacingY, 100, 20, I18n.translate("menu.multiplayer"), (buttonWidget) -> {
            assert this.minecraft != null;
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
     * import minecraft switch To Realms to overwrite
     */
    @Overwrite
    private void switchToRealms() {
        RealmsBridge realmsBridge = new RealmsBridge();
        realmsBridge.switchToRealms(this);
    }

    /**
     * <p>Mixin SquidCraftMixin to Title Screen!</p>
     * @author squid233 and baka4n
     * @param title The title
     */
    protected SquidCraftMixin(Text title) {
        super(title);
    }

}

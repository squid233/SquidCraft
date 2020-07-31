package io.github.squid233.squidcraft.mixin;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.client.gui.AuthorsGui;
import io.github.squid233.squidcraft.config.CreateConfig;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerWarningScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.realms.RealmsBridge;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
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
public abstract class SquidCraftMixin extends Screen {

    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        log("This line is print by SquidCraft mod!");
    }

    private void log(String message) {
        SquidCraft.logInfo(message);
    }

    /**
     * @author baka4n
     * @reason Add mod button
     * @param y int
     * @param spacingY int
     */
    @Overwrite
    private void initWidgetsNormal(int y, int spacingY) {
        if ("false".equals(CreateConfig.PROPERTIES.getProperty("hideMainScreenButton"))) {
            this.addButton(new ButtonWidget(this.width / 2, y + spacingY, 100, 20, new TranslatableText("button.squidcraft.text"), (action) -> {
                MinecraftClient.getInstance().openScreen(new AuthorsGui(this));
                log("By Squid233 & baka4n");
            }));
        }
        this.addButton(new ButtonWidget(this.width / 2 - 100, y, 200, 20, new TranslatableText("menu.singleplayer"), (buttonWidget) -> {
            assert this.client != null;
            this.client.openScreen(new SelectWorldScreen(this));
        }));
        assert this.client != null;
        boolean bl = this.client.isMultiplayerEnabled();
        ButtonWidget.TooltipSupplier tooltipSupplier = bl ? ButtonWidget.EMPTY : (buttonWidget, matrixStack, i, j) -> {
            if (!buttonWidget.active) {
                this.renderTooltip(matrixStack, this.client.textRenderer.wrapLines(new TranslatableText("title.multiplayer.disabled"), Math.max(this.width / 2 - 43, 170)), i, j);
            }

        };
        this.addButton(new ButtonWidget(this.width / 2 - 100, y + spacingY, 100, 20, new TranslatableText("menu.multiplayer"), (buttonWidget) -> {
            Screen screen = this.client.options.skipMultiplayerWarning ? new MultiplayerScreen(this) : new MultiplayerWarningScreen(this);
            this.client.openScreen(screen);
        }, tooltipSupplier)).active = bl;
        this.addButton(new ButtonWidget(this.width / 2 - 100, y + spacingY * 2, 200, 20, new TranslatableText("menu.online"), (buttonWidget) -> this.switchToRealms(), tooltipSupplier)).active = bl;
    }

    /**
     * import minecraft switch To Realms
     * @author baka4n
     */
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

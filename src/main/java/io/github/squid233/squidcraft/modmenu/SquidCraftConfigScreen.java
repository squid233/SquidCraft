package io.github.squid233.squidcraft.modmenu;

import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.squid233.squidcraft.config.Configs;
import io.github.squid233.squidcraft.config.CreateConfig;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ScreenTexts;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.TranslatableText;

public class SquidCraftConfigScreen extends Screen implements ConfigScreenFactory<SquidCraftConfigScreen> {

    private final Screen previousScreen;
    private ButtonWidget hideMainScreenButtonConfig;

    private int paneWidth;
    private int textFieldWidth = paneWidth - 32 - 22;

    protected SquidCraftConfigScreen(Screen previous) {
        super(new TranslatableText("screen.config.squidcraft"));

        previousScreen = previous;
        paneWidth = width / 2 - 8;

        hideMainScreenButtonConfig = new ButtonWidget(120, 22, textFieldWidth, 20,
                new LiteralText(CreateConfig.get(Configs.HIDE_MAIN_SCREEN_BUTTON)), button -> {
            if ("false".equals(CreateConfig.get(Configs.HIDE_MAIN_SCREEN_BUTTON))) {
                CreateConfig.PROPERTIES.setProperty("hideMainScreenButton", "true");
                hideMainScreenButtonConfig.setMessage(NormalTexts.TRUE);
            } else {
                CreateConfig.PROPERTIES.setProperty("hideMainScreenButton", "false");
                hideMainScreenButtonConfig.setMessage(NormalTexts.FALSE);
            }
        });
    }

    @Override
    public SquidCraftConfigScreen create(Screen parent) {
        return this;
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        drawCenteredText(matrices, this.textRenderer, this.title, this.width / 2, 15, 0xffffff);
        textRenderer.drawWithShadow(matrices, "hideMainScreenButton", 0, 22, 0xffffff);
        //hideMainScreenButtonConfig.render(matrices, mouseX, mouseY, delta);
        super.render(matrices, mouseX, mouseY, delta);
    }

    @Override
    protected void init() {
        //children.add(this.hideMainScreenButtonConfig);
        addButton(new ButtonWidget(this.width / 2 - 154, this.height - 28, 150, 20, new TranslatableText("button.reset.text"),
                button -> children()));
        addButton(new ButtonWidget(this.width / 2 + 4, this.height - 28, 150, 20, ScreenTexts.DONE, button -> {
            assert client != null;
            client.openScreen(previousScreen);
        }));
        addButton(hideMainScreenButtonConfig);
        //setInitialFocus(hideMainScreenButtonConfig);
    }

    /*@Override
    public boolean keyPressed(int int_1, int int_2, int int_3) {
        return super.keyPressed(int_1, int_2, int_3) || hideMainScreenButtonConfig.keyPressed(int_1, int_2, int_3);
    }

    @Override
    public boolean charTyped(char chr, int keyCode) {
        return hideMainScreenButtonConfig.charTyped(chr, keyCode);
    }

    @Override
    public void tick() {
        hideMainScreenButtonConfig.tick();
    }*/
}

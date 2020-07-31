package io.github.squid233.squidcraft.client.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ScreenTexts;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class AuthorsGui extends Screen {
    private final Screen screen;

    public AuthorsGui(Screen screen) {
        super(new LiteralText(""));
        this.screen = screen;
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float delta) {
        renderBackground(matrixStack);
        tooltip("authors.squidcraft.info", this.width / 100, this.height / 9);
        tooltip("squid233", 21 * this.width / 100, this.height / 9);
        tooltip("baka4n", 41 * this.width / 100, this.height / 9);
        super.render(matrixStack, mouseX, mouseY, delta);
    }

    @Override
    public void init() {
        myButton(3 * this.width / 4, 8 * this.height / 9, ScreenTexts.BACK, (buttonWidget) -> this.screen.onClose());
    }

    private void myButton(int x, int y, Text text, ButtonWidget.PressAction button) {
        this.addButton(new ButtonWidget(x, y, 100, 20, text, button));
    }

    private void tooltip(String translationKey, int x, int y) {
        renderTooltip(new MatrixStack(), new TranslatableText(translationKey), x, y);
    }
}

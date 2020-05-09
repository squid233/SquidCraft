package io.github.squid233.squidcraft.client.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.text.LiteralText;

public class AuthorsGUI extends Screen {
    private final Screen screen;

    public AuthorsGUI(Screen screen) {
        super(new LiteralText(""));
        this.screen = screen;
    }
    @Override
    public void render(int mouseX, int mouseY, float delta) {
        renderBackground();
        tooltip("authors.squidcraft.info", this.width / 100, this.height / 9);
        tooltip("squid233", 21 * this.width / 100, this.height / 9);
        tooltip("baka4n",  41 * this.width / 100, this.height / 9);
        super.render(mouseX, mouseY, delta);
    }
    @Override
    public void init() {
        super.init();
        MyButton(3 * this.width / 4, 8 * this.height / 9, 100, 20, "authors.squidcraft.back", (buttonWidget) -> this.screen.onClose());
    }
    private void MyButton(int x, int y, int width, int height, String s, ButtonWidget.PressAction button) { this.addButton(new ButtonWidget(x, y, width, height, I18n.translate(s), button)); }
    private void tooltip(String s, int x, int y) { renderTooltip(I18n.translate(s), x, y); }
}

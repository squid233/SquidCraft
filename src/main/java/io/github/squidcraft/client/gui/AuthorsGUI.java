package io.github.squidcraft.client.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.LiteralText;


public class AuthorsGUI extends Screen {
    private Screen screen;

    public AuthorsGUI(Screen screen) {
        super(new LiteralText(""));
        this.screen = screen;
    }

    @Override
    public void render(int mouseX, int mouseY, float delta) {
        renderBackground();
        renderTooltip("squid233", 150, 20);
        super.render(mouseX, mouseY, delta);
    }

    @Override
    public void init() {
        super.init();
        this.addButton(new ButtonWidget(20, 20, 100, 20, "Back", (action) -> {
        }));
    }
}

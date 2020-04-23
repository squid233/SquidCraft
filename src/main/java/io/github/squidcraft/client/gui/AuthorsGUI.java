package io.github.squidcraft.client.gui;

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
        renderTooltip(I18n.translate("authors.squidcraft.info"), this.width / 100, this.height / 9);
        renderTooltip("squid233", 21 * this.width / 100, this.height / 9);
        renderTooltip("baka4n",  41 * this.width / 100, this.height / 9);
        super.render(mouseX, mouseY, delta);
    }

    @Override
    public void init() {
        super.init();
        this.addButton(new ButtonWidget(3 * this.width / 4, 8 * this.height / 9, 100, 20, I18n.translate("authors.squidcraft.back"), (action) -> this.screen.onClose()));
    }
}

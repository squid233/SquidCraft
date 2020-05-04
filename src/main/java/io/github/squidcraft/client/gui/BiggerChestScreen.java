package io.github.squidcraft.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import io.github.squidcraft.tile.BiggerChestContainer;
import net.minecraft.client.gui.screen.ingame.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BiggerChestScreen extends ContainerScreen<BiggerChestContainer> {
    // a path to gui texture, you may replace it with new Identifier(YourMod.MOD_ID, "textures/gui/container/your_container.png");
    private static final Identifier TEXTURE = new Identifier("textures/gui/container/generic_54.png");

    public BiggerChestScreen(BiggerChestContainer container, PlayerInventory playerInventory, Text title) {
        super(container, playerInventory, title);
        this.containerHeight = 114 + 6 * 18;
    }
    @Override
    protected void drawForeground(int mouseX, int mouseY) {
        font(this.title.asFormattedString(), 8.0F, 6.0F, 4210752);
        font(this.playerInventory.getDisplayName().asFormattedString(), 8.0F, (float)(this.containerHeight - 96 + 2), 4210752);
    }
    @Override
    protected void drawBackground(float delta, int mouseX, int mouseY) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        assert this.minecraft != null;
        this.minecraft.getTextureManager().bindTexture(TEXTURE);
        int i = (this.width - this.containerWidth) / 2;
        int j = (this.height - this.containerHeight) / 2;
        blit(i, j, 0, 0, this.containerWidth, 6 * 18 + 17);
        blit(i, j + 6 * 18 + 17, 0, 126, this.containerWidth, 96);
    }
    public void font(String t, float x, float y, int c) { this.font.draw(t, x, y, c); }
    public void blit(int i, int j, int u, int v, int width, int height) { this.blit(i, j, u, v, width, height); }
}

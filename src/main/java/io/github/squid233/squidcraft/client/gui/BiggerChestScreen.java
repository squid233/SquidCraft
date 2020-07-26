package io.github.squid233.squidcraft.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BiggerChestScreen extends HandledScreen<BiggerChestScreenHandler> {

    // a path to gui texture, you may replace it with new Identifier(YourMod.MOD_ID, "textures/gui/container/your_container.png");
    private static final Identifier TEXTURE = new Identifier("textures/gui/container/generic_54.png");

    public BiggerChestScreen(BiggerChestScreenHandler container, PlayerInventory playerInventory, Text title) {
        super(container, playerInventory, title);
        this.backgroundHeight = 114 + 6 * 18;
    }

    @Override
    protected void drawForeground(MatrixStack matrices, int mouseX, int mouseY) {
        this.textRenderer.draw(matrices, this.title.asString(), 8.0F, 6.0F, 4210752);
        this.textRenderer.draw(matrices, this.playerInventory.getDisplayName().asString(), 8.0F, (float) (this.backgroundHeight - 96 + 2), 4210752);
    }

    @Override
    @SuppressWarnings("deprecation")
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        assert this.client != null;
        this.client.getTextureManager().bindTexture(TEXTURE);
        int i = (this.width - this.backgroundWidth) / 2;
        int j = (this.height - this.backgroundHeight) / 2;
        this.blit(i, j, 0, 0, this.backgroundWidth, 6 * 18 + 17);
        this.blit(i, j + 6 * 18 + 17, 0, 126, this.backgroundWidth, 96);
    }

    @SuppressWarnings({"InfiniteRecursion", "unused"})
    public void font(String t, float x, float y, int c) {
        this.font(t, x, y, c);
    }

    @SuppressWarnings({"InfiniteRecursion", "unused"})
    public void blit(int i, int j, int u, int v, int width, int height) {
        this.blit(i, j, u, v, width, height);
    }

}

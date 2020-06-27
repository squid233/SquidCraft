package io.github.squid233.squidcraft.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.block.tile.BiggerChestScreenHandler;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BiggerChestScreen extends HandledScreen<BiggerChestScreenHandler> {
    // a path to gui texture, you may replace it with new Identifier(YourMod.MOD_ID, "textures/gui/container/your_container.png");
    private static final Identifier TEXTURE = new Identifier(SquidCraft.MODID, "textures/gui/container/bigger_chest.png");

    public BiggerChestScreen(BiggerChestScreenHandler handler, PlayerInventory playerInventory, Text title) {
        super(handler, playerInventory, title);
        this.backgroundHeight = 114 + 6 * 18;
    }
    @Override
    protected void drawForeground(MatrixStack matrixStack, int mouseX, int mouseY) {
        font(this.title.asString(), 8.0F, 6.0F, 4210752);
        font(this.playerInventory.getDisplayName().asString(), 8.0F, (float)(this.backgroundHeight - 96 + 2), 4210752);
    }
    @SuppressWarnings("deprecation")
    @Override
    protected void drawBackground(MatrixStack matrixStack, float delta, int mouseX, int mouseY) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        assert this.client != null;
        this.client.getTextureManager().bindTexture(TEXTURE);
        int i = (this.width - this.backgroundWidth) / 2;
        int j = (this.height - this.backgroundHeight) / 2;
        blit(i, j, 0, 0, this.backgroundWidth, 6 * 18 + 17);
        blit(i, j + 6 * 18 + 17, 0, 126, this.backgroundWidth, 96);
    }
    @SuppressWarnings("all")
    public void font(String t, float x, float y, int c) { this.font(t, x, y, c); }
    @SuppressWarnings("all")
    public void blit(int i, int j, int u, int v, int width, int height) { this.blit(i, j, u, v, width, height); }
}

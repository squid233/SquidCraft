package io.github.squidcraft.mixin;

import io.github.squidcraft.client.gui.*;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class SquidCraftMixin extends Screen {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		System.out.println("This line is printed by an example mod mixin!");
		this.addButton(new ButtonWidget(this.width / 2 - 100, this.height / 2  +100, 200, 20, "SquidCraft", (action) -> {
			MinecraftClient.getInstance().openScreen(new AuthorsGUI(this));
			System.out.println("By Squid233");
		}));
	}
	protected SquidCraftMixin(Text title) {
		super(title);
	}
}

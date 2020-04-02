package io.github.squidcraft;

import net.fabricmc.api.ModInitializer;

public class SquidCraft implements ModInitializer {
	public static final String MODID = "squidcraft";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		new SquidCraftProxy();
		System.out.println("The mod is initialize!");
	}
}

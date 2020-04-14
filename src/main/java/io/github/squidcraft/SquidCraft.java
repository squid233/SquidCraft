package io.github.squidcraft;

import io.github.squidcraft.handle.LootTablesHandle;
import io.github.squidcraft.util.registers.*;
import net.fabricmc.api.ModInitializer;

public class SquidCraft implements ModInitializer {
	public static final String MODID = "squidcraft";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//   items registry
		new ItemRegister();
		//   blocks registry
		new BlockRegister();
		//   sounds registry
		new SoundRegister();
		//   enchantments registry
		new EnchantmentRegister();
		// world generate registry
		new WorldGenRegister();
		// loot table registry handler
		new LootTablesHandle();

		System.out.println("The mod is initialize!");
	}
}

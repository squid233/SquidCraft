package io.github.squid233.squidcraft;

import io.github.squid233.squidcraft.api.util.Loggers;
import io.github.squid233.squidcraft.config.CreateConfig;
import io.github.squid233.squidcraft.util.ModEntities;
import io.github.squid233.squidcraft.util.handle.LootTablesHandle;
import io.github.squid233.squidcraft.util.registers.*;
import net.fabricmc.api.ModInitializer;

/**
 * @author squid233 and baka4n → (logger4j test)!
 */
public final class SquidCraft implements ModInitializer {

	public static final String MODID = "squidcraft";

	@Override
	public void onInitialize() {
		CreateConfig.create();
		new ItemRegister();
		logInfo("item register success");
		new BlockRegister();
		logInfo("block register success");
		new FluidRegister();
		logInfo("fluid register success");
		new EnchantmentRegister();
		logInfo("enchantment register success");
		new WorldGenRegister();
		logInfo("world generator register success");
		new LootTablesHandle();
		logInfo("loot table register success");
		new ModEntities();
		logInfo("entities register success");
		logInfo("load on initialize success");
	}

	public static void logInfo(String info) {
		Loggers.logInfo("SquidCraft", info);
	}

}

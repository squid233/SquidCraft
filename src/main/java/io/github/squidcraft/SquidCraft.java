package io.github.squidcraft;

import io.github.squidcraft.handle.LootTablesHandle;
import io.github.squidcraft.util.registers.*;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/**
 * @author squid233 and baka4n->(logger4j test)!
 */
@Nullable
public final class SquidCraft implements ModInitializer {
	public static final String MODID = "squidcraft";

	@Override
	public void onInitialize() {
		Logger logger = LogManager.getLogger("SquidCraft register all");
		new ItemRegister();
		logger.info("item register success");
		new BlockRegister();
		logger.info("block register success");
		new SoundRegister();
		logger.info("sound register success");
		new EnchantmentRegister();
		logger.info("enchantment register success");
		new WorldGenRegister();
		logger.info("world generator register success");
		new LootTablesHandle();
		logger.info("loot table register success");
		logger.info("load on initialize success");
		try {
			new CreateConfig();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

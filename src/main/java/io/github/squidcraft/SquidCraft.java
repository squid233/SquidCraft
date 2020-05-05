package io.github.squidcraft;

import io.github.squidcraft.config.CreateConfig;
import io.github.squidcraft.util.handle.LootTablesHandle;
import io.github.squidcraft.util.registers.*;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.*;

/**
 * @author squid233 and baka4n->(logger4j test)!
 */
public final class SquidCraft implements ModInitializer {
	public static final String MODID = "squidcraft";
	@Override
	public void onInitialize() {
		String s = "SquidCraft register all";
		CreateConfig.config();
		Logger logger = LogManager.getLogger("SquidCraft register all");
		new ItemRegister();
		log(s, "item register success");
		new BlockRegister();
		log(s, "block register success");
		new SoundRegister();
		log(s, "sound register success");
		new EnchantmentRegister();
		log(s, "enchantment register success");
		new WorldGenRegister();
		log(s, "world generator register success");
		new LootTablesHandle();
		log(s, "loot table register success");
		log(s, "load on initialize success");
	}
	public static void log(String s1, String s2) {
		Logger logger = LogManager.getLogger(s1);logger.info(s2);
	}
}

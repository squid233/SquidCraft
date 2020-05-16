package io.github.squid233.squidcraft;

import io.github.squid233.squidcraft.config.CreateConfig;
import io.github.squid233.squidcraft.util.handle.LootTablesHandle;
import io.github.squid233.squidcraft.util.registers.*;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.*;

/**
 * @author squid233 and baka4n → (logger4j test)!
 */
public final class SquidCraft implements ModInitializer {
	public static final String MODID = "squidcraft";
	@Override
	public void onInitialize() {
		String s = "SquidCraft register all";
		BlockRegister br = new BlockRegister();
		CreateConfig.config();
		new ItemRegister();
		log(s, "item register success");
		br.register1();
		br.register2();
		br.register3();
		log(s, "block register success");
		new FluidRegister();
		log(s, "fluid register success");
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

	/**
	 * @param s1 logger name
	 * @param s2 logger info
	 */
	public static void log(String s1, String s2) {
		Logger logger = LogManager.getLogger(s1);
		logger.info(s2);
	}
}

package io.github.squid233.squidcraft;

import io.github.squid233.squidcraft.api.util.MinecraftMod;
import io.github.squid233.squidcraft.config.CreateConfig;
import io.github.squid233.squidcraft.util.handle.LootTablesHandle;
import io.github.squid233.squidcraft.util.registers.*;
import net.fabricmc.api.ModInitializer;

import static io.github.squid233.squidcraft.api.util.Loggers.log;

/**
 * @author squid233 and baka4n → (logger4j test)!
 */
public final class SquidCraft implements ModInitializer, MinecraftMod {
	public static final String MODID = "squidcraft";
	@Override
	public void onInitialize() {
		String s = "SquidCraft register all";
		CreateConfig.create();
		//noinspection InstantiationOfUtilityClass
		new ItemRegister();
		log(s, "item register success");
		new BlockRegister();
		log(s, "block register success");
		new FluidRegister();
		log(s, "fluid register success");
		new EnchantmentRegister();
		log(s, "enchantment register success");
		new WorldGenRegister();
		log(s, "world generator register success");
		new LootTablesHandle();
		log(s, "loot table register success");
		log(s, "load on initialize success");
	}

	@Override
	public String getModName() {
		return "SquidCraft";
	}

}

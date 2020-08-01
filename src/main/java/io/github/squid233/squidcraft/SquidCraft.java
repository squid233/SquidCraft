package io.github.squid233.squidcraft;

import io.github.squid233.squidcraft.common.registes.BlockRegister;
import io.github.squid233.squidcraft.common.registes.ItemRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * @author squid233
 */
@Mod(SquidCraft.MODID)
public class SquidCraft {

    public static final String MODID = "squidcraft";

    public SquidCraft() {
        ItemRegister.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegister.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}

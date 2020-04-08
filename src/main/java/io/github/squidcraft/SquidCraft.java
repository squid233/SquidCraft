package io.github.squidcraft;

import io.github.squidcraft.common.proxy.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import org.apache.logging.log4j.Logger;

@Mod(modid = SquidCraft.MODID, name = SquidCraft.NAME, version = SquidCraft.VERSION, acceptedMinecraftVersions = "1.12.2", useMetadata = true, updateJSON = "https://github.com/squid233/SquidCraft/tree/1.12.x/blob/updateJson.json")
public class SquidCraft
{
    public static final String MODID = "squidcraft";
    public static final String NAME = "SquidCraft";
    public static final String VERSION = "0.0.1.0";

    @Mod.Instance(MODID)
    public static SquidCraft instance;

    private static Logger logger;
	
	@SidedProxy(clientSide = "io.github.squidcraft.common.proxy.ClientProxy",
        serverSide = "io.github.squidcraft.common.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
		proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info(event.getModState());
		proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}

package io.github.squidcraft.common.proxy;

import io.github.squidcraft.common.register.*;
import net.minecraftforge.fml.common.event.*;

public class CommonProxy{
    public void preInit(FMLPreInitializationEvent event) {
        new ItemsRegister();
        new BlocksRegister();
    }

    public void init(FMLInitializationEvent event) {
        new SmeltingRegister();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}

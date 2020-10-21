package io.github.squid233.squidcraft;

import io.github.squid233.squidcraft.block.Blocks;
import io.github.squid233.squidcraft.item.Items;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.gui.screen.TitleScreen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author squid233
 * @date 2020/9/20
 */
public class SquidCraft implements ModInitializer {
    public static final String MODID = "squidcraft";
    public static Logger logger;

    static {
        logger = LogManager.getLogger(MODID);
        new TitleScreen().addButton()
    }

    @Override
    public void onInitialize() {
        Items.init();
        Blocks.init();
    }
}

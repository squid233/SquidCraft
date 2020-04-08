package io.github.squidcraft.common.register;

import io.github.squidcraft.common.item.ItemShreddedSquid;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRegister {
    public SmeltingRegister() {
        GameRegistry.addSmelting(ItemsRegister.SHREDDED_SQUID, new ItemStack(ItemsRegister.COOKED_SHREDDED_SQUID), 0.35f);
    }
}

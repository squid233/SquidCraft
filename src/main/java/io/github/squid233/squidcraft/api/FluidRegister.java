package io.github.squid233.squidcraft.api;

import net.minecraft.block.Block;
import net.minecraft.fluid.BaseFluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FluidRegister {
    /**
     * Let it cannot constructing
     */
    private FluidRegister() {

    }

    /**
     * This method can register still fluid and flowing fluid.
     * @param modid Mod identifier
     * @param fluidID Still fluid's register name is fluidID. Flowing fluid's register name is flowing_ + fluidID.
     * @param stillFluid The still fluid.
     * @param flowingFluid The flowing fluid.
     * @param fluidBlock The fluid block.
     */
    public static void registerFluid(String modid, String fluidID, BaseFluid stillFluid, BaseFluid flowingFluid, Block fluidBlock) {
        Registry.register(Registry.FLUID, new Identifier(modid, fluidID), stillFluid);
        Registry.register(Registry.FLUID, new Identifier(modid, "flowing_"+fluidID), flowingFluid);
        Registry.register(Registry.BLOCK, new Identifier(modid, fluidID), fluidBlock);
    }
}

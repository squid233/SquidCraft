package io.github.squid233.squidcraft.api;

import net.minecraft.block.Block;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FluidRegistries {
    /**
     * Let it cannot constructing
     */
    private FluidRegistries() {

    }

    /**
     * This method can register still fluid and flowing fluid.
     * @param modid Mod identifier
     * @param fluidName Still fluid's register name is fluidName. Flowing fluid's register name is flowing_ + fluidName.
     * @param stillFluid The still fluid.
     * @param flowingFluid The flowing fluid.
     * @param fluidBlock The fluid block.
     */
    public static void registerFluid(String modid, String fluidName, FlowableFluid stillFluid, FlowableFluid flowingFluid, Block fluidBlock) {
        Registry.register(Registry.FLUID, new Identifier(modid, fluidName), stillFluid);
        Registry.register(Registry.FLUID, new Identifier(modid, "flowing_"+ fluidName), flowingFluid);
        Registry.register(Registry.BLOCK, new Identifier(modid, fluidName), fluidBlock);
    }
}

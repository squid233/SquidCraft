package io.github.squid233.squidcraft.util.register;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.api.FluidRegistries;
import io.github.squid233.squidcraft.fluid.MilkFluid;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;

public class FluidRegister {
    public static final FlowableFluid STILL_MILK = new MilkFluid.Still();
    public static final FlowableFluid FLOWING_MILK = new MilkFluid.Flowing();
    public static final Block MILK = new FluidBlock(STILL_MILK, FabricBlockSettings.copy(Blocks.WATER)){};

    public FluidRegister() {
        registerFluid("milk", STILL_MILK, FLOWING_MILK, MILK);
    }

    public void registerFluid(String fluidName, FlowableFluid stillFluid, FlowableFluid flowingFluid, Block fluidBlock) {
        FluidRegistries.registerFluid(SquidCraft.MODID, fluidName, stillFluid, flowingFluid, fluidBlock);
    }
}

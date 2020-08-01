package io.github.squid233.squidcraft.fluid;

import io.github.squid233.squidcraft.util.register.FluidRegister;
import io.github.squid233.squidcraft.util.register.ItemRegister;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;

public abstract class MilkFluid extends BaseMilkFluid {
    @Override
    public Fluid getStill() {
        return FluidRegister.STILL_MILK;
    }

    @Override
    public Fluid getFlowing() {
        return FluidRegister.FLOWING_MILK;
    }

    @Override
    public Item getBucketItem() {
        return ItemRegister.MILK_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState fluidState) {
        // method_15741 converts the LEVEL_1_8 of the fluid state to the LEVEL_15 the fluid block uses
        return FluidRegister.MILK.getDefaultState().with(Properties.LEVEL_15, method_15741(fluidState));
    }

    public static class Flowing extends MilkFluid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState fluidState) {
            return fluidState.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return false;
        }
    }

    public static class Still extends MilkFluid {
        @Override
        public int getLevel(FluidState fluidState) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return true;
        }
    }
}

package io.github.squidcraft.world.feature;

import com.mojang.datafixers.Dynamic;
import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.util.registers.BlockRegister;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Heightmap;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.ChunkGeneratorConfig;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

import java.util.Random;
import java.util.function.Function;

public class SquidSpiralFeature extends Feature<DefaultFeatureConfig> {
    public SquidSpiralFeature(Function<Dynamic<?>, ? extends DefaultFeatureConfig> config) {
        super(config);
    }

    @Override
    public boolean generate(IWorld world, ChunkGenerator<? extends ChunkGeneratorConfig> chunkGenerator, Random random, BlockPos pos, DefaultFeatureConfig config) {
        BlockPos topPos = world.getTopPosition(Heightmap.Type.WORLD_SURFACE, pos);
        Direction offset = Direction.NORTH;

        for (int y = 1; y < 16; y++) {
            offset = offset.rotateYClockwise();
            world.setBlockState(topPos.up(y).offset(offset), BlockRegister.SQUID_BLOCK.getDefaultState(), 3);
        }

        return true;
    }

    public static final Feature<DefaultFeatureConfig> SQUID_SPIRAL = Registry.register(
            Registry.FEATURE,
            new Identifier(SquidCraft.MODID, "squid_spiral"),
            new SquidSpiralFeature(DefaultFeatureConfig::deserialize)
    );
}

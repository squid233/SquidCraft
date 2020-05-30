package io.github.squid233.squidcraft.world.feature;

import com.mojang.serialization.Codec;
import io.github.squid233.squidcraft.util.registers.BlockRegister;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.Heightmap;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.gen.StructureAccessor;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

import java.util.Random;

public class SquidSpiralFeature extends Feature<DefaultFeatureConfig> {
    public SquidSpiralFeature(Codec<DefaultFeatureConfig> codec) {
        super(codec);
    }

    @Override
    public boolean generate(ServerWorldAccess serverWorldAccess, StructureAccessor accessor, ChunkGenerator generator, Random random, BlockPos pos, DefaultFeatureConfig config) {
        BlockPos topPos = serverWorldAccess.getTopPosition(Heightmap.Type.WORLD_SURFACE, pos);
        Direction offset = Direction.NORTH;
        for (int y = 1; y < 16; y++) {
            offset = offset.rotateYClockwise();
            serverWorldAccess.setBlockState(topPos.up(y).offset(offset), BlockRegister.SQUID_BLOCK.getDefaultState(), 3);
        } return true;
    }
}

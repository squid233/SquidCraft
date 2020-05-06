package io.github.squidcraft.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class MultiSquidBlock {
    public One one() {
        return new One();
    }

    public Two two() {
        return new Two();
    }

    public Four four() {
        return new Four();
    }

    public Eight eight() {
        return new Eight();
    }

}

class One extends Block {
    public One() {
        super(FabricBlockSettings.of(Material.EARTH).strength(1.5f, 0.6f));
    }
}

class Two extends Block {
    public Two() {
        super(FabricBlockSettings.of(Material.EARTH).strength(2.0f, 0.65f));
    }
}

class Four extends Block {
    public Four() {
        super(FabricBlockSettings.of(Material.EARTH).strength(2.5f, 0.7f));
    }
}

class Eight extends Block {
    public Eight() {
        super(FabricBlockSettings.of(Material.EARTH).strength(3.0f, 0.75f));
    }
}

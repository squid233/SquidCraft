package io.github.squidcraft.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class SquidBlock extends Block {
    public SquidBlock() {
        super(FabricBlockSettings.of(Material.EARTH).hardness(0.5f).build());
    }

    public CompressSquidBlock compressed() {
        return new CompressSquidBlock();
    }

    public LowSquidBlock low() {
        return new LowSquidBlock();
    }

    public LowCompressSquidBlock lowCompress() {
        return new LowCompressSquidBlock();
    }

    public MediumSquidBlock medium() {
        return new MediumSquidBlock();
    }

    public MediumCompressSquidBlock mediumCompress() {
        return new MediumCompressSquidBlock();
    }

    public HigherSquidBlock higher() {
        return new HigherSquidBlock();
    }

    public HigherCompressSquidBlock higherCompress() {
        return new HigherCompressSquidBlock();
    }

    public SuperSquidBlock supered() {
        return new SuperSquidBlock();
    }

    public SuperCompressSquidBlock superCompress() {
        return new SuperCompressSquidBlock();
    }

    public UltimateSquidBlock ultimate() {
        return new UltimateSquidBlock();
    }

    public UltimateCompressSquidBlock ultimateCompress() {
        return new UltimateCompressSquidBlock();
    }

}

class CompressSquidBlock extends Block {
    public CompressSquidBlock() {
        super(FabricBlockSettings.of(Material.EARTH).hardness(0.525f).build());
    }
}

class LowSquidBlock extends Block {
    public LowSquidBlock() {
        super(FabricBlockSettings.of(Material.EARTH).strength(0.55f, 0.1f).build());
    }
}

class LowCompressSquidBlock extends Block {
    public LowCompressSquidBlock() {
        super(FabricBlockSettings.of(Material.EARTH).strength(0.6f, 0.15f).build());
    }
}

class MediumSquidBlock extends Block {
    public MediumSquidBlock() {
        super(FabricBlockSettings.of(Material.EARTH).strength(0.65f, 0.2f).build());
    }
}

class MediumCompressSquidBlock extends Block {
    public MediumCompressSquidBlock() {
        super(FabricBlockSettings.of(Material.EARTH).strength(0.7f, 0.25f).build());
    }
}

class HigherSquidBlock extends Block {
    public HigherSquidBlock() {
        super(FabricBlockSettings.of(Material.EARTH).strength(0.75f, 0.3f).build());
    }
}

class HigherCompressSquidBlock extends Block {
    public HigherCompressSquidBlock() {
        super(FabricBlockSettings.of(Material.EARTH).strength(0.8f, 0.35f).build());
    }
}

class SuperSquidBlock extends Block {
    public SuperSquidBlock() {
        super(FabricBlockSettings.of(Material.EARTH).strength(0.85f, 0.4f).build());
    }
}

class SuperCompressSquidBlock extends Block {
    public SuperCompressSquidBlock() {
        super(FabricBlockSettings.of(Material.EARTH).strength(0.9f, 0.45f).build());
    }
}

class UltimateSquidBlock extends Block {
    public UltimateSquidBlock() {
        super(FabricBlockSettings.of(Material.EARTH).strength(0.95f, 0.5f).build());
    }
}

class UltimateCompressSquidBlock extends Block {
    public UltimateCompressSquidBlock() {
        super(FabricBlockSettings.of(Material.EARTH).strength(1.0f, 0.55f).build());
    }
}

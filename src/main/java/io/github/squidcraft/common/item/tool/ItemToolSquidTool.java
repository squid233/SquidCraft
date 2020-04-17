package io.github.squidcraft.common.item.tool;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.common.item.ItemGroups;
import net.minecraft.item.*;

public class ItemToolSquidTool {
    public static class SquidAxe extends ItemAxe {
        public SquidAxe() {
            super(ToolMaterial.IRON);
            this.setRegistryName("squid_axe").setUnlocalizedName(SquidCraft.MODID + "." + "squid_axe").setCreativeTab(ItemGroups.SQUID_CRAFT);
        }
    }
    public static class SquidHoe extends ItemHoe {
        public SquidHoe() {
            super(ToolMaterial.IRON);
            this.setRegistryName("squid_hoe").setUnlocalizedName(SquidCraft.MODID + "." + "squid_hoe").setCreativeTab(ItemGroups.SQUID_CRAFT);
        }
    }
    public static class SquidPickaxe extends ItemPickaxe {
        public SquidPickaxe() {
            super(ToolMaterial.IRON);
            this.setRegistryName("squid_pickaxe").setUnlocalizedName(SquidCraft.MODID + "." + "squid_pickaxe").setCreativeTab(ItemGroups.SQUID_CRAFT);
        }
    }
    public static class SquidShovel extends ItemSpade {
        public SquidShovel() {
            super(ToolMaterial.IRON);
            this.setRegistryName("squid_shovel").setUnlocalizedName(SquidCraft.MODID + "." + "squid_shovel").setCreativeTab(ItemGroups.SQUID_CRAFT);
        }
    }
    public static class SquidSword extends ItemSword {
        public SquidSword() {
            super(ToolMaterial.IRON);
            this.setRegistryName("squid_sword").setUnlocalizedName(SquidCraft.MODID + "." + "squid_sword").setCreativeTab(ItemGroups.SQUID_CRAFT);
        }
    }

}

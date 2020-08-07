package io.github.squid233.squidcraft.client.gui;

import io.github.squid233.squidcraft.SquidCraft;
import io.github.squid233.squidcraft.util.register.BlockRegister;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class BiggerChestScreenHandler extends ScreenHandler implements ExtendedScreenHandlerFactory {
    private final Inventory inventory; // Chest inventory
    private static final int INVENTORY_SIZE = 54; // 6 rows * 9 cols

    public BiggerChestScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        super(BlockRegister.BIGGER_CHEST_SCREEN_HANDLER_TYPE, syncId); // Since we didn't create a ContainerType, we will place null here.
        this.inventory = inventory;
        checkSize(inventory, INVENTORY_SIZE);
        inventory.onOpen(playerInventory.player);

        // Creating Slots for GUI. A Slot is essentially a correspoding from inventory itemstacks to the GUI position.
        int i;
        int j;

        // Chest Inventory
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 9; j++) {
                this.addSlot(new Slot(inventory, i * 9 + j, 8 + j * 18, 18 + i * 18));
            }
        }


        // Player Inventory (27 storage + 9 hotbar)
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 9; j++) {
                this.addSlot(new Slot(playerInventory, i * 9 + j + 9, 8 + j * 18, 18 + i * 18 + 103 + 18));
            }
        }


        for (j = 0; j < 9; j++) {
            this.addSlot(new Slot(playerInventory, j, 8 + j * 18, 18 + 161 + 18));
        }
    }

    public BiggerChestScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, BlockRegister.BIGGER_CHEST_BLOCK_ENTITY);
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    // Shift + Player Inv Slot
    @Override
    public ItemStack transferSlot(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        final BlockPos pos = buf.readBlockPos();
        Objects.requireNonNull(player.world.getBlockState(pos).createScreenHandlerFactory(player.world, pos)).createMenu(syncId, player.inventory, player);
    }

    @Override
    public Text getDisplayName() {
        return new TranslatableText("container" + SquidCraft.MODID + "bigger_chest");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return this;
    }
}

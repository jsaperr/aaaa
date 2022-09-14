package com.jsaperr.mixin;


import net.minecraft.server.world.ChunkTicketManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ChunkTicketManager.class)
public class ChunkTicketManagerMixin {

    @ModifyConstant(method = "getPlayerSimulationLevel", constant = @Constant(intValue = 31))
    public int changeSimDistanceLevelCalc(int constant) {
        return 32;
    }
}
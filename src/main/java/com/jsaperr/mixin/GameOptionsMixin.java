package com.jsaperr.mixin;


import net.minecraft.client.option.GameOptions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(GameOptions.class)
public class GameOptionsMixin {

    @ModifyConstant(method = "<init>", constant = @Constant(intValue = 5, ordinal = 2))
    private int changeMinSDValue(int constant) {
        return 2;
    }
}
package net.infinite.lava.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.LavaFluid;

@Mixin(LavaFluid.class)
public abstract class InfiniteLavaMixin extends FlowableFluid {
    @Inject(method = "isInfinite()Z", at = @At("RETURN"), cancellable = true)
    private void injectedIsFinite(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}

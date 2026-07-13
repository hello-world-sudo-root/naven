package org.mixin;

import awa.qwq.ovo.Naven.utils.ICapabilityTracker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(targets = {"com.mojang.blaze3d.platform.GlStateManager$CapabilityTracker"})
public abstract class CapabilityTrackerMixin implements ICapabilityTracker {
   @Shadow
   private boolean state;

   @Shadow
   public abstract void setState(boolean var1);

   @Override
   public boolean get() {
      return this.state;
   }

   @Override
   public void set(boolean state) {
      this.setState(state);
   }
}

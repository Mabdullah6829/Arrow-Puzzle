package com.instagram.common.viewpoint.core;

import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ym */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class AnimationAnimationListenerC4003Ym implements Animation.AnimationListener {
    public final /* synthetic */ ViewOnClickListenerC23126x A00;

    public AnimationAnimationListenerC4003Ym(ViewOnClickListenerC23126x viewOnClickListenerC23126x) {
        this.A00 = viewOnClickListenerC23126x;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ((C3441PZ) this.A00).A08.finish(16);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}

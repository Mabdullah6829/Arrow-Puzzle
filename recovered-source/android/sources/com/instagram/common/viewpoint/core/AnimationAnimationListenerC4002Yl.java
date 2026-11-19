package com.instagram.common.viewpoint.core;

import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class AnimationAnimationListenerC4002Yl implements Animation.AnimationListener {
    public final /* synthetic */ ViewOnClickListenerC23126x A00;

    public AnimationAnimationListenerC4002Yl(ViewOnClickListenerC23126x viewOnClickListenerC23126x) {
        this.A00 = viewOnClickListenerC23126x;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A00.A06();
        if (this.A00.A04 > 0) {
            this.A00.A05.postDelayed(this.A00.A07, this.A00.A04);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}

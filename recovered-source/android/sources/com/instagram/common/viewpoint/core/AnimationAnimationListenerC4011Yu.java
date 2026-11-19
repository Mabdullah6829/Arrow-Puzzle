package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class AnimationAnimationListenerC4011Yu implements Animation.AnimationListener {
    public final /* synthetic */ C3568Re A00;
    public final /* synthetic */ AbstractC3426PJ A01;
    public final /* synthetic */ AbstractC3426PJ A02;

    public AnimationAnimationListenerC4011Yu(AbstractC3426PJ abstractC3426PJ, AbstractC3426PJ abstractC3426PJ2, C3568Re c3568Re) {
        this.A01 = abstractC3426PJ;
        this.A02 = abstractC3426PJ2;
        this.A00 = c3568Re;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A06 = false;
        AbstractC3966YB.A0H(this.A02);
        new Handler().postDelayed(new C3433PQ(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}

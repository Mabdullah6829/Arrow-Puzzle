package com.instagram.common.viewpoint.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.GX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2885GX extends AbstractRunnableC3871Wc {
    public final /* synthetic */ InterfaceC4316dp A00;
    public final /* synthetic */ C4317dq A01;

    public C2885GX(C4317dq c4317dq, InterfaceC4316dp interfaceC4316dp) {
        this.A01 = c4317dq;
        this.A00 = interfaceC4316dp;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C2886GY(this));
        this.A01.startAnimation(alphaAnimation);
    }
}

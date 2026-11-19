package com.instagram.common.viewpoint.core;

import android.R;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.PQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3433PQ extends AbstractRunnableC3871Wc {
    public final /* synthetic */ AnimationAnimationListenerC4011Yu A00;

    public C3433PQ(AnimationAnimationListenerC4011Yu animationAnimationListenerC4011Yu) {
        this.A00 = animationAnimationListenerC4011Yu;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        this.A00.A00.finish(3);
        this.A00.A00.A05().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}

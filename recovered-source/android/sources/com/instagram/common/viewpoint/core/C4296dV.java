package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dV */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4296dV implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C22065F A00;

    public C4296dV(C22065F c22065f) {
        this.A00 = c22065f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.A00.A0b.getLayoutParams().height = num.intValue();
        this.A00.A0b.requestLayout();
    }
}

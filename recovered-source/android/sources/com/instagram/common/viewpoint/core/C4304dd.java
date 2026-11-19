package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dd */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4304dd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C219655 A00;

    public C4304dd(C219655 c219655) {
        this.A00 = c219655;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.A00.A0b.getLayoutParams().height = num.intValue();
        this.A00.A0b.requestLayout();
    }
}

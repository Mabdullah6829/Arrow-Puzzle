package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cf */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4244cf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C3081Ji A00;

    public C4244cf(C3081Ji c3081Ji) {
        this.A00 = c3081Ji;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A00.A0T != null) {
            this.A00.A0T.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.A00.A0T.requestLayout();
        }
    }
}

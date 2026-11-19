package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4225cM implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C3113KE A00;

    public C4225cM(C3113KE c3113ke) {
        this.A00 = c3113ke;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        if (this.A00.A09 != null) {
            this.A00.A09.getLayoutParams().height = num.intValue();
            this.A00.A09.requestLayout();
        }
    }
}

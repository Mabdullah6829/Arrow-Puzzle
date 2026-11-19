package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dW */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4297dW extends AnimatorListenerAdapter {
    public final /* synthetic */ C22065F A00;
    public final /* synthetic */ boolean A01;

    public C4297dW(C22065F c22065f, boolean z) {
        this.A00 = c22065f;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A0H.setTranslationY(0.0f);
        this.A00.A0V();
        if (!this.A01 && this.A00.A0G != null) {
            this.A00.A0G.destroy();
        }
    }
}

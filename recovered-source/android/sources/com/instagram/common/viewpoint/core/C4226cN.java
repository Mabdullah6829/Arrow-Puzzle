package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cN */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4226cN extends AnimatorListenerAdapter {
    public final /* synthetic */ C3113KE A00;
    public final /* synthetic */ boolean A01;

    public C4226cN(C3113KE c3113ke, boolean z) {
        this.A00 = c3113ke;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A0K.setTranslationY(0.0f);
        this.A00.A0T();
        if (!this.A01 && this.A00.A0I != null) {
            this.A00.A0I.destroy();
        }
        if (this.A00.A0g != null) {
            if (!this.A00.A0E.A1i()) {
                this.A00.A0g.setVisibility(this.A01 ? 8 : 0);
            } else {
                this.A00.A0g.setVisibility(8);
            }
        }
    }
}

package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cg */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4245cg extends AnimatorListenerAdapter {
    public final /* synthetic */ C3081Ji A00;
    public final /* synthetic */ boolean A01;

    public C4245cg(C3081Ji c3081Ji, boolean z) {
        this.A00 = c3081Ji;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A0t(this.A00.A0D, true);
        if (!this.A01 && this.A00.A08 != null) {
            this.A00.A08.destroy();
        }
    }
}

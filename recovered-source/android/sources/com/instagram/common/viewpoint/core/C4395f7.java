package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4395f7 extends AnimatorListenerAdapter {
    public final /* synthetic */ C21063c A00;

    public C4395f7(C21063c c21063c) {
        this.A00 = c21063c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00.A04.postDelayed(new C2711Di(this), 2000L);
    }
}

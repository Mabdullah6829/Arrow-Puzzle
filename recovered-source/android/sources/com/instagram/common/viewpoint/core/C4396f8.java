package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4396f8 extends AnimatorListenerAdapter {
    public final /* synthetic */ C2710Dh A00;

    public C4396f8(C2710Dh c2710Dh) {
        this.A00 = c2710Dh;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00.setVisibility(8);
    }
}

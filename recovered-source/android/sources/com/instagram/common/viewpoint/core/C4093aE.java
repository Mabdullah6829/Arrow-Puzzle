package com.instagram.common.viewpoint.core;

import android.animation.Animator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4093aE implements Animator.AnimatorListener {
    public final /* synthetic */ C4098aJ A00;

    public C4093aE(C4098aJ c4098aJ) {
        this.A00 = c4098aJ;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.A00.A08();
        this.A00.A0B();
    }
}

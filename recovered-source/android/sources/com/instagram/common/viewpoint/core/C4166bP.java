package com.instagram.common.viewpoint.core;

import android.animation.Animator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bP */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4166bP implements Animator.AnimatorListener {
    public final /* synthetic */ C4168bR A00;

    public C4166bP(C4168bR c4168bR) {
        this.A00 = c4168bR;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A06();
        this.A00.A02 = true;
        this.A00.A07.A0F().ADF();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

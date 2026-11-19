package com.instagram.common.viewpoint.core;

import android.animation.Animator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aG */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4095aG implements Animator.AnimatorListener {
    public final /* synthetic */ C4098aJ A00;

    public C4095aG(C4098aJ c4098aJ) {
        this.A00 = c4098aJ;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A04 = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.A00.A0H == EnumC4104aP.A04) {
            this.A00.A01.setPadding(AbstractC3924XV.A0S, AbstractC3924XV.A00, AbstractC3924XV.A0S, AbstractC3924XV.A00);
            this.A00.A01.setVisibility(0);
        } else {
            this.A00.A01.setPadding(AbstractC3924XV.A0I, AbstractC3924XV.A00, AbstractC3924XV.A0I, AbstractC3924XV.A00);
        }
    }
}

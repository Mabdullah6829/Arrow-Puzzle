package com.instagram.common.viewpoint.core;

import android.animation.Animator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4414fQ implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C2678DB A02;

    public C4414fQ(C2678DB c2678db, int i2, int i3) {
        this.A02 = c2678db;
        this.A01 = i2;
        this.A00 = i3;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A02.A07(this.A00, this.A01, false);
        if (this.A02.A00 != null) {
            this.A02.A00.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EnumC4407fJ enumC4407fJ;
        C2678DB c2678db = this.A02;
        if (this.A01 == this.A02.A04) {
            enumC4407fJ = EnumC4407fJ.A02;
        } else {
            enumC4407fJ = EnumC4407fJ.A04;
        }
        c2678db.A01 = enumC4407fJ;
        if (this.A02.A00 != null) {
            this.A02.A00.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

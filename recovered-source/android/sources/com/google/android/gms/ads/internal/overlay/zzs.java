package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
final class zzs extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzu f3379a;

    public zzs(zzu zzuVar) {
        this.f3379a = zzuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        zzu zzuVar = this.f3379a;
        zzuVar.setEnabled(true);
        zzuVar.f3384s.setEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zzu zzuVar = this.f3379a;
        zzuVar.setEnabled(true);
        zzuVar.f3384s.setEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        zzu zzuVar = this.f3379a;
        zzuVar.setEnabled(false);
        zzuVar.f3384s.setEnabled(false);
    }
}

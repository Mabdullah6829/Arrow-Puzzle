package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4096aH extends Animator {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC4085a6 A01;
    public final /* synthetic */ C4098aJ A02;

    public C4096aH(C4098aJ c4098aJ, int i2, InterfaceC4085a6 interfaceC4085a6) {
        this.A02 = c4098aJ;
        this.A00 = i2;
        this.A01 = interfaceC4085a6;
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
    }

    @Override // android.animation.Animator
    public final void cancel() {
    }

    @Override // android.animation.Animator
    public final void end() {
    }

    @Override // android.animation.Animator
    public final long getDuration() {
        return this.A00;
    }

    @Override // android.animation.Animator
    public final long getStartDelay() {
        return 0L;
    }

    @Override // android.animation.Animator
    public final boolean isRunning() {
        return this.A02.A04;
    }

    @Override // android.animation.Animator
    public final Animator setDuration(long j2) {
        return null;
    }

    @Override // android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
    }

    @Override // android.animation.Animator
    public final void setStartDelay(long j2) {
    }

    @Override // android.animation.Animator
    public final void setTarget(Object obj) {
        this.A01.AK7(obj, getDuration());
    }

    @Override // android.animation.Animator
    public final void start() {
    }
}

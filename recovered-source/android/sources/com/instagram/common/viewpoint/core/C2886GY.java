package com.instagram.common.viewpoint.core;

import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.GY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2886GY extends AnimationAnimationListenerC3965YA {
    public final /* synthetic */ C2885GX A00;

    public C2886GY(C2885GX c2885gx) {
        this.A00 = c2885gx;
    }

    @Override // com.instagram.common.viewpoint.core.AnimationAnimationListenerC3965YA, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC3966YB.A0H(this.A00.A01);
        this.A00.A00.AEL();
    }
}

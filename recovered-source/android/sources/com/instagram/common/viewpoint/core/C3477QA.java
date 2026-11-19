package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.QA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3477QA extends AnimationAnimationListenerC3965YA {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ScaleAnimation A01;

    public C3477QA(View view, ScaleAnimation scaleAnimation) {
        this.A00 = view;
        this.A01 = scaleAnimation;
    }

    @Override // com.instagram.common.viewpoint.core.AnimationAnimationListenerC3965YA, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A00.startAnimation(this.A01);
    }
}

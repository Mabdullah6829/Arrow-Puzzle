package com.instagram.common.viewpoint.core;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bK */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4161bK implements LayoutTransition.TransitionListener {
    public final /* synthetic */ C4162bL A00;

    public C4161bK(C4162bL c4162bL) {
        this.A00 = c4162bL;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i2) {
        ((AbstractC4156bF) this.A00.A00.A00).A09.setAlpha(1.0f);
        this.A00.A00.A00.A0Q.setAlpha(1.0f);
        this.A00.A00.A00.A0P.setAlpha(1.0f);
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i2) {
    }
}

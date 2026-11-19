package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aV */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnAttachStateChangeListenerC4110aV implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C4111aW A00;

    public ViewOnAttachStateChangeListenerC4110aV(C4111aW c4111aW) {
        this.A00 = c4111aW;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.A00.A09();
        this.A00.A03.setOnClickListener(null);
    }
}

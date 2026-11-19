package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.VJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnAttachStateChangeListenerC3793VJ implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC3791VH A00;
    public final /* synthetic */ C3792VI A01;

    public ViewOnAttachStateChangeListenerC3793VJ(C3792VI c3792vi, EnumC3791VH enumC3791VH) {
        this.A01 = c3792vi;
        this.A00 = enumC3791VH;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A04(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}

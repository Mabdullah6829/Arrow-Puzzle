package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pf */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnApplyWindowInsetsListenerC3447Pf implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ InterfaceC3434PR A00;
    public final /* synthetic */ C19350n A01;

    public ViewOnApplyWindowInsetsListenerC3447Pf(C19350n c19350n, InterfaceC3434PR interfaceC3434PR) {
        this.A01 = c19350n;
        this.A00 = interfaceC3434PR;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C3465Py compatInsets = this.A00.ACw(view, C3465Py.A00(windowInsets));
        return (WindowInsets) C3465Py.A01(compatInsets);
    }
}

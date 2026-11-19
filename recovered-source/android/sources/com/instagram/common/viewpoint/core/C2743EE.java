package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.EE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2743EE implements InterfaceC4379er {
    public final View A00;
    public final C4494gi A01;

    public C2743EE(C4494gi c4494gi, View view) {
        this.A01 = c4494gi;
        this.A00 = view;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4379er
    public final double A9V() {
        C4440fq result = C4439fp.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}

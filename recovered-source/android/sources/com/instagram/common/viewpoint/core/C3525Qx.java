package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qx */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3525Qx {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final C3525Qx A00(AbstractC3548RK abstractC3548RK, int i2) {
        View view = abstractC3548RK.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final C3525Qx A01(AbstractC3548RK abstractC3548RK) {
        return A00(abstractC3548RK, 0);
    }
}

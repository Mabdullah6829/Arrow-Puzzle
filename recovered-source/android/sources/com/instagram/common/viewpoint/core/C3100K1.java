package com.instagram.common.viewpoint.core;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.K1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3100K1 {
    public C3094Jv A00;
    public C3096Jx A01;
    public final int A02;
    public final int A03;
    public final SparseArray<C3098Jz> A08 = new SparseArray<>();
    public final SparseArray<C3093Ju> A06 = new SparseArray<>();
    public final SparseArray<C3095Jw> A07 = new SparseArray<>();
    public final SparseArray<C3093Ju> A04 = new SparseArray<>();
    public final SparseArray<C3095Jw> A05 = new SparseArray<>();

    public C3100K1(int i2, int i3) {
        this.A03 = i2;
        this.A02 = i3;
    }

    public final void A00() {
        this.A08.clear();
        this.A06.clear();
        this.A07.clear();
        this.A04.clear();
        this.A05.clear();
        this.A00 = null;
        this.A01 = null;
    }
}

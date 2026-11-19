package com.instagram.common.viewpoint.core;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3098Jz {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final SparseArray<C3099K0> A09;
    public final boolean A0A;

    public C3098Jz(int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, SparseArray<C3099K0> sparseArray) {
        this.A03 = i2;
        this.A0A = z;
        this.A08 = i3;
        this.A02 = i4;
        this.A04 = i5;
        this.A01 = i6;
        this.A00 = i7;
        this.A07 = i8;
        this.A06 = i9;
        this.A05 = i10;
        this.A09 = sparseArray;
    }

    public final void A00(C3098Jz c3098Jz) {
        SparseArray<C3099K0> sparseArray = c3098Jz.A09;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            SparseArray<C3099K0> sparseArray2 = this.A09;
            int i3 = sparseArray.keyAt(i2);
            sparseArray2.put(i3, sparseArray.valueAt(i2));
        }
    }
}

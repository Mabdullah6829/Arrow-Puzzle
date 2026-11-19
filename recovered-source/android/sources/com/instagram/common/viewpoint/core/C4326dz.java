package com.instagram.common.viewpoint.core;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4326dz {
    public final SparseArray<int[]> A00 = new SparseArray<>();

    public final void A00(int i2, int[] iArr) {
        this.A00.put(i2, iArr);
    }

    public final boolean A01(int i2) {
        return this.A00.indexOfKey(i2) >= 0;
    }

    public final int[] A02(int i2) {
        return this.A00.get(i2);
    }
}

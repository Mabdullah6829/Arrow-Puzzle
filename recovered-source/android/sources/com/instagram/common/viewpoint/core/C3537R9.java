package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.R9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3537R9 {
    public SparseArray<C3536R8> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j2, long j3) {
        if (j2 == 0) {
            return j3;
        }
        return ((j2 / 4) * 3) + (j3 / 4);
    }

    private C3536R8 A01(int i2) {
        C3536R8 c3536r8 = this.A00.get(i2);
        if (c3536r8 == null) {
            C3536R8 c3536r9 = new C3536R8();
            this.A00.put(i2, c3536r9);
            return c3536r9;
        }
        return c3536r8;
    }

    private final void A02() {
        for (int i2 = 0; i2 < i; i2++) {
            this.A00.valueAt(i2).A03.clear();
        }
    }

    public final AbstractC3548RK A03(int i2) {
        C3536R8 c3536r8 = this.A00.get(i2);
        if (c3536r8 != null && !c3536r8.A03.isEmpty()) {
            ArrayList<AbstractC3548RK> arrayList = c3536r8.A03;
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i2, long j2) {
        C3536R8 c3536r8A01 = A01(i2);
        c3536r8A01.A01 = A00(c3536r8A01.A01, j2);
    }

    public final void A06(int i2, long j2) {
        C3536R8 c3536r8A01 = A01(i2);
        c3536r8A01.A02 = A00(c3536r8A01.A02, j2);
    }

    public final void A07(AbstractC3518Qq abstractC3518Qq) {
        this.A01++;
    }

    public final void A08(AbstractC3518Qq abstractC3518Qq, AbstractC3518Qq abstractC3518Qq2, boolean z) {
        if (abstractC3518Qq != null) {
            A04();
        }
        if (!z && this.A01 == 0) {
            A02();
        }
        if (abstractC3518Qq2 != null) {
            A07(abstractC3518Qq2);
        }
    }

    public final void A09(AbstractC3548RK abstractC3548RK) {
        int iA0N = abstractC3548RK.A0N();
        ArrayList<AbstractC3548RK> arrayList = A01(iA0N).A03;
        int i2 = this.A00.get(iA0N).A00;
        int viewType = arrayList.size();
        if (i2 <= viewType) {
            return;
        }
        abstractC3548RK.A0W();
        arrayList.add(abstractC3548RK);
    }

    public final boolean A0A(int i2, long j2, long j3) {
        long j4 = A01(i2).A01;
        return j4 == 0 || j2 + j4 < j3;
    }

    public final boolean A0B(int i2, long j2, long j3) {
        long j4 = A01(i2).A02;
        return j4 == 0 || j2 + j4 < j3;
    }
}

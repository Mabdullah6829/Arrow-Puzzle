package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hs */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4565hs implements InterfaceC3528R0 {
    public static byte[] A04;
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-95, -74, -50, -60, -54, -55, 117, -59, -60, -56, -66, -55, -66, -60, -61, -56, 117, -62, -54, -56, -55, 117, -73, -70, 117, -61, -60, -61, -126, -61, -70, -68, -74, -55, -66, -53, -70, -117, -92, -77, -96, -89, 91, -97, -92, -82, -81, -100, -87, -98, -96, 91, -88, -80, -82, -81, 91, -99, -96, 91, -87, -86, -87, 104, -87, -96, -94, -100, -81, -92, -79, -96};
    }

    public final void A02() {
        if (this.A03 != null) {
            Arrays.fill(this.A03, -1);
        }
        this.A00 = 0;
    }

    public final void A03(int i2, int i3) {
        this.A01 = i2;
        this.A02 = i3;
    }

    public final void A04(C23377M c23377m, boolean z) {
        this.A00 = 0;
        if (this.A03 != null) {
            Arrays.fill(this.A03, -1);
        }
        AbstractC3530R2 abstractC3530R2 = c23377m.A06;
        if (c23377m.A04 != null && abstractC3530R2 != null && abstractC3530R2.A1W()) {
            if (z) {
                if (!c23377m.A00.A0B()) {
                    abstractC3530R2.A1t(c23377m.A04.A0B(), this);
                }
            } else if (!c23377m.A1r()) {
                abstractC3530R2.A1s(this.A01, this.A02, c23377m.A0s, this);
            }
            if (this.A00 > abstractC3530R2.A00) {
                abstractC3530R2.A00 = this.A00;
                abstractC3530R2.A08 = z;
                c23377m.A0r.A0O();
            }
        }
    }

    public final boolean A05(int i2) {
        if (this.A03 != null) {
            int i3 = this.A00 * 2;
            for (int i4 = 0; i4 < i3; i4 += 2) {
                int count = this.A03[i4];
                if (count == i2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3528R0
    public final void A42(int i2, int i3) {
        if (i2 >= 0) {
            if (i3 >= 0) {
                int i4 = this.A00 * 2;
                if (this.A03 == null) {
                    this.A03 = new int[4];
                    Arrays.fill(this.A03, -1);
                } else {
                    int storagePosition = this.A03.length;
                    if (i4 >= storagePosition) {
                        int[] iArr = this.A03;
                        int storagePosition2 = i4 * 2;
                        this.A03 = new int[storagePosition2];
                        System.arraycopy(iArr, 0, this.A03, 0, iArr.length);
                    }
                }
                this.A03[i4] = i2;
                int storagePosition3 = i4 + 1;
                this.A03[storagePosition3] = i3;
                int storagePosition4 = this.A00;
                this.A00 = storagePosition4 + 1;
                return;
            }
            throw new IllegalArgumentException(A00(37, 35, 8));
        }
        throw new IllegalArgumentException(A00(0, 37, 34));
    }
}

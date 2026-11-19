package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3i */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C21113i {
    public static byte[] A04;
    public static final C21113i A05;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-23, -35, 32, 37, 30, 43, 43, 34, 41, 0, 44, 50, 43, 49, -6, 14, 2, 71, 80, 69, 81, 70, 75, 80, 73, 31, -33, 19, 2, 7, 13, -28, 13, 16, 11, -1, 18, -7, 17, -1, 11, 14, 10, 3, -16, -1, 18, 3, -37};
    }

    static {
        A01();
        A05 = new C21113i(-1, -1, -1);
    }

    public C21113i(int i2, int i3, int i4) {
        int iA06;
        this.A03 = i2;
        this.A01 = i3;
        this.A02 = i4;
        if (AbstractC22035C.A15(i4)) {
            iA06 = AbstractC22035C.A06(i4, i3);
        } else {
            iA06 = -1;
        }
        this.A00 = iA06;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21113i)) {
            return false;
        }
        C21113i c21113i = (C21113i) obj;
        return this.A03 == c21113i.A03 && this.A01 == c21113i.A01 && this.A02 == c21113i.A02;
    }

    public final int hashCode() {
        return AbstractC2617CB.A00(Integer.valueOf(this.A03), Integer.valueOf(this.A01), Integer.valueOf(this.A02));
    }

    public final String toString() {
        return A00(26, 23, 59) + this.A03 + A00(0, 15, 90) + this.A01 + A00(15, 11, 127) + this.A02 + ']';
    }
}

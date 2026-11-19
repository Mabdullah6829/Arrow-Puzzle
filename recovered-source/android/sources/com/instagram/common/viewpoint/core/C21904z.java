package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4z */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C21904z {
    public static byte[] A02;
    public static final C21904z A03;
    public static final C21904z A04;
    public final int A00;
    public final int A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-28};
    }

    static {
        A01();
        A03 = new C21904z(-1, -1);
        A04 = new C21904z(0, 0);
    }

    public C21904z(int i2, int i3) {
        AbstractC21273y.A07((i2 == -1 || i2 >= 0) && (i3 == -1 || i3 >= 0));
        this.A01 = i2;
        this.A00 = i3;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21904z)) {
            return false;
        }
        C21904z c21904z = (C21904z) obj;
        return this.A01 == c21904z.A01 && this.A00 == c21904z.A00;
    }

    public final int hashCode() {
        return this.A00 ^ ((this.A01 << 16) | (this.A01 >>> 16));
    }

    public final String toString() {
        return this.A01 + A00(0, 1, 44) + this.A00;
    }
}

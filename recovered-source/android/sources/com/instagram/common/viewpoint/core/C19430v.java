package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0v */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C19430v extends AbstractC19591B {
    public static byte[] A00;
    public static final AbstractC2618CC A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{9, 34, 43, 56, 7, 43, 62, 41, 34, 47, 56, 100, 36, 37, 36, 47, 98, 99};
    }

    static {
        A01();
        A01 = new C19430v();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19430v() {
        final String strA00 = A00(0, 18, 12);
        new AbstractC20382S(strA00) { // from class: com.facebook.ads.redexgen.X.1B
            public final String A00;

            {
                this.A00 = (String) AbstractC4734ki.A04(strA00);
            }

            public final String toString() {
                return this.A00;
            }
        };
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2618CC
    public final int A08(CharSequence sequence, int start) {
        int length = sequence.length();
        AbstractC4734ki.A01(start, length);
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2618CC
    public final boolean A09(char c) {
        return false;
    }
}

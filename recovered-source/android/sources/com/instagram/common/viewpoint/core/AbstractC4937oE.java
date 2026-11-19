package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4937oE implements InterfaceC22485v {
    public static byte[] A00;
    public static final boolean A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{32, 39, 53, 35, 35, 36, 54, 47, 58, 22, 26, 1, 20, 21};
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    static {
        boolean z;
        A01();
        if (A00(8, 6, 91).equals(AbstractC22035C.A05)) {
            if (!A00(4, 4, 66).equals(AbstractC22035C.A06)) {
                if (!A00(0, 4, 65).equals(AbstractC22035C.A06)) {
                    z = false;
                }
            }
            z = true;
        } else {
            z = false;
        }
        A01 = z;
    }
}

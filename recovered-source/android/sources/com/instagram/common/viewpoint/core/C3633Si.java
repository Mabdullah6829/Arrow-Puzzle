package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Si */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3633Si {
    public static InterfaceC3634Sj A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-91, -88, -79, -90, -85, -80, -92, -75, -82};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (C3633Si.class) {
            if (A00 == null) {
                return;
            }
            C3691Te c3691Te = new C3691Te(A00.AIb());
            c3691Te.A05(1);
            C4490ge c4490geA00 = AbstractC3658T7.A00();
            if (c4490geA00 != null) {
                c4490geA00.A08().ABC(A00(0, 9, 49), 3401, c3691Te);
            }
            A00.reset();
        }
    }

    public static void A03(long j2) {
        if (j2 > 0) {
            A00 = new C4503gr();
            new C3635Sk(j2);
        }
    }
}

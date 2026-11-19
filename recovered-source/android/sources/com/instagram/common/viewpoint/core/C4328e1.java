package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4328e1 implements InterfaceC4443ft {
    public static byte[] A01;
    public final C4490ge A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{82, 39, 76, 72, 39, 90, 101, 101, 102, 39, 88, 101, 127, 126, 99, 100, 109, 39, 94, 101, 97, 111, 100, 12, 10, 28, 11, 84, 24, 30, 28, 23, 13};
    }

    public C4328e1(C4490ge c4490ge) {
        this.A00 = c4490ge;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4443ft
    public final Map<String, String> A6g(boolean z) {
        HashMap map = new HashMap();
        if (!AbstractC3625SZ.A00().A04()) {
            map.put(A00(0, 23, 64), C3728UG.A00().A01(this.A00, true).A04());
        }
        map.put(A00(23, 10, 51), AbstractC3731UJ.A06(new C3701To(this.A00), this.A00, z));
        return map;
    }
}

package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4558hl implements InterfaceC3489QM {
    public static byte[] A01;
    public final /* synthetic */ C23377M A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-10, 0, -9};
    }

    public C4558hl(C23377M c23377m) {
        this.A00 = c23377m;
    }

    private final void A02(C3490QN c3490qn) {
        throw new NullPointerException(A00(0, 3, 40));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3489QM
    public final void ADg(C3490QN c3490qn) {
        A02(c3490qn);
        throw null;
    }
}

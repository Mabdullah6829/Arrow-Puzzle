package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.GU */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2882GU extends AbstractRunnableC3871Wc {
    public static byte[] A01;
    public final /* synthetic */ C21604V A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{102, 89, 84, 85, 95, 16, 71, 81, 67, 16, 94, 85, 70, 85, 66, 16, 64, 66, 85, 64, 81, 66, 85, 84};
    }

    public C2882GU(C21604V c21604v) {
        this.A00 = c21604v;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        if (!this.A00.A0E) {
            this.A00.A0Q(A00(0, 24, 46));
        }
    }
}

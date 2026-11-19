package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hm */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2962Hm extends AbstractRunnableC3871Wc {
    public static byte[] A02;
    public final /* synthetic */ C219655 A00;
    public final /* synthetic */ C21394A A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{21, 72, 57, 57, 56, 69, 60, 65, 58, -13, 60, 65, 55, 56, 57, 60, 65, 60, 71, 56, 63, 76};
    }

    public C2962Hm(C219655 c219655, C21394A c21394a) {
        this.A00 = c219655;
        this.A01 = c21394a;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        if (this.A00.A0b.getState() == EnumC4436fm.A02 && this.A00.A0b.getCurrentPositionInMillis() == A00()) {
            this.A00.A0s(A00(0, 22, 104));
        }
    }
}

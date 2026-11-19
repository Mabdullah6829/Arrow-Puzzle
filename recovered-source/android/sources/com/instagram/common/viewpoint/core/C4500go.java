package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.go */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4500go extends AbstractRunnableC3871Wc {
    public static byte[] A02;
    public final /* synthetic */ C4499gn A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{14, 44, 46, 51, 48, -21, 49, 44, 52, 55, -7, -110, -80, -78, -73, -76, 111, -62, -60, -78, -78, -76, -62, -62, 125};
    }

    public C4500go(C4499gn c4499gn, AtomicBoolean atomicBoolean) {
        this.A00 = c4499gn;
        this.A01 = atomicBoolean;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(EnumC3791VH.A0H);
                C3651T0.A02(this.A00.A02.A04, this.A00.A01, C3651T0.A00, A00(11, 14, 1), this.A00.A02.A00);
                this.A00.A02.A0U();
                this.A00.A00.ADT();
                return;
            }
            this.A00.A02.A0I(EnumC3791VH.A0G);
            C3651T0.A02(this.A00.A02.A04, this.A00.A01, C3651T0.A04, A00(0, 11, 125), this.A00.A02.A00);
            this.A00.A02.A0V();
            this.A00.A00.ADL();
        }
    }
}

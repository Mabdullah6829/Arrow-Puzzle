package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4299dY implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C22075G A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 113, 124, 125, 119, 72, 116, 121, 97, 122, 121, 123, 115, 93, 106, 106, 119, 106};
    }

    public RunnableC4299dY(C22075G c22075g) {
        this.A00 = c22075g;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0Z.AGQ(A00(0, 18, 75));
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}

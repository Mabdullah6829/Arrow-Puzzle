package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dh */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4308dh implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C219756 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{98, 93, 80, 81, 91, 100, 88, 85, 77, 86, 85, 87, 95, 113, 70, 70, 91, 70};
    }

    public RunnableC4308dh(C219756 c219756) {
        this.A00 = c219756;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0s(A00(0, 18, 82));
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}

package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yk */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4001Yk implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ ViewOnClickListenerC23126x A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-106, -108, -122, -109, -128, -125, -106, -121, -121, -122, -109, -122, -123, -128, -124, -115, -118, -124, -116, -128, -126, -121, -107, -122, -109, -128, -123, -122, -115, -126, -102};
    }

    public RunnableC4001Yk(ViewOnClickListenerC23126x viewOnClickListenerC23126x) {
        this.A00 = viewOnClickListenerC23126x;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0I(A00(0, 31, 20));
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}

package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4m */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C21774m {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-13, -21, -14, -15, -24};
    }

    public static void A02(Context context, C21804p c21804p) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) AbstractC21273y.A01((TelephonyManager) context.getSystemService(A00(0, 5, 11)));
            C21764l callback = new C21764l(c21804p);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), callback);
            telephonyManager.unregisterTelephonyCallback(callback);
        } catch (RuntimeException unused) {
            c21804p.A07(5);
        }
    }
}

package com.instagram.common.viewpoint.core;

import android.net.Uri;
import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract /* synthetic */ class AbstractC3268Mj {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{9, 28, 19, 3, 16, 9, 18, 17, 36, 27, 11, 30, 17, 16, 21, 30};
    }

    public static long A00(InterfaceC3269Mk interfaceC3269Mk) {
        return interfaceC3269Mk.A6h(A02(0, 7, 111), -1L);
    }

    public static Uri A01(InterfaceC3269Mk interfaceC3269Mk) {
        String strA6j = interfaceC3269Mk.A6j(A02(7, 9, C1137R.styleable.ConstraintSet_quantizeMotionSteps), null);
        if (strA6j == null) {
            return null;
        }
        return Uri.parse(strA6j);
    }
}

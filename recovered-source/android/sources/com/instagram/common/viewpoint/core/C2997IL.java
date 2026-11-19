package com.instagram.common.viewpoint.core;

import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.IL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2997IL extends AbstractRunnableC3871Wc {
    public static byte[] A01;
    public static String[] A02 = {"mPUp", "QaVG6HdjpkfaxAZj0g", "f", "awRGdU6dgRZhiPVlhe", "rFOzx0t9VnUrXKVKNhKeQ4JnbF82l9OW", "Jupus4hVDLzI", "SNB8L6kKTybUpjfk2kEtWCUyw", "zmy1APRNrfa5"};
    public final /* synthetic */ C22195S A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-23, -4, -9, -8, 2, -77, 10, -12, 6, -77, 1, -8, 9, -8, 5, -77, 3, 5, -8, 3, -12, 5, -8, -9};
    }

    static {
        A01();
    }

    public C2997IL(C22195S c22195s) {
        this.A00 = c22195s;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        if (!this.A00.A0C) {
            C22195S c22195s = this.A00;
            String[] strArr = A02;
            if (strArr[2].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A02[3] = "r7zn";
            c22195s.A0S(A00(0, 24, C1137R.styleable.ConstraintSet_transitionEasing));
        }
    }
}

package com.instagram.common.viewpoint.core;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.WJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3853WJ implements InterfaceC4446fw {
    public static byte[] A01;
    public static String[] A02 = {"Pvxnryfp5C2YJ", "58Tt8xWVSP1vJRxeZG7By0J4DHdpZFgc", "d8fJjrUVSDGdkyzleHZclvn63G4sHX0L", "2vkexQ2kDfwHm", "C5INcofoFkRix0Rm4DG2QIlt8jox4BBj", "", "Y25u3HoHlGlpJYy8Y", "MTcvQGxX9nLrxfee4M1dH5SKsx5IsifC"};
    public final /* synthetic */ C3659T8 A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[5].length() == 8) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "YNZl3vrESdm0ZjqRAgqNuDMkNkDkDjcM";
            strArr[2] = "T4MR0Bp8ShJAOBNGhRUi97nIryoGWHBS";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 37);
            i5++;
        }
    }

    public static void A01() {
        A01 = new byte[]{26, 56, 55, 126, 45, 121, 61, 48, 42, 41, 56, 45, 58, 49, 121, 58, 54, 44, 55, 45, 60, 43, 42, 119, 77, 96, 122, 121, 104, 125, 106, 97, 108, 109, 41, 106, 102, 124, 103, 125, 108, 123, 122, 39, 41, 91, 108, 122, 121, 102, 103, 122, 108, 51, 41};
    }

    static {
        A01();
    }

    public C3853WJ(C3659T8 c3659t8) {
        this.A00 = c3659t8;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4446fw
    public final void ADR(InterfaceC4444fu interfaceC4444fu) {
        if (this.A00.A05().AAO() && interfaceC4444fu != null) {
            String str = A00(24, 31, 44) + interfaceC4444fu.A73();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4446fw
    public final void ADq(Exception exc) {
        if (this.A00.A05().AAO()) {
            Log.e(C3795VL.A01, A00(0, 24, 124), exc);
        }
    }
}

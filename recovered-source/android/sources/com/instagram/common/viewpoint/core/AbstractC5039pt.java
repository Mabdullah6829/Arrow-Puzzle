package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5039pt implements InterfaceC201424 {
    public static byte[] A00;
    public static String[] A01 = {"aC8uc30vckBh0ldJ8CsDkWWGmQgl7sOm", "2", "dPCbCdxH5PRV4edn", "QHj", "dDf", "KHWYQA", "nwDl9CeJStZlhkBKgBcw2akg3aHE6X2p", "I5"};
    public static final String A02;
    public static final InterfaceC201323<AbstractC5039pt> A03;

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-126, -101, -104, -101, -100, -92, -101, 77, 127, -114, -95, -106, -101, -108, -127, -90, -99, -110, 103, 77};
    }

    static {
        A07();
        A02 = AbstractC22035C.A0h(0);
        A03 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.pu
            @Override // com.instagram.common.viewpoint.core.InterfaceC201323
            public final InterfaceC201424 A6f(Bundle bundle) {
                return AbstractC5039pt.A04(bundle);
            }
        };
    }

    public static AbstractC5039pt A04(Bundle bundle) {
        int i2 = bundle.getInt(A02, -1);
        switch (i2) {
            case 0:
                return (AbstractC5039pt) C2516AX.A02.A6f(bundle);
            case 1:
                AbstractC5039pt abstractC5039pt = (AbstractC5039pt) C2514AV.A02.A6f(bundle);
                if (A01[6].charAt(2) != 'F') {
                    String[] strArr = A01;
                    strArr[7] = "RK";
                    strArr[1] = "0";
                    return abstractC5039pt;
                }
                break;
            case 2:
                return (AbstractC5039pt) C2513AU.A04.A6f(bundle);
            case 3:
                InterfaceC201424 interfaceC201424A6f = C2512AT.A02.A6f(bundle);
                if (A01[6].charAt(2) != 'F') {
                    String[] strArr2 = A01;
                    strArr2[7] = "Vr";
                    strArr2[1] = "2";
                    return (AbstractC5039pt) interfaceC201424A6f;
                }
                break;
            default:
                throw new IllegalArgumentException(A06(0, 20, 36) + i2);
        }
        throw new RuntimeException();
    }
}

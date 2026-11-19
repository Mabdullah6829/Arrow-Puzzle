package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AV */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2514AV extends AbstractC5039pt {
    public static byte[] A01;
    public static final InterfaceC201323<C2514AV> A02;
    public static final String A03;
    public final float A00;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{22, 3, 20, 5, 3, 8, 18, 70, 11, 19, 21, 18, 70, 4, 3, 70, 15, 8, 70, 18, 14, 3, 70, 20, 7, 8, 1, 3, 70, 9, 0, 70, 61, 86, 74, 70, 87, 86, 86, 59};
    }

    static {
        A03();
        A03 = AbstractC22035C.A0h(1);
        A02 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.q1
            @Override // com.instagram.common.viewpoint.core.InterfaceC201323
            public final InterfaceC201424 A6f(Bundle bundle) {
                return C2514AV.A00(bundle);
            }
        };
    }

    public C2514AV() {
        this.A00 = -1.0f;
    }

    public C2514AV(float f2) {
        AbstractC21273y.A09(f2 >= 0.0f && f2 <= 100.0f, A02(0, 40, 45));
        this.A00 = f2;
    }

    public static C2514AV A00(Bundle bundle) {
        AbstractC21273y.A07(bundle.getInt(AbstractC5039pt.A02, -1) == 1);
        float f2 = bundle.getFloat(A03, -1.0f);
        return f2 == -1.0f ? new C2514AV() : new C2514AV(f2);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2514AV) && this.A00 == ((C2514AV) obj).A00;
    }

    public final int hashCode() {
        return AbstractC2617CB.A00(Float.valueOf(this.A00));
    }
}

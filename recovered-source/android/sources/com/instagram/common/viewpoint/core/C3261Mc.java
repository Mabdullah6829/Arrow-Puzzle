package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mc */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3261Mc implements InterfaceC3916XN {
    public static byte[] A01;
    public final /* synthetic */ C3255MW A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{36, 48, 49, 42, 38, 41, 44, 38, 46};
    }

    public C3261Mc(C3255MW c3255mw) {
        this.A00 = c3255mw;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void ADS() {
        if (!this.A00.A0C && !this.A00.A0B) {
            this.A00.A0V(false, A00(0, 9, 123));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void AFV(float f2) {
    }
}

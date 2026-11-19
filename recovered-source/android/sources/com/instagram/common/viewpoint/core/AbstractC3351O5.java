package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.O5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3351O5 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 77, 81, 72, 73, 93, 90, 64, 81, 70, 71, 64, 93, 64, 93, 85, 88};
    }

    public static void A02(C4494gi c4494gi, AbstractC4669jd abstractC4669jd, boolean z, InterfaceC3349O3 interfaceC3349O3) {
        if (!C3763Up.A2E(c4494gi)) {
            C3648Sx c3648Sx = new C3648Sx(c4494gi);
            C3334No c3334NoA07 = abstractC4669jd.A29().A0H().A07();
            c3648Sx.A0e(new C3792VI(abstractC4669jd.A2E(), c4494gi.A0A()));
            if (c3334NoA07 == null) {
                interfaceC3349O3.AFF(AdError.CACHE_ERROR);
                return;
            }
            if (c3334NoA07.A0Y()) {
                interfaceC3349O3.AFG();
                return;
            }
            C3644St c3644St = new C3644St(c3334NoA07.A0L(), abstractC4669jd.A1D(), abstractC4669jd.A10());
            c3644St.A04 = true;
            c3644St.A03 = A00(0, 5, 86);
            switch (C3348O2.A00[c3334NoA07.A0G().ordinal()]) {
                case 1:
                case 2:
                    c3648Sx.A0Y(c3644St);
                    break;
            }
            c3648Sx.A0c(new C3646Sv(abstractC4669jd.A2C().A01(), -1, -1, abstractC4669jd.A1D(), abstractC4669jd.A10()));
            c3648Sx.A0c(new C3646Sv(c3334NoA07.A0K(), -1, -1, abstractC4669jd.A1D(), abstractC4669jd.A10()));
            AbstractC3346O0.A00(abstractC4669jd, c3648Sx, A00(5, 12, 71));
            c3648Sx.A0X(new C4642jA(c4494gi, interfaceC3349O3, c3648Sx, c3334NoA07, z), new C3641Sq(abstractC4669jd.A1D(), abstractC4669jd.A10()));
            return;
        }
        interfaceC3349O3.AFG();
    }
}

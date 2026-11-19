package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gf */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2893Gf implements InterfaceC3991Ya {
    public static byte[] A01;
    public static String[] A02 = {"csDJTKMsYdQDTZ6oaAKl5T8I2UfElmlw", "ZPoBWwRbmlxJW4JBXeHiCznpgduRwX0R", "YnHNxwrcL4VP2rzDabEPBpSRhKQlF70O", "ZXjFBdL6N8QRVPocRq4T6yjW", "DvDV4BG5U2fSuPxyYCt3atNQBem4gb3r", "Lz5NxPzXDVZYAcKGP0xvxFjIAyYktO5Y", "USLnjf5V4FwfzNcoOXwUO87ZM5qcDzRn", "2jpbWPspWwKCP4YD7vZxOkEv1N6M1MwD"};
    public final /* synthetic */ C2892Ge A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        if (A02[0].charAt(1) == '2') {
            throw new RuntimeException();
        }
        A02[3] = "dLINtRlzHu";
        A01 = new byte[]{117, 109, 111, 118};
    }

    static {
        A01();
    }

    public C2893Gf(C2892Ge c2892Ge) {
        this.A00 = c2892Ge;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3991Ya
    public final void ACl(AbstractC3992Yb abstractC3992Yb) {
        if (abstractC3992Yb.getToolbarActionMode() == 8 && this.A00.A04 != null) {
            this.A00.A0F.A04(EnumC3791VH.A0Y, null);
            this.A00.A04.A1D(A00(0, 4, 95));
            this.A00.A0G();
            return;
        }
        this.A00.A0E();
    }
}

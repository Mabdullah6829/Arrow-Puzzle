package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8G */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C23938G extends AbstractC4725kY<EnumC3228M5> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 90, 81, 81};
    }

    public C23938G(String str) {
        super(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4725kY
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C3222Lz A04(EnumC3228M5 enumC3228M5) {
        return new C3222Lz(this, enumC3228M5 == null ? A00(0, 4, 114) : enumC3228M5.A03());
    }
}

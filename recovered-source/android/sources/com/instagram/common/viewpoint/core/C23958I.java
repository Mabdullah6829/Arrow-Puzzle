package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8I */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C23958I extends AbstractC4725kY<EnumC3214Lr> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, -49, -58, -58};
    }

    public C23958I(String str) {
        super(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4725kY
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C3222Lz A04(EnumC3214Lr enumC3214Lr) {
        return new C3222Lz(this, enumC3214Lr == null ? A00(0, 4, 46) : A00(0, 0, 18) + enumC3214Lr.A03());
    }
}

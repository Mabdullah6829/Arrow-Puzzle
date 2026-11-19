package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4706kE extends AbstractC3278Mt {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{16, 43, 51, 54, 47, 46, -22, 62, 57, -22, 57, 58, 47, 56, -22, 54, 51, 56, 53, -22, 63, 60, 54, 4, -22};
    }

    static {
        A01();
        A02 = C4706kE.class.getSimpleName();
    }

    public C4706kE(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, String str, Uri uri) {
        super(c4494gi, interfaceC3784VA, str);
        this.A00 = uri;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3278Mt
    public final EnumC3275Mq A0G(String str) {
        try {
            C3899X6.A0E(new C3899X6(), this.A01, this.A00, this.A03);
        } catch (Exception unused) {
            String str2 = A00(0, 25, 104) + this.A00.toString();
        }
        return EnumC3275Mq.A09;
    }
}

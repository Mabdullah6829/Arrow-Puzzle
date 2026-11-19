package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sm */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3637Sm {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C3638Sn A00;
    public final C3639So A01;
    public final C4490ge A02;
    public final InterfaceC4470gK A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{122, 108, 71, 125, 96, 108, 106, 121, 107};
    }

    static {
        A01();
        A06 = C3637Sm.class.getSimpleName();
    }

    public C3637Sm(C4490ge c4490ge, InterfaceC2639CY interfaceC2639CY, C3638Sn c3638Sn, C3639So c3639So) {
        this.A02 = c4490ge;
        this.A03 = interfaceC2639CY.A5U(EnumC4471gL.A06);
        this.A00 = c3638Sn;
        this.A01 = c3639So;
        this.A03.A41(new C4502gq(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (!this.A03.AAe()) {
                this.A02.A05().AAO();
                return;
            }
            String btExtras = this.A03.A7i().optString(A00(0, 9, 7));
            if (!TextUtils.isEmpty(btExtras)) {
                this.A00.A04(this.A02, btExtras);
                if (!A04 || C3763Up.A0j(this.A02)) {
                    A04 = true;
                    this.A01.A07();
                }
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}

package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.N3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3287N3 {
    public static byte[] A04;
    public boolean A00;

    @Nullable
    public final AbstractC3288N4 A01;
    public final C4494gi A02;
    public final C4439fp A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-2, 34, 37, 39, 26, 40, 40, 30, 36, 35, -43, 33, 36, 28, 28, 26, 25};
    }

    public abstract void A08(Map<String, String> map);

    public AbstractC3287N3(C4494gi c4494gi, AbstractC3288N4 abstractC3288N4, C4439fp c4439fp) {
        this.A02 = c4494gi;
        this.A01 = abstractC3288N4;
        this.A03 = c4439fp;
    }

    public final void A03() {
        if (this.A00) {
            return;
        }
        if (this.A01 != null) {
            this.A01.A00();
        }
        Map<String, String> extraData = new C4150b9().A03(this.A03).A05();
        A08(extraData);
        this.A00 = true;
        AbstractC3911XI.A04(this.A02, A00(0, 17, 60));
        AbstractC3288N4 abstractC3288N4 = this.A01;
    }
}

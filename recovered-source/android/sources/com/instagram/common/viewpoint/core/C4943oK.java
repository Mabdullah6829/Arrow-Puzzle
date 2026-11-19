package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oK */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4943oK implements InterfaceC24318v {
    public static byte[] A01;
    public static String[] A02 = {"", "W3zKx7uimPBnuqB79eRuk71Lq6Q9Tdtq", "pdw5IcOEDsyx", "PznYxCtiabQ1XXQUVp9BfEAYIGk6ZsUE", "E1k4hPJKfb0MvebzJOZYusmHHBWvORO7", "bmueFxdYYt0nqn8p", "GRfRtgnBgmJZB0Qq", "VS7ML1wDeymmTLeKFRcttz7uEm3bVRGQ"};
    public final /* synthetic */ C195012 A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A02[4] = "fuFs1gweK6T0kCx4bj1F2DHsk5QuVwMS";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 8);
            i5++;
        }
    }

    public static void A01() {
        A01 = new byte[]{47, 27, 10, 7, 1, 78, 29, 7, 0, 5, 78, 11, 28, 28, 1, 28, 32, 8, 9, 4, 12, 46, 2, 9, 8, 14, 44, 24, 9, 4, 2, 63, 8, 3, 9, 8, 31, 8, 31, 55, 54, 11, 52, 61, 61, 40, 24, 25, 32, 22, 28, 18, 2, 7};
    }

    static {
        A01();
    }

    public C4943oK(C195012 c195012) {
        this.A00 = c195012;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC24318v
    public final void AD6(Exception exc) {
        AbstractC21714g.A08(A00(16, 23, 101), A00(0, 16, 102), exc);
        this.A00.A0F.A0D(exc);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC24318v
    public final void AD7(C24288r c24288r) {
        this.A00.A0F.A0B(c24288r);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC24318v
    public final void AD8(C24288r c24288r) {
        this.A00.A0F.A0C(c24288r);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC24318v
    public final void AF2() {
        C195012.A05(this.A00);
        if (0 != 0) {
            C195012.A05(this.A00);
            throw new NullPointerException(A00(46, 8, 127));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC24318v
    public final void AF3() {
        C195012.A05(this.A00);
        if (0 != 0) {
            C195012.A05(this.A00);
            throw new NullPointerException(A00(39, 7, 80));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC24318v
    public final void AFN(long j2) {
        this.A00.A0F.A03(j2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC24318v
    public final void AFO() {
        this.A00.A26();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC24318v
    public final void AFy(boolean z) {
        this.A00.A0F.A0I(z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC24318v
    public final void AGJ(int i2, long j2, long j3) {
        this.A00.A0F.A01(i2, j2, j3);
    }
}

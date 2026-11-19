package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.LX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3194LX {
    public static byte[] A0B;
    public int A00;
    public int A01;
    public Integer A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{58, 51, 48, 51, 52, 60, 51};
    }

    public C3194LX(C3194LX c3194lx) {
        this.A04 = A00(0, 0, 3);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = c3194lx.A09;
        this.A08 = c3194lx.A08;
        this.A06 = c3194lx.A06;
        this.A07 = c3194lx.A07;
        this.A02 = c3194lx.A02;
        this.A03 = c3194lx.A03;
        this.A0A = c3194lx.A0A;
    }

    public C3194LX(String str) {
        this.A04 = A00(0, 0, 3);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = str;
        String strA00 = A00(0, 7, 100);
        this.A08 = strA00;
        this.A06 = strA00;
        this.A07 = strA00;
        this.A02 = null;
        this.A03 = strA00;
        this.A0A = false;
    }

    public C3194LX(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A04 = A00(0, 0, 3);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A02 = null;
        this.A03 = str5;
        this.A0A = z;
    }
}

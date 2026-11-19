package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yg */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC3997Yg {
    A08(C3446Pe.A0D, -1, -15986668, 858468406, true),
    A09(C3446Pe.A0E, Integer.MIN_VALUE, -1, 452984831, false);

    public static byte[] A05;
    public static String[] A06 = {"V62FSpXyXg0rt4sPiNo", "6lq6AHOCdAk9akPwvyC", "nqUSJeC0aIJYgUKl2CPVEyh1brd6E0Ae", "x0NdoFH36D", "29PPikSq1e", "88nHmfXS0I", "EpErG0pNHZnmsJ1", "e2q5yIycFm4TxUxK8s9XbNDHLyuGtCe3"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final boolean A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-33, -30, -15, -34, -35, -30, -24, -21, -35, -16};
    }

    static {
        A01();
    }

    EnumC3997Yg(Integer num, int i2, int i3, int i4, boolean z) {
        this.A03 = num;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A04 = z;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC3997Yg[] valuesCustom() {
        EnumC3997Yg[] enumC3997YgArr = (EnumC3997Yg[]) values().clone();
        if (A06[3].length() != 10) {
            throw new RuntimeException();
        }
        A06[3] = "b4MYrm3ZFw";
        return enumC3997YgArr;
    }
}

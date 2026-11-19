package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8U */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C24078U implements InterfaceC4828mF {
    public static byte[] A06;
    public static String[] A07 = {"QubeI9WU03qBZcNvE4IUkWvlw0NRrBK6", "F1d068LLA73yClDAGmhas6o", "9YpbVeLOd0f6m", "7Ycu3nAZXESMUbUrutcG9271koISuOhT", "QjcyZL4t35rbWMpE5hp6oYgD7sVhkS0D", "M48I8dHdEQTg0rHaHaNT6qI1", "cVfJzOsNywAlxLknvQSr1dDTMZn5TIAU", "kJeh17rnzHgOQ2HfO7oDpw4wPPnH7lFe"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long[] A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C24078U A01(long j2, long j3, C2937HN c2937hn, C21864v c21864v) {
        int iA0L;
        int i2 = c2937hn.A04;
        int i3 = c2937hn.A03;
        int iA0C = c21864v.A0C();
        if ((iA0C & 1) != 1 || (iA0L = c21864v.A0L()) == 0) {
            return null;
        }
        long jA0U = AbstractC22035C.A0U(iA0L, ((long) i2) * 1000000, i3);
        if ((iA0C & 6) != 6) {
            return new C24078U(j3, c2937hn.A02, jA0U);
        }
        long jA0Q = c21864v.A0Q();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = c21864v.A0I();
        }
        if (j2 != -1 && j2 != j3 + jA0Q) {
            AbstractC21714g.A07(A02(27, 10, 78), A02(2, 25, 105) + j2 + A02(0, 2, 40) + (j3 + jA0Q));
        }
        return new C24078U(j3, c2937hn.A02, jA0U, jA0Q, jArr);
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A07;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A07[2] = "La6";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 30);
            i5++;
        }
    }

    public static void A03() {
        A06 = new byte[]{114, 102, -33, -48, -43, -50, -89, -21, -24, -5, -24, -89, -6, -16, 1, -20, -89, -12, -16, -6, -12, -24, -5, -22, -17, -63, -89, -60, -43, -38, -45, -65, -47, -47, -41, -47, -34};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final C2947HX A91(long j2) {
        double d;
        if (!AAj()) {
            return new C2947HX(new C2949HZ(0L, this.A03 + ((long) this.A00)));
        }
        long jA0T = AbstractC22035C.A0T(j2, 0L, this.A04);
        double d2 = (jA0T * 100.0d) / this.A04;
        if (d2 <= 0.0d) {
            d = 0.0d;
        } else if (d2 >= 100.0d) {
            d = 256.0d;
        } else {
            int i2 = (int) d2;
            long[] jArr = (long[]) AbstractC21273y.A02(this.A05);
            double d3 = jArr[i2];
            d = (((i2 == 99 ? 256.0d : jArr[i2 + 1]) - d3) * (d2 - ((double) i2))) + d3;
        }
        return new C2947HX(new C2949HZ(jA0T, this.A03 + AbstractC22035C.A0T(Math.round((d / 256.0d) * this.A02), this.A00, this.A02 - 1)));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC4828mF
    public final long A9H(long j2) {
        long j3 = j2 - this.A03;
        if (!AAj() || j3 <= this.A00) {
            return 0L;
        }
        long[] jArr = (long[]) AbstractC21273y.A02(this.A05);
        double d = (j3 * 256.0d) / this.A02;
        int iA0L = AbstractC22035C.A0L(jArr, (long) d, true, true);
        long jA00 = A00(iA0L);
        long j4 = jArr[iA0L];
        long jA01 = A00(iA0L + 1);
        long j5 = iA0L == 99 ? 256L : jArr[iA0L + 1];
        String[] strArr = A07;
        if (strArr[0].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        A07[6] = "PlWtaQzxKmV3LAe12cSeUsJTirSwbfkK";
        return Math.round((jA01 - jA00) * (j4 == j5 ? 0.0d : (d - j4) / (j5 - j4))) + jA00;
    }

    static {
        A03();
    }

    public C24078U(long j2, int i2, long j3) {
        this(j2, i2, j3, -1L, null);
    }

    public C24078U(long j2, int i2, long j3, long j4, long[] jArr) {
        this.A03 = j2;
        this.A00 = i2;
        this.A04 = j3;
        this.A05 = jArr;
        this.A02 = j4;
        this.A01 = j4 != -1 ? j2 + j4 : -1L;
    }

    private long A00(int i2) {
        return (this.A04 * ((long) i2)) / 100;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4828mF
    public final long A7j() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final long A7t() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final boolean AAj() {
        return this.A05 != null;
    }
}

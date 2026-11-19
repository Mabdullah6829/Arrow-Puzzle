package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8V */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C24088V implements InterfaceC4828mF {
    public static byte[] A04;
    public final long A00;
    public final long A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C24088V A00(long j2, long j3, C2937HN c2937hn, C21864v c21864v) {
        int iA0I;
        long j4 = j3;
        c21864v.A0g(10);
        int iA0C = c21864v.A0C();
        if (iA0C <= 0) {
            return null;
        }
        int i2 = c2937hn.A03;
        long jA0U = AbstractC22035C.A0U(iA0C, ((long) (i2 >= 32000 ? 1152 : 576)) * 1000000, i2);
        int iA0M = c21864v.A0M();
        int iA0M2 = c21864v.A0M();
        int iA0M3 = c21864v.A0M();
        c21864v.A0g(2);
        long j5 = j4 + ((long) c2937hn.A02);
        long[] jArr = new long[iA0M];
        long[] jArr2 = new long[iA0M];
        for (int i3 = 0; i3 < iA0M; i3++) {
            jArr[i3] = (((long) i3) * jA0U) / ((long) iA0M);
            jArr2[i3] = Math.max(j4, j5);
            switch (iA0M3) {
                case 1:
                    iA0I = c21864v.A0I();
                    break;
                case 2:
                    iA0I = c21864v.A0M();
                    break;
                case 3:
                    iA0I = c21864v.A0K();
                    break;
                case 4:
                    iA0I = c21864v.A0L();
                    break;
                default:
                    return null;
            }
            j4 += ((long) iA0I) * ((long) iA0M2);
        }
        if (j2 != -1 && j2 != j4) {
            AbstractC21714g.A07(A01(27, 10, 89), A01(2, 25, 50) + j2 + A01(0, 2, 80) + j4);
        }
        return new C24088V(jArr, jArr2, jA0U, j4);
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-89, -101, -77, -97, -81, -90, 125, -63, -66, -47, -66, 125, -48, -58, -41, -62, 125, -54, -58, -48, -54, -66, -47, -64, -59, -105, 125, -38, -26, -10, -19, -41, -23, -23, -17, -23, -10};
    }

    public C24088V(long[] jArr, long[] jArr2, long j2, long j3) {
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A01 = j2;
        this.A00 = j3;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4828mF
    public final long A7j() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final long A7t() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final C2947HX A91(long j2) {
        int iA0L = AbstractC22035C.A0L(this.A03, j2, true, true);
        C2949HZ c2949hz = new C2949HZ(this.A03[iA0L], this.A02[iA0L]);
        if (c2949hz.A01 < j2) {
            int tableIndex = this.A03.length;
            if (iA0L != tableIndex - 1) {
                int tableIndex2 = iA0L + 1;
                long j3 = this.A03[tableIndex2];
                int tableIndex3 = iA0L + 1;
                C2949HZ nextSeekPoint = new C2949HZ(j3, this.A02[tableIndex3]);
                return new C2947HX(c2949hz, nextSeekPoint);
            }
        }
        return new C2947HX(c2949hz);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4828mF
    public final long A9H(long j2) {
        return this.A03[AbstractC22035C.A0L(this.A02, j2, true, true)];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final boolean AAj() {
        return true;
    }
}

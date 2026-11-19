package com.instagram.common.viewpoint.core;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.DL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2688DL {
    public static String[] A07 = {"1TUPUvqjuckMieKxy618dXqeho2I2nXO", "1tw", "Rv8BHxt03y9lIrpcW4kHhbfWsqmFKBVK", "r8Px", "D2vXeeTjlCXB4Odv", "hN", "uuD40", "TpLNmCJV5wG1YwTXf3toM93vl9iWeWk7"};
    public long A00;
    public C4906ni A01;
    public C4906ni A02;
    public C4906ni A03;
    public final int A04;
    public final C21864v A05 = new C21864v(32);
    public final InterfaceC2791F0 A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C4906ni A04(C4906ni c4906ni, C4985p0 c4985p0, C2690DN c2690dn, C21864v c21864v) {
        int iA0M;
        long j2 = c2690dn.A01;
        c21864v.A0d(1);
        C4906ni c4906niA03 = A03(c4906ni, j2, c21864v.A0l(), 1);
        long j3 = j2 + 1;
        byte b = c21864v.A0l()[0];
        boolean z = (b & 128) != 0;
        int i2 = b & 127;
        C22525z c22525z = c4985p0.A05;
        if (c22525z.A04 == null) {
            c22525z.A04 = new byte[16];
        } else {
            Arrays.fill(c22525z.A04, (byte) 0);
        }
        C4906ni c4906niA04 = A03(c4906niA03, j3, c22525z.A04, i2);
        long j4 = j3 + ((long) i2);
        if (z) {
            c21864v.A0d(2);
            c4906niA04 = A03(c4906niA04, j4, c21864v.A0l(), 2);
            j4 += 2;
            iA0M = c21864v.A0M();
        } else {
            iA0M = 1;
            if (A07[7].charAt(5) == 'i') {
                throw new RuntimeException();
            }
            A07[7] = "Hpyz1f8ALnZx1iP9R6alck8MxH3P54oK";
        }
        int[] iArr = c22525z.A06;
        if (iArr == null || iArr.length < iA0M) {
            iArr = new int[iA0M];
        }
        int[] iArr2 = c22525z.A07;
        if (iArr2 == null || iArr2.length < iA0M) {
            iArr2 = new int[iA0M];
        }
        if (z) {
            int i3 = iA0M * 6;
            c21864v.A0d(i3);
            c4906niA04 = A03(c4906niA04, j4, c21864v.A0l(), i3);
            j4 += (long) i3;
            c21864v.A0f(0);
            for (int i4 = 0; i4 < iA0M; i4++) {
                iArr[i4] = c21864v.A0M();
                iArr2[i4] = c21864v.A0L();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = c2690dn.A00 - ((int) (j4 - c2690dn.A01));
        }
        C2951Hb c2951Hb = (C2951Hb) AbstractC22035C.A0f(c2690dn.A02);
        c22525z.A02(iA0M, iArr, iArr2, c2951Hb.A03, c22525z.A04, c2951Hb.A01, c2951Hb.A02, c2951Hb.A00);
        int i5 = (int) (j4 - c2690dn.A01);
        c2690dn.A01 += (long) i5;
        if (A07[0].charAt(1) == 'T') {
            A07[0] = "nTpP9ibfF3cbwjVbkTA4UIhNPpZui5fl";
            c2690dn.A00 -= i5;
            return c4906niA04;
        }
        String[] strArr = A07;
        strArr[3] = "b8i1";
        strArr[6] = "bRWrT";
        c2690dn.A00 -= i5;
        return c4906niA04;
    }

    public C2688DL(InterfaceC2791F0 interfaceC2791F0) {
        this.A06 = interfaceC2791F0;
        this.A04 = interfaceC2791F0.A8I();
        this.A01 = new C4906ni(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
    }

    private int A00(int i2) {
        if (this.A03.A03 == null) {
            this.A03.A03(this.A06.A49(), new C4906ni(this.A03.A00, this.A04));
        }
        return Math.min(i2, (int) (this.A03.A00 - this.A00));
    }

    public static C4906ni A01(C4906ni c4906ni, long j2) {
        while (j2 >= c4906ni.A00) {
            c4906ni = c4906ni.A02;
        }
        return c4906ni;
    }

    public static C4906ni A02(C4906ni c4906ni, long j2, ByteBuffer byteBuffer, int i2) {
        C4906ni c4906niA01 = A01(c4906ni, j2);
        while (i2 > 0) {
            int remaining = (int) (c4906niA01.A00 - j2);
            int iMin = Math.min(i2, remaining);
            byte[] bArr = c4906niA01.A03.A01;
            int remaining2 = c4906niA01.A00(j2);
            byteBuffer.put(bArr, remaining2, iMin);
            i2 -= iMin;
            j2 += (long) iMin;
            if (j2 == c4906niA01.A00) {
                c4906niA01 = c4906niA01.A02;
            }
        }
        return c4906niA01;
    }

    public static C4906ni A03(C4906ni c4906ni, long j2, byte[] bArr, int i2) {
        C4906ni c4906niA01 = A01(c4906ni, j2);
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (c4906niA01.A00 - j2));
            byte[] bArr2 = c4906niA01.A03.A01;
            int toCopy = c4906niA01.A00(j2);
            int remaining = i2 - i3;
            System.arraycopy(bArr2, toCopy, bArr, remaining, iMin);
            i3 -= iMin;
            j2 += (long) iMin;
            if (j2 == c4906niA01.A00) {
                c4906niA01 = c4906niA01.A02;
            }
        }
        return c4906niA01;
    }

    public static C4906ni A05(C4906ni c4906ni, C4985p0 c4985p0, C2690DN c2690dn, C21864v c21864v) {
        if (c4985p0.A0E()) {
            c4906ni = A04(c4906ni, c4985p0, c2690dn, c21864v);
        }
        if (c4985p0.A03()) {
            c21864v.A0d(4);
            C4906ni c4906niA03 = A03(c4906ni, c2690dn.A01, c21864v.A0l(), 4);
            int iA0L = c21864v.A0L();
            c2690dn.A01 += 4;
            c2690dn.A00 -= 4;
            c4985p0.A0C(iA0L);
            C4906ni c4906niA02 = A02(c4906niA03, c2690dn.A01, c4985p0.A02, iA0L);
            c2690dn.A01 += (long) iA0L;
            c2690dn.A00 -= iA0L;
            c4985p0.A0D(c2690dn.A00);
            return A02(c4906niA02, c2690dn.A01, c4985p0.A03, c2690dn.A00);
        }
        c4985p0.A0C(c2690dn.A00);
        return A02(c4906ni, c2690dn.A01, c4985p0.A02, c2690dn.A00);
    }

    private void A06(int i2) {
        this.A00 += (long) i2;
        if (this.A00 == this.A03.A00) {
            this.A03 = this.A03.A02;
        }
    }

    private void A07(C4906ni c4906ni) {
        if (c4906ni.A03 == null) {
            return;
        }
        this.A06.AHe(c4906ni);
        c4906ni.A01();
    }

    public final int A08(InterfaceC20482c interfaceC20482c, int i2, boolean z) throws IOException {
        int i3 = interfaceC20482c.read(this.A03.A03.A01, this.A03.A00(this.A00), A00(i2));
        if (i3 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        A06(i3);
        return i3;
    }

    public final long A09() {
        return this.A00;
    }

    public final void A0A() {
        A07(this.A01);
        this.A01.A02(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
        this.A00 = 0L;
        this.A06.AKT();
    }

    public final void A0B() {
        this.A02 = this.A01;
    }

    public final void A0C(long j2) {
        if (j2 == -1) {
            return;
        }
        while (j2 >= this.A01.A00) {
            this.A06.AHd(this.A01.A03);
            this.A01 = this.A01.A01();
        }
        long j3 = this.A02.A01;
        long j4 = this.A01.A01;
        String[] strArr = A07;
        if (strArr[3].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[3] = "kTcq";
        strArr2[6] = "Dj6YZ";
        if (j3 < j4) {
            this.A02 = this.A01;
        }
    }

    public final void A0D(C21864v c21864v, int i2) {
        while (i2 > 0) {
            int iA00 = A00(i2);
            byte[] bArr = this.A03.A03.A01;
            int bytesAppended = this.A03.A00(this.A00);
            c21864v.A0k(bArr, bytesAppended, iA00);
            i2 -= iA00;
            A06(iA00);
        }
    }

    public final void A0E(C4985p0 c4985p0, C2690DN c2690dn) {
        A05(this.A02, c4985p0, c2690dn, this.A05);
    }

    public final void A0F(C4985p0 c4985p0, C2690DN c2690dn) {
        this.A02 = A05(this.A02, c4985p0, c2690dn, this.A05);
    }
}

package com.instagram.common.viewpoint.core;

import androidx.constraintlayout.widget.C1137R;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.L6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3167L6 {
    public static byte[] A08;
    public static String[] A09 = {"voRQ6Eoiy", "dM5sUr3BWW4nkGo5nRVfbphD0FkiLgeI", "t4ngtozvUcRON5qFCPMw9NZHviWOcz8N", "2o", "HR4o0SgaegzvmEvMyBsSV3cy", "Fxd3YqblXENYapC", "iFe6DhKEBr1iW4qwRCto7Lk6hMgexe67", "drzzj9o5hc6Li6ZR2JGiBSJ"};
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C219453 A07 = new C219453(0);
    public long A01 = -9223372036854775807L;
    public long A02 = -9223372036854775807L;
    public long A00 = -9223372036854775807L;
    public final C21864v A06 = new C21864v();

    public static String A08(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{-19, -33, 20, 50, 40, 45, 38, -33, 19, 8, 12, 4, 30, 20, 13, 18, 4, 19, -33, 40, 45, 50, 51, 36, 32, 35, -19, 18, 55, 63, 42, 53, 50, 45, -23, 45, 62, 59, 42, 61, 50, 56, 55, 3, -23, 22, 57, 10, 59, 56, 39, 58, 47, 53, 52, 24, 43, 39, 42, 43, 56};
    }

    static {
        A09();
    }

    private int A00(InterfaceC4855ms interfaceC4855ms) {
        this.A06.A0i(AbstractC22035C.A07);
        this.A03 = true;
        interfaceC4855ms.AIl();
        return 0;
    }

    private int A01(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        int iMin = (int) Math.min(20000L, interfaceC4855ms.A8O());
        if (interfaceC4855ms.A8n() != 0) {
            c2945hv.A00 = 0;
            return 1;
        }
        C21864v c21864v = this.A06;
        int bytesToSearch = A09[6].length();
        if (bytesToSearch == 30) {
            throw new RuntimeException();
        }
        A09[6] = "JjjcAHcIe3bphcpehmdhx0lOvmd2";
        c21864v.A0d(iMin);
        interfaceC4855ms.AIl();
        interfaceC4855ms.AGt(this.A06.A0l(), 0, iMin);
        this.A01 = A04(this.A06);
        this.A04 = true;
        return 0;
    }

    private int A02(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        long jA8O = interfaceC4855ms.A8O();
        int iMin = (int) Math.min(20000L, jA8O);
        long j2 = jA8O - ((long) iMin);
        long searchStartPosition = interfaceC4855ms.A8n();
        if (searchStartPosition != j2) {
            c2945hv.A00 = j2;
            return 1;
        }
        this.A06.A0d(iMin);
        interfaceC4855ms.AIl();
        interfaceC4855ms.AGt(this.A06.A0l(), 0, iMin);
        long inputLength = A05(this.A06);
        this.A02 = inputLength;
        this.A05 = true;
        return 0;
    }

    private int A03(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8) | (bArr[i2 + 3] & 255);
    }

    private long A04(C21864v c21864v) {
        int iA0A = c21864v.A0A();
        for (int iA09 = c21864v.A09(); iA09 < searchStartPosition; iA09++) {
            int searchEndPosition = A03(c21864v.A0l(), iA09);
            if (searchEndPosition == 442) {
                int searchStartPosition = iA09 + 4;
                c21864v.A0f(searchStartPosition);
                long jA06 = A06(c21864v);
                if (jA06 != -9223372036854775807L) {
                    return jA06;
                }
            }
        }
        return -9223372036854775807L;
    }

    private long A05(C21864v c21864v) {
        int iA09 = c21864v.A09();
        int searchStartPosition = c21864v.A0A();
        for (int nextStartCode = searchStartPosition - 4; nextStartCode >= iA09; nextStartCode--) {
            int searchEndPosition = A03(c21864v.A0l(), nextStartCode);
            if (searchEndPosition == 442) {
                int searchStartPosition2 = nextStartCode + 4;
                c21864v.A0f(searchStartPosition2);
                long jA06 = A06(c21864v);
                int searchEndPosition2 = A09[1].charAt(26);
                if (searchEndPosition2 != 107) {
                    throw new RuntimeException();
                }
                A09[6] = "fZ";
                if (jA06 != -9223372036854775807L) {
                    return jA06;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long A06(C21864v c21864v) {
        int iA09 = c21864v.A09();
        if (c21864v.A07() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        int originalPosition = bArr.length;
        c21864v.A0k(bArr, 0, originalPosition);
        c21864v.A0f(iA09);
        if (A0A(bArr)) {
            return A07(bArr);
        }
        return -9223372036854775807L;
    }

    public static long A07(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public static boolean A0A(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public final int A0B(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        if (!this.A05) {
            return A02(interfaceC4855ms, c2945hv);
        }
        if (this.A02 == -9223372036854775807L) {
            return A00(interfaceC4855ms);
        }
        if (!this.A04) {
            return A01(interfaceC4855ms, c2945hv);
        }
        if (this.A01 == -9223372036854775807L) {
            return A00(interfaceC4855ms);
        }
        this.A00 = this.A07.A06(this.A02) - this.A07.A06(this.A01);
        if (this.A00 < 0) {
            AbstractC21714g.A07(A08(45, 16, C1137R.styleable.ConstraintSet_quantizeMotionSteps), A08(27, 18, C1137R.styleable.ConstraintSet_transitionPathRotate) + this.A00 + A08(0, 27, 112));
            this.A00 = -9223372036854775807L;
        }
        return A00(interfaceC4855ms);
    }

    public final long A0C() {
        return this.A00;
    }

    public final C219453 A0D() {
        return this.A07;
    }

    public final boolean A0E() {
        return this.A03;
    }
}

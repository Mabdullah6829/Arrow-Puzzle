package com.instagram.common.viewpoint.core;

import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4765lE implements InterfaceC3178LH {
    public static byte[] A0C;
    public static String[] A0D = {"PKE6bUnMb8YRJi5c3EKctidvnGObkWUW", "Sj6HMP0SOTonM2", "QNuElofm8mn1vxmEMVf480D516cE6c1A", "mo3DY2i4ZftrkN8KZEKpxWPbRUkrlx1j", "gCiGT026Vp", "", "zTp2xHG3y1GADYyWqYlevGmnNqTbrtlk", "l459osJydpsPWra20sllrfS"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C219453 A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC3156Kv A0B;
    public final C21854u A0A = new C21854u(new byte[10]);
    public int A03 = 0;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{-23, 54, 56, 59, 46, -23, 43, 66, 61, 46, 60, 49, 90, 96, 89, 79, 11, 89, 80, 82, 76, 95, 84, 97, 80, 11, 91, 76, 78, 86, 80, 95, 11, 91, 76, 100, 87, 90, 76, 79, 11, 94, 84, 101, 80, 37, 11, 36, 57, 71, 38, 57, 53, 56, 57, 70, -7, 18, 9, 28, 20, 9, 7, 24, 9, 8, -60, 23, 24, 5, 22, 24, -60, 7, 19, 8, 9, -60, 20, 22, 9, 10, 13, 28, -34, -60, 11, 36, 27, 46, 38, 27, 25, 42, 27, 26, -42, 41, 42, 23, 40, 42, -42, 31, 36, 26, 31, 25, 23, 42, 37, 40, -42, 40, 27, 23, 26, 31, 36, 29, -42, 27, 46, 42, 27, 36, 26, 27, 26, -42, 30, 27, 23, 26, 27, 40, 4, 29, 20, 39, 31, 20, 18, 35, 20, 19, -49, 34, 35, 16, 33, 35, -49, 24, 29, 19, 24, 18, 16, 35, 30, 33, -23, -49, 20, 39, 31, 20, 18, 35, 20, 19, -49};
    }

    static {
        A02();
    }

    public C4765lE(InterfaceC3156Kv interfaceC3156Kv) {
        this.A0B = interfaceC3156Kv;
    }

    @RequiresNonNull({"timestampAdjuster"})
    private void A01() {
        this.A0A.A08(0);
        this.A04 = -9223372036854775807L;
        if (this.A08) {
            this.A0A.A09(4);
            long jA04 = ((long) this.A0A.A04(3)) << 30;
            this.A0A.A09(1);
            long pts = this.A0A.A04(15) << 15;
            long j2 = jA04 | pts;
            this.A0A.A09(1);
            long pts2 = this.A0A.A04(15);
            long j3 = j2 | pts2;
            this.A0A.A09(1);
            if (!this.A09 && this.A07) {
                this.A0A.A09(4);
                long pts3 = this.A0A.A04(3);
                this.A0A.A09(1);
                long pts4 = (pts3 << 30) | ((long) (this.A0A.A04(15) << 15));
                this.A0A.A09(1);
                long pts5 = pts4 | ((long) this.A0A.A04(15));
                this.A0A.A09(1);
                this.A05.A06(pts5);
                this.A09 = true;
            }
            this.A04 = this.A05.A06(j3);
        }
    }

    private void A03(int i2) {
        this.A03 = i2;
        this.A00 = 0;
    }

    private boolean A04() {
        this.A0A.A08(0);
        int iA04 = this.A0A.A04(24);
        String strA00 = A00(47, 9, 94);
        if (iA04 != 1) {
            AbstractC21714g.A07(strA00, A00(56, 30, 46) + iA04);
            this.A02 = -1;
            return false;
        }
        this.A0A.A09(8);
        int iA05 = this.A0A.A04(16);
        this.A0A.A09(5);
        this.A06 = this.A0A.A0H();
        this.A0A.A09(2);
        this.A08 = this.A0A.A0H();
        this.A07 = this.A0A.A0H();
        this.A0A.A09(6);
        int startCodePrefix = this.A0A.A04(8);
        this.A01 = startCodePrefix;
        if (iA05 == 0) {
            this.A02 = -1;
        } else {
            int startCodePrefix2 = iA05 + 6;
            int packetLength = startCodePrefix2 - 9;
            int startCodePrefix3 = this.A01;
            this.A02 = packetLength - startCodePrefix3;
            int startCodePrefix4 = this.A02;
            if (startCodePrefix4 < 0) {
                StringBuilder sbAppend = new StringBuilder().append(A00(11, 36, C1137R.styleable.ConstraintSet_pivotAnchor));
                int startCodePrefix5 = this.A02;
                AbstractC21714g.A07(strA00, sbAppend.append(startCodePrefix5).toString());
                this.A02 = -1;
            }
        }
        return true;
    }

    private boolean A05(C21864v c21864v, byte[] bArr, int i2) {
        int iMin = Math.min(c21864v.A07(), i2 - this.A00);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c21864v.A0g(iMin);
        } else {
            int bytesToRead = this.A00;
            c21864v.A0k(bArr, bytesToRead, iMin);
        }
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.instagram.common.viewpoint.core.InterfaceC3178LH
    public final void A5B(C21864v c21864v, int i2) throws C20883K {
        AbstractC21273y.A02(this.A05);
        if ((i2 & 1) != 0) {
            int i3 = this.A03;
            String strA00 = A00(47, 9, 94);
            switch (i3) {
                case 0:
                case 1:
                    A03(1);
                    break;
                case 2:
                    AbstractC21714g.A07(strA00, A00(86, 50, 64));
                    A03(1);
                    break;
                case 3:
                    if (this.A02 != -1) {
                        AbstractC21714g.A07(strA00, A00(136, 37, 57) + this.A02 + A00(0, 11, 83));
                    }
                    this.A0B.AGp();
                    A03(1);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
        while (c21864v.A07() > 0) {
            int i4 = 0;
            switch (this.A03) {
                case 0:
                    c21864v.A0g(c21864v.A07());
                    break;
                case 1:
                    if (A05(c21864v, this.A0A.A00, 9)) {
                        boolean zA04 = A04();
                        if (A0D[5].length() != 12) {
                            A0D[6] = "QQT4Wvnf7PZI1aBOQkpVRuEJ9a4y7TW0";
                            A03(zA04 ? 2 : 0);
                        }
                    } else {
                        continue;
                    }
                    break;
                case 2:
                    int iMin = Math.min(10, this.A01);
                    byte[] bArr = this.A0A.A00;
                    if (A0D[1].length() != 20) {
                        A0D[4] = "l8YJPAfB3X";
                        if (A05(c21864v, bArr, iMin) && A05(c21864v, null, this.A01)) {
                            A01();
                            i2 |= this.A06 ? 4 : 0;
                            this.A0B.AGq(this.A04, i2);
                            A03(3);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                    break;
                case 3:
                    int iA07 = c21864v.A07();
                    int readLength = this.A02;
                    if (readLength != -1) {
                        int readLength2 = this.A02;
                        i4 = iA07 - readLength2;
                    }
                    if (i4 > 0) {
                        iA07 -= i4;
                        int iA09 = c21864v.A09() + iA07;
                        if (A0D[6].charAt(7) != '6') {
                            A0D[2] = "lFx9fkjTnk1xSHr5wh3B5PMDNRGZ6lqn";
                            c21864v.A0e(iA09);
                        }
                    }
                    this.A0B.A5A(c21864v);
                    int readLength3 = this.A02;
                    if (readLength3 != -1) {
                        int readLength4 = this.A02;
                        this.A02 = readLength4 - iA07;
                        int readLength5 = this.A02;
                        if (readLength5 == 0) {
                            this.A0B.AGp();
                            A03(1);
                        }
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
            throw new RuntimeException();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3178LH
    public final void AAA(C219453 c219453, InterfaceC2924HA interfaceC2924HA, C3177LG c3177lg) {
        this.A05 = c219453;
        this.A0B.A5c(interfaceC2924HA, c3177lg);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3178LH
    public final void AJ5() {
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A0B.AJ5();
    }
}

package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4772lL implements InterfaceC3156Kv {
    public static byte[] A0B;
    public static String[] A0C = {"Sri33Nkjg2q1UfSTa8c1c4poMbcRpRLi", "09hX7cFAjusi8bmxYUkedKuhTIWBBFyj", "9Nq5ciBjH0E2wAdqO8kDicSSF4ASqfED", "QsWxT4gaPPGppGCvyiz5txfiFuAY8zGx", "IfMd", "WTVPPiGNk6qIrjWgxgkH9oFnGfUzUO7U", "kZSjpU6etDs1IBDvrqsQrqQjBcHBIo8z", "H6v3RmW3GvMpIK1G5kWvIHPLiCmsEM1C"};
    public static final float[] A0D;
    public long A00;
    public long A01;
    public InterfaceC2953Hd A02;
    public C3160Kz A03;
    public String A04;
    public boolean A05;
    public final C21864v A06;
    public final C3159Ky A07;
    public final C3165L4 A08;
    public final C3180LJ A09;
    public final boolean[] A0A;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 69);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0B = new byte[]{66, 56, 60, 57, 88, 111, 107, 110, 111, 120, 18, 53, 45, 58, 55, 50, 63, 123, 58, 40, 43, 62, 56, 47, 123, 41, 58, 47, 50, 52, 125, 90, 66, 85, 88, 93, 80, 20, 66, 91, 68, 107, 93, 90, 87, 70, 81, 89, 81, 90, 64, 107, 64, 93, 89, 81, 107, 70, 81, 71, 91, 88, 65, 64, 93, 91, 90, 77, 118, 112, 121, 118, 124, 116, 125, 124, 56, 110, 113, 124, 125, 119, 56, 119, 122, 114, 125, 123, 108, 56, 116, 121, 97, 125, 106, 56, 107, 112, 121, 104, 125, 45, 50, 63, 62, 52, 116, 54, 43, 111, 45, 118, 62, 40};
    }

    static {
        A02();
        A0D = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    }

    public C4772lL() {
        this(null);
    }

    public C4772lL(C3180LJ c3180lj) {
        this.A09 = c3180lj;
        this.A0A = new boolean[4];
        this.A07 = new C3159Ky(128);
        this.A00 = -9223372036854775807L;
        if (c3180lj != null) {
            this.A08 = new C3165L4(178, 128);
            this.A06 = new C21864v();
        } else {
            this.A08 = null;
            this.A06 = null;
        }
    }

    public static C5064qI A00(C3159Ky c3159Ky, int i2, String str) {
        float f2;
        byte[] bArrCopyOf = Arrays.copyOf(c3159Ky.A02, c3159Ky.A00);
        C21854u c21854u = new C21854u(bArrCopyOf);
        c21854u.A0A(i2);
        c21854u.A0A(4);
        c21854u.A07();
        c21854u.A09(8);
        if (c21854u.A0H()) {
            c21854u.A09(4);
            c21854u.A09(3);
        }
        int iA04 = c21854u.A04(4);
        String strA01 = A01(10, 20, 30);
        String strA02 = A01(0, 10, 79);
        if (iA04 == 15) {
            int iA05 = c21854u.A04(8);
            String[] strArr = A0C;
            if (strArr[1].charAt(10) != strArr[6].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[1] = "pNVnHJusVCsmPjFYzkWaaBxpUvIALZFH";
            strArr2[6] = "5W5bueKBkmsFSlOt61KpehVGJe26nslO";
            int iA06 = c21854u.A04(8);
            if (iA06 == 0) {
                AbstractC21714g.A07(strA02, strA01);
                f2 = 1.0f;
            } else {
                f2 = iA05 / iA06;
            }
        } else if (iA04 < A0D.length) {
            f2 = A0D[iA04];
        } else {
            AbstractC21714g.A07(strA02, strA01);
            f2 = 1.0f;
        }
        if (c21854u.A0H()) {
            c21854u.A09(2);
            c21854u.A09(1);
            boolean zA0H = c21854u.A0H();
            if (A0C[2].charAt(24) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr3 = A0C;
            strArr3[1] = "a7iwuG0S7TsvBO2g0yc87XIFTOWCV0GN";
            strArr3[6] = "G4F0gcHQBssTN40k2zdU8kwKQEhYA5ZF";
            if (zA0H) {
                c21854u.A09(15);
                c21854u.A07();
                c21854u.A09(15);
                c21854u.A07();
                c21854u.A09(15);
                c21854u.A07();
                c21854u.A09(3);
                c21854u.A09(11);
                c21854u.A07();
                c21854u.A09(15);
                c21854u.A07();
            }
        }
        if (c21854u.A04(2) != 0) {
            AbstractC21714g.A07(strA02, A01(67, 34, 93));
        }
        c21854u.A07();
        int iA07 = c21854u.A04(16);
        c21854u.A07();
        if (c21854u.A0H()) {
            if (iA07 == 0) {
                AbstractC21714g.A07(strA02, A01(30, 37, 113));
            } else {
                int i3 = 0;
                for (int i4 = iA07 - 1; i4 > 0; i4 >>= 1) {
                    i3++;
                }
                c21854u.A09(i3);
            }
        }
        c21854u.A07();
        int videoObjectLayerWidth = c21854u.A04(13);
        c21854u.A07();
        int iA08 = c21854u.A04(13);
        c21854u.A07();
        c21854u.A07();
        return new C20592p().A0y(str).A11(A01(101, 13, 30)).A0r(videoObjectLayerWidth).A0f(iA08).A0Y(f2).A12(Collections.singletonList(bArrCopyOf)).A14();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00df  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x011f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0129  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099 A[EDGE_INSN: B:48:0x0099->B:24:0x0099 BREAK  A[LOOP:0: B:3:0x0029->B:45:0x012e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x012e A[SYNTHETIC] */
    @Override // com.instagram.common.viewpoint.core.InterfaceC3156Kv
    public final void A5A(C21864v c21864v) {
        int i2;
        int offset;
        C3165L4 c3165l4;
        int limit;
        AbstractC21273y.A02(this.A03);
        AbstractC21273y.A02(this.A02);
        int iA09 = c21864v.A09();
        int iA0A = c21864v.A0A();
        byte[] bArrA0l = c21864v.A0l();
        long j2 = this.A01;
        int offset2 = c21864v.A07();
        this.A01 = j2 + ((long) offset2);
        InterfaceC2953Hd interfaceC2953Hd = this.A02;
        int offset3 = c21864v.A07();
        interfaceC2953Hd.AIr(c21864v, offset3);
        while (true) {
            int lengthToStartCode = AbstractC2942HS.A04(bArrA0l, iA09, iA0A, this.A0A);
            if (lengthToStartCode == iA0A) {
                if (!this.A05) {
                    C3159Ky c3159Ky = this.A07;
                    int limit2 = A0C[7].charAt(0);
                    if (limit2 == 51) {
                        break;
                    }
                    A0C[4] = "80MY";
                    c3159Ky.A03(bArrA0l, iA09, iA0A);
                }
                this.A03.A03(bArrA0l, iA09, iA0A);
                if (this.A08 != null) {
                    this.A08.A02(bArrA0l, iA09, iA0A);
                    return;
                }
                return;
            }
            int offset4 = lengthToStartCode + 3;
            int startCodeValue = c21864v.A0l()[offset4] & 255;
            int i3 = lengthToStartCode - iA09;
            if (!this.A05) {
                if (i3 > 0) {
                    this.A07.A03(bArrA0l, iA09, lengthToStartCode);
                }
                int limit3 = i3 < 0 ? -i3 : 0;
                if (this.A07.A04(startCodeValue, limit3)) {
                    InterfaceC2953Hd interfaceC2953Hd2 = this.A02;
                    C3159Ky c3159Ky2 = this.A07;
                    String[] strArr = A0C;
                    String str = strArr[1];
                    String str2 = strArr[6];
                    int limit4 = str.charAt(10);
                    int offset5 = str2.charAt(10);
                    if (limit4 != offset5) {
                        break;
                    }
                    String[] strArr2 = A0C;
                    strArr2[1] = "jCMcU5kX01siyiD9Xw2jZ38LNAQD3esf";
                    strArr2[6] = "NTL8nbB45bsjwa3rfW6th5wXRcuqzfwM";
                    int limit5 = this.A07.A01;
                    interfaceC2953Hd2.A6e(A00(c3159Ky2, limit5, (String) AbstractC21273y.A01(this.A04)));
                    this.A05 = true;
                    this.A03.A03(bArrA0l, iA09, lengthToStartCode);
                    if (this.A08 != null) {
                        i2 = 0;
                        if (i3 > 0) {
                            c3165l4 = this.A08;
                            limit = A0C[4].length();
                            if (limit != 4) {
                                break;
                                break;
                            } else {
                                A0C[2] = "pGtfbhZ8gA4Y3zya71EFVTXhFPoVLYfI";
                                c3165l4.A02(bArrA0l, iA09, lengthToStartCode);
                            }
                        } else {
                            i2 = -i3;
                        }
                        if (this.A08.A04(i2)) {
                            byte[] bArr = this.A08.A01;
                            int offset6 = this.A08.A00;
                            ((C21864v) AbstractC22035C.A0f(this.A06)).A0j(this.A08.A01, AbstractC2942HS.A02(bArr, offset6));
                            ((C3180LJ) AbstractC22035C.A0f(this.A09)).A02(this.A00, this.A06);
                        }
                        if (startCodeValue == 178) {
                            offset = lengthToStartCode + 2;
                            if (c21864v.A0l()[offset] == 1) {
                                this.A08.A01(startCodeValue);
                            }
                        }
                    }
                    int i4 = iA0A - lengthToStartCode;
                    this.A03.A02(this.A01 - ((long) i4), i4, this.A05);
                    this.A03.A01(startCodeValue, this.A00);
                    iA09 = lengthToStartCode + 3;
                } else {
                    this.A03.A03(bArrA0l, iA09, lengthToStartCode);
                    if (this.A08 != null) {
                        i2 = 0;
                        if (i3 > 0) {
                            c3165l4 = this.A08;
                            limit = A0C[4].length();
                            if (limit != 4) {
                                break;
                                break;
                            } else {
                                A0C[2] = "pGtfbhZ8gA4Y3zya71EFVTXhFPoVLYfI";
                                c3165l4.A02(bArrA0l, iA09, lengthToStartCode);
                            }
                        } else {
                            i2 = -i3;
                        }
                        if (this.A08.A04(i2)) {
                            byte[] bArr2 = this.A08.A01;
                            int offset7 = this.A08.A00;
                            ((C21864v) AbstractC22035C.A0f(this.A06)).A0j(this.A08.A01, AbstractC2942HS.A02(bArr2, offset7));
                            ((C3180LJ) AbstractC22035C.A0f(this.A09)).A02(this.A00, this.A06);
                        }
                        if (startCodeValue == 178) {
                            offset = lengthToStartCode + 2;
                            if (c21864v.A0l()[offset] == 1) {
                                this.A08.A01(startCodeValue);
                            }
                        }
                    }
                    int i5 = iA0A - lengthToStartCode;
                    this.A03.A02(this.A01 - ((long) i5), i5, this.A05);
                    this.A03.A01(startCodeValue, this.A00);
                    iA09 = lengthToStartCode + 3;
                }
            } else {
                this.A03.A03(bArrA0l, iA09, lengthToStartCode);
                if (this.A08 != null) {
                    i2 = 0;
                    if (i3 > 0) {
                        c3165l4 = this.A08;
                        limit = A0C[4].length();
                        if (limit != 4) {
                            break;
                        }
                        A0C[2] = "pGtfbhZ8gA4Y3zya71EFVTXhFPoVLYfI";
                        c3165l4.A02(bArrA0l, iA09, lengthToStartCode);
                    } else {
                        i2 = -i3;
                    }
                    if (this.A08.A04(i2)) {
                        byte[] bArr3 = this.A08.A01;
                        int offset8 = this.A08.A00;
                        ((C21864v) AbstractC22035C.A0f(this.A06)).A0j(this.A08.A01, AbstractC2942HS.A02(bArr3, offset8));
                        ((C3180LJ) AbstractC22035C.A0f(this.A09)).A02(this.A00, this.A06);
                    }
                    if (startCodeValue == 178) {
                        offset = lengthToStartCode + 2;
                        if (c21864v.A0l()[offset] == 1) {
                            this.A08.A01(startCodeValue);
                        }
                    }
                }
                int i6 = iA0A - lengthToStartCode;
                this.A03.A02(this.A01 - ((long) i6), i6, this.A05);
                this.A03.A01(startCodeValue, this.A00);
                iA09 = lengthToStartCode + 3;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3156Kv
    public final void A5c(InterfaceC2924HA interfaceC2924HA, C3177LG c3177lg) {
        c3177lg.A05();
        this.A04 = c3177lg.A04();
        this.A02 = interfaceC2924HA.AKS(c3177lg.A03(), 2);
        this.A03 = new C3160Kz(this.A02);
        if (this.A09 != null) {
            this.A09.A03(interfaceC2924HA, c3177lg);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3156Kv
    public final void AGp() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3156Kv
    public final void AGq(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.A00 = j2;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3156Kv
    public final void AJ5() {
        AbstractC2942HS.A0H(this.A0A);
        this.A07.A02();
        if (this.A03 != null) {
            this.A03.A00();
        }
        if (this.A08 != null) {
            this.A08.A00();
        }
        if (A0C[4].length() != 4) {
            throw new RuntimeException();
        }
        A0C[2] = "KHBnxT5PT6gCJIZCrRbgphkbFp7MF5Ts";
        this.A01 = 0L;
        this.A00 = -9223372036854775807L;
    }
}

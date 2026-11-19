package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgr {

    /* JADX INFO: renamed from: a */
    public static final byte[] f18091a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final float[] f18092b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c */
    public static final Object f18093c = new Object();

    /* JADX INFO: renamed from: d */
    public static int[] f18094d = new int[10];

    /* JADX INFO: renamed from: a */
    public static int m7080a(int i2, byte[] bArr) {
        int i3;
        synchronized (f18093c) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    try {
                        if (i4 >= i2 - 2) {
                            i4 = i2;
                            break;
                        }
                        int i6 = i4 + 1;
                        if (bArr[i4] == 0 && bArr[i6] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4 = i6;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = f18094d;
                    int length = iArr.length;
                    if (length <= i5) {
                        f18094d = Arrays.copyOf(iArr, length + length);
                    }
                    f18094d[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = f18094d[i9] - i7;
                System.arraycopy(bArr, i7, bArr, i8, i10);
                int i11 = i8 + i10;
                int i12 = i11 + 1;
                bArr[i11] = 0;
                i8 = i11 + 2;
                bArr[i12] = 0;
                i7 += i10 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i8, i3 - i8);
        }
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public static int m7081b(zzv zzvVar) {
        String strM7091l = m7091l(zzvVar);
        if (Objects.equals(strM7091l, "video/avc")) {
            return 1;
        }
        return (Objects.equals(strM7091l, "video/hevc") || Objects.equals(strM7091l, "video/vvc")) ? 2 : 0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7082c(byte[] bArr, int i2, zzv zzvVar) {
        int i3;
        String str = zzvVar.f21061o;
        if (Objects.equals(str, "video/avc")) {
            byte b = bArr[4];
            if (((b & 96) >> 5) == 0 && ((i3 = b & 31) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, "video/hevc")) {
            zzgf zzgfVarM7088i = m7088i(new zzgy(bArr, 4, i2 + 4));
            int i4 = zzgfVarM7088i.f17123a;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && zzgfVarM7088i.f17125c == zzvVar.f21036F - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0188  */
    /* JADX WARN: Code duplicated, block: B:102:0x018d  */
    /* JADX WARN: Code duplicated, block: B:105:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01db  */
    /* JADX WARN: Code duplicated, block: B:116:0x01de  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:125:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:128:0x0206  */
    /* JADX WARN: Code duplicated, block: B:131:0x020d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0219  */
    /* JADX WARN: Code duplicated, block: B:136:0x0239  */
    /* JADX WARN: Code duplicated, block: B:141:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX WARN: Code duplicated, block: B:90:0x015f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0165  */
    /* JADX WARN: Code duplicated, block: B:94:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0181  */
    /* JADX WARN: Code duplicated, block: B:99:0x0184  */
    /* JADX INFO: renamed from: d */
    public static zzgq m7083d(byte[] bArr, int i2, int i3) {
        int iM7258g;
        int i4;
        int i5;
        int iM7258g2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iM7257f;
        int i11;
        int i12;
        int iM7258g3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f2;
        int i18;
        float f3;
        int iM8028b;
        int iM8029c;
        boolean zM7255d;
        boolean zM7255d2;
        int iM7256e;
        int iM7256e2;
        int i19;
        zzgy zzgyVar = new zzgy(bArr, i2, i3);
        int iM7256e3 = zzgyVar.m7256e(8);
        int iM7256e4 = zzgyVar.m7256e(8);
        int iM7256e5 = zzgyVar.m7256e(8);
        int iM7258g4 = zzgyVar.m7258g();
        if (iM7256e3 == 100 || iM7256e3 == 110 || iM7256e3 == 122 || iM7256e3 == 244 || iM7256e3 == 44 || iM7256e3 == 83 || iM7256e3 == 86 || iM7256e3 == 118 || iM7256e3 == 128) {
            iM7258g = zzgyVar.m7258g();
            if (iM7258g == 3) {
                zzgyVar.m7255d();
                i4 = 3;
            } else {
                i4 = iM7258g;
            }
            i5 = 16;
            iM7258g2 = zzgyVar.m7258g();
            int iM7258g5 = zzgyVar.m7258g();
            zzgyVar.m7252a();
            if (zzgyVar.m7255d()) {
                if (i4 != 3) {
                    i7 = 8;
                } else {
                    i7 = 12;
                }
                for (i8 = 0; i8 < i7; i8++) {
                    if (!zzgyVar.m7255d()) {
                        if (i8 < 6) {
                            i9 = 16;
                        } else {
                            i9 = 64;
                        }
                        iM7257f = 8;
                        i11 = 8;
                        for (i10 = 0; i10 < i9; i10++) {
                            if (iM7257f != 0) {
                                iM7257f = ((zzgyVar.m7257f() + i11) + 256) % 256;
                            }
                            if (iM7257f != 0) {
                                i11 = iM7257f;
                            }
                        }
                    }
                }
            }
            i6 = iM7258g5;
        } else if (iM7256e3 == 138) {
            iM7256e3 = 138;
            iM7258g = zzgyVar.m7258g();
            if (iM7258g == 3) {
                zzgyVar.m7255d();
                i4 = 3;
            } else {
                i4 = iM7258g;
            }
            i5 = 16;
            iM7258g2 = zzgyVar.m7258g();
            int iM7258g6 = zzgyVar.m7258g();
            zzgyVar.m7252a();
            if (zzgyVar.m7255d()) {
                if (i4 != 3) {
                    i7 = 8;
                } else {
                    i7 = 12;
                }
                while (i8 < i7) {
                    if (!zzgyVar.m7255d()) {
                        if (i8 < 6) {
                            i9 = 16;
                        } else {
                            i9 = 64;
                        }
                        iM7257f = 8;
                        i11 = 8;
                        while (i10 < i9) {
                            if (iM7257f != 0) {
                                iM7257f = ((zzgyVar.m7257f() + i11) + 256) % 256;
                            }
                            if (iM7257f != 0) {
                                i11 = iM7257f;
                            }
                        }
                    }
                }
            }
            i6 = iM7258g6;
        } else {
            iM7258g = 1;
            i5 = 16;
            i6 = 0;
            iM7258g2 = 0;
        }
        zzgyVar.m7258g();
        int iM7258g7 = zzgyVar.m7258g();
        if (iM7258g7 == 0) {
            zzgyVar.m7258g();
        } else if (iM7258g7 == 1) {
            zzgyVar.m7255d();
            zzgyVar.m7257f();
            zzgyVar.m7257f();
            long jM7258g = zzgyVar.m7258g();
            for (int i20 = 0; i20 < jM7258g; i20++) {
                zzgyVar.m7258g();
            }
        }
        zzgyVar.m7258g();
        zzgyVar.m7252a();
        int iM7258g8 = zzgyVar.m7258g() + 1;
        int iM7258g9 = zzgyVar.m7258g() + 1;
        boolean zM7255d3 = zzgyVar.m7255d();
        int i21 = 2 - (zM7255d3 ? 1 : 0);
        if (!zM7255d3) {
            zzgyVar.m7252a();
        }
        zzgyVar.m7252a();
        int i22 = iM7258g8 * 16;
        int i23 = iM7258g9 * i21 * 16;
        if (zzgyVar.m7255d()) {
            int iM7258g10 = zzgyVar.m7258g();
            int iM7258g11 = zzgyVar.m7258g();
            int iM7258g12 = zzgyVar.m7258g();
            int iM7258g13 = zzgyVar.m7258g();
            if (iM7258g == 0) {
                i19 = 1;
            } else {
                i19 = iM7258g == 3 ? 1 : 2;
                i21 *= iM7258g == 1 ? 2 : 1;
            }
            i22 -= (iM7258g10 + iM7258g11) * i19;
            i23 -= (iM7258g12 + iM7258g13) * i21;
        }
        int i24 = i22;
        if (iM7256e3 != 44 && iM7256e3 != 86 && iM7256e3 != 100 && iM7256e3 != 110 && iM7256e3 != 122) {
            if (iM7256e3 == 244) {
                i12 = 244;
            } else {
                iM7258g3 = i5;
                i13 = iM7256e3;
            }
            i14 = -1;
            if (zzgyVar.m7255d()) {
                if (zzgyVar.m7255d()) {
                    iM7256e = zzgyVar.m7256e(8);
                    if (iM7256e == 255) {
                        int i25 = i5;
                        iM7256e2 = zzgyVar.m7256e(i25);
                        int iM7256e6 = zzgyVar.m7256e(i25);
                        if (iM7256e2 != 0 || iM7256e6 == 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = iM7256e2 / iM7256e6;
                        }
                    } else if (iM7256e < 17) {
                        f3 = f18092b[iM7256e];
                    } else {
                        AbstractC5152f.m3776h(new StringBuilder(String.valueOf(iM7256e).length() + 35), "Unexpected aspect_ratio_idc value: ", iM7256e, "NalUnitUtil");
                        f3 = 1.0f;
                    }
                } else {
                    f3 = 1.0f;
                }
                if (zzgyVar.m7255d()) {
                    zzgyVar.m7252a();
                }
                if (zzgyVar.m7255d()) {
                    zzgyVar.m7253b(3);
                    int i26 = true != zzgyVar.m7255d() ? 2 : 1;
                    if (zzgyVar.m7255d()) {
                        int iM7256e7 = zzgyVar.m7256e(8);
                        int iM7256e8 = zzgyVar.m7256e(8);
                        zzgyVar.m7253b(8);
                        iM8028b = zzi.m8028b(iM7256e7);
                        iM8029c = zzi.m8029c(iM7256e8);
                    } else {
                        iM8028b = -1;
                        iM8029c = -1;
                    }
                    i14 = i26;
                } else {
                    iM8028b = -1;
                    iM8029c = -1;
                }
                if (zzgyVar.m7255d()) {
                    zzgyVar.m7258g();
                    zzgyVar.m7258g();
                }
                if (zzgyVar.m7255d()) {
                    zzgyVar.m7253b(65);
                }
                zM7255d = zzgyVar.m7255d();
                if (zM7255d) {
                    m7090k(zzgyVar);
                }
                zM7255d2 = zzgyVar.m7255d();
                if (zM7255d2) {
                    m7090k(zzgyVar);
                }
                if (zM7255d || zM7255d2) {
                    zzgyVar.m7252a();
                }
                zzgyVar.m7252a();
                if (zzgyVar.m7255d()) {
                    zzgyVar.m7252a();
                    zzgyVar.m7258g();
                    zzgyVar.m7258g();
                    zzgyVar.m7258g();
                    zzgyVar.m7258g();
                    iM7258g3 = zzgyVar.m7258g();
                    zzgyVar.m7258g();
                }
                i16 = iM8029c;
                i15 = i14;
                f2 = f3;
                i17 = iM7258g3;
                i18 = iM8028b;
            } else {
                i15 = -1;
                i16 = -1;
                i17 = iM7258g3;
                f2 = 1.0f;
                i18 = -1;
            }
            return new zzgq(i13, iM7256e4, iM7256e5, iM7258g4, i24, i23, f2, iM7258g2, i6, i18, i15, i16, i17);
        }
        i12 = iM7256e3;
        if ((iM7256e4 & 16) != 0) {
            i13 = i12;
            iM7258g3 = 0;
        } else {
            iM7258g3 = i5;
            i13 = i12;
        }
        i14 = -1;
        if (zzgyVar.m7255d()) {
            if (zzgyVar.m7255d()) {
                f3 = 1.0f;
            } else {
                iM7256e = zzgyVar.m7256e(8);
                if (iM7256e == 255) {
                    int i27 = i5;
                    iM7256e2 = zzgyVar.m7256e(i27);
                    int iM7256e9 = zzgyVar.m7256e(i27);
                    if (iM7256e2 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = 1.0f;
                    }
                } else if (iM7256e < 17) {
                    f3 = f18092b[iM7256e];
                } else {
                    AbstractC5152f.m3776h(new StringBuilder(String.valueOf(iM7256e).length() + 35), "Unexpected aspect_ratio_idc value: ", iM7256e, "NalUnitUtil");
                    f3 = 1.0f;
                }
            }
            if (zzgyVar.m7255d()) {
                zzgyVar.m7252a();
            }
            if (zzgyVar.m7255d()) {
                zzgyVar.m7253b(3);
                if (true != zzgyVar.m7255d()) {
                }
                if (zzgyVar.m7255d()) {
                    int iM7256e10 = zzgyVar.m7256e(8);
                    int iM7256e11 = zzgyVar.m7256e(8);
                    zzgyVar.m7253b(8);
                    iM8028b = zzi.m8028b(iM7256e10);
                    iM8029c = zzi.m8029c(iM7256e11);
                } else {
                    iM8028b = -1;
                    iM8029c = -1;
                }
                i14 = i26;
            } else {
                iM8028b = -1;
                iM8029c = -1;
            }
            if (zzgyVar.m7255d()) {
                zzgyVar.m7258g();
                zzgyVar.m7258g();
            }
            if (zzgyVar.m7255d()) {
                zzgyVar.m7253b(65);
            }
            zM7255d = zzgyVar.m7255d();
            if (zM7255d) {
                m7090k(zzgyVar);
            }
            zM7255d2 = zzgyVar.m7255d();
            if (zM7255d2) {
                m7090k(zzgyVar);
            }
            if (zM7255d) {
                zzgyVar.m7252a();
            } else {
                zzgyVar.m7252a();
            }
            zzgyVar.m7252a();
            if (zzgyVar.m7255d()) {
                zzgyVar.m7252a();
                zzgyVar.m7258g();
                zzgyVar.m7258g();
                zzgyVar.m7258g();
                zzgyVar.m7258g();
                iM7258g3 = zzgyVar.m7258g();
                zzgyVar.m7258g();
            }
            i16 = iM8029c;
            i15 = i14;
            f2 = f3;
            i17 = iM7258g3;
            i18 = iM8028b;
        } else {
            i15 = -1;
            i16 = -1;
            i17 = iM7258g3;
            f2 = 1.0f;
            i18 = -1;
        }
        return new zzgq(i13, iM7256e4, iM7256e5, iM7258g4, i24, i23, f2, iM7258g2, i6, i18, i15, i16, i17);
    }

    /* JADX WARN: Code duplicated, block: B:467:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0128  */
    /* JADX WARN: Code duplicated, block: B:70:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Code duplicated, block: B:74:0x0148  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static zzgo m7084e(byte[] bArr, int i2, int i3) {
        zzgn zzgnVar;
        boolean z;
        int iM7256e;
        int iM7256e2;
        int iM7256e3;
        int iM7256e4;
        int i4;
        zzgwt zzgwtVar;
        boolean[][] zArr;
        boolean[][] zArr2;
        int[] iArr;
        int[] iArr2;
        int i5;
        int i6;
        boolean zM7255d;
        int i7;
        int i8;
        int i9;
        int iM7258g;
        int i10;
        int i11;
        int i12;
        boolean z2;
        boolean z3;
        zzgy zzgyVar = new zzgy(bArr, i2, i3);
        m7088i(zzgyVar);
        zzgyVar.m7253b(4);
        boolean zM7255d2 = zzgyVar.m7255d();
        boolean zM7255d3 = zzgyVar.m7255d();
        int iM7256e5 = zzgyVar.m7256e(6);
        int i13 = iM7256e5 + 1;
        int iM7256e6 = zzgyVar.m7256e(3);
        zzgyVar.m7253b(17);
        zzgg zzggVarM7089j = m7089j(zzgyVar, true, iM7256e6, null);
        for (int i14 = true != zzgyVar.m7255d() ? iM7256e6 : 0; i14 <= iM7256e6; i14++) {
            zzgyVar.m7258g();
            zzgyVar.m7258g();
            zzgyVar.m7258g();
        }
        int iM7256e7 = zzgyVar.m7256e(6);
        int iM7258g2 = zzgyVar.m7258g() + 1;
        int i15 = 6;
        zzgh zzghVar = new zzgh(zzgwt.m7216n(zzggVarM7089j), new int[1]);
        boolean z4 = i13 >= 2 && iM7258g2 >= 2;
        boolean z5 = zM7255d2 && zM7255d3;
        int i16 = iM7256e7 + 1;
        if (!z4 || !z5 || i16 < i13) {
            return new zzgo(null, zzghVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, iM7258g2, i16);
        int i17 = 1;
        int[] iArr4 = new int[iM7258g2];
        int[] iArr5 = new int[iM7258g2];
        iArr3[0][0] = 0;
        iArr4[0] = 1;
        iArr5[0] = 0;
        for (int i18 = 1; i18 < iM7258g2; i18++) {
            int i19 = 0;
            for (int i20 = 0; i20 <= iM7256e7; i20++) {
                if (zzgyVar.m7255d()) {
                    iArr3[i18][i19] = i20;
                    iArr5[i18] = i20;
                    i19++;
                }
                iArr4[i18] = i19;
            }
        }
        if (zzgyVar.m7255d()) {
            zzgyVar.m7253b(64);
            if (zzgyVar.m7255d()) {
                zzgyVar.m7258g();
            }
            int iM7258g3 = zzgyVar.m7258g();
            int i21 = 0;
            while (i21 < iM7258g3) {
                zzgyVar.m7258g();
                if (i21 == 0 || zzgyVar.m7255d()) {
                    boolean zM7255d4 = zzgyVar.m7255d();
                    boolean zM7255d5 = zzgyVar.m7255d();
                    z3 = zM7255d4;
                    z2 = zM7255d5;
                    if (zM7255d4 || zM7255d5) {
                        zM7255d = zzgyVar.m7255d();
                        if (zM7255d) {
                            zzgyVar.m7253b(19);
                        }
                        zzgyVar.m7253b(8);
                        if (zM7255d) {
                            zzgyVar.m7253b(4);
                        }
                        zzgyVar.m7253b(15);
                        i8 = zM7255d4;
                        i7 = zM7255d5;
                    }
                    i9 = 0;
                    while (i9 <= iM7256e6) {
                        if (!zzgyVar.m7255d() || zzgyVar.m7255d()) {
                            zzgyVar.m7258g();
                        } else {
                            if (zzgyVar.m7255d()) {
                                iM7258g = 0;
                            }
                            int[][] iArr6 = iArr3;
                            i10 = i8 + i7;
                            int[] iArr7 = iArr5;
                            i11 = 0;
                            while (i11 < i10) {
                                int i22 = i10;
                                for (i12 = 0; i12 <= iM7258g; i12++) {
                                    zzgyVar.m7258g();
                                    zzgyVar.m7258g();
                                    if (zM7255d) {
                                        zzgyVar.m7258g();
                                        zzgyVar.m7258g();
                                    }
                                    zzgyVar.m7252a();
                                }
                                i11++;
                                i10 = i22;
                            }
                            i9++;
                            iArr3 = iArr6;
                            i21 = i21;
                            iArr5 = iArr7;
                        }
                        iM7258g = zzgyVar.m7258g();
                        int[][] iArr8 = iArr3;
                        i10 = i8 + i7;
                        int[] iArr9 = iArr5;
                        i11 = 0;
                        while (i11 < i10) {
                            int i23 = i10;
                            while (i12 <= iM7258g) {
                                zzgyVar.m7258g();
                                zzgyVar.m7258g();
                                if (zM7255d) {
                                    zzgyVar.m7258g();
                                    zzgyVar.m7258g();
                                }
                                zzgyVar.m7252a();
                            }
                            i11++;
                            i10 = i23;
                        }
                        i9++;
                        iArr3 = iArr8;
                        i21 = i21;
                        iArr5 = iArr9;
                    }
                    i21++;
                } else {
                    z3 = false;
                    z2 = false;
                }
                zM7255d = false;
                i8 = z3;
                i7 = z2;
                i9 = 0;
                while (i9 <= iM7256e6) {
                    if (zzgyVar.m7255d()) {
                        zzgyVar.m7258g();
                        iM7258g = zzgyVar.m7258g();
                    } else {
                        zzgyVar.m7258g();
                        iM7258g = zzgyVar.m7258g();
                    }
                    int[][] iArr10 = iArr3;
                    i10 = i8 + i7;
                    int[] iArr11 = iArr5;
                    i11 = 0;
                    while (i11 < i10) {
                        int i24 = i10;
                        while (i12 <= iM7258g) {
                            zzgyVar.m7258g();
                            zzgyVar.m7258g();
                            if (zM7255d) {
                                zzgyVar.m7258g();
                                zzgyVar.m7258g();
                            }
                            zzgyVar.m7252a();
                        }
                        i11++;
                        i10 = i24;
                    }
                    i9++;
                    iArr3 = iArr10;
                    i21 = i21;
                    iArr5 = iArr11;
                }
                i21++;
            }
        }
        int[][] iArr12 = iArr3;
        int[] iArr13 = iArr5;
        if (!zzgyVar.m7255d()) {
            return new zzgo(null, zzghVar, null, null);
        }
        int i25 = zzgyVar.f18351e;
        if (i25 > 0) {
            zzgyVar.m7253b(8 - i25);
        }
        zzgg zzggVarM7089j2 = m7089j(zzgyVar, false, iM7256e6, zzggVarM7089j);
        boolean zM7255d6 = zzgyVar.m7255d();
        boolean[] zArr3 = new boolean[16];
        int i26 = 0;
        for (int i27 = 0; i27 < 16; i27++) {
            boolean zM7255d7 = zzgyVar.m7255d();
            zArr3[i27] = zM7255d7;
            if (zM7255d7) {
                i26++;
            }
        }
        if (i26 == 0 || !zArr3[1]) {
            return new zzgo(null, zzghVar, null, null);
        }
        int i28 = i26 + 1;
        int[] iArr14 = new int[i26];
        for (int i29 = 0; i29 < i26 - (zM7255d6 ? 1 : 0); i29++) {
            iArr14[i29] = zzgyVar.m7256e(3);
        }
        int[] iArr15 = new int[i28];
        if (zM7255d6) {
            for (int i30 = 1; i30 < i26; i30++) {
                for (int i31 = 0; i31 < i30; i31++) {
                    iArr15[i30] = iArr14[i31] + 1 + iArr15[i30];
                }
            }
            iArr15[i26] = 6;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i13, i26);
        int[] iArr17 = new int[i13];
        iArr17[0] = 0;
        boolean zM7255d8 = zzgyVar.m7255d();
        int i32 = 1;
        while (i32 < i13) {
            if (zM7255d8) {
                iArr17[i32] = zzgyVar.m7256e(i15);
            } else {
                iArr17[i32] = i32;
            }
            if (zM7255d6) {
                i6 = i32;
                int i33 = 0;
                while (i33 < i26) {
                    int i34 = i33 + 1;
                    iArr16[i6][i33] = (iArr17[i6] & ((1 << iArr15[i34]) - 1)) >> iArr15[i33];
                    i33 = i34;
                }
            } else {
                int i35 = 0;
                while (i35 < i26) {
                    iArr16[i32][i35] = zzgyVar.m7256e(iArr14[i35] + 1);
                    i35++;
                    i32 = i32;
                }
                i6 = i32;
            }
            i32 = i6 + 1;
            i15 = 6;
        }
        int[] iArr18 = new int[i16];
        int i36 = 1;
        int i37 = 0;
        while (i37 < i13) {
            iArr18[iArr17[i37]] = -1;
            int[] iArr19 = iArr18;
            int i38 = 0;
            int i39 = 0;
            while (i38 < 16) {
                if (zArr3[i38]) {
                    i5 = i17;
                    if (i38 == i5) {
                        iArr19[iArr17[i37]] = iArr16[i37][i39];
                        i38 = i5;
                    }
                    i39++;
                } else {
                    i5 = i17;
                }
                i38 += i5;
                i17 = i5;
            }
            if (i37 > 0) {
                int i40 = 0;
                while (true) {
                    if (i40 >= i37) {
                        i36++;
                        break;
                    }
                    int i41 = i40;
                    if (iArr19[iArr17[i37]] == iArr19[iArr17[i40]]) {
                        break;
                    }
                    i40 = i41 + 1;
                }
            }
            i37++;
            iArr18 = iArr19;
            i17 = 1;
        }
        int[] iArr20 = iArr18;
        int iM7256e8 = zzgyVar.m7256e(4);
        if (i36 < 2 || iM7256e8 == 0) {
            return new zzgo(null, zzghVar, null, null);
        }
        int[] iArr21 = new int[i36];
        for (int i42 = 0; i42 < i36; i42++) {
            iArr21[i42] = zzgyVar.m7256e(iM7256e8);
        }
        int[] iArr22 = new int[i16];
        for (int i43 = 0; i43 < i13; i43++) {
            iArr22[Math.min(iArr17[i43], iM7256e7)] = i43;
        }
        zzgwq zzgwqVar = new zzgwq();
        int i44 = 0;
        while (i44 <= iM7256e7) {
            int[] iArr23 = iArr21;
            int i45 = i36;
            int iMin = Math.min(iArr20[i44], i45 - 1);
            int[] iArr24 = iArr22;
            zzgwqVar.m7203c(new zzge(iArr24[i44], iMin >= 0 ? iArr23[iMin] : -1));
            i44++;
            i36 = i45;
            iArr21 = iArr23;
            iArr22 = iArr24;
        }
        zzgyo zzgyoVar = (zzgyo) zzgwqVar.m7214f();
        if (((zzge) zzgyoVar.get(0)).f17073b == -1) {
            return new zzgo(null, zzghVar, null, null);
        }
        int i46 = 1;
        while (true) {
            if (i46 > iM7256e7) {
                i46 = -1;
                break;
            }
            if (((zzge) zzgyoVar.get(i46)).f17073b != -1) {
                break;
            }
            i46++;
        }
        if (i46 == -1) {
            return new zzgo(null, zzghVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i13, i13);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i13, i13);
        int i47 = 1;
        while (i47 < i13) {
            boolean[][] zArr6 = zArr5;
            for (int i48 = 0; i48 < i47; i48++) {
                boolean[] zArr7 = zArr4[i47];
                boolean[] zArr8 = zArr6[i47];
                boolean zM7255d9 = zzgyVar.m7255d();
                zArr8[i48] = zM7255d9;
                zArr7[i48] = zM7255d9;
            }
            i47++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i49 = 1; i49 < i13; i49++) {
            int i50 = 0;
            while (i50 < iM7256e5) {
                boolean[][] zArr10 = zArr4;
                for (int i51 = 0; i51 < i49; i51++) {
                    boolean[] zArr11 = zArr9[i49];
                    if (zArr11[i51] && zArr9[i51][i50]) {
                        zArr11[i50] = true;
                        break;
                    }
                }
                i50++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr25 = new int[i16];
        for (int i52 = 0; i52 < i13; i52++) {
            int i53 = 0;
            for (int i54 = 0; i54 < i52; i54++) {
                i53 += zArr12[i52][i54] ? 1 : 0;
            }
            iArr25[iArr17[i52]] = i53;
        }
        int i55 = 0;
        for (int i56 = 0; i56 < i13; i56++) {
            if (iArr25[iArr17[i56]] == 0) {
                i55++;
            }
        }
        if (i55 > 1) {
            return new zzgo(null, zzghVar, null, null);
        }
        int[] iArr26 = new int[i13];
        int[] iArr27 = new int[iM7258g2];
        if (zzgyVar.m7255d()) {
            int i57 = 0;
            while (i57 < i13) {
                int i58 = i57;
                iArr26[i58] = zzgyVar.m7256e(3);
                i57 = i58 + 1;
            }
        } else {
            Arrays.fill(iArr26, 0, i13, iM7256e6);
        }
        int i59 = 0;
        while (i59 < iM7258g2) {
            int i60 = i59;
            int[] iArr28 = iArr26;
            int[] iArr29 = iArr27;
            int iMax = 0;
            for (int i61 = 0; i61 < iArr4[i60]; i61++) {
                iMax = Math.max(iMax, iArr28[((zzge) zzgyoVar.get(iArr12[i60][i61])).f17072a]);
            }
            iArr29[i60] = iMax + 1;
            i59 = i60 + 1;
            iArr26 = iArr28;
            iArr27 = iArr29;
        }
        int[] iArr30 = iArr27;
        if (zzgyVar.m7255d()) {
            int i62 = 0;
            while (i62 < iM7256e5) {
                int i63 = i62 + 1;
                int i64 = i63;
                while (i64 < i13) {
                    if (zArr12[i64][i62]) {
                        zzgyVar.m7253b(3);
                    }
                    i64++;
                    iM7256e5 = iM7256e5;
                }
                i62 = i63;
            }
        }
        zzgyVar.m7252a();
        int iM7258g4 = zzgyVar.m7258g() + 1;
        zzgwq zzgwqVar2 = new zzgwq();
        zzgwqVar2.m7203c(zzggVarM7089j);
        if (iM7258g4 > 1) {
            zzgwqVar2.m7203c(zzggVarM7089j2);
            for (int i65 = 2; i65 < iM7258g4; i65++) {
                zzggVarM7089j2 = m7089j(zzgyVar, zzgyVar.m7255d(), iM7256e6, zzggVarM7089j2);
                zzgwqVar2.m7203c(zzggVarM7089j2);
            }
        }
        zzgwt zzgwtVarM7214f = zzgwqVar2.m7214f();
        int iM7258g5 = zzgyVar.m7258g() + iM7258g2;
        if (iM7258g5 > iM7258g2) {
            return new zzgo(null, zzghVar, null, null);
        }
        int iM7256e9 = zzgyVar.m7256e(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM7258g5, i16);
        int[] iArr31 = new int[iM7258g5];
        int i66 = 0;
        int[] iArr32 = new int[iM7258g5];
        int i67 = 0;
        while (i67 < iM7258g2) {
            iArr31[i67] = i66;
            int i68 = i67;
            int i69 = iArr13[i68];
            iArr32[i68] = i69;
            if (iM7256e9 == 0) {
                zArr2 = zArr13;
                iArr = iArr31;
                iArr2 = iArr17;
                Arrays.fill(zArr13[i68], i66, iArr4[i68], true);
                iArr[i68] = iArr4[i68];
            } else {
                zArr2 = zArr13;
                iArr = iArr31;
                iArr2 = iArr17;
                if (iM7256e9 == 1) {
                    for (int i70 = 0; i70 < iArr4[i68]; i70++) {
                        zArr2[i68][i70] = iArr12[i68][i70] == i69;
                    }
                    iArr[i68] = 1;
                } else {
                    i66 = 0;
                    zArr2[0][0] = true;
                    iArr[0] = 1;
                }
                i67 = i68 + 1;
                zArr13 = zArr2;
                iArr31 = iArr;
                iArr17 = iArr2;
            }
            i66 = 0;
            i67 = i68 + 1;
            zArr13 = zArr2;
            iArr31 = iArr;
            iArr17 = iArr2;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr33 = iArr31;
        int[] iArr34 = iArr17;
        int[] iArr35 = new int[i16];
        int i71 = 2;
        int[] iArr36 = new int[2];
        iArr36[1] = i16;
        iArr36[i66] = iM7258g5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr36);
        int i72 = 1;
        int i73 = 0;
        while (i72 < iM7258g5) {
            if (iM7256e9 == i71) {
                for (int i74 = 0; i74 < iArr4[i72]; i74++) {
                    zArr14[i72][i74] = zzgyVar.m7255d();
                    int i75 = iArr33[i72];
                    boolean z6 = zArr14[i72][i74];
                    iArr33[i72] = i75 + (z6 ? 1 : 0);
                    if (z6) {
                        iArr32[i72] = iArr12[i72][i74];
                    }
                }
            }
            if (i73 == 0) {
                i4 = 0;
                if (iArr12[i72][0] == 0 && zArr14[i72][0]) {
                    i73 = 0;
                    for (int i76 = 1; i76 < iArr4[i72]; i76++) {
                        if (iArr12[i72][i76] == i46 && zArr14[i72][i46]) {
                            i73 = i72;
                        }
                    }
                } else {
                    i73 = 0;
                }
            } else {
                i4 = 0;
            }
            int i77 = i4;
            while (i77 < iArr4[i72]) {
                if (iM7258g4 > 1) {
                    zArr15[i72][i77] = zArr14[i72][i77];
                    zzgwtVar = zzgwtVarM7214f;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iM7291b = zzhad.m7291b(iM7258g4);
                    if (!zArr[i72][i77]) {
                        int i78 = ((zzge) zzgyoVar.get(iArr12[i72][i77])).f17072a;
                        int i79 = i4;
                        while (i79 < i77) {
                            int i80 = i79;
                            if (zArr9[i78][((zzge) zzgyoVar.get(iArr12[i72][i80])).f17072a]) {
                                zArr[i72][i77] = true;
                                break;
                            }
                            i79 = i80 + 1;
                        }
                    }
                    if (zArr[i72][i77]) {
                        if (i73 <= 0 || i72 != i73) {
                            zzgyVar.m7253b(iM7291b);
                        } else {
                            iArr35[i77] = zzgyVar.m7256e(iM7291b);
                        }
                    }
                } else {
                    zzgwtVar = zzgwtVarM7214f;
                    zArr = zArr15;
                }
                i77++;
                zzgwtVarM7214f = zzgwtVar;
                zArr15 = zArr;
            }
            zzgwt zzgwtVar2 = zzgwtVarM7214f;
            boolean[][] zArr16 = zArr15;
            if (iArr33[i72] == 1 && iArr25[iArr32[i72]] > 0) {
                zzgyVar.m7252a();
            }
            i72++;
            zzgwtVarM7214f = zzgwtVar2;
            zArr15 = zArr16;
            i71 = 2;
        }
        zzgwt zzgwtVar3 = zzgwtVarM7214f;
        boolean[][] zArr17 = zArr15;
        if (i73 == 0) {
            return new zzgo(null, zzghVar, null, null);
        }
        int iM7258g6 = zzgyVar.m7258g();
        int i81 = iM7258g6 + 1;
        zzgvp.m7175b(i81, "expectedSize");
        zzgwq zzgwqVar3 = new zzgwq(i81);
        int[] iArr37 = new int[i13];
        for (int i82 = 0; i82 < i81; i82++) {
            int iM7256e10 = zzgyVar.m7256e(16);
            int iM7256e11 = zzgyVar.m7256e(16);
            if (zzgyVar.m7255d()) {
                iM7256e2 = zzgyVar.m7256e(2);
                if (iM7256e2 == 3) {
                    zzgyVar.m7252a();
                }
                iM7256e3 = zzgyVar.m7256e(4);
                iM7256e4 = zzgyVar.m7256e(4);
            } else {
                iM7256e2 = 0;
                iM7256e3 = 0;
                iM7256e4 = 0;
            }
            if (zzgyVar.m7255d()) {
                int iM7258g7 = zzgyVar.m7258g();
                int iM7258g8 = zzgyVar.m7258g();
                int iM7258g9 = zzgyVar.m7258g();
                int iM7258g10 = zzgyVar.m7258g();
                iM7256e10 -= (iM7258g7 + iM7258g8) * ((iM7256e2 == 1 || iM7256e2 == 2) ? 2 : 1);
                iM7256e11 -= (iM7258g9 + iM7258g10) * (iM7256e2 == 1 ? 2 : 1);
            }
            zzgwqVar3.m7203c(new zzgi(iM7256e2, iM7256e3, iM7256e4, iM7256e10, iM7256e11));
        }
        if (i81 <= 1 || !zzgyVar.m7255d()) {
            for (int i83 = 1; i83 < i13; i83++) {
                iArr37[i83] = Math.min(i83, iM7258g6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iM7291b2 = zzhad.m7291b(i81);
            for (int i84 = 1; i84 < i13; i84++) {
                iArr37[i84] = zzgyVar.m7256e(iM7291b2);
            }
        }
        zzgj zzgjVar = new zzgj(zzgwqVar3.m7214f(), iArr37);
        zzgyVar.m7253b(2);
        for (int i85 = 1; i85 < i13; i85++) {
            if (iArr25[iArr34[i85]] == 0) {
                zzgyVar.m7252a();
            }
        }
        for (int i86 = 1; i86 < iM7258g5; i86++) {
            boolean zM7255d10 = zzgyVar.m7255d();
            int i87 = 0;
            while (i87 < iArr30[i86]) {
                if ((i87 <= 0 || !zM7255d10) ? i87 == 0 : zzgyVar.m7255d()) {
                    for (int i88 = 0; i88 < iArr4[i86]; i88++) {
                        if (zArr17[i86][i88]) {
                            zzgyVar.m7258g();
                        }
                    }
                    zzgyVar.m7258g();
                    zzgyVar.m7258g();
                }
                i87++;
            }
        }
        int iM7258g11 = zzgyVar.m7258g() + 2;
        if (zzgyVar.m7255d()) {
            zzgyVar.m7253b(iM7258g11);
        } else {
            for (int i89 = 1; i89 < i13; i89++) {
                for (int i90 = 0; i90 < i89; i90++) {
                    if (zArr12[i89][i90]) {
                        zzgyVar.m7253b(iM7258g11);
                    }
                }
            }
        }
        int iM7258g12 = zzgyVar.m7258g();
        for (int i91 = 1; i91 <= iM7258g12; i91++) {
            zzgyVar.m7253b(8);
        }
        if (zzgyVar.m7255d()) {
            int i92 = zzgyVar.f18351e;
            if (i92 > 0) {
                zzgyVar.m7253b(8 - i92);
            }
            if (zzgyVar.m7255d() || zzgyVar.m7255d()) {
                zzgyVar.m7252a();
            }
            boolean zM7255d11 = zzgyVar.m7255d();
            boolean zM7255d12 = zzgyVar.m7255d();
            if (zM7255d11 || zM7255d12) {
                for (int i93 = 0; i93 < iM7258g2; i93++) {
                    for (int i94 = 0; i94 < iArr30[i93]; i94++) {
                        boolean zM7255d13 = zM7255d11 ? zzgyVar.m7255d() : false;
                        boolean zM7255d14 = zM7255d12 ? zzgyVar.m7255d() : false;
                        if (zM7255d13) {
                            zzgyVar.m7253b(32);
                        }
                        if (zM7255d14) {
                            zzgyVar.m7253b(18);
                        }
                    }
                }
            }
            boolean zM7255d15 = zzgyVar.m7255d();
            if (zM7255d15) {
                z = true;
                iM7256e = zzgyVar.m7256e(4) + 1;
            } else {
                z = true;
                iM7256e = i13;
            }
            zzgvp.m7175b(iM7256e, "expectedSize");
            zzgwq zzgwqVar4 = new zzgwq(iM7256e);
            int[] iArr38 = new int[i13];
            int i95 = 0;
            while (i95 < iM7256e) {
                zzgyVar.m7253b(3);
                int i96 = z != zzgyVar.m7255d() ? 2 : 1;
                int iM8028b = zzi.m8028b(zzgyVar.m7256e(8));
                int iM8029c = zzi.m8029c(zzgyVar.m7256e(8));
                zzgyVar.m7253b(8);
                zzgwqVar4.m7203c(new zzgm(iM8028b, i96, iM8029c));
                i95++;
                z = true;
            }
            if (zM7255d15 && iM7256e > 1) {
                for (int i97 = 0; i97 < i13; i97++) {
                    iArr38[i97] = zzgyVar.m7256e(4);
                }
            }
            zzgnVar = new zzgn(zzgwqVar4.m7214f(), iArr38);
        } else {
            zzgnVar = null;
        }
        return new zzgo(zzgyoVar, new zzgh(zzgwtVar3, iArr35), zzgjVar, zzgnVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    /* JADX WARN: Code duplicated, block: B:203:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX INFO: renamed from: f */
    public static zzgl m7085f(byte[] bArr, int i2, int i3, zzgo zzgoVar) {
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM7258g;
        int i9;
        int i10;
        int i11;
        int i12;
        float f2;
        int i13;
        int i14;
        int i15;
        int i16;
        int iM8028b;
        int iM8029c;
        int i17;
        zzgn zzgnVar;
        int i18;
        zzgj zzgjVar;
        zzgf zzgfVarM7088i = m7088i(new zzgy(bArr, i2, i3));
        zzgy zzgyVar = new zzgy(bArr, i2 + 2, i3);
        int i19 = 4;
        zzgyVar.m7253b(4);
        int iM7256e = zzgyVar.m7256e(3);
        int i20 = zzgfVarM7088i.f17124b;
        if (i20 == 0 || iM7256e != 7) {
            i4 = iM7256e;
            z = false;
        } else {
            z = true;
            i4 = 7;
        }
        if (zzgoVar != null) {
            zzgwt zzgwtVar = zzgoVar.f17902a;
            if (zzgwtVar.isEmpty()) {
                i5 = 0;
            } else {
                i5 = ((zzge) zzgwtVar.get(Math.min(i20, zzgwtVar.size() - 1))).f17072a;
            }
        } else {
            i5 = 0;
        }
        zzgg zzggVarM7089j = null;
        if (!z) {
            zzgyVar.m7252a();
            zzggVarM7089j = m7089j(zzgyVar, true, i4, null);
        } else if (zzgoVar != null) {
            zzgh zzghVar = zzgoVar.f17903b;
            int i21 = zzghVar.f17252b[i5];
            zzgwt zzgwtVar2 = zzghVar.f17251a;
            if (zzgwtVar2.size() > i21) {
                zzggVarM7089j = (zzgg) zzgwtVar2.get(i21);
            }
        }
        zzgg zzggVar = zzggVarM7089j;
        zzgyVar.m7258g();
        if (z) {
            int iM7256e2 = zzgyVar.m7255d() ? zzgyVar.m7256e(8) : -1;
            if (zzgoVar == null || (zzgjVar = zzgoVar.f17904c) == null) {
                i7 = 0;
                i11 = 0;
                iM7258g = 0;
                i10 = 0;
                i8 = 0;
                i9 = 0;
            } else {
                if (iM7256e2 == -1) {
                    iM7256e2 = zzgjVar.f17571b[i5];
                }
                if (iM7256e2 != -1) {
                    zzgwt zzgwtVar3 = zzgjVar.f17570a;
                    if (zzgwtVar3.size() > iM7256e2) {
                        zzgi zzgiVar = (zzgi) zzgwtVar3.get(iM7256e2);
                        int i22 = zzgiVar.f17296a;
                        int i23 = zzgiVar.f17299d;
                        int i24 = zzgiVar.f17300e;
                        int i25 = zzgiVar.f17297b;
                        i8 = i23;
                        i9 = i24;
                        iM7258g = zzgiVar.f17298c;
                        i10 = i8;
                        i11 = i25;
                        i7 = i9;
                    } else {
                        i7 = 0;
                        i11 = 0;
                        iM7258g = 0;
                        i10 = 0;
                        i8 = 0;
                        i9 = 0;
                    }
                } else {
                    i7 = 0;
                    i11 = 0;
                    iM7258g = 0;
                    i10 = 0;
                    i8 = 0;
                    i9 = 0;
                }
            }
        } else {
            int iM7258g2 = zzgyVar.m7258g();
            if (iM7258g2 == 3) {
                zzgyVar.m7252a();
                iM7258g2 = 3;
            }
            int iM7258g3 = zzgyVar.m7258g();
            int iM7258g4 = zzgyVar.m7258g();
            if (zzgyVar.m7255d()) {
                int iM7258g5 = zzgyVar.m7258g();
                int iM7258g6 = zzgyVar.m7258g();
                int iM7258g7 = zzgyVar.m7258g();
                int iM7258g8 = zzgyVar.m7258g();
                i6 = iM7258g3 - ((iM7258g5 + iM7258g6) * ((iM7258g2 == 1 || iM7258g2 == 2) ? 2 : 1));
                i7 = iM7258g4 - ((iM7258g7 + iM7258g8) * (iM7258g2 == 1 ? 2 : 1));
            } else {
                i6 = iM7258g3;
                i7 = iM7258g4;
            }
            int iM7258g9 = zzgyVar.m7258g();
            i8 = iM7258g3;
            iM7258g = zzgyVar.m7258g();
            i9 = iM7258g4;
            i10 = i6;
            i11 = iM7258g9;
        }
        int iM7258g10 = zzgyVar.m7258g();
        if (z) {
            i12 = -1;
        } else {
            int iMax = -1;
            for (int i26 = true != zzgyVar.m7255d() ? i4 : 0; i26 <= i4; i26++) {
                zzgyVar.m7258g();
                iMax = Math.max(zzgyVar.m7258g(), iMax);
                zzgyVar.m7258g();
            }
            i12 = iMax;
        }
        zzgyVar.m7258g();
        zzgyVar.m7258g();
        zzgyVar.m7258g();
        zzgyVar.m7258g();
        zzgyVar.m7258g();
        zzgyVar.m7258g();
        if (zzgyVar.m7255d()) {
            if (z && zzgyVar.m7255d()) {
                zzgyVar.m7253b(6);
            } else if (zzgyVar.m7255d()) {
                int i27 = 0;
                while (i27 < i19) {
                    int i28 = 0;
                    while (i28 < 6) {
                        if (zzgyVar.m7255d()) {
                            int iMin = Math.min(64, 1 << ((i27 + i27) + i19));
                            if (i27 > 1) {
                                zzgyVar.m7257f();
                            }
                            for (int i29 = 0; i29 < iMin; i29++) {
                                zzgyVar.m7257f();
                            }
                        } else {
                            zzgyVar.m7258g();
                        }
                        i28 += i27 == 3 ? 3 : 1;
                        i19 = 4;
                    }
                    i27++;
                    i19 = 4;
                }
            }
        }
        zzgyVar.m7253b(2);
        if (zzgyVar.m7255d()) {
            zzgyVar.m7253b(8);
            zzgyVar.m7258g();
            zzgyVar.m7258g();
            zzgyVar.m7252a();
        }
        int iM7258g11 = zzgyVar.m7258g();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i30 = 0;
        int i31 = -1;
        int i32 = -1;
        while (i30 < iM7258g11) {
            if (i30 == 0 || !zzgyVar.m7255d()) {
                int iM7258g12 = zzgyVar.m7258g();
                int iM7258g13 = zzgyVar.m7258g();
                int[] iArr2 = new int[iM7258g12];
                int i33 = 0;
                while (i33 < iM7258g12) {
                    iArr2[i33] = (i33 > 0 ? iArr2[i33 - 1] : 0) - (zzgyVar.m7258g() + 1);
                    zzgyVar.m7252a();
                    i33++;
                }
                int[] iArr3 = new int[iM7258g13];
                int i34 = 0;
                while (i34 < iM7258g13) {
                    iArr3[i34] = zzgyVar.m7258g() + 1 + (i34 > 0 ? iArr3[i34 - 1] : 0);
                    zzgyVar.m7252a();
                    i34++;
                }
                i32 = iM7258g13;
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i31 = iM7258g12;
            } else {
                int i35 = i31 + i32;
                boolean zM7255d = zzgyVar.m7255d();
                int iM7258g14 = zzgyVar.m7258g() + 1;
                int i36 = 1 - ((zM7255d ? 1 : 0) + (zM7255d ? 1 : 0));
                int i37 = i35 + 1;
                boolean[] zArr = new boolean[i37];
                for (int i38 = 0; i38 <= i35; i38++) {
                    if (zzgyVar.m7255d()) {
                        zArr[i38] = true;
                    } else {
                        zArr[i38] = zzgyVar.m7255d();
                    }
                }
                int i39 = i32 - 1;
                int[] iArr4 = new int[i37];
                int[] iArr5 = new int[i37];
                int i40 = 0;
                while (true) {
                    i18 = i36 * iM7258g14;
                    if (i39 < 0) {
                        break;
                    }
                    int i41 = iArrCopyOf[i39] + i18;
                    if (i41 < 0 && zArr[i31 + i39]) {
                        iArr4[i40] = i41;
                        i40++;
                    }
                    i39--;
                }
                if (i18 < 0 && zArr[i35]) {
                    iArr4[i40] = i18;
                    i40++;
                }
                int[] iArr6 = iArr;
                int i42 = i40;
                for (int i43 = 0; i43 < i31; i43++) {
                    int i44 = iArr6[i43] + i18;
                    if (i44 < 0 && zArr[i43]) {
                        iArr4[i42] = i44;
                        i42++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i42);
                int i45 = 0;
                for (int i46 = i31 - 1; i46 >= 0; i46--) {
                    int i47 = iArr6[i46] + i18;
                    if (i47 > 0 && zArr[i46]) {
                        iArr5[i45] = i47;
                        i45++;
                    }
                }
                if (i18 > 0 && zArr[i35]) {
                    iArr5[i45] = i18;
                    i45++;
                }
                int i48 = i45;
                for (int i49 = 0; i49 < i32; i49++) {
                    int i50 = iArrCopyOf[i49] + i18;
                    if (i50 > 0 && zArr[i31 + i49]) {
                        iArr5[i48] = i50;
                        i48++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i48);
                i31 = i42;
                i32 = i48;
                iArr = iArrCopyOf2;
            }
            i30++;
            iM7258g11 = iM7258g11;
            i5 = i5;
        }
        int i51 = i5;
        if (zzgyVar.m7255d()) {
            int iM7258g15 = zzgyVar.m7258g();
            for (int i52 = 0; i52 < iM7258g15; i52++) {
                zzgyVar.m7253b(iM7258g10 + 5);
            }
        }
        zzgyVar.m7253b(2);
        float f3 = 1.0f;
        if (zzgyVar.m7255d()) {
            if (zzgyVar.m7255d()) {
                int iM7256e3 = zzgyVar.m7256e(8);
                if (iM7256e3 == 255) {
                    int iM7256e4 = zzgyVar.m7256e(16);
                    int iM7256e5 = zzgyVar.m7256e(16);
                    if (iM7256e4 != 0 && iM7256e5 != 0) {
                        f3 = iM7256e4 / iM7256e5;
                    }
                } else if (iM7256e3 < 17) {
                    f3 = f18092b[iM7256e3];
                } else {
                    AbstractC5152f.m3776h(new StringBuilder(String.valueOf(iM7256e3).length() + 35), "Unexpected aspect_ratio_idc value: ", iM7256e3, "NalUnitUtil");
                }
            }
            if (zzgyVar.m7255d()) {
                zzgyVar.m7252a();
            }
            if (zzgyVar.m7255d()) {
                zzgyVar.m7253b(3);
                i17 = true != zzgyVar.m7255d() ? 2 : 1;
                if (zzgyVar.m7255d()) {
                    int iM7256e6 = zzgyVar.m7256e(8);
                    int iM7256e7 = zzgyVar.m7256e(8);
                    zzgyVar.m7253b(8);
                    iM8028b = zzi.m8028b(iM7256e6);
                    iM8029c = zzi.m8029c(iM7256e7);
                } else {
                    iM8028b = -1;
                    iM8029c = -1;
                }
            } else if (zzgoVar == null || (zzgnVar = zzgoVar.f17905d) == null) {
                iM8028b = -1;
                iM8029c = -1;
                i17 = -1;
            } else {
                int i53 = zzgnVar.f17840b[i51];
                zzgwt zzgwtVar4 = zzgnVar.f17839a;
                if (zzgwtVar4.size() > i53) {
                    zzgm zzgmVar = (zzgm) zzgwtVar4.get(i53);
                    int i54 = zzgmVar.f17762a;
                    int i55 = zzgmVar.f17763b;
                    iM8029c = zzgmVar.f17764c;
                    iM8028b = i54;
                    i17 = i55;
                } else {
                    iM8028b = -1;
                    iM8029c = -1;
                    i17 = -1;
                }
            }
            if (zzgyVar.m7255d()) {
                zzgyVar.m7258g();
                zzgyVar.m7258g();
            }
            zzgyVar.m7252a();
            if (zzgyVar.m7255d()) {
                i7 += i7;
            }
            i14 = iM8028b;
            i16 = iM8029c;
            f2 = f3;
            i15 = i17;
            i13 = i7;
        } else {
            f2 = 1.0f;
            i13 = i7;
            i14 = -1;
            i15 = -1;
            i16 = -1;
        }
        return new zzgl(i4, zzggVar, i11, iM7258g, i10, i13, i8, i9, f2, i12, i14, i15, i16);
    }

    /* JADX INFO: renamed from: g */
    public static int m7086g(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        zzgtr.m7133f(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            m7087h(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            m7087h(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            m7087h(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b = bArr[i6];
            if ((b & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b == 1) {
                    m7087h(zArr);
                    return i7;
                }
                i6 = i7;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    /* JADX INFO: renamed from: h */
    public static void m7087h(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX INFO: renamed from: i */
    public static zzgf m7088i(zzgy zzgyVar) {
        zzgyVar.m7252a();
        return new zzgf(zzgyVar.m7256e(6), zzgyVar.m7256e(6), zzgyVar.m7256e(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c A[SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    public static zzgg m7089j(zzgy zzgyVar, boolean z, int i2, zzgg zzggVar) {
        int[] iArr;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean zM7255d;
        int iM7256e;
        int i6;
        int i7;
        int[] iArr2 = new int[6];
        if (!z) {
            if (zzggVar != null) {
                int i8 = zzggVar.f17184a;
                zM7255d = zzggVar.f17185b;
                iM7256e = zzggVar.f17186c;
                i6 = zzggVar.f17187d;
                iArr2 = zzggVar.f17188e;
                i3 = i8;
            } else {
                iArr = iArr2;
                i3 = 0;
                z2 = false;
                i4 = 0;
                i5 = 0;
            }
            int iM7256e2 = zzgyVar.m7256e(8);
            i7 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                if (zzgyVar.m7255d()) {
                    i7 += 88;
                }
                if (zzgyVar.m7255d()) {
                    i7 += 8;
                }
            }
            zzgyVar.m7253b(i7);
            if (i2 > 0) {
                int i10 = 8 - i2;
                zzgyVar.m7253b(i10 + i10);
            }
            return new zzgg(i3, z2, i4, i5, iArr, iM7256e2);
        }
        int iM7256e3 = zzgyVar.m7256e(2);
        zM7255d = zzgyVar.m7255d();
        iM7256e = zzgyVar.m7256e(5);
        i6 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            if (zzgyVar.m7255d()) {
                i6 |= 1 << i11;
            }
        }
        for (int i12 = 0; i12 < 6; i12++) {
            iArr2[i12] = zzgyVar.m7256e(8);
        }
        i3 = iM7256e3;
        iArr = iArr2;
        z2 = zM7255d;
        i4 = iM7256e;
        i5 = i6;
        int iM7256e4 = zzgyVar.m7256e(8);
        i7 = 0;
        while (i9 < i2) {
            if (zzgyVar.m7255d()) {
                i7 += 88;
            }
            if (zzgyVar.m7255d()) {
                i7 += 8;
            }
        }
        zzgyVar.m7253b(i7);
        if (i2 > 0) {
            int i13 = 8 - i2;
            zzgyVar.m7253b(i13 + i13);
        }
        return new zzgg(i3, z2, i4, i5, iArr, iM7256e4);
    }

    /* JADX INFO: renamed from: k */
    public static void m7090k(zzgy zzgyVar) {
        int iM7258g = zzgyVar.m7258g() + 1;
        zzgyVar.m7253b(8);
        for (int i2 = 0; i2 < iM7258g; i2++) {
            zzgyVar.m7258g();
            zzgyVar.m7258g();
            zzgyVar.m7252a();
        }
        zzgyVar.m7253b(20);
    }

    /* JADX INFO: renamed from: l */
    public static String m7091l(zzv zzvVar) {
        String str;
        String str2 = zzvVar.f21061o;
        if (Objects.equals(str2, "video/dolby-vision") && (str = zzvVar.f21057k) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return "video/avc";
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return str2;
    }
}

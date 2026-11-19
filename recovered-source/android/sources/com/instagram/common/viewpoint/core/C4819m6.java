package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.location.LocationRequestCompat;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4819m6 implements InterfaceC2923H9 {
    public static byte[] A0e;
    public static String[] A0f = {"ywSCwlzG1SMdvvW", "WbYO2rYjmhbf4R3oYDPvQZ3H98amgjSr", "Za", "aa8pMmtLKrvpWkukTfymetmlHniL9M", "752FE5aLUbaesINptKDix8v", "1m6bsNbzXuacY99BBbBsLUDHw0asFdhp", "tFAwrqTGVJ2tUOf2i", "X0elgRXJnrwhMbXNAucG6j3nQ1B9k96A"};
    public static final InterfaceC2927HD A0g;
    public static final C5064qI A0h;
    public static final byte[] A0i;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public SparseArray<C3044J7> A0D;
    public C21864v A0E;
    public InterfaceC2924HA A0F;
    public C3044J7 A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public InterfaceC2953Hd[] A0K;
    public InterfaceC2953Hd[] A0L;
    public final int A0M;
    public final DrmInitData A0N;
    public final C21864v A0O;
    public final C21864v A0P;
    public final C21864v A0Q;
    public final C21864v A0R;
    public final C21864v A0S;
    public final C219453 A0T;
    public final InterfaceC2953Hd A0U;
    public final C2976I0 A0V;
    public final C3061JO A0W;
    public final ArrayDeque<C4827mE> A0X;
    public final ArrayDeque<C3043J6> A0Y;
    public final List<C5064qI> A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final byte[] A0d;

    /* JADX WARN: Code duplicated, block: B:11:0x0061  */
    /* JADX WARN: Code duplicated, block: B:14:0x0067  */
    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00be  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:62:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x011b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0120  */
    /* JADX WARN: Code duplicated, block: B:67:0x012f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0139  */
    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Code duplicated, block: B:70:0x013f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0143  */
    /* JADX WARN: Code duplicated, block: B:72:0x0147  */
    /* JADX WARN: Code duplicated, block: B:73:0x014b  */
    /* JADX WARN: Code duplicated, block: B:74:0x014f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0153  */
    /* JADX WARN: Code duplicated, block: B:78:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(C3044J7 c3044j7, int i2, long j2, int i3, C21864v c21864v, int i4) {
        boolean z;
        int iA0L;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j3;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z6;
        int i5;
        long j4;
        int iA0L2;
        int iA0L3;
        int iA0C;
        boolean z7;
        String[] strArr;
        int i6 = i4;
        long j5 = j2;
        c21864v.A0f(8);
        int iA00 = AbstractC3031Iu.A00(c21864v.A0C());
        C3061JO c3061jo = c3044j7.A05;
        C3063JQ c3063jq = c3044j7.A07;
        C3038J1 c3038j1 = c3063jq.A06;
        c3063jq.A0C[i2] = c21864v.A0L();
        c3063jq.A0E[i2] = c3063jq.A04;
        if ((iA00 & 1) == 0) {
            if ((iA00 & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            iA0L = c3038j1.A01;
            if (z) {
                iA0L = c21864v.A0L();
            }
            if ((iA00 & 256) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((iA00 & 512) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((iA00 & 1024) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((iA00 & 2048) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            j3 = 0;
            if (c3061jo.A08 != null) {
                j3 = c3061jo.A09[0];
            }
            iArr = c3063jq.A0B;
            jArr = c3063jq.A0D;
            zArr = c3063jq.A0G;
            if (c3061jo.A03 == 2) {
                z6 = false;
            } else {
                z6 = false;
            }
            i5 = i6 + c3063jq.A0C[i2];
            j4 = c3061jo.A06;
            if (i2 > 0) {
                j5 = c3063jq.A05;
            }
            while (i6 < i5) {
                if (z2) {
                    iA0L2 = c21864v.A0L();
                } else {
                    iA0L2 = c3038j1.A00;
                }
                if (z3) {
                    iA0L3 = c21864v.A0L();
                    strArr = A0f;
                    if (strArr[3].length() != strArr[6].length()) {
                        String[] strArr2 = A0f;
                        strArr2[1] = "prYCRILb9XoLiqEuzjLvSymHGedE7tyJ";
                        strArr2[5] = "tQPxWhVMkiMqfE1WSn5JfVNHf8FlQpL7";
                    }
                } else {
                    iA0L3 = c3038j1.A03;
                }
                if (i6 != 0) {
                    if (z4) {
                        iA0C = c21864v.A0C();
                    } else if (A0f[4].length() == 23) {
                        A0f[4] = "VUSN2W3IkwtruuiuKY2zNmE";
                        iA0C = c3038j1.A01;
                    }
                } else if (z4) {
                    iA0C = c21864v.A0C();
                } else if (A0f[4].length() == 23) {
                    A0f[4] = "VUSN2W3IkwtruuiuKY2zNmE";
                    iA0C = c3038j1.A01;
                }
                jArr[i6] = AbstractC22035C.A0U((((long) (z5 ? c21864v.A0C() : 0)) + j5) - j3, 1000000L, j4);
                if (((iA0C >> 16) & 1) == 0) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                zArr[i6] = z7;
                iArr[i6] = iA0L3;
                j5 += (long) iA0L2;
                i6++;
            }
            c3063jq.A05 = j5;
            return i5;
        }
        long[] jArr2 = c3063jq.A0E;
        String[] strArr3 = A0f;
        if (strArr3[1].charAt(23) == strArr3[5].charAt(23)) {
            A0f[2] = "02";
            jArr2[i2] = jArr2[i2] + ((long) c21864v.A0C());
            if ((iA00 & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            iA0L = c3038j1.A01;
            if (z) {
                iA0L = c21864v.A0L();
            }
            if ((iA00 & 256) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((iA00 & 512) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((iA00 & 1024) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((iA00 & 2048) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            j3 = 0;
            if (c3061jo.A08 != null && c3061jo.A08.length == 1 && c3061jo.A08[0] == 0) {
                j3 = c3061jo.A09[0];
            }
            iArr = c3063jq.A0B;
            jArr = c3063jq.A0D;
            zArr = c3063jq.A0G;
            if (c3061jo.A03 == 2 || (i3 & 1) == 0) {
                z6 = false;
            } else {
                z6 = true;
            }
            i5 = i6 + c3063jq.A0C[i2];
            j4 = c3061jo.A06;
            if (i2 > 0) {
                j5 = c3063jq.A05;
            }
            while (i6 < i5) {
                if (z2) {
                    iA0L2 = c21864v.A0L();
                } else {
                    iA0L2 = c3038j1.A00;
                }
                if (z3) {
                    iA0L3 = c21864v.A0L();
                    strArr = A0f;
                    if (strArr[3].length() != strArr[6].length()) {
                        String[] strArr4 = A0f;
                        strArr4[1] = "prYCRILb9XoLiqEuzjLvSymHGedE7tyJ";
                        strArr4[5] = "tQPxWhVMkiMqfE1WSn5JfVNHf8FlQpL7";
                    }
                } else {
                    iA0L3 = c3038j1.A03;
                }
                if (i6 != 0 && z) {
                    iA0C = iA0L;
                } else if (z4) {
                    iA0C = c21864v.A0C();
                } else if (A0f[4].length() == 23) {
                    A0f[4] = "VUSN2W3IkwtruuiuKY2zNmE";
                    iA0C = c3038j1.A01;
                }
                jArr[i6] = AbstractC22035C.A0U((((long) (z5 ? c21864v.A0C() : 0)) + j5) - j3, 1000000L, j4);
                if (((iA0C >> 16) & 1) == 0 || (z6 && i6 != 0)) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                zArr[i6] = z7;
                iArr[i6] = iA0L3;
                j5 += (long) iA0L2;
                i6++;
            }
            c3063jq.A05 = j5;
            return i5;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C4860my> A04(C21864v c21864v, long j2) throws C20883K {
        long jA0R;
        long jA0R2;
        c21864v.A0f(8);
        int iA01 = AbstractC3031Iu.A01(c21864v.A0C());
        c21864v.A0g(4);
        long jA0Q = c21864v.A0Q();
        if (iA01 == 0) {
            jA0R = c21864v.A0Q();
            jA0R2 = j2 + c21864v.A0Q();
        } else {
            jA0R = c21864v.A0R();
            jA0R2 = j2 + c21864v.A0R();
        }
        long jA0U = AbstractC22035C.A0U(jA0R, 1000000L, jA0Q);
        c21864v.A0g(2);
        int iA0M = c21864v.A0M();
        int[] iArr = new int[iA0M];
        long[] jArr = new long[iA0M];
        long[] jArr2 = new long[iA0M];
        long[] jArr3 = new long[iA0M];
        long jA0U2 = jA0U;
        for (int i2 = 0; i2 < iA0M; i2++) {
            int iA0C = c21864v.A0C();
            if ((Integer.MIN_VALUE & iA0C) != 0) {
                throw new C20883K(A0B(634, 28, 93));
            }
            long jA0Q2 = c21864v.A0Q();
            iArr[i2] = Integer.MAX_VALUE & iA0C;
            jArr[i2] = jA0R2;
            jArr3[i2] = jA0U2;
            jA0R += jA0Q2;
            jA0U2 = AbstractC22035C.A0U(jA0R, 1000000L, jA0Q);
            String[] strArr = A0f;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0f[7] = "mBjUzKzbBV9DJWZlH52EoviqXd7Fx3w7";
            jArr2[i2] = jA0U2 - jArr3[i2];
            c21864v.A0g(4);
            jA0R2 += (long) iArr[i2];
        }
        return Pair.create(Long.valueOf(jA0U), new C4860my(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3044J7 A09(C21864v c21864v, SparseArray<C3044J7> sparseArray, boolean z) {
        c21864v.A0f(8);
        int iA00 = AbstractC3031Iu.A00(c21864v.A0C());
        C3044J7 c3044j7A08 = A08(sparseArray, c21864v.A0C(), z);
        if (c3044j7A08 == null) {
            return null;
        }
        if ((iA00 & 1) != 0) {
            long jA0R = c21864v.A0R();
            c3044j7A08.A07.A04 = jA0R;
            c3044j7A08.A07.A03 = jA0R;
        }
        C3038J1 c3038j1 = c3044j7A08.A04;
        c3044j7A08.A07.A06 = new C3038J1((iA00 & 2) != 0 ? c21864v.A0L() - 1 : c3038j1.A02, (iA00 & 8) != 0 ? c21864v.A0L() : c3038j1.A00, (iA00 & 16) != 0 ? c21864v.A0L() : c3038j1.A03, (iA00 & 32) != 0 ? c21864v.A0L() : c3038j1.A01);
        return c3044j7A08;
    }

    public static String A0B(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0e, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        String[] strArr = A0f;
        if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[1] = "BGZmKOZPo9hBykc2GdFNUQpHC0I3sPv1";
        strArr2[5] = "CvUkm70dQ0grN9w1V6xWMg6HVylPciNL";
        A0e = new byte[]{84, 88, 95, 106, 113, 115, 62, 109, 119, 100, 123, 62, 114, 123, 109, 109, 62, 106, 118, 127, 112, 62, 118, 123, 127, 122, 123, 108, 62, 114, 123, 112, 121, 106, 118, 62, 54, 107, 112, 109, 107, 110, 110, 113, 108, 106, 123, 122, 55, 48, 99, 72, 82, 84, 95, 6, 69, 73, 83, 72, 82, 6, 79, 72, 6, 85, 68, 65, 86, 6, 7, 27, 6, 23, 6, 14, 83, 72, 85, 83, 86, 86, 73, 84, 82, 67, 66, 15, 8, 73, 98, 120, 126, 117, 44, 111, 99, 121, 98, 120, 44, 101, 98, 44, 127, 107, 124, 104, 44, 45, 49, 44, 61, 44, 36, 121, 98, 127, 121, 124, 124, 99, 126, 120, 105, 104, 37, 34, 104, 92, 79, 73, 67, 75, 64, 90, 75, 74, 99, 94, 26, 107, 86, 90, 92, 79, 77, 90, 65, 92, 57, 23, 30, 31, 2, 25, 30, 23, 80, 30, 21, 23, 17, 4, 25, 6, 21, 80, 31, 22, 22, 3, 21, 4, 80, 4, 31, 80, 3, 17, 29, 0, 28, 21, 80, 20, 17, 4, 17, 94, 116, 83, 75, 92, 81, 84, 89, 29, 115, 124, 113, 29, 81, 88, 83, 90, 73, 85, 113, 88, 92, 91, 29, 92, 73, 82, 80, 29, 89, 88, 91, 84, 83, 88, 78, 29, 88, 69, 73, 88, 83, 89, 88, 89, 29, 92, 73, 82, 80, 29, 78, 84, 71, 88, 29, 21, 72, 83, 78, 72, 77, 77, 82, 79, 73, 88, 89, 20, 19, 62, 23, 19, 20, 82, 19, 6, 29, 31, 82, 5, 27, 6, 26, 82, 30, 23, 28, 21, 6, 26, 82, 76, 82, 64, 67, 70, 69, 70, 74, 65, 68, 70, 69, 82, 90, 7, 28, 1, 7, 2, 2, 29, 0, 6, 23, 22, 91, 92, 2, 43, 32, 41, 58, 38, 110, 35, 39, 61, 35, 47, 58, 45, 38, 116, 110, 82, 123, 123, 110, 120, 105, 61, 105, 114, 61, 120, 115, 126, 111, 100, 109, 105, 116, 114, 115, 61, 121, 124, 105, 124, 61, 106, 124, 110, 61, 115, 120, 122, 124, 105, 116, 107, 120, 51, 123, 82, 82, 71, 81, 64, 20, 64, 91, 20, 81, 90, 80, 20, 91, 82, 20, 89, 80, 85, 64, 20, 67, 85, 71, 20, 90, 81, 83, 85, 64, 93, 66, 81, 26, 61, 4, 23, 0, 0, 27, 22, 27, 28, 21, 82, 38, 0, 19, 17, 25, 55, 28, 17, 0, 11, 2, 6, 27, 29, 28, 48, 29, 10, 82, 2, 19, 0, 19, 31, 23, 6, 23, 0, 1, 82, 27, 1, 82, 7, 28, 1, 7, 2, 2, 29, 0, 6, 23, 22, 92, 84, 108, 110, 119, 119, 98, 99, 39, 119, 116, 116, 111, 39, 102, 115, 104, 106, 39, 47, 97, 102, 110, 107, 98, 99, 39, 115, 104, 39, 98, 127, 115, 117, 102, 100, 115, 39, 114, 114, 110, 99, 46, 60, 4, 6, 31, 31, 6, 1, 8, 79, 14, 27, 0, 2, 79, 24, 6, 27, 7, 79, 3, 10, 1, 8, 27, 7, 79, 81, 79, 93, 94, 91, 88, 91, 87, 92, 89, 91, 88, 79, 71, 26, 1, 28, 26, 31, 31, 0, 29, 27, 10, 11, 70, 65, 79, 119, 117, 108, 108, 117, 114, 123, 60, 105, 114, 111, 105, 108, 108, 115, 110, 104, 121, 120, 60, 121, 113, 111, 123, 60, 106, 121, 110, 111, 117, 115, 114, 38, 60, 57, 2, 9, 20, 28, 9, 15, 24, 9, 8, 76, 1, 3, 3, 26, 76, 14, 3, 20, 66, 71, 124, 119, 106, 98, 119, 113, 102, 119, 118, 50, 97, 115, 123, 125, 50, 119, 124, 102, 96, 107, 50, 113, 125, 103, 124, 102, 40, 50, 107, 80, 86, 95, 80, 90, 82, 91, 90, 30, 87, 80, 90, 87, 76, 91, 93, 74, 30, 76, 91, 88, 91, 76, 91, 80, 93, 91, 107, 92, 79, 84, 92, 95, 81, 88, 29, 81, 88, 83, 90, 73, 85, 29, 89, 88, 78, 94, 79, 84, 77, 73, 84, 82, 83, 29, 84, 83, 29, 78, 90, 77, 89, 29, 91, 82, 72, 83, 89, 29, 21, 72, 83, 78, 72, 77, 77, 82, 79, 73, 88, 89, 20, 83, 66, 66, 94, 91, 81, 83, 70, 91, 93, 92, 29, 74, 31, 87, 95, 65, 85, 66, 83, 83, 79, 74, 64, 66, 87, 74, 76, 77, 12, 91, 14, 78, 83, 23, 14, 85, 87, 87, 70, 89, 84, 85, 95, 31, 88, 85, 70, 83, 40, 55, 58, 59, 49, 113, 51, 46, 106};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0I(C21864v c21864v, Uri uri) {
        String str;
        String str2;
        long jA05;
        long jA0U;
        long jA0Q;
        if (this.A0L == null || this.A0L.length == 0) {
            return;
        }
        c21864v.A0f(8);
        int iA01 = AbstractC3031Iu.A01(c21864v.A0C());
        long jA0U2 = -9223372036854775807L;
        switch (iA01) {
            case 0:
                str = (String) AbstractC21273y.A01(c21864v.A0U());
                str2 = (String) AbstractC21273y.A01(c21864v.A0U());
                if (A0f[2].length() != 2) {
                    throw new RuntimeException();
                }
                A0f[0] = "4yWaL9iFGGaDiXT";
                long jA0Q2 = c21864v.A0Q();
                jA0U2 = AbstractC22035C.A0U(c21864v.A0Q(), 1000000L, jA0Q2);
                jA05 = this.A0C != -9223372036854775807L ? this.A0C + jA0U2 : -9223372036854775807L;
                jA0U = AbstractC22035C.A0U(c21864v.A0Q(), 1000L, jA0Q2);
                jA0Q = c21864v.A0Q();
                break;
                break;
            case 1:
                long jA0Q3 = c21864v.A0Q();
                jA05 = AbstractC22035C.A0U(c21864v.A0R(), 1000000L, jA0Q3);
                jA0U = AbstractC22035C.A0U(c21864v.A0Q(), 1000L, jA0Q3);
                jA0Q = c21864v.A0Q();
                str = (String) AbstractC21273y.A01(c21864v.A0U());
                str2 = (String) AbstractC21273y.A01(c21864v.A0U());
                break;
            default:
                AbstractC21714g.A07(A0B(128, 22, 77), A0B(550, 35, 127) + iA01);
                return;
        }
        byte[] bArr = new byte[c21864v.A07()];
        c21864v.A0k(bArr, 0, c21864v.A07());
        int i2 = 0;
        C21864v c21864v2 = new C21864v(this.A0V.A01(new EventMessage(str, str2, jA0U, jA0Q, bArr)));
        int iA07 = c21864v2.A07();
        InterfaceC2953Hd[] interfaceC2953HdArr = this.A0L;
        int length = interfaceC2953HdArr.length;
        int i3 = 0;
        while (i3 < length) {
            InterfaceC2953Hd interfaceC2953Hd = interfaceC2953HdArr[i3];
            c21864v2.A0f(i2);
            interfaceC2953Hd.AKf(uri);
            interfaceC2953Hd.AIr(c21864v2, iA07);
            i3++;
            i2 = 0;
        }
        if (jA05 == -9223372036854775807L) {
            this.A0Y.addLast(new C3043J6(jA0U2, iA07));
            this.A03 += iA07;
            return;
        }
        if (this.A0T != null) {
            jA05 = this.A0T.A05(jA05);
        }
        if (this.A0b && this.A0A != -9223372036854775807L) {
            jA05 = this.A0A;
        }
        for (InterfaceC2953Hd interfaceC2953Hd2 : this.A0L) {
            interfaceC2953Hd2.AIu(jA05, 1, iA07, 0, null);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0J(C21864v c21864v, C21864v c21864v2, String str, C3063JQ c3063jq) throws C20883K {
        c21864v.A0f(8);
        int iA0C = c21864v.A0C();
        if (c21864v.A0C() != 1936025959) {
            return;
        }
        int iA01 = AbstractC3031Iu.A01(iA0C);
        if (A0f[2].length() != 2) {
            throw new RuntimeException();
        }
        A0f[0] = "QrVDtjxvyixdHPq";
        if (iA01 == 1) {
            c21864v.A0g(4);
        }
        if (c21864v.A0C() != 1) {
            throw new C20883K(A0B(50, 39, 69));
        }
        c21864v2.A0f(8);
        int iA0C2 = c21864v2.A0C();
        if (c21864v2.A0C() != 1936025959) {
            return;
        }
        int iA02 = AbstractC3031Iu.A01(iA0C2);
        if (iA02 == 1) {
            if (c21864v2.A0Q() == 0) {
                throw new C20883K(A0B(662, 55, 94));
            }
        } else if (iA02 >= 2) {
            c21864v2.A0g(4);
        }
        if (c21864v2.A0Q() != 1) {
            throw new C20883K(A0B(89, 39, 111));
        }
        c21864v2.A0g(1);
        int iA0I = c21864v2.A0I();
        int i2 = (iA0I & 240) >> 4;
        int i3 = iA0I & 15;
        boolean z = c21864v2.A0I() == 1;
        if (z) {
            int iA0I2 = c21864v2.A0I();
            byte[] bArr = new byte[16];
            c21864v2.A0k(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (iA0I2 == 0) {
                int iA0I3 = c21864v2.A0I();
                bArr2 = new byte[iA0I3];
                c21864v2.A0k(bArr2, 0, iA0I3);
            }
            c3063jq.A08 = true;
            c3063jq.A07 = new C3062JP(z, str, iA0I2, bArr, i2, i3, bArr2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0R(C4827mE c4827mE) throws C20883K {
        AbstractC21273y.A0A(this.A0W == null, A0B(585, 20, 15));
        DrmInitData drmInitDataA05 = A05(c4827mE.A02);
        C4827mE c4827mE2 = (C4827mE) AbstractC21273y.A01(c4827mE.A06(1836475768));
        SparseArray<C3038J1> sparseArray = new SparseArray<>();
        long jA01 = -9223372036854775807L;
        int size = c4827mE2.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4826mD c4826mD = c4827mE2.A02.get(i2);
            if (((AbstractC3031Iu) c4826mD).A00 == 1953654136) {
                Pair<Integer, C3038J1> pairA03 = A03(c4826mD.A00);
                int iIntValue = ((Integer) pairA03.first).intValue();
                Object obj = pairA03.second;
                if (A0f[7].charAt(29) == '0') {
                    throw new RuntimeException();
                }
                A0f[0] = "KUxAVqQLzsv7ujT";
                sparseArray.put(iIntValue, (C3038J1) obj);
            } else {
                int i3 = ((AbstractC3031Iu) c4826mD).A00;
                if (A0f[7].charAt(29) != '0') {
                    A0f[2] = "EA";
                    if (i3 == 1835362404) {
                        jA01 = A01(c4826mD.A00);
                    }
                } else {
                    String[] strArr = A0f;
                    strArr[3] = "P1l2XCTjN0GLzwkC984rH7zDpCyyqZ";
                    strArr[6] = "39xRaNo9QFkrA6tLq";
                    if (i3 == 237072518) {
                        jA01 = A01(c4826mD.A00);
                    }
                }
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c4827mE.A01.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C4827mE c4827mE3 = c4827mE.A01.get(i4);
            if (((AbstractC3031Iu) c4827mE3).A00 == 1953653099) {
                C3061JO c3061joA0A = A0A(AbstractC3037J0.A0J(c4827mE3, c4827mE.A07(1836476516), jA01, drmInitDataA05, (this.A0M & 16) != 0, false));
                if (c3061joA0A != null) {
                    sparseArray2.put(c3061joA0A.A00, c3061joA0A);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0D.size() != 0) {
            AbstractC21273y.A08(this.A0D.size() == size3);
            for (int i5 = 0; i5 < size3; i5++) {
                C3061JO c3061jo = (C3061JO) sparseArray2.valueAt(i5);
                this.A0D.get(c3061jo.A00).A08(c3061jo, A06(sparseArray, c3061jo.A00));
            }
            return;
        }
        for (int i6 = 0; i6 < size3; i6++) {
            C3061JO c3061jo2 = (C3061JO) sparseArray2.valueAt(i6);
            C3044J7 c3044j7 = new C3044J7(this.A0F.AKS(i6, c3061jo2.A03));
            c3044j7.A08(c3061jo2, A06(sparseArray, c3061jo2.A00));
            this.A0D.put(c3061jo2.A00, c3044j7);
            this.A08 = Math.max(this.A08, c3061jo2.A04);
        }
        A0D();
        InterfaceC2924HA interfaceC2924HA = this.A0F;
        if (A0f[7].charAt(29) != '0') {
            String[] strArr2 = A0f;
            strArr2[3] = "NZTZhjA83sW4NrmiIOwSslFR5UdjBx";
            strArr2[6] = "jWtg8I2sGrLmtghr5";
            interfaceC2924HA.A6O();
            return;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006a A[PHI: r0 r3
  0x006a: PHI (r0v33 com.facebook.ads.redexgen.X.mD) = (r0v12 com.facebook.ads.redexgen.X.mD), (r0v38 com.facebook.ads.redexgen.X.mD) binds: [B:43:0x0106, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r3v6 com.facebook.ads.redexgen.X.JP) = (r3v1 com.facebook.ads.redexgen.X.JP), (r3v7 com.facebook.ads.redexgen.X.JP) binds: [B:43:0x0106, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0T(C4827mE c4827mE, SparseArray<C3044J7> sparseArray, int i2, byte[] bArr, boolean z) throws C20883K {
        C3062JP c3062jpA00;
        C4826mD c4826mDA07;
        C3044J7 c3044j7A09 = A09(c4827mE.A07(1952868452).A00, sparseArray, z);
        if (c3044j7A09 == null) {
            return;
        }
        C3063JQ c3063jq = c3044j7A09.A07;
        long jA02 = c3063jq.A05;
        c3044j7A09.A05();
        if (c4827mE.A07(1952867444) != null) {
            int i3 = i2 & 2;
            if (A0f[0].length() != 15) {
                throw new RuntimeException();
            }
            A0f[4] = "8CfIIEomKXR2z1rzEceKdGz";
            if (i3 == 0) {
                jA02 = A02(c4827mE.A07(1952867444).A00);
            }
        }
        A0U(c4827mE, c3044j7A09, jA02, i2);
        C3061JO c3061jo = c3044j7A09.A05;
        if (A0f[2].length() != 2) {
            c3062jpA00 = c3061jo.A00(c3063jq.A06.A02);
            c4826mDA07 = c4827mE.A07(1935763834);
            if (c4826mDA07 != null) {
                A0W(c3062jpA00, c4826mDA07.A00, c3063jq);
            }
        } else {
            String[] strArr = A0f;
            strArr[1] = "KgLNgt4jXc3ey27lHSoy2KaHmXxTtgSL";
            strArr[5] = "0TnPqkkfx8cOSuGK7tHkJ8yHXf83oy0i";
            c3062jpA00 = c3061jo.A00(c3063jq.A06.A02);
            c4826mDA07 = c4827mE.A07(1935763834);
            if (c4826mDA07 != null) {
                A0W(c3062jpA00, c4826mDA07.A00, c3063jq);
            }
        }
        C4826mD c4826mDA08 = c4827mE.A07(1935763823);
        if (c4826mDA08 != null) {
            C21864v c21864v = c4826mDA08.A00;
            if (A0f[7].charAt(29) != '0') {
                A0f[2] = "tW";
                A0K(c21864v, c3063jq);
            } else {
                A0f[0] = "kXc0iULHRQw05uA";
                A0K(c21864v, c3063jq);
            }
        }
        C4826mD c4826mDA09 = c4827mE.A07(1936027235);
        if (c4826mDA09 != null) {
            A0L(c4826mDA09.A00, c3063jq);
        }
        C4826mD c4826mDA010 = c4827mE.A07(1935828848);
        C4826mD c4826mDA011 = c4827mE.A07(1936158820);
        if (c4826mDA010 != null && c4826mDA011 != null) {
            A0J(c4826mDA010.A00, c4826mDA011.A00, c3062jpA00 != null ? c3062jpA00.A02 : null, c3063jq);
        }
        int size = c4827mE.A02.size();
        for (int i4 = 0; i4 < size; i4++) {
            C4826mD c4826mD = c4827mE.A02.get(i4);
            if (((AbstractC3031Iu) c4826mD).A00 == 1970628964) {
                A0M(c4826mD.A00, c3063jq, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0W(C3062JP c3062jp, C21864v c21864v, C3063JQ c3063jq) throws C20883K {
        int i2 = c3062jp.A00;
        c21864v.A0f(8);
        if ((AbstractC3031Iu.A00(c21864v.A0C()) & 1) == 1) {
            c21864v.A0g(8);
        }
        int iA0I = c21864v.A0I();
        int iA0L = c21864v.A0L();
        if (iA0L != c3063jq.A00) {
            throw new C20883K(A0B(308, 17, 45) + iA0L + A0B(0, 2, 27) + c3063jq.A00);
        }
        int i3 = 0;
        if (iA0I == 0) {
            boolean[] zArr = c3063jq.A0F;
            for (int i4 = 0; i4 < iA0L; i4++) {
                int iA0I2 = c21864v.A0I();
                i3 += iA0I2;
                zArr[i4] = iA0I2 > i2;
            }
        } else {
            i3 = 0 + (iA0I * iA0L);
            Arrays.fill(c3063jq.A0F, 0, iA0L, iA0I > i2);
        }
        c3063jq.A02(i3);
    }

    static {
        A0E();
        A0g = new InterfaceC2927HD() { // from class: com.facebook.ads.redexgen.X.mA
            @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
            public final InterfaceC2923H9[] A5N() {
                return C4819m6.A0b();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
            public final /* synthetic */ InterfaceC2923H9[] A5O(Uri uri, Map map) {
                return AbstractC2926HC.A01(this, uri, map);
            }
        };
        A0i = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0h = new C20592p().A11(A0B(717, 18, 81)).A14();
    }

    public C4819m6() {
        this(0);
    }

    public C4819m6(int i2) {
        this(i2, null);
    }

    public C4819m6(int i2, C219453 c219453) {
        this(i2, c219453, null, null);
    }

    public C4819m6(int i2, C219453 c219453, C3061JO c3061jo, DrmInitData drmInitData) {
        this(i2, c219453, c3061jo, drmInitData, Collections.emptyList());
    }

    public C4819m6(int i2, C219453 c219453, C3061JO c3061jo, DrmInitData drmInitData, List<C5064qI> list) {
        this(i2, c219453, c3061jo, drmInitData, list, null, false, false, false);
    }

    public C4819m6(int i2, C219453 c219453, C3061JO c3061jo, DrmInitData drmInitData, List<C5064qI> list, InterfaceC2953Hd interfaceC2953Hd, boolean z, boolean z2, boolean z3) {
        this.A0A = -9223372036854775807L;
        this.A0M = (c3061jo != null ? 8 : 0) | i2;
        this.A0T = c219453;
        this.A0W = c3061jo;
        this.A0N = drmInitData;
        this.A0Z = Collections.unmodifiableList(list);
        this.A0U = interfaceC2953Hd;
        this.A0c = z;
        this.A0b = z2;
        this.A0a = z3;
        this.A0V = new C2976I0();
        this.A0O = new C21864v(16);
        this.A0R = new C21864v(AbstractC2942HS.A03);
        this.A0Q = new C21864v(5);
        this.A0P = new C21864v();
        this.A0d = new byte[16];
        this.A0S = new C21864v(this.A0d);
        this.A0X = new ArrayDeque<>();
        this.A0Y = new ArrayDeque<>();
        this.A0D = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        A0C();
    }

    public static long A01(C21864v c21864v) {
        c21864v.A0f(8);
        int fullAtom = c21864v.A0C();
        return AbstractC3031Iu.A01(fullAtom) == 0 ? c21864v.A0Q() : c21864v.A0R();
    }

    public static long A02(C21864v c21864v) {
        c21864v.A0f(8);
        int fullAtom = c21864v.A0C();
        int version = AbstractC3031Iu.A01(fullAtom);
        return version == 1 ? c21864v.A0R() : c21864v.A0Q();
    }

    public static Pair<Integer, C3038J1> A03(C21864v c21864v) {
        c21864v.A0f(12);
        int defaultSampleDescriptionIndex = c21864v.A0C();
        int trackId = c21864v.A0L();
        int defaultSampleFlags = c21864v.A0L();
        int defaultSampleSize = c21864v.A0L();
        int defaultSampleDuration = c21864v.A0C();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new C3038J1(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A05(List<C4826mD> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4826mD c4826mD = list.get(i2);
            int leafChildrenSize = A0f[4].length();
            if (leafChildrenSize != 23) {
                throw new RuntimeException();
            }
            A0f[0] = "gRucWkmmr3YeQcV";
            C4826mD c4826mD2 = c4826mD;
            int leafChildrenSize2 = ((AbstractC3031Iu) c4826mD2).A00;
            if (leafChildrenSize2 == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c4826mD2.A00.A00;
                UUID uuidA02 = AbstractC3054JH.A02(bArr);
                if (uuidA02 == null) {
                    AbstractC21714g.A07(A0B(128, 22, 77), A0B(455, 42, 100));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidA02, A0B(766, 9, 61), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private C3038J1 A06(SparseArray<C3038J1> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (C3038J1) AbstractC21273y.A01(sparseArray.get(i2));
    }

    public static C3044J7 A07(SparseArray<C3044J7> sparseArray) {
        C3044J7 c3044j7 = null;
        long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3044J7 c3044j7ValueAt = sparseArray.valueAt(i2);
            if (c3044j7ValueAt.A02 != c3044j7ValueAt.A07.A01) {
                long nextTrackRunOffset = c3044j7ValueAt.A07.A0E[c3044j7ValueAt.A02];
                if (nextTrackRunOffset < j2) {
                    c3044j7 = c3044j7ValueAt;
                    j2 = nextTrackRunOffset;
                }
            }
        }
        return c3044j7;
    }

    public static C3044J7 A08(SparseArray<C3044J7> sparseArray, int i2, boolean z) {
        if (sparseArray.size() == 1 && !z) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i2);
    }

    private final C3061JO A0A(C3061JO c3061jo) {
        return c3061jo;
    }

    private void A0C() {
        this.A02 = 0;
        this.A00 = 0;
    }

    private void A0D() {
        if (this.A0L == null) {
            this.A0L = new InterfaceC2953Hd[2];
            int i2 = 0;
            if (this.A0U != null) {
                this.A0L[0] = this.A0U;
                i2 = 0 + 1;
            }
            int emsgTrackOutputCount = this.A0M;
            if ((emsgTrackOutputCount & 4) != 0) {
                InterfaceC2953Hd[] interfaceC2953HdArr = this.A0L;
                int i3 = i2 + 1;
                if (A0f[7].charAt(29) == '0') {
                    throw new RuntimeException();
                }
                String[] strArr = A0f;
                strArr[1] = "2Ynf6gmdLfe6xE9EEWKUzFfHKl41sL7a";
                strArr[5] = "AN0qqeacVBgpTr6ZS3JdezHHRUzhKU8l";
                interfaceC2953HdArr[i2] = this.A0F.AKS(this.A0D.size(), 5);
                i2 = i3;
            }
            this.A0L = (InterfaceC2953Hd[]) Arrays.copyOf(this.A0L, i2);
            for (InterfaceC2953Hd interfaceC2953Hd : this.A0L) {
                interfaceC2953Hd.A6e(A0h);
            }
        }
        if (this.A0K == null) {
            this.A0K = new InterfaceC2953Hd[this.A0Z.size()];
            for (int i4 = 0; i4 < i; i4++) {
                InterfaceC2924HA interfaceC2924HA = this.A0F;
                int i5 = this.A0D.size();
                InterfaceC2953Hd output = interfaceC2924HA.AKS(i5 + 1 + i4, 3);
                output.A6e(this.A0Z.get(i4));
                this.A0K[i4] = output;
            }
        }
    }

    private void A0F(long j2) {
        while (!this.A0Y.isEmpty()) {
            C3043J6 c3043j6RemoveFirst = this.A0Y.removeFirst();
            this.A03 -= c3043j6RemoveFirst.A00;
            long jA05 = j2 + c3043j6RemoveFirst.A01;
            if (this.A0T != null) {
                jA05 = this.A0T.A05(jA05);
            }
            for (InterfaceC2953Hd interfaceC2953Hd : this.A0L) {
                interfaceC2953Hd.AIu(jA05, 1, c3043j6RemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0G(long j2) throws C20883K {
        while (!this.A0X.isEmpty() && this.A0X.peek().A00 == j2) {
            A0P(this.A0X.pop());
        }
        A0C();
    }

    public static void A0H(C21864v c21864v, int i2, C3063JQ c3063jq) throws C20883K {
        c21864v.A0f(i2 + 8);
        int fullAtom = c21864v.A0C();
        int flags = AbstractC3031Iu.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z = fullAtom3 != 0;
            int sampleCount = c21864v.A0L();
            int fullAtom4 = c3063jq.A00;
            if (sampleCount == fullAtom4) {
                Arrays.fill(c3063jq.A0F, 0, sampleCount, z);
                int fullAtom5 = c21864v.A07();
                c3063jq.A02(fullAtom5);
                c3063jq.A04(c21864v);
                return;
            }
            StringBuilder sbAppend = new StringBuilder().append(A0B(308, 17, 45)).append(sampleCount).append(A0B(0, 2, 27));
            int fullAtom6 = c3063jq.A00;
            throw new C20883K(sbAppend.append(fullAtom6).toString());
        }
        throw new C20883K(A0B(399, 56, 17));
    }

    public static void A0K(C21864v c21864v, C3063JQ c3063jq) throws C20883K {
        c21864v.A0f(8);
        int flags = c21864v.A0C();
        int fullAtom = AbstractC3031Iu.A00(flags) & 1;
        if (fullAtom == 1) {
            c21864v.A0g(8);
        }
        int iA0L = c21864v.A0L();
        if (iA0L == 1) {
            int entryCount = AbstractC3031Iu.A01(flags);
            c3063jq.A03 += entryCount == 0 ? c21864v.A0Q() : c21864v.A0R();
            return;
        }
        throw new C20883K(A0B(TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 29, 113) + iA0L);
    }

    public static void A0L(C21864v c21864v, C3063JQ c3063jq) throws C20883K {
        A0H(c21864v, 0, c3063jq);
    }

    public static void A0M(C21864v c21864v, C3063JQ c3063jq, byte[] bArr) throws C20883K {
        c21864v.A0f(8);
        c21864v.A0k(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0i)) {
            return;
        }
        A0H(c21864v, 16, c3063jq);
    }

    private void A0N(InterfaceC4855ms interfaceC4855ms) throws IOException {
        int i2 = ((int) this.A07) - this.A00;
        if (this.A0E != null) {
            interfaceC4855ms.readFully(this.A0E.A00, 8, i2);
            A0V(new C4826mD(this.A01, this.A0E), interfaceC4855ms);
        } else {
            interfaceC4855ms.AK3(i2);
        }
        A0G(interfaceC4855ms.A8n());
    }

    private void A0O(InterfaceC4855ms interfaceC4855ms) throws IOException {
        C3044J7 c3044j7ValueAt = null;
        long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
        int size = this.A0D.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3044J7 nextTrackBundle = this.A0D.valueAt(i2);
            C3063JQ c3063jq = nextTrackBundle.A07;
            if (c3063jq.A0A) {
                long nextDataOffset = c3063jq.A03;
                String[] strArr = A0f;
                if (strArr[3].length() == strArr[6].length()) {
                    throw new RuntimeException();
                }
                A0f[4] = "mIjUpcDFQdM2YkTgY6cnbvy";
                if (nextDataOffset < j2) {
                    j2 = c3063jq.A03;
                    c3044j7ValueAt = this.A0D.valueAt(i2);
                }
            }
        }
        if (c3044j7ValueAt == null) {
            if (A0f[4].length() == 23) {
                A0f[0] = "NbtoUSPOiQE3wq0";
                this.A02 = 3;
                return;
            }
            throw new RuntimeException();
        }
        int iA8n = (int) (j2 - interfaceC4855ms.A8n());
        if (iA8n >= 0) {
            interfaceC4855ms.AK3(iA8n);
            c3044j7ValueAt.A07.A05(interfaceC4855ms);
            return;
        }
        throw new C20883K(A0B(325, 39, 126));
    }

    private void A0P(C4827mE c4827mE) throws C20883K {
        if (((AbstractC3031Iu) c4827mE).A00 == 1836019574) {
            A0R(c4827mE);
        } else if (((AbstractC3031Iu) c4827mE).A00 == 1836019558) {
            A0Q(c4827mE);
        } else {
            if (this.A0X.isEmpty()) {
                return;
            }
            this.A0X.peek().A08(c4827mE);
        }
    }

    private void A0Q(C4827mE c4827mE) throws C20883K {
        A0S(c4827mE, this.A0D, this.A0M, this.A0d, this.A0c);
        DrmInitData drmInitDataA05 = this.A0N != null ? null : A05(c4827mE.A02);
        if (drmInitDataA05 != null) {
            int i2 = this.A0D.size();
            for (int trackCount = 0; trackCount < i2; trackCount++) {
                this.A0D.valueAt(trackCount).A07(drmInitDataA05);
            }
        }
        if (this.A0B != -9223372036854775807L) {
            int size = this.A0D.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.A0D.valueAt(i3).A06(this.A0B);
            }
            this.A0B = -9223372036854775807L;
        }
    }

    public static void A0S(C4827mE c4827mE, SparseArray<C3044J7> sparseArray, int i2, byte[] bArr, boolean z) throws C20883K {
        int size = c4827mE.A01.size();
        for (int i3 = 0; i3 < size; i3++) {
            C4827mE child = c4827mE.A01.get(i3);
            int i4 = ((AbstractC3031Iu) child).A00;
            if (i4 == 1953653094) {
                boolean z2 = true;
                if (size <= 1 || !z) {
                    z2 = false;
                }
                A0T(child, sparseArray, i2, bArr, z2);
            }
        }
    }

    public static void A0U(C4827mE c4827mE, C3044J7 c3044j7, long j2, int i2) {
        int i3 = 0;
        int i4 = 0;
        List<C4826mD> list = c4827mE.A02;
        int size = list.size();
        int i5 = 0;
        while (true) {
            String[] strArr = A0f;
            if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                throw new RuntimeException();
            }
            A0f[0] = "3b9EJYgpciD07do";
            if (i5 < size) {
                C4826mD c4826mD = list.get(i5);
                if (((AbstractC3031Iu) c4826mD).A00 == 1953658222) {
                    C21864v trunData = c4826mD.A00;
                    trunData.A0f(12);
                    int iA0L = trunData.A0L();
                    if (iA0L > 0) {
                        i4 += iA0L;
                        i3++;
                    }
                }
                i5++;
            } else {
                c3044j7.A02 = 0;
                c3044j7.A00 = 0;
                c3044j7.A01 = 0;
                c3044j7.A07.A03(i3, i4);
                int i6 = 0;
                int trunStartPosition = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    C4826mD c4826mD2 = list.get(i7);
                    if (((AbstractC3031Iu) c4826mD2).A00 == 1953658222) {
                        trunStartPosition = A00(c3044j7, i6, j2, i2, c4826mD2.A00, trunStartPosition);
                        i6++;
                    }
                }
                return;
            }
        }
    }

    private void A0V(C4826mD c4826mD, InterfaceC4855ms interfaceC4855ms) throws C20883K {
        Uri uriA9P;
        if (!this.A0X.isEmpty()) {
            this.A0X.peek().A09(c4826mD);
            return;
        }
        if (((AbstractC3031Iu) c4826mD).A00 == 1936286840) {
            Pair<Long, C4860my> pairA04 = A04(c4826mD.A00, interfaceC4855ms.A8n());
            this.A0C = ((Long) pairA04.first).longValue();
            this.A0F.AJ7((InterfaceC2948HY) pairA04.second);
            if (A0f[2].length() != 2) {
                throw new RuntimeException();
            }
            A0f[2] = "jw";
            this.A0H = true;
            return;
        }
        if (((AbstractC3031Iu) c4826mD).A00 != 1701671783 || (uriA9P = interfaceC4855ms.A9P()) == null) {
            return;
        }
        A0I(c4826mD.A00, uriA9P);
    }

    public static boolean A0X(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1836019558 || i2 == 1953653094 || i2 == 1836475768 || i2 == 1701082227;
    }

    public static boolean A0Y(int i2) {
        if (i2 != 1751411826 && i2 != 1835296868 && i2 != 1836476516 && i2 != 1936286840 && i2 != 1937011556 && i2 != 1952867444 && i2 != 1952868452 && i2 != 1953196132 && i2 != 1953654136 && i2 != 1953658222 && i2 != 1886614376) {
            if (A0f[0].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0f;
            strArr[1] = "pufslWDHGkolcxIdleA53YlHTmcCni23";
            strArr[5] = "pxTVwd0BvZHkKJbeu8mcyfUHnPvesqsQ";
            if (i2 != 1935763834 && i2 != 1935763823 && i2 != 1936027235 && i2 != 1970628964 && i2 != 1935828848 && i2 != 1936158820 && i2 != 1701606260 && i2 != 1835362404 && i2 != 1701671783) {
                return false;
            }
        }
        return true;
    }

    private boolean A0Z(InterfaceC4855ms interfaceC4855ms) throws IOException {
        if (this.A00 == 0) {
            if (!interfaceC4855ms.AHR(this.A0O.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0O.A0f(0);
            this.A07 = this.A0O.A0Q();
            this.A01 = this.A0O.A0C();
        }
        if (this.A07 == 1) {
            interfaceC4855ms.readFully(this.A0O.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0O.A0R();
        } else if (this.A07 == 0) {
            long jA8O = interfaceC4855ms.A8O();
            if (jA8O == -1 && !this.A0X.isEmpty()) {
                jA8O = this.A0X.peek().A00;
            }
            if (jA8O != -1) {
                long jA8n = jA8O - interfaceC4855ms.A8n();
                int trackCount = this.A00;
                this.A07 = jA8n + ((long) trackCount);
            }
        }
        if (this.A07 >= this.A00) {
            long jA8n2 = interfaceC4855ms.A8n() - ((long) this.A00);
            if (this.A01 == 1836019558) {
                int size = this.A0D.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C3063JQ c3063jq = this.A0D.valueAt(i2).A07;
                    c3063jq.A02 = jA8n2;
                    c3063jq.A03 = jA8n2;
                    c3063jq.A04 = jA8n2;
                }
            }
            if (this.A01 == 1835295092) {
                this.A0G = null;
                this.A09 = this.A07 + jA8n2;
                if (!this.A0H) {
                    this.A0F.AJ7(new C4850mn(this.A08, jA8n2));
                    this.A0H = true;
                }
                this.A02 = 2;
                return true;
            }
            boolean zA0X = A0X(this.A01);
            String[] strArr = A0f;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0f[7] = "BTpsgrbOJA5y808qoKaZGmPima83kMX9";
            if (zA0X) {
                long jA8n3 = (interfaceC4855ms.A8n() + this.A07) - 8;
                this.A0X.push(new C4827mE(this.A01, jA8n3));
                if (this.A07 == this.A00) {
                    A0G(jA8n3);
                } else {
                    A0C();
                }
            } else if (A0Y(this.A01)) {
                if (this.A00 != 8) {
                    throw new C20883K(A0B(208, 51, 94));
                }
                if (this.A07 <= 2147483647L) {
                    this.A0E = new C21864v((int) this.A07);
                    System.arraycopy(this.A0O.A00, 0, this.A0E.A00, 0, 8);
                    this.A02 = 1;
                } else {
                    throw new C20883K(A0B(259, 49, 17));
                }
            } else if (this.A07 <= 2147483647L) {
                this.A0E = null;
                this.A02 = 1;
            } else {
                throw new C20883K(A0B(497, 53, 12));
            }
            return true;
        }
        throw new C20883K(A0B(2, 48, 125));
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x002e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:37:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0106  */
    /* JADX WARN: Code duplicated, block: B:41:0x011e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0132  */
    /* JADX WARN: Code duplicated, block: B:47:0x014a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0171  */
    /* JADX WARN: Code duplicated, block: B:55:0x0184  */
    /* JADX WARN: Code duplicated, block: B:58:0x018a  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:64:0x0201  */
    /* JADX WARN: Code duplicated, block: B:66:0x0205  */
    /* JADX WARN: Code duplicated, block: B:69:0x022a  */
    /* JADX WARN: Code duplicated, block: B:72:0x023f A[LOOP:1: B:67:0x0224->B:72:0x023f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x025d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0266  */
    /* JADX WARN: Code duplicated, block: B:84:0x0290  */
    /* JADX WARN: Code duplicated, block: B:86:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:89:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:91:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean A0a(InterfaceC4855ms interfaceC4855ms) throws IOException {
        C3063JQ c3063jq;
        C3061JO c3061jo;
        InterfaceC2953Hd interfaceC2953Hd;
        int i2;
        long jA00;
        int i3;
        int i4;
        boolean z;
        C2951Hb c2951Hb;
        C3062JP c3062jpA00;
        ?? r11;
        int i5;
        String[] strArr;
        String str;
        String[] strArr2;
        byte[] bArr;
        int i6;
        int i7;
        int iA0C;
        boolean z2;
        int iAIp;
        int i8 = 4;
        int i9 = 1;
        int i10 = 0;
        if (this.A02 == 3) {
            if (this.A0G == null) {
                C3044J7 c3044j7A07 = A07(this.A0D);
                if (c3044j7A07 == null) {
                    int iA8n = (int) (this.A09 - interfaceC4855ms.A8n());
                    if (A0f[0].length() == 15) {
                        A0f[4] = "i1YiOY4gD0FAVv8vBgekv9L";
                        if (iA8n >= 0) {
                            interfaceC4855ms.AK3(iA8n);
                            A0C();
                            return false;
                        }
                        throw new C20883K(A0B(364, 35, 87));
                    }
                } else {
                    int iA8n2 = (int) (c3044j7A07.A07.A0E[c3044j7A07.A02] - interfaceC4855ms.A8n());
                    if (iA8n2 < 0) {
                        AbstractC21714g.A07(A0B(128, 22, 77), A0B(150, 40, 19));
                        iA8n2 = 0;
                    }
                    interfaceC4855ms.AK3(iA8n2);
                    this.A0G = c3044j7A07;
                }
            }
            this.A06 = this.A0G.A07.A0B[this.A0G.A01];
            if (this.A0G.A01 < this.A0G.A03) {
                interfaceC4855ms.AK3(this.A06);
                if (A0f[4].length() != 23) {
                    this.A0G.A02();
                    if (!this.A0G.A09()) {
                        this.A0G = null;
                    }
                } else {
                    A0f[0] = "A3KFlo0OZ1vz3cN";
                    this.A0G.A02();
                    if (!this.A0G.A09()) {
                        this.A0G = null;
                    }
                }
                this.A02 = 3;
                return true;
            }
            if (this.A0G.A05.A02 == 1) {
                this.A06 -= 8;
                interfaceC4855ms.AK3(8);
            }
            this.A04 = this.A0G.A04();
            this.A06 += this.A04;
            this.A02 = 4;
            this.A05 = 0;
            c3063jq = this.A0G.A07;
            c3061jo = this.A0G.A05;
            interfaceC2953Hd = this.A0G.A06;
            i2 = this.A0G.A01;
            jA00 = c3063jq.A00(i2);
            if (this.A0T != null) {
                jA00 = this.A0T.A05(jA00);
            }
            i3 = c3061jo.A01;
            if (A0f[0].length() != 15) {
                if (i3 != 0) {
                    bArr = this.A0Q.A00;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    i6 = c3061jo.A01 + 1;
                    i7 = 4 - c3061jo.A01;
                    while (this.A04 < this.A06) {
                        if (this.A05 == 0) {
                            interfaceC4855ms.readFully(bArr, i7, i6);
                            this.A0Q.A0f(i10);
                            iA0C = this.A0Q.A0C();
                            if (iA0C >= i9) {
                                this.A05 = iA0C - 1;
                                this.A0R.A0f(i10);
                                interfaceC2953Hd.AIr(this.A0R, i8);
                                interfaceC2953Hd.AIr(this.A0Q, i9);
                                if (this.A0K.length > 0) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                this.A0J = z2;
                                this.A04 += 5;
                                if (A0f[2].length() != 2) {
                                    throw new RuntimeException();
                                }
                                String[] strArr3 = A0f;
                                strArr3[3] = "rGJs1bdDcV9vWCpHaV2ADCTyGiB9Xi";
                                strArr3[6] = "SO50y9aywvhjzs541";
                                this.A06 += i7;
                                i9 = 1;
                            } else {
                                throw new C20883K(A0B(190, 18, 94));
                            }
                        } else {
                            if (this.A0J) {
                                this.A0P.A0d(this.A05);
                                interfaceC4855ms.readFully(this.A0P.A00, i10, this.A05);
                                interfaceC2953Hd.AIr(this.A0P, this.A05);
                                iAIp = this.A05;
                                int iA02 = AbstractC2942HS.A02(this.A0P.A00, this.A0P.A0A());
                                this.A0P.A0f(A0B(756, 10, 83).equals(c3061jo.A07.A0W) ? 1 : 0);
                                this.A0P.A0e(iA02);
                                AbstractC3091Js.A03(jA00, this.A0P, this.A0K);
                            } else {
                                iAIp = interfaceC2953Hd.AIp(interfaceC4855ms, this.A05, false);
                            }
                            this.A04 += iAIp;
                            this.A05 -= iAIp;
                            i8 = 4;
                            i9 = 1;
                            i10 = 0;
                        }
                    }
                } else {
                    if (this.A0I) {
                        AbstractC2908Gu.A07(this.A06, this.A0S);
                        int iA0A = this.A0S.A0A();
                        interfaceC2953Hd.AIr(this.A0S, iA0A);
                        this.A06 += iA0A;
                        this.A04 += iA0A;
                        this.A0I = false;
                    }
                    while (this.A04 < this.A06) {
                        i4 = this.A06 - this.A04;
                        if (A0f[4].length() != 23) {
                            A0f[4] = "4fzpRPid5Z3e8Rz7esUDMjQ";
                            this.A04 += interfaceC2953Hd.AIp(interfaceC4855ms, i4, false);
                        }
                    }
                }
                z = c3063jq.A0G[i2];
                c2951Hb = null;
                c3062jpA00 = this.A0G.A00();
                r11 = z;
                if (c3062jpA00 != null) {
                    int i11 = (z ? 1 : 0) | BasicMeasure.EXACTLY;
                    c2951Hb = c3062jpA00.A01;
                    r11 = i11;
                }
                i5 = r11;
                if (this.A0G != null) {
                    str = this.A0G.A05.A07.A0W;
                    strArr2 = A0f;
                    if (strArr2[3].length() != strArr2[6].length()) {
                        A0f[2] = "aG";
                        if (str == A0B(735, 21, 64)) {
                            i5 = r11;
                            i5 = r11;
                            i5 = r11;
                            i5 = (r11 == true ? 1 : 0) | true;
                        }
                    }
                }
                i5 = r11;
                i5 = r11;
                i5 = r11;
                i5 = r11;
                i5 = r11;
                i5 = r11;
                long j2 = jA00;
                interfaceC2953Hd.AIu(jA00, i5, this.A06, 0, c2951Hb);
                this.A0A = j2;
                A0F(j2);
                if (!this.A0G.A09()) {
                    strArr = A0f;
                    if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                        this.A0G = null;
                    } else {
                        String[] strArr4 = A0f;
                        strArr4[1] = "si2y9gsn9mC0ma4HRQ4DLaiHkSELP0XP";
                        strArr4[5] = "aeCrUYztm6cMo33HVXFI6qvHQZYHBxKr";
                        this.A0G = null;
                    }
                }
                this.A02 = 3;
                return true;
            }
            String[] strArr5 = A0f;
            strArr5[1] = "1reQ2pcS16Hgv6ya8EYaKcYHA8e9gTqM";
            strArr5[5] = "zXUoCiVQDhh6v7GYUtROZrCHyvEA77y8";
            if (i3 != 0) {
                bArr = this.A0Q.A00;
                bArr[0] = 0;
                bArr[1] = 0;
                bArr[2] = 0;
                i6 = c3061jo.A01 + 1;
                i7 = 4 - c3061jo.A01;
                while (this.A04 < this.A06) {
                    if (this.A05 == 0) {
                        interfaceC4855ms.readFully(bArr, i7, i6);
                        this.A0Q.A0f(i10);
                        iA0C = this.A0Q.A0C();
                        if (iA0C >= i9) {
                            this.A05 = iA0C - 1;
                            this.A0R.A0f(i10);
                            interfaceC2953Hd.AIr(this.A0R, i8);
                            interfaceC2953Hd.AIr(this.A0Q, i9);
                            if (this.A0K.length > 0) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            this.A0J = z2;
                            this.A04 += 5;
                            if (A0f[2].length() != 2) {
                                throw new RuntimeException();
                            }
                            String[] strArr6 = A0f;
                            strArr6[3] = "rGJs1bdDcV9vWCpHaV2ADCTyGiB9Xi";
                            strArr6[6] = "SO50y9aywvhjzs541";
                            this.A06 += i7;
                            i9 = 1;
                        } else {
                            throw new C20883K(A0B(190, 18, 94));
                        }
                    } else {
                        if (this.A0J) {
                            this.A0P.A0d(this.A05);
                            interfaceC4855ms.readFully(this.A0P.A00, i10, this.A05);
                            interfaceC2953Hd.AIr(this.A0P, this.A05);
                            iAIp = this.A05;
                            int iA03 = AbstractC2942HS.A02(this.A0P.A00, this.A0P.A0A());
                            this.A0P.A0f(A0B(756, 10, 83).equals(c3061jo.A07.A0W) ? 1 : 0);
                            this.A0P.A0e(iA03);
                            AbstractC3091Js.A03(jA00, this.A0P, this.A0K);
                        } else {
                            iAIp = interfaceC2953Hd.AIp(interfaceC4855ms, this.A05, false);
                        }
                        this.A04 += iAIp;
                        this.A05 -= iAIp;
                        i8 = 4;
                        i9 = 1;
                        i10 = 0;
                    }
                }
            } else {
                if (this.A0I) {
                    AbstractC2908Gu.A07(this.A06, this.A0S);
                    int iA0A2 = this.A0S.A0A();
                    interfaceC2953Hd.AIr(this.A0S, iA0A2);
                    this.A06 += iA0A2;
                    this.A04 += iA0A2;
                    this.A0I = false;
                }
                while (this.A04 < this.A06) {
                    i4 = this.A06 - this.A04;
                    if (A0f[4].length() != 23) {
                        A0f[4] = "4fzpRPid5Z3e8Rz7esUDMjQ";
                        this.A04 += interfaceC2953Hd.AIp(interfaceC4855ms, i4, false);
                    }
                }
            }
            z = c3063jq.A0G[i2];
            c2951Hb = null;
            c3062jpA00 = this.A0G.A00();
            r11 = z;
            if (c3062jpA00 != null) {
                int i12 = (z ? 1 : 0) | BasicMeasure.EXACTLY;
                c2951Hb = c3062jpA00.A01;
                r11 = i12;
            }
            i5 = r11;
            if (this.A0G != null) {
                str = this.A0G.A05.A07.A0W;
                strArr2 = A0f;
                if (strArr2[3].length() != strArr2[6].length()) {
                    A0f[2] = "aG";
                    if (str == A0B(735, 21, 64)) {
                        i5 = r11;
                        i5 = r11;
                        i5 = r11;
                        i5 = (r11 == true ? 1 : 0) | true;
                    }
                }
            }
            i5 = r11;
            i5 = r11;
            i5 = r11;
            i5 = r11;
            i5 = r11;
            i5 = r11;
            long j3 = jA00;
            interfaceC2953Hd.AIu(jA00, i5, this.A06, 0, c2951Hb);
            this.A0A = j3;
            A0F(j3);
            if (!this.A0G.A09()) {
                strArr = A0f;
                if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                    this.A0G = null;
                } else {
                    String[] strArr7 = A0f;
                    strArr7[1] = "si2y9gsn9mC0ma4HRQ4DLaiHkSELP0XP";
                    strArr7[5] = "aeCrUYztm6cMo33HVXFI6qvHQZYHBxKr";
                    this.A0G = null;
                }
            }
            this.A02 = 3;
            return true;
        }
        c3063jq = this.A0G.A07;
        c3061jo = this.A0G.A05;
        interfaceC2953Hd = this.A0G.A06;
        i2 = this.A0G.A01;
        jA00 = c3063jq.A00(i2);
        if (this.A0T != null) {
            jA00 = this.A0T.A05(jA00);
        }
        i3 = c3061jo.A01;
        if (A0f[0].length() != 15) {
            if (i3 != 0) {
                bArr = this.A0Q.A00;
                bArr[0] = 0;
                bArr[1] = 0;
                bArr[2] = 0;
                i6 = c3061jo.A01 + 1;
                i7 = 4 - c3061jo.A01;
                while (this.A04 < this.A06) {
                    if (this.A05 == 0) {
                        interfaceC4855ms.readFully(bArr, i7, i6);
                        this.A0Q.A0f(i10);
                        iA0C = this.A0Q.A0C();
                        if (iA0C >= i9) {
                            this.A05 = iA0C - 1;
                            this.A0R.A0f(i10);
                            interfaceC2953Hd.AIr(this.A0R, i8);
                            interfaceC2953Hd.AIr(this.A0Q, i9);
                            if (this.A0K.length > 0 || !AbstractC2942HS.A0I(c3061jo.A07.A0W, bArr[i8])) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            this.A0J = z2;
                            this.A04 += 5;
                            if (A0f[2].length() != 2) {
                                throw new RuntimeException();
                            }
                            String[] strArr8 = A0f;
                            strArr8[3] = "rGJs1bdDcV9vWCpHaV2ADCTyGiB9Xi";
                            strArr8[6] = "SO50y9aywvhjzs541";
                            this.A06 += i7;
                            i9 = 1;
                        } else {
                            throw new C20883K(A0B(190, 18, 94));
                        }
                    } else {
                        if (this.A0J) {
                            this.A0P.A0d(this.A05);
                            interfaceC4855ms.readFully(this.A0P.A00, i10, this.A05);
                            interfaceC2953Hd.AIr(this.A0P, this.A05);
                            iAIp = this.A05;
                            int iA04 = AbstractC2942HS.A02(this.A0P.A00, this.A0P.A0A());
                            this.A0P.A0f(A0B(756, 10, 83).equals(c3061jo.A07.A0W) ? 1 : 0);
                            this.A0P.A0e(iA04);
                            AbstractC3091Js.A03(jA00, this.A0P, this.A0K);
                        } else {
                            iAIp = interfaceC2953Hd.AIp(interfaceC4855ms, this.A05, false);
                        }
                        this.A04 += iAIp;
                        this.A05 -= iAIp;
                        i8 = 4;
                        i9 = 1;
                        i10 = 0;
                    }
                }
            } else {
                if (this.A0I) {
                    AbstractC2908Gu.A07(this.A06, this.A0S);
                    int iA0A3 = this.A0S.A0A();
                    interfaceC2953Hd.AIr(this.A0S, iA0A3);
                    this.A06 += iA0A3;
                    this.A04 += iA0A3;
                    this.A0I = false;
                }
                while (this.A04 < this.A06) {
                    i4 = this.A06 - this.A04;
                    if (A0f[4].length() != 23) {
                        A0f[4] = "4fzpRPid5Z3e8Rz7esUDMjQ";
                        this.A04 += interfaceC2953Hd.AIp(interfaceC4855ms, i4, false);
                    }
                }
            }
            z = c3063jq.A0G[i2];
            c2951Hb = null;
            c3062jpA00 = this.A0G.A00();
            r11 = z;
            if (c3062jpA00 != null) {
                int i13 = (z ? 1 : 0) | BasicMeasure.EXACTLY;
                c2951Hb = c3062jpA00.A01;
                r11 = i13;
            }
            i5 = r11;
            if (this.A0G != null && this.A0G.A05 != null && this.A0G.A05.A07 != null) {
                str = this.A0G.A05.A07.A0W;
                strArr2 = A0f;
                if (strArr2[3].length() != strArr2[6].length()) {
                    A0f[2] = "aG";
                    if (str == A0B(735, 21, 64)) {
                        i5 = r11;
                        i5 = r11;
                        i5 = r11;
                        i5 = (r11 == true ? 1 : 0) | true;
                    }
                }
            }
            i5 = r11;
            i5 = r11;
            i5 = r11;
            i5 = r11;
            i5 = r11;
            i5 = r11;
            long j4 = jA00;
            interfaceC2953Hd.AIu(jA00, i5, this.A06, 0, c2951Hb);
            this.A0A = j4;
            A0F(j4);
            if (!this.A0G.A09()) {
                strArr = A0f;
                if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                    this.A0G = null;
                } else {
                    String[] strArr9 = A0f;
                    strArr9[1] = "si2y9gsn9mC0ma4HRQ4DLaiHkSELP0XP";
                    strArr9[5] = "aeCrUYztm6cMo33HVXFI6qvHQZYHBxKr";
                    this.A0G = null;
                }
            }
            this.A02 = 3;
            return true;
        }
        String[] strArr10 = A0f;
        strArr10[1] = "1reQ2pcS16Hgv6ya8EYaKcYHA8e9gTqM";
        strArr10[5] = "zXUoCiVQDhh6v7GYUtROZrCHyvEA77y8";
        if (i3 != 0) {
            bArr = this.A0Q.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            i6 = c3061jo.A01 + 1;
            i7 = 4 - c3061jo.A01;
            while (this.A04 < this.A06) {
                if (this.A05 == 0) {
                    interfaceC4855ms.readFully(bArr, i7, i6);
                    this.A0Q.A0f(i10);
                    iA0C = this.A0Q.A0C();
                    if (iA0C >= i9) {
                        this.A05 = iA0C - 1;
                        this.A0R.A0f(i10);
                        interfaceC2953Hd.AIr(this.A0R, i8);
                        interfaceC2953Hd.AIr(this.A0Q, i9);
                        if (this.A0K.length > 0) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        this.A0J = z2;
                        this.A04 += 5;
                        if (A0f[2].length() != 2) {
                            throw new RuntimeException();
                        }
                        String[] strArr11 = A0f;
                        strArr11[3] = "rGJs1bdDcV9vWCpHaV2ADCTyGiB9Xi";
                        strArr11[6] = "SO50y9aywvhjzs541";
                        this.A06 += i7;
                        i9 = 1;
                    } else {
                        throw new C20883K(A0B(190, 18, 94));
                    }
                } else {
                    if (this.A0J) {
                        this.A0P.A0d(this.A05);
                        interfaceC4855ms.readFully(this.A0P.A00, i10, this.A05);
                        interfaceC2953Hd.AIr(this.A0P, this.A05);
                        iAIp = this.A05;
                        int iA05 = AbstractC2942HS.A02(this.A0P.A00, this.A0P.A0A());
                        this.A0P.A0f(A0B(756, 10, 83).equals(c3061jo.A07.A0W) ? 1 : 0);
                        this.A0P.A0e(iA05);
                        AbstractC3091Js.A03(jA00, this.A0P, this.A0K);
                    } else {
                        iAIp = interfaceC2953Hd.AIp(interfaceC4855ms, this.A05, false);
                    }
                    this.A04 += iAIp;
                    this.A05 -= iAIp;
                    i8 = 4;
                    i9 = 1;
                    i10 = 0;
                }
            }
        } else {
            if (this.A0I) {
                AbstractC2908Gu.A07(this.A06, this.A0S);
                int iA0A4 = this.A0S.A0A();
                interfaceC2953Hd.AIr(this.A0S, iA0A4);
                this.A06 += iA0A4;
                this.A04 += iA0A4;
                this.A0I = false;
            }
            while (this.A04 < this.A06) {
                i4 = this.A06 - this.A04;
                if (A0f[4].length() != 23) {
                    A0f[4] = "4fzpRPid5Z3e8Rz7esUDMjQ";
                    this.A04 += interfaceC2953Hd.AIp(interfaceC4855ms, i4, false);
                }
            }
        }
        z = c3063jq.A0G[i2];
        c2951Hb = null;
        c3062jpA00 = this.A0G.A00();
        r11 = z;
        if (c3062jpA00 != null) {
            int i14 = (z ? 1 : 0) | BasicMeasure.EXACTLY;
            c2951Hb = c3062jpA00.A01;
            r11 = i14;
        }
        i5 = r11;
        if (this.A0G != null) {
            str = this.A0G.A05.A07.A0W;
            strArr2 = A0f;
            if (strArr2[3].length() != strArr2[6].length()) {
                A0f[2] = "aG";
                if (str == A0B(735, 21, 64)) {
                    i5 = r11;
                    i5 = r11;
                    i5 = r11;
                    i5 = (r11 == true ? 1 : 0) | true;
                }
            }
        }
        i5 = r11;
        i5 = r11;
        i5 = r11;
        i5 = r11;
        i5 = r11;
        i5 = r11;
        long j5 = jA00;
        interfaceC2953Hd.AIu(jA00, i5, this.A06, 0, c2951Hb);
        this.A0A = j5;
        A0F(j5);
        if (!this.A0G.A09()) {
            strArr = A0f;
            if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                this.A0G = null;
            } else {
                String[] strArr12 = A0f;
                strArr12[1] = "si2y9gsn9mC0ma4HRQ4DLaiHkSELP0XP";
                strArr12[5] = "aeCrUYztm6cMo33HVXFI6qvHQZYHBxKr";
                this.A0G = null;
            }
        }
        this.A02 = 3;
        return true;
        i5 = r11;
        i5 = r11;
        throw new RuntimeException();
    }

    public static /* synthetic */ InterfaceC2923H9[] A0b() {
        return new InterfaceC2923H9[]{new C4819m6()};
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AAC(InterfaceC2924HA interfaceC2924HA) {
        this.A0F = interfaceC2924HA;
        if (this.A0W != null) {
            C3044J7 c3044j7 = new C3044J7(interfaceC2924HA.AKS(0, this.A0W.A03));
            c3044j7.A08(this.A0W, new C3038J1(0, 0, 0, 0));
            this.A0D.put(0, c3044j7);
            A0D();
            this.A0F.A6O();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final int AHL(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        while (true) {
            int i2 = this.A02;
            if (A0f[0].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0f;
            strArr[3] = "yYIiClYY3RZS73RDJ5vLPk2bDdZFXU";
            strArr[6] = "bGm4sUzBrXbQjG5ES";
            switch (i2) {
                case 0:
                    if (!A0Z(interfaceC4855ms)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    A0N(interfaceC4855ms);
                    break;
                case 2:
                    A0O(interfaceC4855ms);
                    break;
                default:
                    if (A0a(interfaceC4855ms)) {
                        return 0;
                    }
                    break;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AJ6(long j2, long j3) {
        int size = this.A0D.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A0D.valueAt(i2).A05();
        }
        this.A0Y.clear();
        this.A03 = 0;
        this.A0B = j3;
        this.A0X.clear();
        this.A0I = false;
        A0C();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final boolean AK5(InterfaceC4855ms interfaceC4855ms) throws IOException {
        return AbstractC3059JM.A01(interfaceC4855ms);
    }
}

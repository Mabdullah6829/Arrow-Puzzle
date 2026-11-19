package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("Rename the class for A/B Testing")
public final class C4820m7 implements InterfaceC2923H9 {
    public static byte[] A0Z;
    public static String[] A0a = {"vtb", "vbKonC", "9ohrxt3rIVPnhyMUHrYVmyK7bOK5FZ2r", "2NigTWH0ge82u7sbUdSeL8Wtj6iQtHIS", "zZrcpvCeqeJUqHmK3YGTET67EQVL4Dlr", "FEfAuyU", "TXQt6Bb5wsq1E0rpiydPRGzBJonmO6nW", "L3NiJ083BoYvWzKRwautviQbODBNEwGW"};
    public static final InterfaceC2927HD A0b;
    public static final C5064qI A0c;
    public static final byte[] A0d;
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

    @MetaExoPlayerCustomization("New field")
    public long A0A;
    public long A0B;
    public long A0C;
    public C21864v A0D;
    public InterfaceC2924HA A0E;
    public C3047JA A0F;
    public boolean A0G;
    public boolean A0H;
    public InterfaceC2953Hd[] A0I;
    public InterfaceC2953Hd[] A0J;
    public final int A0K;
    public final SparseArray<C3047JA> A0L;
    public final C21864v A0M;
    public final C21864v A0N;
    public final C21864v A0O;
    public final C21864v A0P;
    public final C21864v A0Q;
    public final C219453 A0R;
    public final InterfaceC2953Hd A0S;
    public final C2976I0 A0T;
    public final C3061JO A0U;
    public final ArrayDeque<C4827mE> A0V;
    public final ArrayDeque<C3046J9> A0W;
    public final List<C5064qI> A0X;
    public final byte[] A0Y;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(C3047JA c3047ja, int i2, int i3, C21864v c21864v, int i4) throws C20883K {
        int iA0C;
        int iA0C2;
        int i5 = i4;
        c21864v.A0f(8);
        int iA00 = AbstractC3031Iu.A00(c21864v.A0C());
        C3061JO c3061jo = c3047ja.A05.A03;
        C3063JQ c3063jq = c3047ja.A09;
        C3038J1 c3038j1 = (C3038J1) AbstractC22035C.A0f(c3063jq.A06);
        c3063jq.A0C[i2] = c21864v.A0L();
        c3063jq.A0E[i2] = c3063jq.A04;
        if ((iA00 & 1) != 0) {
            long[] jArr = c3063jq.A0E;
            jArr[i2] = jArr[i2] + ((long) c21864v.A0C());
        }
        boolean z = (iA00 & 4) != 0;
        int iA0C3 = c3038j1.A01;
        if (z) {
            iA0C3 = c21864v.A0C();
        }
        boolean z2 = (iA00 & 256) != 0;
        boolean z3 = (iA00 & 512) != 0;
        boolean z4 = (iA00 & 1024) != 0;
        boolean z5 = (iA00 & 2048) != 0;
        long j2 = A0a(c3061jo) ? ((long[]) AbstractC22035C.A0f(c3061jo.A09))[0] : 0L;
        int[] iArr = c3063jq.A0B;
        long[] jArr2 = c3063jq.A0D;
        boolean[] zArr = c3063jq.A0G;
        boolean z6 = c3061jo.A03 == 2 && (i3 & 1) != 0;
        int i6 = i5 + c3063jq.A0C[i2];
        long j3 = c3061jo.A06;
        long j4 = c3063jq.A05;
        while (i5 < i6) {
            if (z2) {
                iA0C = c21864v.A0C();
                if (A0a[5].length() == 30) {
                    throw new RuntimeException();
                }
                A0a[0] = "Vvd";
            } else {
                iA0C = c3038j1.A00;
            }
            int iA01 = A00(iA0C);
            int iA02 = A00(z3 ? c21864v.A0C() : c3038j1.A03);
            if (z4) {
                iA0C2 = c21864v.A0C();
            } else {
                iA0C2 = (i5 == 0 && z) ? iA0C3 : c3038j1.A01;
            }
            jArr2[i5] = AbstractC22035C.A0U((((long) (z5 ? c21864v.A0C() : 0)) + j4) - j2, 1000000L, j3);
            if (!c3063jq.A09) {
                jArr2[i5] = jArr2[i5] + c3047ja.A05.A02;
            }
            iArr[i5] = iA02;
            zArr[i5] = ((iA0C2 >> 16) & 1) == 0 && (!z6 || i5 == 0);
            j4 += (long) iA01;
            i5++;
        }
        c3063jq.A05 = j4;
        return i6;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C4860my> A05(C21864v c21864v, long j2) throws C20883K {
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
                throw C20883K.A01(A0A(756, 28, 79), null);
            }
            long jA0Q2 = c21864v.A0Q();
            iArr[i2] = Integer.MAX_VALUE & iA0C;
            jArr[i2] = jA0R2;
            jArr3[i2] = jA0U2;
            jA0R += jA0Q2;
            jA0U2 = AbstractC22035C.A0U(jA0R, 1000000L, jA0Q);
            jArr2[i2] = jA0U2 - jArr3[i2];
            c21864v.A0g(4);
            jA0R2 += (long) iArr[i2];
        }
        return Pair.create(Long.valueOf(jA0U), new C4860my(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3047JA A09(C21864v c21864v, SparseArray<C3047JA> sparseArray, boolean z) {
        c21864v.A0f(8);
        int iA00 = AbstractC3031Iu.A00(c21864v.A0C());
        C3047JA c3047jaValueAt = z ? sparseArray.valueAt(0) : sparseArray.get(c21864v.A0C());
        if (c3047jaValueAt == null) {
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[1] = "jDobgNhtM";
            return null;
        }
        if ((iA00 & 1) != 0) {
            long jA0R = c21864v.A0R();
            c3047jaValueAt.A09.A04 = jA0R;
            c3047jaValueAt.A09.A03 = jA0R;
        }
        C3038J1 c3038j1 = c3047jaValueAt.A04;
        c3047jaValueAt.A09.A06 = new C3038J1((iA00 & 2) != 0 ? c21864v.A0C() - 1 : c3038j1.A02, (iA00 & 8) != 0 ? c21864v.A0C() : c3038j1.A00, (iA00 & 16) != 0 ? c21864v.A0C() : c3038j1.A03, (iA00 & 32) != 0 ? c21864v.A0C() : c3038j1.A01);
        return c3047jaValueAt;
    }

    public static String A0A(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Z, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[5] = "p0M5dFs6dnHIC4r2oiX9lIp2";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 74);
            i5++;
        }
    }

    public static void A0D() {
        A0Z = new byte[]{8, 65, 91, 8, 76, 65, 78, 78, 77, 90, 77, 70, 92, 8, 78, 90, 71, 69, 8, 78, 90, 73, 79, 69, 77, 70, 92, 8, 91, 73, 69, 88, 68, 77, 8, 75, 71, 93, 70, 92, 109, 36, 62, 109, 42, 63, 40, 44, 57, 40, 63, 109, 57, 37, 44, 35, 109, 43, 63, 44, 42, 32, 40, 35, 57, 109, 62, 44, 32, 61, 33, 40, 109, 46, 34, 56, 35, 57, 47, 26, 1, 3, 78, 29, 7, 20, 11, 78, 2, 11, 29, 29, 78, 26, 6, 15, 0, 78, 6, 11, 15, 10, 11, 28, 78, 2, 11, 0, 9, 26, 6, 78, 70, 27, 0, 29, 27, 30, 30, 1, 28, 26, 11, 10, 71, 64, 70, 109, 119, 113, 122, 35, 96, 108, 118, 109, 119, 35, 106, 109, 35, 112, 97, 100, 115, 35, 34, 62, 35, 50, 35, 43, 118, 109, 112, 118, 115, 115, 108, 113, 119, 102, 103, 42, 45, 29, 54, 44, 42, 33, 120, 59, 55, 45, 54, 44, 120, 49, 54, 120, 43, 63, 40, 60, 120, 121, 101, 120, 105, 120, 112, 45, 54, 43, 45, 40, 40, 55, 42, 44, 61, 60, 113, 118, 71, 115, 96, 102, 108, 100, 111, 117, 100, 101, 76, 113, 53, 68, 121, 117, 115, 96, 98, 117, 110, 115, 14, 32, 41, 40, 53, 46, 41, 32, 103, 41, 34, 32, 38, 51, 46, 49, 34, 103, 40, 33, 33, 52, 34, 51, 103, 51, 40, 103, 52, 38, 42, 55, 43, 34, 103, 35, 38, 51, 38, 105, 118, 81, 73, 94, 83, 86, 91, 31, 113, 126, 115, 31, 83, 90, 81, 88, 75, 87, 0, 41, 45, 42, 108, 45, 56, 35, 33, 108, 40, 41, 42, 37, 34, 41, 63, 108, 41, 52, 56, 41, 34, 40, 41, 40, 108, 45, 56, 35, 33, 108, 63, 37, 54, 41, 108, 100, 57, 34, 63, 57, 60, 60, 35, 62, 56, 41, 40, 101, 98, 75, 98, 102, 97, 39, 102, 115, 104, 106, 39, 112, 110, 115, 111, 39, 107, 98, 105, 96, 115, 111, 39, 57, 39, 53, 54, 51, 48, 51, 63, 52, 49, 51, 48, 39, 47, 114, 105, 116, 114, 119, 119, 104, 117, 115, 98, 99, 46, 41, 62, 23, 23, 2, 20, 5, 81, 5, 30, 81, 20, 31, 18, 3, 8, 1, 5, 24, 30, 31, 81, 21, 16, 5, 16, 81, 6, 16, 2, 81, 31, 20, 22, 16, 5, 24, 7, 20, 95, 120, 81, 81, 68, 82, 67, 23, 67, 88, 23, 82, 89, 83, 23, 88, 81, 23, 90, 83, 86, 67, 23, 64, 86, 68, 23, 89, 82, 80, 86, 67, 94, 65, 82, 25, 27, 34, 49, 38, 38, 61, 48, 61, 58, 51, 116, 0, 38, 53, 55, 63, 17, 58, 55, 38, 45, 36, 32, 61, 59, 58, 22, 59, 44, 116, 36, 53, 38, 53, 57, 49, 32, 49, 38, 39, 116, 61, 39, 116, 33, 58, 39, 33, 36, 36, 59, 38, 32, 49, 48, 122, 35, 17, 25, 10, 80, 3, 17, 29, 0, 28, 21, 80, 19, 31, 5, 30, 4, 80, 70, 112, 123, 118, 53, 102, 116, 120, 101, 121, 112, 53, 118, 122, 96, 123, 97, 53, 5, 61, 63, 38, 38, 51, 50, 118, 38, 37, 37, 62, 118, 55, 34, 57, 59, 118, 126, 48, 55, 63, 58, 51, 50, 118, 34, 57, 118, 51, 46, 34, 36, 55, 53, 34, 118, 35, 35, 63, 50, 127, 78, 118, 116, 109, 109, 116, 115, 122, 61, 124, 105, 114, 112, 61, 106, 116, 105, 117, 61, 113, 120, 115, 122, 105, 117, 61, 35, 61, 47, 44, 41, 42, 41, 37, 46, 43, 41, 42, 61, 53, 104, 115, 110, 104, 109, 109, 114, 111, 105, 120, 121, 52, 51, 1, 57, 59, 34, 34, 59, 60, 53, 114, 39, 60, 33, 39, 34, 34, 61, 32, 38, 55, 54, 114, 55, 63, 33, 53, 114, 36, 55, 32, 33, 59, 61, 60, 104, 114, 23, 44, 39, 58, 50, 39, 33, 54, 39, 38, 98, 47, 45, 45, 52, 98, 32, 45, 58, 108, 92, 103, 108, 113, 121, 108, 106, 125, 108, 109, 41, 103, 108, 110, 104, 125, 96, 127, 108, 41, 127, 104, 101, 124, 108, 51, 41, 35, 24, 19, 14, 6, 19, 21, 2, 19, 18, 86, 5, 23, 31, 25, 86, 19, 24, 2, 4, 15, 86, 21, 25, 3, 24, 2, 76, 86, 80, 107, 109, 100, 107, 97, 105, 96, 97, 37, 108, 107, 97, 108, 119, 96, 102, 113, 37, 119, 96, 99, 96, 119, 96, 107, 102, 96, 114, 69, 86, 77, 69, 70, 72, 65, 4, 72, 65, 74, 67, 80, 76, 4, 64, 65, 87, 71, 86, 77, 84, 80, 77, 75, 74, 4, 77, 74, 4, 87, 67, 84, 64, 4, 66, 75, 81, 74, 64, 4, 12, 81, 74, 87, 81, 84, 84, 75, 86, 80, 65, 64, 13, 102, 119, 119, 107, 110, 100, 102, 115, 110, 104, 105, 40, 127, 42, 98, 106, 116, 96, 88, 73, 73, 85, 80, 90, 88, 77, 80, 86, 87, 22, 65, 20, 84, 73, 13, 20, 79, 77, 77, 52, 32, 49, 60, 58, 122, 52, 54, 97, 72, 87, 90, 91, 81, 17, 86, 91, 72, 93, 126, 97, 108, 109, 103, 39, 101, 120, 60};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0H(C21864v c21864v, Uri uri) {
        String str;
        String str2;
        long jA05;
        long jA0U;
        long jA0Q;
        if (this.A0J.length == 0) {
            return;
        }
        c21864v.A0f(8);
        if (A0a[3].charAt(19) != 'e') {
            throw new RuntimeException();
        }
        A0a[1] = "i2btDlVidn";
        int iA01 = AbstractC3031Iu.A01(c21864v.A0C());
        long jA0U2 = -9223372036854775807L;
        switch (iA01) {
            case 0:
                str = (String) AbstractC21273y.A01(c21864v.A0U());
                str2 = (String) AbstractC21273y.A01(c21864v.A0U());
                long jA0Q2 = c21864v.A0Q();
                jA0U2 = AbstractC22035C.A0U(c21864v.A0Q(), 1000000L, jA0Q2);
                jA05 = this.A0C != -9223372036854775807L ? this.A0C + jA0U2 : -9223372036854775807L;
                jA0U = AbstractC22035C.A0U(c21864v.A0Q(), 1000L, jA0Q2);
                jA0Q = c21864v.A0Q();
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
                AbstractC21714g.A07(A0A(204, 22, 75), A0A(645, 35, 24) + iA01);
                return;
        }
        byte[] bArr = new byte[c21864v.A07()];
        c21864v.A0k(bArr, 0, c21864v.A07());
        int i2 = 0;
        C21864v c21864v2 = new C21864v(this.A0T.A01(new EventMessage(str, str2, jA0U, jA0Q, bArr)));
        int iA07 = c21864v2.A07();
        InterfaceC2953Hd[] interfaceC2953HdArr = this.A0J;
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
            this.A0W.addLast(new C3046J9(jA0U2, true, iA07));
            this.A03 += iA07;
            return;
        }
        if (!this.A0W.isEmpty()) {
            this.A0W.addLast(new C3046J9(jA05, false, iA07));
            this.A03 += iA07;
            return;
        }
        if (this.A0R != null) {
            C219453 c219453 = this.A0R;
            if (A0a[1].length() != 3) {
                String[] strArr = A0a;
                strArr[4] = "dSij3ZZr7drragDO7KaW8OWZIZwByPGb";
                strArr[6] = "O4MuDOrrUt3KGtyHElmFzP2mmpN9Ut0I";
                jA05 = c219453.A05(jA05);
            } else {
                jA05 = c219453.A05(jA05);
            }
        }
        if (this.A0A != -9223372036854775807L && !MetaExoPlayerUpgradeConfig.A03(EnumC4663jX.A11)) {
            jA05 = this.A0A;
        }
        InterfaceC2953Hd[] interfaceC2953HdArr2 = this.A0J;
        if (A0a[0].length() != 3) {
            throw new RuntimeException();
        }
        A0a[2] = "lJ55r5gDB38Ao7rNsYIhv4IUy3LH5Ini";
        for (InterfaceC2953Hd interfaceC2953Hd2 : interfaceC2953HdArr2) {
            interfaceC2953Hd2.AIu(jA05, 1, iA07, 0, null);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0R(C4827mE c4827mE, SparseArray<C3047JA> sparseArray, boolean z, int i2, byte[] bArr) throws C20883K {
        C3047JA c3047jaA09 = A09(((C4826mD) AbstractC21273y.A01(c4827mE.A07(1952868452))).A00, sparseArray, z);
        if (c3047jaA09 == null) {
            return;
        }
        C3063JQ c3063jq = c3047jaA09.A09;
        long j2 = c3063jq.A05;
        boolean z2 = c3063jq.A09;
        c3047jaA09.A08();
        c3047jaA09.A06 = true;
        C4826mD c4826mDA07 = c4827mE.A07(1952867444);
        if (c4826mDA07 == null || (i2 & 2) != 0) {
            c3063jq.A05 = j2;
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[7] = "mrSj0GzHTHwkPK2z0oCyoB4jTU17nK7M";
            c3063jq.A09 = z2;
        } else {
            c3063jq.A05 = A03(c4826mDA07.A00);
            c3063jq.A09 = true;
        }
        A0S(c4827mE, c3047jaA09, i2);
        C3061JO c3061jo = c3047jaA09.A05.A03;
        Object objA01 = AbstractC21273y.A01(c3063jq.A06);
        String[] strArr2 = A0a;
        if (strArr2[4].charAt(20) == strArr2[6].charAt(20)) {
            throw new RuntimeException();
        }
        A0a[1] = "vW8YzoDO1k8YQphW8Ysx";
        C3062JP c3062jpA00 = c3061jo.A00(((C3038J1) objA01).A02);
        C4826mD c4826mDA08 = c4827mE.A07(1935763834);
        if (c4826mDA08 != null) {
            A0V((C3062JP) AbstractC21273y.A01(c3062jpA00), c4826mDA08.A00, c3063jq);
        }
        C4826mD c4826mDA09 = c4827mE.A07(1935763823);
        if (c4826mDA09 != null) {
            A0I(c4826mDA09.A00, c3063jq);
        }
        C4826mD c4826mDA010 = c4827mE.A07(1936027235);
        if (c4826mDA010 != null) {
            A0J(c4826mDA010.A00, c3063jq);
        }
        A0T(c4827mE, c3062jpA00 != null ? c3062jpA00.A02 : null, c3063jq);
        int size = c4827mE.A02.size();
        for (int i3 = 0; i3 < size; i3++) {
            C4826mD c4826mD = c4827mE.A02.get(i3);
            if (((AbstractC3031Iu) c4826mD).A00 == 1970628964) {
                A0K(c4826mD.A00, c3063jq, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0T(C4827mE c4827mE, String str, C3063JQ c3063jq) throws C20883K {
        C21864v c21864v = null;
        C21864v c21864v2 = null;
        for (int i2 = 0; i2 < c4827mE.A02.size(); i2++) {
            C4826mD c4826mD = c4827mE.A02.get(i2);
            C21864v c21864v3 = c4826mD.A00;
            if (((AbstractC3031Iu) c4826mD).A00 == 1935828848) {
                c21864v3.A0f(12);
                if (c21864v3.A0C() == 1936025959) {
                    c21864v = c21864v3;
                }
            } else if (((AbstractC3031Iu) c4826mD).A00 == 1936158820) {
                c21864v3.A0f(12);
                if (c21864v3.A0C() == 1936025959) {
                    c21864v2 = c21864v3;
                }
            }
        }
        if (c21864v == null || c21864v2 == null) {
            return;
        }
        c21864v.A0f(8);
        int iA01 = AbstractC3031Iu.A01(c21864v.A0C());
        c21864v.A0g(4);
        if (iA01 == 1) {
            c21864v.A0g(4);
        }
        if (c21864v.A0C() != 1) {
            throw C20883K.A00(A0A(126, 39, 73));
        }
        c21864v2.A0f(8);
        int iA02 = AbstractC3031Iu.A01(c21864v2.A0C());
        c21864v2.A0g(4);
        if (iA02 == 1) {
            if (c21864v2.A0Q() == 0) {
                throw C20883K.A00(A0A(784, 55, 110));
            }
        } else if (iA02 >= 2) {
            c21864v2.A0g(4);
        }
        if (c21864v2.A0Q() != 1) {
            throw C20883K.A00(A0A(165, 39, 18));
        }
        c21864v2.A0g(1);
        int iA0I = c21864v2.A0I();
        int i3 = (iA0I & 240) >> 4;
        int i4 = iA0I & 15;
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
            c3063jq.A07 = new C3062JP(z, str, iA0I2, bArr, i3, i4, bArr2);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0V(C3062JP c3062jp, C21864v c21864v, C3063JQ c3063jq) throws C20883K {
        int i2 = c3062jp.A00;
        c21864v.A0f(8);
        if ((AbstractC3031Iu.A00(c21864v.A0C()) & 1) == 1) {
            c21864v.A0g(8);
        }
        int iA0I = c21864v.A0I();
        int iA0L = c21864v.A0L();
        if (iA0L > c3063jq.A00) {
            throw C20883K.A01(A0A(514, 18, 58) + iA0L + A0A(40, 38, 7) + c3063jq.A00, null);
        }
        int i3 = 0;
        if (iA0I == 0) {
            boolean[] zArr = c3063jq.A0F;
            if (A0a[1].length() == 3) {
                throw new RuntimeException();
            }
            A0a[0] = "ACu";
            for (int i4 = 0; i4 < iA0L; i4++) {
                int iA0I2 = c21864v.A0I();
                i3 += iA0I2;
                zArr[i4] = iA0I2 > i2;
            }
        } else {
            i3 = 0 + (iA0I * iA0L);
            Arrays.fill(c3063jq.A0F, 0, iA0L, iA0I > i2);
        }
        Arrays.fill(c3063jq.A0F, iA0L, c3063jq.A00, false);
        if (i3 > 0) {
            c3063jq.A02(i3);
        }
    }

    static {
        A0D();
        A0b = new InterfaceC2927HD() { // from class: com.facebook.ads.redexgen.X.m8
            @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
            public final InterfaceC2923H9[] A5N() {
                return C4820m7.A0b();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
            public final /* synthetic */ InterfaceC2923H9[] A5O(Uri uri, Map map) {
                return AbstractC2926HC.A01(this, uri, map);
            }
        };
        A0d = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0c = new C20592p().A11(A0A(839, 18, 77)).A14();
    }

    public C4820m7() {
        this(0);
    }

    public C4820m7(int i2) {
        this(i2, null);
    }

    public C4820m7(int i2, C219453 c219453) {
        this(i2, c219453, null, Collections.emptyList());
    }

    public C4820m7(int i2, C219453 c219453, C3061JO c3061jo, List<C5064qI> list) {
        this(i2, c219453, c3061jo, list, null);
    }

    @MetaExoPlayerCustomization("Additional fields for custom behaviors")
    public C4820m7(int i2, C219453 c219453, C3061JO c3061jo, List<C5064qI> list, InterfaceC2953Hd interfaceC2953Hd) {
        this.A0A = -9223372036854775807L;
        this.A0K = i2;
        this.A0R = c219453;
        this.A0U = c3061jo;
        this.A0X = Collections.unmodifiableList(list);
        this.A0S = interfaceC2953Hd;
        this.A0T = new C2976I0();
        this.A0M = new C21864v(16);
        this.A0P = new C21864v(AbstractC2942HS.A03);
        this.A0O = new C21864v(5);
        this.A0N = new C21864v();
        this.A0Y = new byte[16];
        this.A0Q = new C21864v(this.A0Y);
        this.A0V = new ArrayDeque<>();
        this.A0W = new ArrayDeque<>();
        this.A0L = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0E = InterfaceC2924HA.A00;
        this.A0J = new InterfaceC2953Hd[0];
        this.A0I = new InterfaceC2953Hd[0];
    }

    public static int A00(int i2) throws C20883K {
        if (i2 >= 0) {
            return i2;
        }
        throw C20883K.A01(A0A(TypedValues.TransitionType.TYPE_DURATION, 27, 67) + i2, null);
    }

    public static long A02(C21864v c21864v) {
        c21864v.A0f(8);
        int fullAtom = c21864v.A0C();
        return AbstractC3031Iu.A01(fullAtom) == 0 ? c21864v.A0Q() : c21864v.A0R();
    }

    public static long A03(C21864v c21864v) {
        c21864v.A0f(8);
        int fullAtom = c21864v.A0C();
        int version = AbstractC3031Iu.A01(fullAtom);
        return version == 1 ? c21864v.A0R() : c21864v.A0Q();
    }

    public static Pair<Integer, C3038J1> A04(C21864v c21864v) {
        c21864v.A0f(12);
        int defaultSampleDescriptionIndex = c21864v.A0C();
        int trackId = c21864v.A0C();
        int defaultSampleFlags = c21864v.A0C();
        int defaultSampleSize = c21864v.A0C();
        int defaultSampleDuration = c21864v.A0C();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new C3038J1(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A06(List<C4826mD> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4826mD c4826mD = list.get(i2);
            int leafChildrenSize = ((AbstractC3031Iu) c4826mD).A00;
            if (leafChildrenSize == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrA0l = c4826mD.A00.A0l();
                UUID uuidA02 = AbstractC3054JH.A02(bArrA0l);
                if (uuidA02 == null) {
                    AbstractC21714g.A07(A0A(204, 22, 75), A0A(550, 42, 28));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidA02, A0A(897, 9, 66), bArrA0l));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private C3038J1 A07(SparseArray<C3038J1> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (C3038J1) AbstractC21273y.A01(sparseArray.get(i2));
    }

    public static C3047JA A08(SparseArray<C3047JA> sparseArray) {
        C3047JA c3047ja = null;
        long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3047JA c3047jaValueAt = sparseArray.valueAt(i2);
            if (c3047jaValueAt.A06 || c3047jaValueAt.A01 != c3047jaValueAt.A05.A01) {
                boolean z = c3047jaValueAt.A06;
                if (A0a[7].charAt(28) == 'N') {
                    throw new RuntimeException();
                }
                A0a[2] = "bWFL5LbHycaN2QeAwKakifUxbxentXmn";
                if (!z || c3047jaValueAt.A02 != c3047jaValueAt.A09.A01) {
                    long nextSampleOffset = c3047jaValueAt.A05();
                    if (nextSampleOffset < j2) {
                        c3047ja = c3047jaValueAt;
                        j2 = nextSampleOffset;
                    }
                }
            }
        }
        return c3047ja;
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    private void A0C() {
        int nextExtraTrackId = 100;
        this.A0J = new InterfaceC2953Hd[2];
        int i2 = 0;
        if (this.A0S != null) {
            int emsgTrackOutputCount = 0 + 1;
            this.A0J[0] = this.A0S;
            i2 = emsgTrackOutputCount;
        }
        int nextExtraTrackId2 = this.A0K;
        if ((nextExtraTrackId2 & 4) != 0) {
            int emsgTrackOutputCount2 = i2 + 1;
            this.A0J[i2] = this.A0E.AKS(100, 5);
            i2 = emsgTrackOutputCount2;
            nextExtraTrackId = 100 + 1;
        }
        this.A0J = (InterfaceC2953Hd[]) AbstractC22035C.A1I(this.A0J, i2);
        for (InterfaceC2953Hd interfaceC2953Hd : this.A0J) {
            interfaceC2953Hd.A6e(A0c);
        }
        int nextExtraTrackId3 = this.A0X.size();
        this.A0I = new InterfaceC2953Hd[nextExtraTrackId3];
        int i3 = 0;
        while (i3 < nextExtraTrackId) {
            int i4 = nextExtraTrackId + 1;
            InterfaceC2953Hd interfaceC2953HdAKS = this.A0E.AKS(nextExtraTrackId, 3);
            interfaceC2953HdAKS.A6e(this.A0X.get(i3));
            this.A0I[i3] = interfaceC2953HdAKS;
            i3++;
            nextExtraTrackId = i4;
        }
    }

    private void A0E(long j2) {
        while (!this.A0W.isEmpty()) {
            C3046J9 c3046j9RemoveFirst = this.A0W.removeFirst();
            this.A03 -= c3046j9RemoveFirst.A00;
            if (A0a[7].charAt(28) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[4] = "VR2FeNKrGWLUx6XQMfWHox9ZNtks2zuu";
            strArr[6] = "s2y9CEVkGFcMGmJDsuNOnRFQ2pMNKAx2";
            long jA05 = c3046j9RemoveFirst.A01;
            if (c3046j9RemoveFirst.A02) {
                jA05 += j2;
            }
            if (this.A0R != null) {
                jA05 = this.A0R.A05(jA05);
            }
            for (InterfaceC2953Hd interfaceC2953Hd : this.A0J) {
                interfaceC2953Hd.AIu(jA05, 1, c3046j9RemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j2) throws C20883K {
        while (!this.A0V.isEmpty() && this.A0V.peek().A00 == j2) {
            A0N(this.A0V.pop());
        }
        A0B();
    }

    public static void A0G(C21864v c21864v, int i2, C3063JQ c3063jq) throws C20883K {
        c21864v.A0f(i2 + 8);
        int fullAtom = c21864v.A0C();
        int flags = AbstractC3031Iu.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z = fullAtom3 != 0;
            int sampleCount = c21864v.A0L();
            if (sampleCount == 0) {
                boolean[] zArr = c3063jq.A0F;
                int fullAtom4 = c3063jq.A00;
                Arrays.fill(zArr, 0, fullAtom4, false);
                return;
            }
            int fullAtom5 = c3063jq.A00;
            if (sampleCount == fullAtom5) {
                Arrays.fill(c3063jq.A0F, 0, sampleCount, z);
                int fullAtom6 = c21864v.A07();
                c3063jq.A02(fullAtom6);
                c3063jq.A04(c21864v);
                return;
            }
            StringBuilder sbAppend = new StringBuilder().append(A0A(532, 18, 95)).append(sampleCount).append(A0A(0, 40, 98));
            int fullAtom7 = c3063jq.A00;
            throw C20883K.A01(sbAppend.append(fullAtom7).toString(), null);
        }
        throw C20883K.A00(A0A(458, 56, 30));
    }

    public static void A0I(C21864v c21864v, C3063JQ c3063jq) throws C20883K {
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
        throw C20883K.A01(A0A(727, 29, 60) + iA0L, null);
    }

    public static void A0J(C21864v c21864v, C3063JQ c3063jq) throws C20883K {
        A0G(c21864v, 0, c3063jq);
    }

    public static void A0K(C21864v c21864v, C3063JQ c3063jq, byte[] bArr) throws C20883K {
        c21864v.A0f(8);
        c21864v.A0k(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0d)) {
            return;
        }
        A0G(c21864v, 16, c3063jq);
    }

    @MetaExoPlayerCustomization("New parameter for getUri()")
    private void A0L(InterfaceC4855ms interfaceC4855ms) throws IOException {
        int i2 = ((int) this.A07) - this.A00;
        C21864v c21864v = this.A0D;
        if (c21864v != null) {
            interfaceC4855ms.readFully(c21864v.A0l(), 8, i2);
            A0U(new C4826mD(this.A01, c21864v), interfaceC4855ms.A8n(), interfaceC4855ms.A9P());
        } else {
            interfaceC4855ms.AK3(i2);
        }
        A0F(interfaceC4855ms.A8n());
    }

    private void A0M(InterfaceC4855ms interfaceC4855ms) throws IOException {
        C3047JA c3047jaValueAt = null;
        long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
        int size = this.A0L.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3047JA nextTrackBundle = this.A0L.valueAt(i2);
            C3063JQ c3063jq = nextTrackBundle.A09;
            if (c3063jq.A0A && c3063jq.A03 < j2) {
                j2 = c3063jq.A03;
                c3047jaValueAt = this.A0L.valueAt(i2);
            }
        }
        if (c3047jaValueAt == null) {
            this.A02 = 3;
            return;
        }
        int iA8n = (int) (j2 - interfaceC4855ms.A8n());
        if (iA8n >= 0) {
            interfaceC4855ms.AK3(iA8n);
            c3047jaValueAt.A09.A05(interfaceC4855ms);
            return;
        }
        throw C20883K.A01(A0A(384, 39, 59), null);
    }

    private void A0N(C4827mE c4827mE) throws C20883K {
        if (((AbstractC3031Iu) c4827mE).A00 == 1836019574) {
            A0P(c4827mE);
            return;
        }
        if (((AbstractC3031Iu) c4827mE).A00 == 1836019558) {
            A0O(c4827mE);
            return;
        }
        if (this.A0V.isEmpty()) {
            return;
        }
        C4827mE c4827mEPeek = this.A0V.peek();
        if (A0a[1].length() == 3) {
            throw new RuntimeException();
        }
        A0a[5] = "pjYwVuiFyV8fJrHeJXv5AlOqs";
        c4827mEPeek.A08(c4827mE);
    }

    private void A0O(C4827mE c4827mE) throws C20883K {
        A0Q(c4827mE, this.A0L, this.A0U != null, this.A0K, this.A0Y);
        DrmInitData drmInitDataA06 = A06(c4827mE.A02);
        if (drmInitDataA06 != null) {
            int i2 = this.A0L.size();
            for (int trackCount = 0; trackCount < i2; trackCount++) {
                this.A0L.valueAt(trackCount).A0B(drmInitDataA06);
            }
        }
        long j2 = this.A0B;
        if (A0a[5].length() != 30) {
            String[] strArr = A0a;
            strArr[4] = "qdUBZHhFhQeTbxiPtlDH0srS7WoJbCtx";
            strArr[6] = "eg1L367OGrFS41anHFQFHM93YBMqVnGW";
            if (j2 != -9223372036854775807L) {
                int size = this.A0L.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C3047JA c3047jaValueAt = this.A0L.valueAt(i3);
                    long j3 = this.A0B;
                    int trackCount2 = A0a[5].length();
                    if (trackCount2 != 30) {
                        A0a[3] = "ExaTttTG7QLu5ZnLvMbeVx0ab4jt6cU8";
                        c3047jaValueAt.A0A(j3);
                    }
                }
                this.A0B = -9223372036854775807L;
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    private void A0P(C4827mE c4827mE) throws C20883K {
        AbstractC21273y.A0A(this.A0U == null, A0A(680, 20, 8));
        DrmInitData drmInitDataA06 = A06(c4827mE.A02);
        C4827mE c4827mE2 = (C4827mE) AbstractC21273y.A01(c4827mE.A06(1836475768));
        SparseArray<C3038J1> sparseArray = new SparseArray<>();
        long jA02 = -9223372036854775807L;
        int size = c4827mE2.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4826mD c4826mD = c4827mE2.A02.get(i2);
            if (((AbstractC3031Iu) c4826mD).A00 == 1953654136) {
                Pair<Integer, C3038J1> pairA04 = A04(c4826mD.A00);
                Object obj = pairA04.first;
                if (A0a[7].charAt(28) == 'N') {
                    throw new RuntimeException();
                }
                A0a[2] = "1hJqa9Igz9YM2Xn7uSuVVZMPlDpSi7YR";
                sparseArray.put(((Integer) obj).intValue(), (C3038J1) pairA04.second);
            } else if (((AbstractC3031Iu) c4826mD).A00 == 1835362404) {
                jA02 = A02(c4826mD.A00);
            }
        }
        List<C3064JR> listA0O = AbstractC3037J0.A0O(c4827mE, new C2934HK(), jA02, drmInitDataA06, (this.A0K & 16) != 0, false, new InterfaceC4715kO() { // from class: com.facebook.ads.redexgen.X.m9
            @Override // com.instagram.common.viewpoint.core.InterfaceC4715kO
            public final Object A4B(Object obj2) {
                return this.A00.A0c((C3061JO) obj2);
            }
        });
        int size2 = listA0O.size();
        if (this.A0L.size() == 0) {
            for (int i3 = 0; i3 < size2; i3++) {
                C3064JR c3064jr = listA0O.get(i3);
                C3061JO c3061jo = c3064jr.A03;
                this.A0L.put(c3061jo.A00, new C3047JA(this.A0E.AKS(i3, c3061jo.A03), c3064jr, A07(sparseArray, c3061jo.A00)));
                this.A08 = Math.max(this.A08, c3061jo.A04);
            }
            this.A0E.A6O();
            return;
        }
        AbstractC21273y.A08(this.A0L.size() == size2);
        for (int i4 = 0; i4 < size2; i4++) {
            C3064JR c3064jr2 = listA0O.get(i4);
            C3061JO c3061jo2 = c3064jr2.A03;
            this.A0L.get(c3061jo2.A00).A0C(c3064jr2, A07(sparseArray, c3061jo2.A00));
        }
    }

    public static void A0Q(C4827mE c4827mE, SparseArray<C3047JA> sparseArray, boolean z, int i2, byte[] bArr) throws C20883K {
        int size = c4827mE.A01.size();
        for (int i3 = 0; i3 < size; i3++) {
            C4827mE child = c4827mE.A01.get(i3);
            int i4 = ((AbstractC3031Iu) child).A00;
            if (i4 == 1953653094) {
                A0R(child, sparseArray, z, i2, bArr);
            }
        }
    }

    public static void A0S(C4827mE c4827mE, C3047JA c3047ja, int i2) throws C20883K {
        int i3 = 0;
        int leafChildrenSize = 0;
        List<C4826mD> list = c4827mE.A02;
        int i4 = list.size();
        int i5 = 0;
        while (totalSampleCount != 30) {
            A0a[1] = "g5KWW";
            if (i5 < i4) {
                C4826mD c4826mD = list.get(i5);
                int trunCount = ((AbstractC3031Iu) c4826mD).A00;
                if (trunCount == 1953658222) {
                    C21864v c21864v = c4826mD.A00;
                    c21864v.A0f(12);
                    int trunCount2 = c21864v.A0L();
                    if (trunCount2 > 0) {
                        leafChildrenSize += trunCount2;
                        i3++;
                    }
                }
                i5++;
            } else {
                c3047ja.A02 = 0;
                c3047ja.A00 = 0;
                c3047ja.A01 = 0;
                c3047ja.A09.A03(i3, leafChildrenSize);
                int i6 = 0;
                int trunCount3 = 0;
                for (int trunIndex = 0; trunIndex < i4; trunIndex++) {
                    C4826mD c4826mD2 = list.get(trunIndex);
                    int totalSampleCount = ((AbstractC3031Iu) c4826mD2).A00;
                    if (totalSampleCount == 1953658222) {
                        trunCount3 = A01(c3047ja, i6, i2, c4826mD2.A00, trunCount3);
                        i6++;
                    }
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0U(C4826mD c4826mD, long j2, Uri uri) throws C20883K {
        if (!this.A0V.isEmpty()) {
            this.A0V.peek().A09(c4826mD);
            return;
        }
        if (((AbstractC3031Iu) c4826mD).A00 == 1936286840) {
            Pair<Long, C4860my> pairA05 = A05(c4826mD.A00, j2);
            Long l2 = (Long) pairA05.first;
            if (A0a[2].charAt(14) == 'D') {
                throw new RuntimeException();
            }
            A0a[2] = "KqHjYmkkmLRftUSzBx7x8q1P7pbSwwaZ";
            this.A0C = l2.longValue();
            this.A0E.AJ7((InterfaceC2948HY) pairA05.second);
            this.A0G = true;
            return;
        }
        if (((AbstractC3031Iu) c4826mD).A00 != 1701671783 || uri == null) {
            return;
        }
        A0H(c4826mD.A00, uri);
    }

    public static boolean A0W(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1836019558 || i2 == 1953653094 || i2 == 1836475768 || i2 == 1701082227;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    public static boolean A0X(int i2) {
        if (i2 != 1751411826 && i2 != 1835296868 && i2 != 1836476516 && i2 != 1936286840 && i2 != 1937011556 && i2 != 1937011827 && i2 != 1668576371 && i2 != 1937011555) {
            if (A0a[1].length() == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[4] = "BwdOpTtZC6qkHbBW6vzemIV3sewTUKel";
            strArr[6] = "oE5SsWuxWmjvJDoIWd7OBauEjDNEKBY0";
            if (i2 != 1937011578) {
                if (A0a[3].charAt(19) != 'e') {
                    A0a[7] = "alBOnYvVhDOHTU7zpsfhYzjhJlh1j5qj";
                    if (i2 != 1937013298) {
                        if (i2 == 1937007471 && i2 != 1668232756 && i2 != 1937011571 && i2 != 1952867444 && i2 != 1952868452 && i2 != 1953196132 && i2 != 1953654136 && i2 != 1953658222 && i2 != 1886614376 && i2 != 1935763834 && i2 != 1935763823 && i2 != 1936027235 && i2 != 1970628964 && i2 != 1935828848 && i2 != 1936158820 && i2 != 1701606260 && i2 != 1835362404 && i2 != 1701671783) {
                            return false;
                        }
                    }
                } else {
                    A0a[0] = "AuC";
                    if (i2 != 1937013298) {
                        if (i2 == 1937007471) {
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean A0Y(InterfaceC4855ms interfaceC4855ms) throws IOException {
        int trackCount;
        int i2;
        if (this.A00 == 0) {
            C21864v c21864v = this.A0M;
            if (A0a[2].charAt(14) != 'D') {
                A0a[5] = "Du9yMjOrUhZNFJE5GgCY";
                if (!interfaceC4855ms.AHR(c21864v.A0l(), 0, 8, true)) {
                    return false;
                }
                this.A00 = 8;
                this.A0M.A0f(0);
                this.A07 = this.A0M.A0Q();
                int iA0C = this.A0M.A0C();
                if (A0a[5].length() != 30) {
                    A0a[0] = "Nk2";
                    this.A01 = iA0C;
                }
            }
            throw new RuntimeException();
        }
        if (this.A07 == 1) {
            interfaceC4855ms.readFully(this.A0M.A0l(), 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0M.A0R();
        } else if (this.A07 == 0) {
            long jA8O = interfaceC4855ms.A8O();
            if (jA8O == -1 && !this.A0V.isEmpty()) {
                jA8O = this.A0V.peek().A00;
            }
            if (jA8O != -1) {
                long jA8n = jA8O - interfaceC4855ms.A8n();
                int trackCount2 = this.A00;
                this.A07 = jA8n + ((long) trackCount2);
            }
        }
        if (this.A07 >= this.A00) {
            long jA8n2 = interfaceC4855ms.A8n() - ((long) this.A00);
            if ((this.A01 == 1836019558 || this.A01 == 1835295092) && !this.A0G) {
                this.A0E.AJ7(new C4850mn(this.A08, jA8n2));
                this.A0G = true;
            }
            if (this.A01 == 1836019558) {
                SparseArray<C3047JA> sparseArray = this.A0L;
                if (A0a[0].length() != 3) {
                    A0a[7] = "3NdiubR5fLBwA18U1YAUjfhOdAcmjZCx";
                    trackCount = sparseArray.size();
                    i2 = 0;
                } else {
                    A0a[0] = "3Yh";
                    trackCount = sparseArray.size();
                    i2 = 0;
                }
                while (i2 < trackCount) {
                    C3063JQ c3063jq = this.A0L.valueAt(i2).A09;
                    c3063jq.A02 = jA8n2;
                    c3063jq.A03 = jA8n2;
                    c3063jq.A04 = jA8n2;
                    i2++;
                }
            }
            int trackCount3 = this.A01;
            if (trackCount3 == 1835295092) {
                this.A0F = null;
                this.A09 = this.A07 + jA8n2;
                this.A02 = 2;
                return true;
            }
            if (A0W(this.A01)) {
                long jA8n3 = (interfaceC4855ms.A8n() + this.A07) - 8;
                this.A0V.push(new C4827mE(this.A01, jA8n3));
                if (this.A07 == this.A00) {
                    A0F(jA8n3);
                } else {
                    A0B();
                }
            } else if (A0X(this.A01)) {
                if (this.A00 != 8) {
                    throw C20883K.A00(A0A(284, 51, 6));
                }
                if (this.A07 <= 2147483647L) {
                    C21864v c21864v2 = new C21864v((int) this.A07);
                    C21864v atomData = this.A0M;
                    System.arraycopy(atomData.A0l(), 0, c21864v2.A0l(), 0, 8);
                    this.A0D = c21864v2;
                    this.A02 = 1;
                } else {
                    throw C20883K.A00(A0A(335, 49, 77));
                }
            } else if (this.A07 <= 2147483647L) {
                this.A0D = null;
                this.A02 = 1;
            } else {
                throw C20883K.A00(A0A(592, 53, 87));
            }
            return true;
        }
        throw C20883K.A00(A0A(78, 48, 36));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    /* JADX WARN: Code duplicated, block: B:43:0x0122  */
    /* JADX WARN: Code duplicated, block: B:45:0x0133  */
    /* JADX WARN: Code duplicated, block: B:48:0x0142  */
    /* JADX WARN: Code duplicated, block: B:51:0x015c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0170  */
    /* JADX WARN: Code duplicated, block: B:57:0x0190  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01be  */
    /* JADX WARN: Code duplicated, block: B:68:0x0221  */
    /* JADX WARN: Code duplicated, block: B:69:0x0228  */
    /* JADX WARN: Code duplicated, block: B:70:0x022e  */
    /* JADX WARN: Code duplicated, block: B:77:0x025c A[LOOP:1: B:77:0x025c->B:79:0x0262, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:79:0x0262 A[LOOP:1: B:77:0x025c->B:79:0x0262, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x027c  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f0  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        r19.AK3(r3);
        A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0246, code lost:
    
        throw com.instagram.common.viewpoint.core.C20883K.A01(A0A(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD, 35, 125), null);
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Mark text samples as sync frames")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0Z(com.instagram.common.viewpoint.core.InterfaceC4855ms r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C4820m7.A0Z(com.facebook.ads.redexgen.X.ms):boolean");
    }

    public static boolean A0a(C3061JO c3061jo) {
        if (c3061jo.A08 == null || c3061jo.A08.length != 1 || c3061jo.A09 == null) {
            return false;
        }
        if (c3061jo.A08[0] == 0) {
            return true;
        }
        long editListEndMediaTimeUs = AbstractC22035C.A0U(c3061jo.A08[0] + c3061jo.A09[0], 1000000L, c3061jo.A05);
        if (A0a[2].charAt(14) == 'D') {
            throw new RuntimeException();
        }
        A0a[1] = "wHdUW";
        return editListEndMediaTimeUs >= c3061jo.A04;
    }

    public static /* synthetic */ InterfaceC2923H9[] A0b() {
        return new InterfaceC2923H9[]{new C4819m6()};
    }

    public final C3061JO A0c(C3061JO c3061jo) {
        return c3061jo;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AAC(InterfaceC2924HA interfaceC2924HA) {
        this.A0E = interfaceC2924HA;
        A0B();
        A0C();
        if (this.A0U != null) {
            this.A0L.put(0, new C3047JA(interfaceC2924HA.AKS(0, this.A0U.A03), new C3064JR(this.A0U, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C3038J1(0, 0, 0, 0)));
            this.A0E.A6O();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final int AHL(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        while (true) {
            switch (this.A02) {
                case 0:
                    if (!A0Y(interfaceC4855ms)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    A0L(interfaceC4855ms);
                    break;
                case 2:
                    A0M(interfaceC4855ms);
                    break;
                default:
                    if (A0Z(interfaceC4855ms)) {
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
        int size = this.A0L.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A0L.valueAt(i2).A08();
        }
        this.A0W.clear();
        this.A03 = 0;
        this.A0B = j3;
        this.A0V.clear();
        A0B();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final boolean AK5(InterfaceC4855ms interfaceC4855ms) throws IOException {
        return AbstractC3059JM.A01(interfaceC4855ms);
    }
}

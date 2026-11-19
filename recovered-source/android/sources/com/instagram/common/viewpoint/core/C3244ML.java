package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ML */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3244ML {
    public static byte[] A0V;
    public static String[] A0W = {"lVJcyHuE1PJb579Sb1LAAlg5vS4NZYMV", "qyLkbqfl0JpOOnDgJdZjiTPjgkzmhXwK", "qCNdEz7ripOZNNb3yCY8Ki49zW8UWRt4", "Cjqz4QIw8w0k6KevPFem8GYP4yUKgFOK", "ptM4eVx6M57F8Ll6MNcW2L659ErB2sOY", "McIwIiSAB", "OKPGVpQZykPiX00cv", "DTBK8GKi"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final C3242MJ A0G;
    public final C3243MK A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final Map<String, String> A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0V, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 89);
            if (A0W[4].charAt(24) == 'w') {
                throw new RuntimeException();
            }
            A0W[3] = "PXVGXjtmkErHxa13ZrhtcOEvw3ek";
            bArrCopyOfRange[i5] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0V = new byte[]{72, 68};
    }

    static {
        A01();
    }

    public C3244ML() {
        this(A00(0, 0, 39), -1L, false, -1, -1, -1, -1, false, false, -1, -1L, new C3243MK(), false, -1, -1, -1L, -1L, -1, null, -1, null, null, C3242MJ.A02, -1, false, A00(0, 0, 39), A00(0, 0, 39), A00(0, 0, 39), null, -1L, -1L);
    }

    public C3244ML(C3244ML c3244ml) {
        this(c3244ml, c3244ml.A0M);
    }

    public C3244ML(C3244ML c3244ml, String str) {
        this(c3244ml.A0L, c3244ml.A0A, c3244ml.A0S, c3244ml.A08, c3244ml.A07, c3244ml.A00, c3244ml.A09, c3244ml.A0U, c3244ml.A0R, c3244ml.A05, c3244ml.A0C, c3244ml.A0H, c3244ml.A0T, c3244ml.A06, c3244ml.A02, c3244ml.A0E, c3244ml.A0B, c3244ml.A01, c3244ml.A0P, c3244ml.A04, c3244ml.A0J, c3244ml.A0I, c3244ml.A0G, c3244ml.A03, c3244ml.A0Q, c3244ml.A0N, c3244ml.A0K, c3244ml.A0O, str, -1L, -1L);
    }

    public C3244ML(String str, long j2, boolean z, int i2, int i3, int i4, int i5, boolean z2, boolean z3, int i6, long j3, C3243MK c3243mk, boolean z4, int i7, int i8, long j4, long j5, int i9, Map<String, String> map, int i10, String str2, String str3, C3242MJ c3242mj, int i11, boolean z5, String str4, String str5, String str6, String str7, long j6, long j7) {
        this.A0P = new HashMap();
        this.A0L = str;
        this.A0A = j2;
        this.A0S = z;
        this.A08 = i2;
        this.A07 = i3;
        this.A00 = i4;
        this.A09 = i5;
        this.A0U = z2;
        this.A0R = z3;
        this.A05 = i6;
        this.A0C = j3;
        this.A0H = c3243mk;
        this.A0T = z4;
        this.A06 = i7;
        this.A02 = i8;
        this.A0E = j4;
        this.A0B = j5;
        this.A01 = i9;
        this.A04 = i10;
        this.A0I = str3;
        this.A0J = str2;
        if (map != null) {
            this.A0P.putAll(map);
        }
        this.A0G = c3242mj;
        this.A03 = i11;
        this.A0Q = z5;
        this.A0N = str4;
        this.A0K = str5;
        this.A0O = str6;
        this.A0M = str7;
        this.A0F = j6;
        this.A0D = j7;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder().append(this.A0L);
        String strA00 = A00(0, 2, 61);
        return sbAppend.append(strA00).append(this.A0A).append(strA00).append(this.A0S).append(strA00).append(this.A08).append(strA00).append(this.A07).append(strA00).append(this.A00).append(strA00).append(this.A09).append(strA00).append(this.A0U).append(strA00).append(this.A0R).append(strA00).append(this.A05).append(strA00).append(this.A0E).append(strA00).append(this.A0B).append(strA00).append(this.A01).append(strA00).append(this.A04).append(strA00).append(this.A06).append(strA00).append(this.A02).append(strA00).append(this.A03).append(strA00).append(this.A0Q).append(strA00).append(this.A0N).toString();
    }
}

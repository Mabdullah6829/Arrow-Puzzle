package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzams {

    /* JADX INFO: renamed from: a */
    public final zzamp f6032a;

    /* JADX INFO: renamed from: b */
    public final int f6033b;

    /* JADX INFO: renamed from: c */
    public final long[] f6034c;

    /* JADX INFO: renamed from: d */
    public final int[] f6035d;

    /* JADX INFO: renamed from: e */
    public final int f6036e;

    /* JADX INFO: renamed from: f */
    public final long[] f6037f;

    /* JADX INFO: renamed from: g */
    public final int[] f6038g;

    /* JADX INFO: renamed from: h */
    public final int[] f6039h;

    /* JADX INFO: renamed from: i */
    public final long f6040i;

    /* JADX INFO: renamed from: j */
    public final boolean f6041j;

    public zzams(zzamp zzampVar, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, int[] iArr3, boolean z, long j2, int i3) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzgtr.m7128a(length == length2);
        zzgtr.m7128a(jArr.length == length2);
        int length3 = iArr2.length;
        zzgtr.m7128a(length3 == length2);
        this.f6032a = zzampVar;
        this.f6034c = jArr;
        this.f6035d = iArr;
        this.f6036e = i2;
        this.f6037f = jArr2;
        this.f6038g = iArr2;
        this.f6039h = iArr3;
        this.f6041j = z;
        this.f6040i = j2;
        this.f6033b = i3;
        if (length3 > 0) {
            int i4 = length3 - 1;
            iArr2[i4] = iArr2[i4] | 536870912;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m4225a(long j2) {
        boolean z = this.f6041j;
        int i2 = 0;
        long[] jArr = this.f6037f;
        if (z) {
            return zzfm.m6517s(jArr, j2, false);
        }
        int[] iArr = this.f6039h;
        int length = iArr.length - 1;
        int i3 = -1;
        while (i2 <= length) {
            int i4 = ((length - i2) / 2) + i2;
            if (jArr[iArr[i4]] <= j2) {
                i2 = i4 + 1;
                i3 = i4;
            } else {
                length = i4 - 1;
            }
        }
        if (i3 == -1) {
            return -1;
        }
        long j3 = jArr[iArr[i3]];
        if (j3 == j2) {
            while (i3 > 0) {
                int i5 = i3 - 1;
                if (jArr[iArr[i5]] != j3) {
                    break;
                }
                i3 = i5;
            }
        }
        return iArr[i3];
    }

    /* JADX INFO: renamed from: b */
    public final int m4226b(long j2) {
        boolean z = this.f6041j;
        long[] jArr = this.f6037f;
        if (z) {
            String str = zzfm.f16091a;
            int iBinarySearch = Arrays.binarySearch(jArr, j2);
            if (iBinarySearch < 0) {
                return ~iBinarySearch;
            }
            while (true) {
                int i2 = iBinarySearch + 1;
                if (i2 >= jArr.length || jArr[i2] != j2) {
                    break;
                }
                iBinarySearch = i2;
            }
            return iBinarySearch;
        }
        int[] iArr = this.f6039h;
        int length = iArr.length - 1;
        int i3 = 0;
        int i4 = -1;
        while (i3 <= length) {
            int i5 = ((length - i3) / 2) + i3;
            if (jArr[iArr[i5]] >= j2) {
                length = i5 - 1;
                i4 = i5;
            } else {
                i3 = i5 + 1;
            }
        }
        if (i4 == -1) {
            return -1;
        }
        long j3 = jArr[iArr[i4]];
        if (j3 == j2) {
            while (i4 < iArr.length - 1) {
                int i6 = i4 + 1;
                if (jArr[iArr[i6]] != j3) {
                    break;
                }
                i4 = i6;
            }
        }
        return iArr[i4];
    }
}

package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhan {

    /* JADX INFO: renamed from: a */
    public long[] f18428a;

    /* JADX INFO: renamed from: b */
    public int f18429b;

    /* JADX INFO: renamed from: a */
    public final void m7302a(long j2) {
        int i2 = this.f18429b;
        int i3 = i2 + 1;
        long[] jArr = this.f18428a;
        int length = jArr.length;
        if (i3 > length) {
            int i4 = length + (length >> 1) + 1;
            if (i4 < i3) {
                int iHighestOneBit = Integer.highestOneBit(i2);
                i4 = iHighestOneBit + iHighestOneBit;
            }
            if (i4 < 0) {
                i4 = Integer.MAX_VALUE;
            }
            this.f18428a = Arrays.copyOf(jArr, i4);
        }
        long[] jArr2 = this.f18428a;
        int i5 = this.f18429b;
        jArr2[i5] = j2;
        this.f18429b = i5 + 1;
    }
}

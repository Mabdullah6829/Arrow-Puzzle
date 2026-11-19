package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhat {
    /* JADX INFO: renamed from: a */
    public static long[] m7310a(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i2 = (int) length;
        zzgtr.m7131d(length, length == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int");
        long[] jArr3 = new long[i2];
        int i3 = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i3, length2);
            i3 += length2;
        }
        return jArr3;
    }
}

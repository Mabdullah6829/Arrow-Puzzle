package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagy {

    /* JADX INFO: renamed from: a */
    public static final String[] f5296a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b */
    public static final int[] f5297b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f5298c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d */
    public static final int[] f5299d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e */
    public static final int[] f5300e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f */
    public static final int[] f5301f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g */
    public static final int[] f5302g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: a */
    public static int m4128a(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = i5 - 1;
        int i9 = f5297b[i6];
        if (i3 == 2) {
            i9 /= 2;
        } else if (i3 == 0) {
            i9 /= 4;
        }
        int i10 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? f5298c[i8] : f5299d[i8]) * 12) / i9) + i10) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? f5300e[i8] : f5301f[i8];
        } else {
            i7 = f5302g[i8];
        }
        if (i3 == 3) {
            return AbstractC1456a.m2436c(i7, 144, i9, i10);
        }
        return AbstractC1456a.m2436c(i4 == 1 ? 72 : 144, i7, i9, i10);
    }
}

package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcc {

    /* JADX INFO: renamed from: a */
    public static final char[] f7581a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: a */
    public static byte[] m4742a(String str) {
        int length = str.length();
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length >> 1];
        for (int i2 = 0; i2 < length; i2 += 2) {
            bArr[i2 / 2] = (byte) (Character.digit(str.charAt(i2 + 1), 16) + (Character.digit(str.charAt(i2), 16) << 4));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static long m4743b(double d, DisplayMetrics displayMetrics) {
        return Math.round(d / ((double) displayMetrics.density));
    }
}

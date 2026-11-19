package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzhae {
    /* JADX INFO: renamed from: a */
    public static long m7293a(double d) {
        zzgtr.m7129b("not a normal value", m7294b(d));
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7294b(double d) {
        return Math.getExponent(d) <= 1023;
    }
}

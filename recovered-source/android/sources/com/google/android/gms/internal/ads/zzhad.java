package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhad {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f18422a = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7290a(double d) {
        if (d > 0.0d && zzhae.m7294b(d)) {
            long jM7293a = zzhae.m7293a(d);
            if ((jM7293a & ((-1) + jM7293a)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static int m7291b(double d) {
        boolean zM7290a;
        RoundingMode roundingMode = RoundingMode.CEILING;
        boolean z = false;
        zzgtr.m7129b("x must be positive and finite", d > 0.0d && zzhae.m7294b(d));
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return m7291b(d * 4.503599627370496E15d) - 52;
        }
        switch (zzhac.f18421a[roundingMode.ordinal()]) {
            case 1:
                zzhaj.m7300b(m7290a(d));
                return exponent;
            case 2:
                return exponent;
            case 3:
                z = !m7290a(d);
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z = exponent < 0;
                zM7290a = m7290a(d);
                z &= !zM7290a;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z = exponent >= 0;
                zM7290a = m7290a(d);
                z &= !zM7290a;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z = true;
                }
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7292c(double d) {
        if (zzhae.m7294b(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(zzhae.m7293a(d)) <= Math.getExponent(d);
        }
        return false;
    }
}

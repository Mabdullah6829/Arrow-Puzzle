package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhai {
    /* JADX INFO: renamed from: a */
    public static long m7296a(long j2, long j3, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j4 = j2 / j3;
        long j5 = j2 - (j3 * j4);
        if (j5 == 0) {
            return j4;
        }
        int i2 = ((int) ((j2 ^ j3) >> 63)) | 1;
        switch (zzhah.f18424a[roundingMode.ordinal()]) {
            case 1:
                zzhaj.m7300b(false);
                return j4;
            case 2:
                return j4;
            case 3:
                if (i2 >= 0) {
                    return j4;
                }
                break;
            case 4:
                break;
            case 5:
                if (i2 <= 0) {
                    return j4;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j5);
                long jAbs2 = jAbs - (Math.abs(j3) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j4) == 0)) {
                        return j4;
                    }
                } else if (jAbs2 <= 0) {
                    return j4;
                }
            default:
                throw new AssertionError();
        }
        return j4 + ((long) i2);
    }

    /* JADX INFO: renamed from: b */
    public static long m7297b(long j2, long j3) {
        zzhaj.m7299a("a", j2);
        zzhaj.m7299a("b", j3);
        if (j2 == 0) {
            return j3;
        }
        if (j3 == 0) {
            return j2;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
        long jNumberOfTrailingZeros = j2 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j3);
        long j4 = j3 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j4) {
            long j5 = jNumberOfTrailingZeros - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            jNumberOfTrailingZeros = j7 >> Long.numberOfTrailingZeros(j7);
            j4 += j6;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    /* JADX INFO: renamed from: c */
    public static long m7298c(long j2, long j3) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2);
        if (iNumberOfLeadingZeros > 65) {
            return j2 * j3;
        }
        long j4 = j2 ^ j3;
        boolean z = (iNumberOfLeadingZeros < 64) | ((j3 == Long.MIN_VALUE) & (j2 < 0));
        long j5 = (j4 >>> 63) + LocationRequestCompat.PASSIVE_INTERVAL;
        if (!z) {
            long j6 = j2 * j3;
            if (j2 == 0 || j6 / j2 == j3) {
                return j6;
            }
        }
        return j5;
    }
}

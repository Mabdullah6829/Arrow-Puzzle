package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfj {

    /* JADX INFO: renamed from: a */
    public long f15786a;

    /* JADX INFO: renamed from: b */
    public long f15787b;

    /* JADX INFO: renamed from: c */
    public long f15788c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal f15789d = new ThreadLocal();

    public zzfj() {
        m6465b(0L);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m6464a() {
        long j2 = this.f15786a;
        if (j2 == LocationRequestCompat.PASSIVE_INTERVAL || j2 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j2;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6465b(long j2) {
        this.f15786a = j2;
        this.f15787b = j2 == LocationRequestCompat.PASSIVE_INTERVAL ? 0L : -9223372036854775807L;
        this.f15788c = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized long m6466c(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j3 = this.f15788c;
            if (j3 != -9223372036854775807L) {
                long jM6521w = zzfm.m6521w(j3, 90000L, 1000000L, RoundingMode.DOWN);
                long j4 = (4294967296L + jM6521w) / 8589934592L;
                long j5 = (((-1) + j4) * 8589934592L) + j2;
                long j6 = (j4 * 8589934592L) + j2;
                j2 = Math.abs(j5 - jM6521w) < Math.abs(j6 - jM6521w) ? j5 : j6;
            }
            return m6468e(zzfm.m6521w(j2, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized long m6467d(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j3 = this.f15788c;
            if (j3 != -9223372036854775807L) {
                long jM6521w = zzfm.m6521w(j3, 90000L, 1000000L, RoundingMode.DOWN);
                long j4 = jM6521w / 8589934592L;
                long j5 = (j4 * 8589934592L) + j2;
                j2 = j5 >= jM6521w ? j5 : ((j4 + 1) * 8589934592L) + j2;
            }
            return m6468e(zzfm.m6521w(j2, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized long m6468e(long j2) {
        long j3;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.f15787b != -9223372036854775807L)) {
                    long jLongValue = this.f15786a;
                    if (jLongValue == 9223372036854775806L) {
                        Long l2 = (Long) this.f15789d.get();
                        if (l2 == null) {
                            throw null;
                        }
                        jLongValue = l2.longValue();
                    }
                    this.f15787b = jLongValue - j2;
                    notifyAll();
                }
                this.f15788c = j2;
                j3 = j2 + this.f15787b;
            }
            return j3;
        } catch (Throwable th) {
            throw th;
        }
    }
}

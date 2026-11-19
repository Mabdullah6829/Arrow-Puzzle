package com.google.android.gms.internal.ads;

import android.util.Range;

/* JADX INFO: loaded from: classes2.dex */
final class zzadx {

    /* JADX INFO: renamed from: a */
    public long f5071a;

    /* JADX INFO: renamed from: b */
    public long f5072b;

    /* JADX INFO: renamed from: c */
    public double f5073c;

    /* JADX INFO: renamed from: d */
    public Range f5074d;

    public zzadx() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.f5074d = range;
        this.f5073c = ((Double) range.getUpper()).doubleValue();
        this.f5071a = -9223372036854775807L;
        this.f5072b = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    /* JADX INFO: renamed from: a */
    public final void m4037a(long j2, long j3) {
        double dDoubleValue;
        zzgtr.m7128a(j2 != -9223372036854775807L);
        zzgtr.m7128a(j3 != -9223372036854775807L);
        long j4 = this.f5071a;
        if (j4 != -9223372036854775807L) {
            long j5 = this.f5072b;
            if (j5 == -9223372036854775807L || j2 == j4) {
                dDoubleValue = ((Double) this.f5074d.getUpper()).doubleValue();
            } else {
                dDoubleValue = (j3 - j5) / (j2 - j4);
            }
        } else {
            dDoubleValue = ((Double) this.f5074d.getUpper()).doubleValue();
        }
        this.f5073c = (((Double) this.f5074d.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d) + (this.f5073c * 0.800000011920929d);
        this.f5071a = j2;
        this.f5072b = j3;
    }

    /* JADX INFO: renamed from: b */
    public final void m4038b(float f2) {
        zzgtr.m7128a(f2 > 0.0f);
        this.f5074d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f2)));
        m4039c();
    }

    /* JADX INFO: renamed from: c */
    public final void m4039c() {
        this.f5073c = ((Double) this.f5074d.getUpper()).doubleValue();
        this.f5071a = -9223372036854775807L;
        this.f5072b = -9223372036854775807L;
    }
}

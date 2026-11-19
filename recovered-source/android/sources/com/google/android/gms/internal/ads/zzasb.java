package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
final class zzasb implements zzahd {

    /* JADX INFO: renamed from: a */
    public final zzary f6820a;

    /* JADX INFO: renamed from: b */
    public final int f6821b;

    /* JADX INFO: renamed from: c */
    public final long f6822c;

    /* JADX INFO: renamed from: d */
    public final long f6823d;

    /* JADX INFO: renamed from: e */
    public final long f6824e;

    public zzasb(zzary zzaryVar, int i2, long j2, long j3) {
        this.f6820a = zzaryVar;
        this.f6821b = i2;
        this.f6822c = j2;
        long j4 = (j3 - j2) / ((long) zzaryVar.f6810c);
        this.f6823d = j4;
        this.f6824e = m4361d(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    /* JADX INFO: renamed from: a */
    public final zzahb mo4064a(long j2) {
        long j3 = this.f6821b;
        zzary zzaryVar = this.f6820a;
        long j4 = (((long) zzaryVar.f6809b) * j2) / (j3 * 1000000);
        String str = zzfm.f16091a;
        long j5 = this.f6823d - 1;
        long jMax = Math.max(0L, Math.min(j4, j5));
        long j6 = zzaryVar.f6810c;
        long jM4361d = m4361d(jMax);
        long j7 = this.f6822c;
        zzahe zzaheVar = new zzahe(jM4361d, (jMax * j6) + j7);
        if (jM4361d >= j2 || jMax == j5) {
            return new zzahb(zzaheVar, zzaheVar);
        }
        long j8 = jMax + 1;
        return new zzahb(zzaheVar, new zzahe(m4361d(j8), (j6 * j8) + j7));
    }

    /* JADX INFO: renamed from: d */
    public final long m4361d(long j2) {
        return zzfm.m6521w(j2 * ((long) this.f6821b), 1000000L, this.f6820a.f6809b, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.f6824e;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }
}

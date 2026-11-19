package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzafq implements zzahd {

    /* JADX INFO: renamed from: a */
    public final long f5204a;

    /* JADX INFO: renamed from: b */
    public final long f5205b;

    /* JADX INFO: renamed from: c */
    public final int f5206c;

    /* JADX INFO: renamed from: d */
    public final long f5207d;

    /* JADX INFO: renamed from: e */
    public final int f5208e;

    /* JADX INFO: renamed from: f */
    public final long f5209f;

    /* JADX INFO: renamed from: g */
    public final boolean f5210g;

    public zzafq(long j2, long j3, int i2, int i3, boolean z) {
        long jMax;
        this.f5204a = j2;
        this.f5205b = j3;
        this.f5206c = i3 == -1 ? 1 : i3;
        this.f5208e = i2;
        this.f5210g = z;
        if (j2 == -1) {
            this.f5207d = -1L;
            jMax = -9223372036854775807L;
        } else {
            long j4 = j2 - j3;
            this.f5207d = j4;
            jMax = (Math.max(0L, j4) * 8000000) / ((long) i2);
        }
        this.f5209f = jMax;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    /* JADX INFO: renamed from: a */
    public final zzahb mo4064a(long j2) {
        long j3 = this.f5207d;
        long j4 = this.f5205b;
        if (j3 == -1) {
            zzahe zzaheVar = new zzahe(0L, j4);
            return new zzahb(zzaheVar, zzaheVar);
        }
        int i2 = this.f5208e;
        long j5 = this.f5206c;
        long jMin = (((((long) i2) * j2) / 8000000) / j5) * j5;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - j5);
        }
        long jMax = Math.max(jMin, 0L) + j4;
        long jMax2 = (Math.max(0L, jMax - j4) * 8000000) / ((long) i2);
        zzahe zzaheVar2 = new zzahe(jMax2, jMax);
        if (j3 != -1 && jMax2 < j2) {
            long j6 = jMax + j5;
            if (j6 < this.f5204a) {
                return new zzahb(zzaheVar2, new zzahe((Math.max(0L, j6 - j4) * 8000000) / ((long) i2), j6));
            }
        }
        return new zzahb(zzaheVar2, zzaheVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.f5209f;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return this.f5207d != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzj() {
        return this.f5210g;
    }
}

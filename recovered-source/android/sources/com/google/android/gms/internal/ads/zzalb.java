package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzalb implements zzaky {

    /* JADX INFO: renamed from: a */
    public final long f5784a;

    /* JADX INFO: renamed from: b */
    public final int f5785b;

    /* JADX INFO: renamed from: c */
    public final long f5786c;

    /* JADX INFO: renamed from: d */
    public final int f5787d;

    /* JADX INFO: renamed from: e */
    public final long f5788e;

    /* JADX INFO: renamed from: f */
    public final long f5789f;

    /* JADX INFO: renamed from: g */
    public final long[] f5790g;

    public zzalb(long j2, int i2, long j3, int i3, long j4, long[] jArr) {
        this.f5784a = j2;
        this.f5785b = i2;
        this.f5786c = j3;
        this.f5787d = i3;
        this.f5788e = j4;
        this.f5790g = jArr;
        this.f5789f = j4 != -1 ? j2 + j4 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    /* JADX INFO: renamed from: a */
    public final zzahb mo4064a(long j2) {
        double d;
        double d2;
        boolean zZzb = zzb();
        int i2 = this.f5785b;
        long j3 = this.f5784a;
        if (!zZzb) {
            zzahe zzaheVar = new zzahe(0L, j3 + ((long) i2));
            return new zzahb(zzaheVar, zzaheVar);
        }
        String str = zzfm.f16091a;
        long j4 = this.f5786c;
        long jMax = Math.max(0L, Math.min(j2, j4));
        double d3 = (jMax * 100.0d) / j4;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i3 = (int) d3;
            long[] jArr = this.f5790g;
            jArr.getClass();
            double d5 = jArr[i3];
            if (i3 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i3 + 1];
            }
            d4 = ((d2 - d5) * (d3 - ((double) i3))) + d5;
        }
        long j5 = this.f5788e;
        zzahe zzaheVar2 = new zzahe(jMax, j3 + Math.max(i2, Math.min(Math.round((d4 / d) * j5), j5 - 1)));
        return new zzahb(zzaheVar2, zzaheVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    /* JADX INFO: renamed from: b */
    public final long mo4181b(long j2) {
        if (!zzb()) {
            return 0L;
        }
        long j3 = j2 - this.f5784a;
        if (j3 <= this.f5785b) {
            return 0L;
        }
        long[] jArr = this.f5790g;
        jArr.getClass();
        double d = (j3 * 256.0d) / this.f5788e;
        int iM6517s = zzfm.m6517s(jArr, (long) d, true);
        long j4 = this.f5786c;
        long j5 = (((long) iM6517s) * j4) / 100;
        long j6 = jArr[iM6517s];
        int i2 = iM6517s + 1;
        long j7 = (j4 * ((long) i2)) / 100;
        long j8 = iM6517s == 99 ? 256L : jArr[i2];
        return Math.round((j6 == j8 ? 0.0d : (d - j6) / (j8 - j6)) * (j7 - j5)) + j5;
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    /* JADX INFO: renamed from: c */
    public final long mo4182c() {
        return this.f5789f;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.f5786c;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return this.f5790g != null;
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final int zzh() {
        return this.f5787d;
    }
}

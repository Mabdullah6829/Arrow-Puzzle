package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzakz implements zzaky {

    /* JADX INFO: renamed from: a */
    public final long[] f5775a;

    /* JADX INFO: renamed from: b */
    public final long[] f5776b;

    /* JADX INFO: renamed from: c */
    public final long f5777c;

    /* JADX INFO: renamed from: d */
    public final long f5778d;

    /* JADX INFO: renamed from: e */
    public final int f5779e;

    public zzakz(long[] jArr, long[] jArr2, long j2, long j3, int i2) {
        this.f5775a = jArr;
        this.f5776b = jArr2;
        this.f5777c = j2;
        this.f5778d = j3;
        this.f5779e = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    /* JADX INFO: renamed from: a */
    public final zzahb mo4064a(long j2) {
        long[] jArr = this.f5775a;
        int iM6517s = zzfm.m6517s(jArr, j2, true);
        long j3 = jArr[iM6517s];
        long[] jArr2 = this.f5776b;
        zzahe zzaheVar = new zzahe(j3, jArr2[iM6517s]);
        if (j3 >= j2 || iM6517s == jArr.length - 1) {
            return new zzahb(zzaheVar, zzaheVar);
        }
        int i2 = iM6517s + 1;
        return new zzahb(zzaheVar, new zzahe(jArr[i2], jArr2[i2]));
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    /* JADX INFO: renamed from: b */
    public final long mo4181b(long j2) {
        return this.f5775a[zzfm.m6517s(this.f5776b, j2, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    /* JADX INFO: renamed from: c */
    public final long mo4182c() {
        return this.f5778d;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.f5777c;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final int zzh() {
        return this.f5779e;
    }
}

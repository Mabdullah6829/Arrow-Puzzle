package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzzk implements zzzd {

    /* JADX INFO: renamed from: a */
    public final zzzd f21483a;

    /* JADX INFO: renamed from: b */
    public final long f21484b;

    public zzzk(zzzd zzzdVar, long j2) {
        this.f21483a = zzzdVar;
        this.f21484b = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    /* JADX INFO: renamed from: a */
    public final int mo9033a(zzly zzlyVar, zzix zzixVar, int i2) {
        int iMo9033a = this.f21483a.mo9033a(zzlyVar, zzixVar, i2);
        if (iMo9033a != -4) {
            return iMo9033a;
        }
        zzixVar.f20049e += this.f21484b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    /* JADX INFO: renamed from: f */
    public final int mo9034f(long j2) {
        return this.f21483a.mo9034f(j2 - this.f21484b);
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final boolean zza() {
        return this.f21483a.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final void zzb() {
        this.f21483a.zzb();
    }
}

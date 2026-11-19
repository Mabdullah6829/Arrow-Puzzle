package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzahc implements zzahd {

    /* JADX INFO: renamed from: a */
    public final long f5306a;

    /* JADX INFO: renamed from: b */
    public final zzahb f5307b;

    public zzahc(long j2, long j3) {
        this.f5306a = j2;
        zzahe zzaheVar = j3 == 0 ? zzahe.f5308c : new zzahe(0L, j3);
        this.f5307b = new zzahb(zzaheVar, zzaheVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    /* JADX INFO: renamed from: a */
    public final zzahb mo4064a(long j2) {
        return this.f5307b;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.f5306a;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return false;
    }
}

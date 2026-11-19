package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzxy extends zzabd {

    /* JADX INFO: renamed from: b */
    public final zzbg f21307b;

    public zzxy(zzabb zzabbVar, zzbg zzbgVar) {
        super(zzabbVar);
        this.f21307b = zzbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabd, com.google.android.gms.internal.ads.zzabg
    /* JADX INFO: renamed from: b */
    public final zzv mo3919b(int i2) {
        return this.f21307b.f7810d[this.f4837a.mo3920o(i2)];
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof zzxy)) {
            return this.f21307b.equals(((zzxy) obj).f21307b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final int hashCode() {
        return this.f21307b.hashCode() + (this.f4837a.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzabd, com.google.android.gms.internal.ads.zzabg
    public final zzbg zza() {
        return this.f21307b;
    }

    @Override // com.google.android.gms.internal.ads.zzabd, com.google.android.gms.internal.ads.zzabb
    public final zzv zzc() {
        return this.f21307b.f7810d[this.f4837a.zzh()];
    }
}

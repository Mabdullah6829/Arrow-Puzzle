package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdct implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcyr f12054a;

    /* JADX INFO: renamed from: b */
    public final zzcys f12055b;

    /* JADX INFO: renamed from: c */
    public final zzini f12056c;

    /* JADX INFO: renamed from: d */
    public final zzcyt f12057d;

    /* JADX INFO: renamed from: e */
    public final zzini f12058e;

    public zzdct(zzcyr zzcyrVar, zzcys zzcysVar, zzimy zzimyVar, zzcyt zzcytVar, zzimy zzimyVar2) {
        this.f12054a = zzcyrVar;
        this.f12055b = zzcysVar;
        this.f12056c = zzimyVar;
        this.f12057d = zzcytVar;
        this.f12058e = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzdcs zzb() {
        return new zzdcs(this.f12054a.m5872a(), this.f12055b.f11792a.f11790c, (zzemf) this.f12056c.zzb(), this.f12057d.f11793a.m5871a(), (String) this.f12058e.zzb());
    }
}

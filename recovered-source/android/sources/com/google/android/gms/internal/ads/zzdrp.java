package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdrp implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f12743a;

    /* JADX INFO: renamed from: b */
    public final zzdpc f12744b;

    /* JADX INFO: renamed from: c */
    public final zzini f12745c;

    /* JADX INFO: renamed from: d */
    public final zzdpb f12746d;

    public zzdrp(zzimy zzimyVar, zzdpc zzdpcVar, zzimy zzimyVar2, zzdpb zzdpbVar) {
        this.f12743a = zzimyVar;
        this.f12744b = zzdpcVar;
        this.f12745c = zzimyVar2;
        this.f12746d = zzdpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzdwq zzdwqVar = (zzdwq) this.f12743a.zzb();
        zzdvf zzdvfVar = this.f12744b.f12523a.f12515b;
        zzinh.m8554a(zzdvfVar);
        zzcux zzcuxVar = (zzcux) this.f12745c.zzb();
        zzdov zzdovVar = (zzdov) this.f12746d.f12522a.zzb();
        zzinh.m8554a(zzdovVar);
        return new zzdro(zzdwqVar, zzdvfVar, zzcuxVar, zzdovVar);
    }
}

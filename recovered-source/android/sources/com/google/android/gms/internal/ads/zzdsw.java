package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdsw implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzdtl f12850a;

    /* JADX INFO: renamed from: b */
    public final zzdtq f12851b;

    /* JADX INFO: renamed from: c */
    public final zzini f12852c;

    public zzdsw(zzdtl zzdtlVar, zzdtq zzdtqVar, zzini zziniVar) {
        this.f12850a = zzdtlVar;
        this.f12851b = zzdtqVar;
        this.f12852c = zziniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzdsv zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        zzdtk zzdtkVarZzb = this.f12850a.zzb();
        zzinh.m8554a(zzhcpVar);
        zzdtq zzdtqVar = this.f12851b;
        return new zzdsv(zzhcpVar, zzdtkVarZzb, new zzdtp(zzhcpVar, zzdtqVar.f12926a.zzb(), (zzdzo) zzdtqVar.f12927b.zzb()), (zzdzo) this.f12852c.zzb());
    }
}

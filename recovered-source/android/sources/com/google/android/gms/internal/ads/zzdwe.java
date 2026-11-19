package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdwe implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f13151a;

    /* JADX INFO: renamed from: b */
    public final zzini f13152b;

    /* JADX INFO: renamed from: c */
    public final zzeqc f13153c;

    /* JADX INFO: renamed from: d */
    public final zzeqw f13154d;

    public zzdwe(zzini zziniVar, zzini zziniVar2, zzeqc zzeqcVar, zzeqw zzeqwVar) {
        this.f13151a = zziniVar;
        this.f13152b = zziniVar2;
        this.f13153c = zzeqcVar;
        this.f13154d = zzeqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzfps zzfpsVar = (zzfps) this.f13151a.zzb();
        zzhcp zzhcpVar = (zzhcp) this.f13152b.zzb();
        zzeqc zzeqcVar = this.f13153c;
        return new zzerc(zzfpsVar, zzhcpVar, this.f13154d.zzb(), new zzeqb((Context) zzeqcVar.f14598a.zzb(), (zzdvz) zzeqcVar.f14599b.f20011a));
    }
}

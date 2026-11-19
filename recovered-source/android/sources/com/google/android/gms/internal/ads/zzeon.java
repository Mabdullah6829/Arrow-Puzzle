package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeon implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f14401a;

    /* JADX INFO: renamed from: b */
    public final zzdsw f14402b;

    /* JADX INFO: renamed from: c */
    public final zzini f14403c;

    /* JADX INFO: renamed from: d */
    public final zzini f14404d;

    /* JADX INFO: renamed from: e */
    public final zzini f14405e;

    /* JADX INFO: renamed from: f */
    public final zzini f14406f;

    /* JADX INFO: renamed from: g */
    public final zzini f14407g;

    public zzeon(zzina zzinaVar, zzdsw zzdswVar, zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        this.f14401a = zzinaVar;
        this.f14402b = zzdswVar;
        this.f14403c = zziniVar;
        this.f14404d = zziniVar2;
        this.f14405e = zziniVar3;
        this.f14406f = zziniVar4;
        this.f14407g = zziniVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzdok zzdokVar = (zzdok) this.f14401a.f20011a;
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzeom(zzdokVar, zzhcpVar, this.f14402b.zzb(), (zzfmf) this.f14403c.zzb(), (zzdvl) this.f14404d.zzb(), (zzdzo) this.f14405e.zzb(), ((zzcop) this.f14406f).m5711a(), (Context) this.f14407g.zzb(), new zzcdq());
    }
}

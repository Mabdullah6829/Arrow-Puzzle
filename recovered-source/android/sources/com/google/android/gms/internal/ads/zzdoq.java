package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdoq implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f12442a;

    /* JADX INFO: renamed from: b */
    public final zzdcr f12443b;

    /* JADX INFO: renamed from: c */
    public final zzdju f12444c;

    /* JADX INFO: renamed from: d */
    public final zzdoh f12445d;

    /* JADX INFO: renamed from: e */
    public final zzini f12446e;

    /* JADX INFO: renamed from: f */
    public final zzini f12447f;

    public zzdoq(zzdcr zzdcrVar, zzdju zzdjuVar, zzdoh zzdohVar, zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.f12442a = zziniVar;
        this.f12443b = zzdcrVar;
        this.f12444c = zzdjuVar;
        this.f12445d = zzdohVar;
        this.f12446e = zziniVar2;
        this.f12447f = zziniVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzcnq zzcnqVar = (zzcnq) this.f12442a.zzb();
        zzdci zzdciVarM5897a = this.f12443b.f12042a.m5897a();
        zzdiz zzdizVar = this.f12444c.f12272a;
        zzdof zzdofVar = this.f12445d.f12437a;
        zzdga zzdgaVarZzb = ((zzcvr) this.f12446e).zzb();
        zzepl zzeplVar = (zzepl) this.f12447f.zzb();
        zzcww zzcwwVarMo5693l = zzcnqVar.mo5693l();
        ((zzcpl) zzcwwVarMo5693l).f10939e = new zzdcj(zzdciVarM5897a);
        zzcpl zzcplVar = (zzcpl) zzcwwVarMo5693l;
        zzcplVar.f10938d = zzdizVar;
        zzcplVar.f10944j = zzdofVar;
        zzcplVar.f10940f = new zzerq(null);
        zzcplVar.f10941g = new zzcxs(zzdgaVarZzb, null);
        zzcplVar.f10943i = new zzcvp(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8848y4)).booleanValue()) {
            zzepu zzepuVar = new zzepu();
            zzepuVar.f14579a = zzeplVar;
            zzcplVar.f10942h = zzepuVar;
        }
        zzcyd zzcydVar = (zzcyd) ((zzcpm) zzcplVar.zzh()).f11000t.zzb();
        zzinh.m8554a(zzcydVar);
        return zzcydVar;
    }
}

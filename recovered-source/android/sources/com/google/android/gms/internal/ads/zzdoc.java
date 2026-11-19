package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdoc implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzdnc f12418a;

    /* JADX INFO: renamed from: b */
    public final zzini f12419b;

    /* JADX INFO: renamed from: c */
    public final zzini f12420c;

    /* JADX INFO: renamed from: d */
    public final zzdmq f12421d;

    /* JADX INFO: renamed from: e */
    public final zzini f12422e;

    /* JADX INFO: renamed from: f */
    public final zzcyr f12423f;

    public zzdoc(zzdnc zzdncVar, zzcnz zzcnzVar, zzimy zzimyVar, zzdmq zzdmqVar, zzini zziniVar, zzcyr zzcyrVar) {
        this.f12418a = zzdncVar;
        this.f12419b = zzcnzVar;
        this.f12420c = zzimyVar;
        this.f12421d = zzdmqVar;
        this.f12422e = zziniVar;
        this.f12423f = zzcyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzdnc zzdncVar = this.f12418a;
        zzced zzcedVar = new zzced(((zzcnz) zzdncVar.f12375a).m5709a(), ((zzdcq) zzdncVar.f12376b).m5898a().f16043g);
        Context contextM5709a = ((zzcnz) this.f12419b).m5709a();
        zzceg zzcegVar = (zzceg) this.f12420c.zzb();
        zzclb zzclbVar = this.f12421d.f12353a.f12349b;
        return new zzdob(zzcedVar, contextM5709a, zzcegVar, zzclbVar == null ? null : zzclbVar.mo5620y(), (zzbic.zza.EnumC6586zza) this.f12422e.zzb(), this.f12423f.m5872a());
    }
}

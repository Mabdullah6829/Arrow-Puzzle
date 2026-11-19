package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemm implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f14218a;

    /* JADX INFO: renamed from: b */
    public final zzini f14219b;

    /* JADX INFO: renamed from: c */
    public final zzini f14220c;

    /* JADX INFO: renamed from: d */
    public final zzini f14221d;

    /* JADX INFO: renamed from: e */
    public final zzdcq f14222e;

    /* JADX INFO: renamed from: f */
    public final zzini f14223f;

    /* JADX INFO: renamed from: g */
    public final zzini f14224g;

    /* JADX INFO: renamed from: h */
    public final zzini f14225h;

    /* JADX INFO: renamed from: i */
    public final zzini f14226i;

    public zzemm(zzdcq zzdcqVar, zzina zzinaVar, zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7) {
        this.f14218a = zzinaVar;
        this.f14219b = zziniVar;
        this.f14220c = zziniVar2;
        this.f14221d = zziniVar3;
        this.f14222e = zzdcqVar;
        this.f14223f = zziniVar4;
        this.f14224g = zziniVar5;
        this.f14225h = zziniVar6;
        this.f14226i = zziniVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzcvg zzcvgVar = (zzcvg) this.f14218a.f20011a;
        return new zzeml(zzcvgVar, (Executor) this.f14220c.zzb(), (zzdwq) this.f14221d.zzb(), this.f14222e.m5898a(), ((zzcop) this.f14223f).m5711a(), new zzbqa(), (zzekz) this.f14224g.zzb(), (zzdzo) this.f14225h.zzb(), (zzdzt) this.f14226i.zzb());
    }
}

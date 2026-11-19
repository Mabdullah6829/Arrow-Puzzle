package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzenx implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f14345a;

    /* JADX INFO: renamed from: b */
    public final zzini f14346b;

    /* JADX INFO: renamed from: c */
    public final zzdcq f14347c;

    /* JADX INFO: renamed from: d */
    public final zzini f14348d;

    /* JADX INFO: renamed from: e */
    public final zzina f14349e;

    /* JADX INFO: renamed from: f */
    public final zzini f14350f;

    /* JADX INFO: renamed from: g */
    public final zzini f14351g;

    /* JADX INFO: renamed from: h */
    public final zzini f14352h;

    /* JADX INFO: renamed from: i */
    public final zzini f14353i;

    public zzenx(zzdcq zzdcqVar, zzina zzinaVar, zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7) {
        this.f14345a = zziniVar;
        this.f14346b = zziniVar2;
        this.f14347c = zzdcqVar;
        this.f14348d = zziniVar3;
        this.f14349e = zzinaVar;
        this.f14350f = zziniVar4;
        this.f14351g = zziniVar5;
        this.f14352h = zziniVar6;
        this.f14353i = zziniVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzenw((Context) this.f14345a.zzb(), ((zzcop) this.f14346b).m5711a(), this.f14347c.m5898a(), (Executor) this.f14348d.zzb(), (zzdno) this.f14349e.f20011a, (zzdwq) this.f14350f.zzb(), new zzbqa(), (zzekz) this.f14351g.zzb(), (zzdzo) this.f14352h.zzb(), (zzdzt) this.f14353i.zzb());
    }
}

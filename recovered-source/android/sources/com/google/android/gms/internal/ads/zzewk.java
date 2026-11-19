package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewk implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15037a;

    /* JADX INFO: renamed from: b */
    public final zzdco f15038b;

    /* JADX INFO: renamed from: c */
    public final zzini f15039c;

    /* JADX INFO: renamed from: d */
    public final zzini f15040d;

    /* JADX INFO: renamed from: e */
    public final zzini f15041e;

    /* JADX INFO: renamed from: f */
    public final zzdcq f15042f;

    /* JADX INFO: renamed from: g */
    public final zzini f15043g;

    /* JADX INFO: renamed from: h */
    public final zzini f15044h;

    /* JADX INFO: renamed from: i */
    public final zzini f15045i;

    public zzewk(zzini zziniVar, zzdco zzdcoVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzdcq zzdcqVar, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7) {
        this.f15037a = zziniVar;
        this.f15038b = zzdcoVar;
        this.f15039c = zziniVar2;
        this.f15040d = zziniVar3;
        this.f15041e = zziniVar4;
        this.f15042f = zzdcqVar;
        this.f15043g = zziniVar5;
        this.f15044h = zziniVar6;
        this.f15045i = zziniVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context contextM5709a = ((zzcnz) this.f15037a).m5709a();
        String str = ((zzczq) this.f15038b.f12039a.zzb()).f11843t.f9866e;
        zzinh.m8554a(str);
        return new zzewi(contextM5709a, str, (String) this.f15039c.zzb(), (zzczq) this.f15040d.zzb(), (zzfmo) this.f15041e.zzb(), this.f15042f.m5898a(), (zzdzo) this.f15043g.zzb(), (zzdae) this.f15044h.zzb(), ((Long) this.f15045i.zzb()).longValue());
    }
}

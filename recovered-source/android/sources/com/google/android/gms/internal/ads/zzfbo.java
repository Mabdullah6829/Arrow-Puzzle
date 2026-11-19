package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbo implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15338a;

    /* JADX INFO: renamed from: b */
    public final zzdcq f15339b;

    /* JADX INFO: renamed from: c */
    public final zzini f15340c;

    public zzfbo(zzdcq zzdcqVar, zzini zziniVar, zzini zziniVar2) {
        this.f15338a = zziniVar;
        this.f15339b = zzdcqVar;
        this.f15340c = zziniVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfbm zzb() {
        Context contextM5709a = ((zzcnz) this.f15338a).m5709a();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfbm(contextM5709a, zzhcpVar, this.f15339b.m5898a(), ((zzcop) this.f15340c).m5711a());
    }
}

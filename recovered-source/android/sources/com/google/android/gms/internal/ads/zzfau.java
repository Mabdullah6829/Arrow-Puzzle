package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfau implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzdcq f15289a;

    /* JADX INFO: renamed from: b */
    public final zzini f15290b;

    /* JADX INFO: renamed from: c */
    public final zzini f15291c;

    public zzfau(zzdcq zzdcqVar, zzini zziniVar, zzini zziniVar2) {
        this.f15289a = zzdcqVar;
        this.f15290b = zziniVar;
        this.f15291c = zziniVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfas(zzhcpVar, this.f15289a.m5898a(), (PackageInfo) this.f15290b.zzb(), ((zzcnt) this.f15291c).zzb());
    }
}

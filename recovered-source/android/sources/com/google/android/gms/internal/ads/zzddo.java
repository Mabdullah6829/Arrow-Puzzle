package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzddo implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzddn f12080a;

    /* JADX INFO: renamed from: b */
    public final zzinl f12081b;

    /* JADX INFO: renamed from: c */
    public final zzini f12082c;

    public zzddo(zzddn zzddnVar, zzinl zzinlVar, zzimy zzimyVar) {
        this.f12080a = zzddnVar;
        this.f12081b = zzinlVar;
        this.f12082c = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzddi zzddiVar = new zzddi(this.f12080a.f12079a.zzb());
        Set setZzb = this.f12081b.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzddm(zzddiVar, setZzb, zzhcpVar, (ScheduledExecutorService) this.f12082c.zzb());
    }
}

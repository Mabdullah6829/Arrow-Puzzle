package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdbt implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11966a;

    /* JADX INFO: renamed from: b */
    public final zzcyr f11967b;

    /* JADX INFO: renamed from: c */
    public final zzini f11968c;

    /* JADX INFO: renamed from: d */
    public final zzcys f11969d;

    /* JADX INFO: renamed from: e */
    public final zzini f11970e;

    public zzdbt(zzimy zzimyVar, zzcyr zzcyrVar, zzimy zzimyVar2, zzcys zzcysVar, zzimy zzimyVar3) {
        this.f11966a = zzimyVar;
        this.f11967b = zzcyrVar;
        this.f11968c = zzimyVar2;
        this.f11969d = zzcysVar;
        this.f11970e = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzddr zzddrVar = (zzddr) this.f11966a.zzb();
        zzfkn zzfknVarM5872a = this.f11967b.m5872a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f11968c.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzdbs(zzddrVar, zzfknVarM5872a, scheduledExecutorService, zzhcpVar, this.f11969d.f11792a.f11790c, (zzdfs) this.f11970e.zzb());
    }
}

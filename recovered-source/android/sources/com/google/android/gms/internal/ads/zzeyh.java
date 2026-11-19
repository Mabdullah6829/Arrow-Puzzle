package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyh implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzeuv f15153a;

    /* JADX INFO: renamed from: b */
    public final zzini f15154b;

    public zzeyh(zzeuv zzeuvVar, zzini zziniVar) {
        this.f15153a = zzeuvVar;
        this.f15154b = zziniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        zzeuv zzeuvVar = this.f15153a;
        zzflg zzflgVarM5898a = zzeuvVar.f14934a.m5898a();
        return new zzfbe(new zzeut(zzhcpVar, zzflgVarM5898a), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8288Qd)).intValue(), (ScheduledExecutorService) this.f15154b.zzb());
    }
}

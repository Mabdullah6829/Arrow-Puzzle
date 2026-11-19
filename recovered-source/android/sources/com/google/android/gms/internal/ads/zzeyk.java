package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyk implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzevt f15159a;

    /* JADX INFO: renamed from: b */
    public final zzini f15160b;

    public zzeyk(zzevt zzevtVar, zzini zziniVar) {
        this.f15159a = zzevtVar;
        this.f15160b = zziniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfbe(new zzevr(((zzcnz) this.f15159a.f14992a).m5709a(), zzhcpVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8434Zd)).intValue(), (ScheduledExecutorService) this.f15160b.zzb());
    }
}

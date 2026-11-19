package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezg implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzfcp f15214a;

    /* JADX INFO: renamed from: b */
    public final zzini f15215b;

    public zzezg(zzfcp zzfcpVar, zzimy zzimyVar) {
        this.f15214a = zzfcpVar;
        this.f15215b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfbe(new zzfco(((zzcnz) this.f15214a.f15422a).m5709a(), zzhcpVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8874zd)).intValue(), (ScheduledExecutorService) this.f15215b.zzb());
    }
}

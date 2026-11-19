package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeza implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzfay f15199a;

    /* JADX INFO: renamed from: b */
    public final zzini f15200b;

    public zzeza(zzfay zzfayVar, zzimy zzimyVar) {
        this.f15199a = zzfayVar;
        this.f15200b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfbe(new zzfaw(((zzcnz) this.f15199a.f15295a).m5709a(), zzhcpVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8084Ed)).intValue(), (ScheduledExecutorService) this.f15200b.zzb());
    }
}

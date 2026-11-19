package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyt implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15182a;

    public zzeyt(zzimy zzimyVar) {
        this.f15182a = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfbe(new zzezo(zzhcpVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8152Id)).intValue(), (ScheduledExecutorService) this.f15182a.zzb());
    }
}

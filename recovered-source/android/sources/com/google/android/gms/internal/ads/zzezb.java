package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezb implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzfbc f15201a;

    /* JADX INFO: renamed from: b */
    public final zzini f15202b;

    public zzezb(zzfbc zzfbcVar, zzimy zzimyVar) {
        this.f15201a = zzfbcVar;
        this.f15202b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfbe(new zzfba(zzhcpVar, (zzeaw) this.f15201a.f15307a.zzb()), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8118Gd)).intValue(), (ScheduledExecutorService) this.f15202b.zzb());
    }
}

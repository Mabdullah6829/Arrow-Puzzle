package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyx implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzfaj f15191a;

    /* JADX INFO: renamed from: b */
    public final zzini f15192b;

    public zzeyx(zzfaj zzfajVar, zzini zziniVar) {
        this.f15191a = zzfajVar;
        this.f15192b = zziniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfbe(new zzfah(zzhcpVar, (zzecz) this.f15191a.f15274a.zzb()), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8135Hd)).intValue(), (ScheduledExecutorService) this.f15192b.zzb());
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezd implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzfbo f15206a;

    /* JADX INFO: renamed from: b */
    public final zzini f15207b;

    public zzezd(zzfbo zzfboVar, zzini zziniVar) {
        this.f15206a = zzfboVar;
        this.f15207b = zziniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzfbe(this.f15206a.zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8050Cd)).intValue(), (ScheduledExecutorService) this.f15207b.zzb());
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezh implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15216a;

    /* JADX INFO: renamed from: b */
    public final zzini f15217b;

    public zzezh(zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15216a = zzimyVar;
        this.f15217b = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzfbe((zzexg) this.f15216a.zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8857yd)).intValue(), (ScheduledExecutorService) this.f15217b.zzb());
    }
}

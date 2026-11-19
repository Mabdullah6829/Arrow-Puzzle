package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyp implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzexc f15175a;

    /* JADX INFO: renamed from: b */
    public final zzini f15176b;

    public zzeyp(zzexc zzexcVar, zzimy zzimyVar) {
        this.f15175a = zzexcVar;
        this.f15176b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzfbe(new zzexb((zzfhm) this.f15175a.f15077a.f20011a), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8186Kd)).intValue(), (ScheduledExecutorService) this.f15176b.zzb());
    }
}

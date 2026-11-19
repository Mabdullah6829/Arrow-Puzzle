package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyo implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15173a;

    /* JADX INFO: renamed from: b */
    public final zzini f15174b;

    public zzeyo(zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15173a = zzimyVar;
        this.f15174b = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzfbe((zzexg) this.f15173a.zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8203Ld)).intValue(), (ScheduledExecutorService) this.f15174b.zzb());
    }
}

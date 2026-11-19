package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyi implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzevf f15155a;

    /* JADX INFO: renamed from: b */
    public final zzini f15156b;

    public zzeyi(zzevf zzevfVar, zzimy zzimyVar) {
        this.f15155a = zzevfVar;
        this.f15156b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzfbe(this.f15155a.zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8271Pd)).intValue(), (ScheduledExecutorService) this.f15156b.zzb());
    }
}

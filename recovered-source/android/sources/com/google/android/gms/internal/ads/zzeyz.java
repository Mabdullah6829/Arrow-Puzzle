package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyz implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzfaq f15196a;

    /* JADX INFO: renamed from: b */
    public final zzini f15197b;

    public zzeyz(zzfaq zzfaqVar, zzimy zzimyVar) {
        this.f15196a = zzfaqVar;
        this.f15197b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzfbe(new zzfao((zzfkm) this.f15196a.f15280a.zzb()), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8402Xd)).intValue(), (ScheduledExecutorService) this.f15197b.zzb());
    }
}

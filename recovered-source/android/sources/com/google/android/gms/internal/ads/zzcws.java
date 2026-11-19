package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcws implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzewv f11638a;

    /* JADX INFO: renamed from: b */
    public final zzini f11639b;

    public zzcws(zzewv zzewvVar, zzimy zzimyVar) {
        this.f11638a = zzewvVar;
        this.f11639b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzfbe(new zzewt(this.f11638a.f15068a.m5898a()), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8418Yd)).intValue(), (ScheduledExecutorService) this.f11639b.zzb());
    }
}

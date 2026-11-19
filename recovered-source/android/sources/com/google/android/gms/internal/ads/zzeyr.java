package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyr implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzexo f15178a;

    /* JADX INFO: renamed from: b */
    public final zzini f15179b;

    public zzeyr(zzexo zzexoVar, zzimy zzimyVar) {
        this.f15178a = zzexoVar;
        this.f15179b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzfbe(this.f15178a.zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8322Sd)).intValue(), (ScheduledExecutorService) this.f15179b.zzb());
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcwr implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzeuo f11636a;

    /* JADX INFO: renamed from: b */
    public final zzini f11637b;

    public zzcwr(zzeuo zzeuoVar, zzimy zzimyVar) {
        this.f11636a = zzeuoVar;
        this.f11637b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzfbe(this.f11636a.zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8338Td)).intValue(), (ScheduledExecutorService) this.f11637b.zzb());
    }
}

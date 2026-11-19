package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcwt implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzfac f11640a;

    /* JADX INFO: renamed from: b */
    public final zzini f11641b;

    public zzcwt(zzfac zzfacVar, zzimy zzimyVar) {
        this.f11640a = zzfacVar;
        this.f11641b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzfbe(this.f11640a.zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8354Ud)).intValue(), (ScheduledExecutorService) this.f11641b.zzb());
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyj implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzevp f15157a;

    /* JADX INFO: renamed from: b */
    public final zzini f15158b;

    public zzeyj(zzevp zzevpVar, zzimy zzimyVar) {
        this.f15157a = zzevpVar;
        this.f15158b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzfbe(this.f15157a.zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8305Rd)).intValue(), (ScheduledExecutorService) this.f15158b.zzb());
    }
}

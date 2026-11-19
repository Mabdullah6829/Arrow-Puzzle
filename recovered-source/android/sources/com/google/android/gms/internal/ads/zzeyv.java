package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyv implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzezy f15185a;

    /* JADX INFO: renamed from: b */
    public final zzini f15186b;

    public zzeyv(zzezy zzezyVar, zzini zziniVar) {
        this.f15185a = zzezyVar;
        this.f15186b = zziniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfbe(new zzezw(zzhcpVar, this.f15185a.f15242a.m5898a()), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8386Wd)).intValue(), (ScheduledExecutorService) this.f15186b.zzb());
    }
}

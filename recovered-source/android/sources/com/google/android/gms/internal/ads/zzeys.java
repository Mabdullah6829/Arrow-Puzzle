package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeys implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzezm f15180a;

    /* JADX INFO: renamed from: b */
    public final zzini f15181b;

    public zzeys(zzezm zzezmVar, zzimy zzimyVar) {
        this.f15180a = zzezmVar;
        this.f15181b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context contextM5709a = ((zzcnz) this.f15180a.f15228a).m5709a();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfbe(new zzezl(contextM5709a, zzhcpVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8169Jd)).intValue(), (ScheduledExecutorService) this.f15181b.zzb());
    }
}

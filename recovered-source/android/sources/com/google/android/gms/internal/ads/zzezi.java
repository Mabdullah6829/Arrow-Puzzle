package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezi implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15218a;

    /* JADX INFO: renamed from: b */
    public final zzini f15219b;

    /* JADX INFO: renamed from: c */
    public final zzini f15220c;

    /* JADX INFO: renamed from: d */
    public final zzini f15221d;

    public zzezi(zzfdi zzfdiVar, zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f15218a = zzfdiVar;
        this.f15219b = zzimyVar;
        this.f15220c = zzimyVar2;
        this.f15221d = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzfdh zzfdhVarZzb = ((zzfdi) this.f15218a).zzb();
        zzexg zzexgVar = (zzexg) this.f15219b.zzb();
        List list = (List) this.f15220c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f15221d.zzb();
        if (list.contains("39")) {
            return new zzfbe(zzexgVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8840xd)).intValue(), scheduledExecutorService);
        }
        return new zzfbe(zzfdhVarZzb, ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8840xd)).intValue(), scheduledExecutorService);
    }
}

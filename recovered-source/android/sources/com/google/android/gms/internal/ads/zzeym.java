package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeym implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15165a;

    /* JADX INFO: renamed from: b */
    public final zzini f15166b;

    /* JADX INFO: renamed from: c */
    public final zzini f15167c;

    /* JADX INFO: renamed from: d */
    public final zzini f15168d;

    public zzeym(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.f15165a = zziniVar;
        this.f15166b = zziniVar2;
        this.f15167c = zziniVar3;
        this.f15168d = zziniVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzewm zzewmVarZzb = ((zzewo) this.f15165a).zzb();
        zzexg zzexgVar = (zzexg) this.f15166b.zzb();
        List list = (List) this.f15167c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f15168d.zzb();
        if (list.contains("54")) {
            return new zzfbe(zzexgVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8237Nd)).intValue(), scheduledExecutorService);
        }
        return new zzfbe(zzewmVarZzb, ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8237Nd)).intValue(), scheduledExecutorService);
    }
}

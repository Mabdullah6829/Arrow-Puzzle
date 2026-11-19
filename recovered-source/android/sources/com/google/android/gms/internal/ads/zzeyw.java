package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyw implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15187a;

    /* JADX INFO: renamed from: b */
    public final zzini f15188b;

    /* JADX INFO: renamed from: c */
    public final zzini f15189c;

    /* JADX INFO: renamed from: d */
    public final zzini f15190d;

    public zzeyw(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.f15187a = zziniVar;
        this.f15188b = zziniVar2;
        this.f15189c = zziniVar3;
        this.f15190d = zziniVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzfad zzfadVarZzb = ((zzfaf) this.f15187a).zzb();
        zzexg zzexgVar = (zzexg) this.f15188b.zzb();
        List list = (List) this.f15189c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f15190d.zzb();
        if (list.contains("60")) {
            return new zzfbe(zzexgVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8671ne)).intValue(), scheduledExecutorService);
        }
        return new zzfbe(zzfadVarZzb, ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8671ne)).intValue(), scheduledExecutorService);
    }
}

package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezf implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15210a;

    /* JADX INFO: renamed from: b */
    public final zzini f15211b;

    /* JADX INFO: renamed from: c */
    public final zzini f15212c;

    /* JADX INFO: renamed from: d */
    public final zzini f15213d;

    public zzezf(zzfci zzfciVar, zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f15210a = zzfciVar;
        this.f15211b = zzimyVar;
        this.f15212c = zzimyVar2;
        this.f15213d = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzfcg zzfcgVarZzb = ((zzfci) this.f15210a).zzb();
        zzexg zzexgVar = (zzexg) this.f15211b.zzb();
        List list = (List) this.f15212c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f15213d.zzb();
        if (list.contains("35")) {
            return new zzfbe(zzexgVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8016Ad)).intValue(), scheduledExecutorService);
        }
        return new zzfbe(zzfcgVarZzb, ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8016Ad)).intValue(), scheduledExecutorService);
    }
}

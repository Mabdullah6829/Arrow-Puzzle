package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyy implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15193a;

    /* JADX INFO: renamed from: b */
    public final zzini f15194b;

    /* JADX INFO: renamed from: c */
    public final zzini f15195c;

    public zzeyy(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f15193a = zzimyVar;
        this.f15194b = zzimyVar2;
        this.f15195c = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        zzfal zzfalVar = new zzfal(zzhcpVar);
        zzexg zzexgVar = (zzexg) this.f15193a.zzb();
        List list = (List) this.f15194b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f15195c.zzb();
        if (list.contains("24")) {
            return new zzfbe(zzexgVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8101Fd)).intValue(), scheduledExecutorService);
        }
        return new zzfbe(zzfalVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8101Fd)).intValue(), scheduledExecutorService);
    }
}

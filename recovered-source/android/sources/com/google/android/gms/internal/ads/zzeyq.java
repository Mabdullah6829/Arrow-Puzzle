package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyq implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15177a;

    public zzeyq(zzimy zzimyVar) {
        this.f15177a = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Object zzgzeVar;
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        zzexi zzexiVar = new zzexi(zzhcpVar);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f15177a.zzb();
        zzbio zzbioVar = zzbix.f8393X4;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            zzfbe zzfbeVar = new zzfbe(zzexiVar, ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8409Y4)).intValue(), scheduledExecutorService);
            int i2 = zzgxd.f18323u;
            zzgzeVar = new zzgze(zzfbeVar);
        } else {
            int i3 = zzgxd.f18323u;
            zzgzeVar = zzgyu.f18372B;
        }
        zzinh.m8554a(zzgzeVar);
        return zzgzeVar;
    }
}

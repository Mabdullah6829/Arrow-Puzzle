package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyl implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15161a;

    /* JADX INFO: renamed from: b */
    public final zzini f15162b;

    /* JADX INFO: renamed from: c */
    public final zzini f15163c;

    /* JADX INFO: renamed from: d */
    public final zzini f15164d;

    public zzeyl(zzewb zzewbVar, zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f15161a = zzewbVar;
        this.f15162b = zzimyVar;
        this.f15163c = zzimyVar2;
        this.f15164d = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzevz zzevzVarZzb = ((zzewb) this.f15161a).zzb();
        zzexg zzexgVar = (zzexg) this.f15162b.zzb();
        List list = (List) this.f15163c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f15164d.zzb();
        if (list.contains("10")) {
            return new zzfbe(zzexgVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8067Dd)).intValue(), scheduledExecutorService);
        }
        return new zzfbe(zzevzVarZzb, ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8067Dd)).intValue(), scheduledExecutorService);
    }
}

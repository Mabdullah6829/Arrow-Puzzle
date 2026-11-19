package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewh implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15017a;

    /* JADX INFO: renamed from: b */
    public final zzini f15018b;

    /* JADX INFO: renamed from: c */
    public final zzini f15019c;

    public zzewh(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.f15017a = zziniVar;
        this.f15018b = zziniVar2;
        this.f15019c = zziniVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context contextM5709a = ((zzcnz) this.f15017a).m5709a();
        zzcfk zzcfkVar = (zzcfk) this.f15018b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f15019c.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzewf(contextM5709a, zzcfkVar, scheduledExecutorService, zzhcpVar);
    }
}

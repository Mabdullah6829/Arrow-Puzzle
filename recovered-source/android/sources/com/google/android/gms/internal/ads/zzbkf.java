package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbkf implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f8970a;

    /* JADX INFO: renamed from: b */
    public final zzini f8971b;

    /* JADX INFO: renamed from: c */
    public final zzini f8972c;

    public zzbkf(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.f8970a = zziniVar;
        this.f8971b = zziniVar2;
        this.f8972c = zziniVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        ((zzcnz) this.f8970a).m5709a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f8971b.zzb();
        new zzbkg();
        return new zzbke(scheduledExecutorService);
    }
}

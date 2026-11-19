package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeva implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f14945a;

    /* JADX INFO: renamed from: b */
    public final zzini f14946b;

    public zzeva(zzini zziniVar, zzini zziniVar2) {
        this.f14945a = zziniVar;
        this.f14946b = zziniVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        ListenableFuture listenableFuture = (ListenableFuture) this.f14945a.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzeuy(listenableFuture, zzhcpVar, (ScheduledExecutorService) this.f14946b.zzb());
    }
}

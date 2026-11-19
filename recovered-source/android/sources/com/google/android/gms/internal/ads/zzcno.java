package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcno implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f10610a;

    /* JADX INFO: renamed from: b */
    public final zzini f10611b;

    public zzcno(zzimy zzimyVar, zzimy zzimyVar2) {
        this.f10610a = zzimyVar;
        this.f10611b = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcnn((ScheduledExecutorService) this.f10611b.zzb());
    }
}

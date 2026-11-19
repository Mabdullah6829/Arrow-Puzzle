package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeze implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzfce f15208a;

    /* JADX INFO: renamed from: b */
    public final zzini f15209b;

    public zzeze(zzfce zzfceVar, zzimy zzimyVar) {
        this.f15208a = zzfceVar;
        this.f15209b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzfce zzfceVar = this.f15208a;
        zzceg zzcegVar = (zzceg) zzfceVar.f15397a.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfbe(new zzfcc(zzcegVar, zzhcpVar, ((zzcnz) zzfceVar.f15398b).m5709a()), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8033Bd)).intValue(), (ScheduledExecutorService) this.f15209b.zzb());
    }
}

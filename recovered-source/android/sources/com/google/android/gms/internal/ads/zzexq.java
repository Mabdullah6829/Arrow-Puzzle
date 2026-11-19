package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexq implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzfda f15105a;

    /* JADX INFO: renamed from: b */
    public final zzini f15106b;

    /* JADX INFO: renamed from: c */
    public final zzini f15107c;

    public zzexq(zzfda zzfdaVar, zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15105a = zzfdaVar;
        this.f15106b = zzimyVar;
        this.f15107c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context contextM5709a = this.f15105a.f15452a.m5709a();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        zzfcy zzfcyVar = new zzfcy(contextM5709a, zzhcpVar);
        Clock clock = (Clock) this.f15106b.zzb();
        zzinh.m8554a(zzhcpVar);
        return new zzexg(zzfcyVar, 2147483647L, clock, zzhcpVar, (zzdzt) this.f15107c.zzb());
    }
}

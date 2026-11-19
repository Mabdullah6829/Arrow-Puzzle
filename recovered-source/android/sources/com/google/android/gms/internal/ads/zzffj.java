package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzffj implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15577a;

    /* JADX INFO: renamed from: b */
    public final zzffb f15578b;

    /* JADX INFO: renamed from: c */
    public final zzfey f15579c;

    /* JADX INFO: renamed from: d */
    public final zzini f15580d;

    /* JADX INFO: renamed from: e */
    public final zzffd f15581e;

    public zzffj(zzimy zzimyVar, zzffb zzffbVar, zzfey zzfeyVar, zzimy zzimyVar2, zzffd zzffdVar) {
        this.f15577a = zzimyVar;
        this.f15578b = zzffbVar;
        this.f15579c = zzfeyVar;
        this.f15580d = zzimyVar2;
        this.f15581e = zzffdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzffh zzb() {
        zzcfk zzcfkVar = (zzcfk) this.f15577a.zzb();
        boolean z = this.f15578b.f15566a.f15561a.f9679C;
        new zzcfa();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        zzinh.m8554a(this.f15579c.f15563a.f15561a.f9685v);
        return new zzffh(zzcfkVar, z, zzhcpVar, (ScheduledExecutorService) this.f15580d.zzb(), this.f15581e.zzb().intValue());
    }
}

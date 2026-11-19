package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdcb implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcyu f11987a;

    /* JADX INFO: renamed from: b */
    public final zzcyr f11988b;

    /* JADX INFO: renamed from: c */
    public final zzini f11989c;

    /* JADX INFO: renamed from: d */
    public final zzini f11990d;

    /* JADX INFO: renamed from: e */
    public final zzini f11991e;

    public zzdcb(zzcyu zzcyuVar, zzcyr zzcyrVar, zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f11987a = zzcyuVar;
        this.f11988b = zzcyrVar;
        this.f11989c = zzimyVar;
        this.f11990d = zzimyVar2;
        this.f11991e = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdca(this.f11987a.m5873a(), this.f11988b.m5872a(), (Clock) this.f11989c.zzb(), (zzdzt) this.f11990d.zzb(), (ScheduledExecutorService) this.f11991e.zzb());
    }
}

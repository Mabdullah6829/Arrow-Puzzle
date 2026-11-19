package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcvr implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11581a;

    /* JADX INFO: renamed from: b */
    public final zzini f11582b;

    /* JADX INFO: renamed from: c */
    public final zzini f11583c;

    public zzcvr(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f11581a = zzimyVar;
        this.f11582b = zzimyVar2;
        this.f11583c = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzdga zzb() {
        return new zzdga((ScheduledExecutorService) this.f11581a.zzb(), (Clock) this.f11582b.zzb(), (zzdzt) this.f11583c.zzb());
    }
}

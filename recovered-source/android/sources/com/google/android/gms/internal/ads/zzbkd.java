package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbkd implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f8963a;

    /* JADX INFO: renamed from: b */
    public final zzini f8964b;

    /* JADX INFO: renamed from: c */
    public final zzini f8965c;

    /* JADX INFO: renamed from: d */
    public final zzini f8966d;

    public zzbkd(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3, zzimy zzimyVar4) {
        this.f8963a = zzimyVar;
        this.f8964b = zzimyVar2;
        this.f8965c = zzimyVar3;
        this.f8966d = zzimyVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzbkc zzb() {
        return new zzbkc((ScheduledExecutorService) this.f8963a.zzb(), (com.google.android.gms.ads.nonagon.signalgeneration.zzj) this.f8964b.zzb(), (com.google.android.gms.ads.nonagon.signalgeneration.zza) this.f8965c.zzb(), (zzdzy) this.f8966d.zzb());
    }
}

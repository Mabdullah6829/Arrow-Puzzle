package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesk implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f14790a;

    /* JADX INFO: renamed from: b */
    public final zzini f14791b;

    /* JADX INFO: renamed from: c */
    public final zzini f14792c;

    /* JADX INFO: renamed from: d */
    public final zzcwf f14793d;

    /* JADX INFO: renamed from: e */
    public final zzini f14794e;

    public zzesk(zzimy zzimyVar, zzdog zzdogVar, zzdcq zzdcqVar, zzcwf zzcwfVar, zzimy zzimyVar2) {
        this.f14790a = zzimyVar;
        this.f14791b = zzdogVar;
        this.f14792c = zzdcqVar;
        this.f14793d = zzcwfVar;
        this.f14794e = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzesj((Context) this.f14790a.zzb(), ((zzdog) this.f14791b).f12436a.f12435b, ((zzdcq) this.f14792c).m5898a(), this.f14793d.f11620a.zzb(), (zzdzt) this.f14794e.zzb());
    }
}

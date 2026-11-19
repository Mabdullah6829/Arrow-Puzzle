package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzczr implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11844a;

    /* JADX INFO: renamed from: b */
    public final zzini f11845b;

    public zzczr(zzimy zzimyVar, zzimy zzimyVar2) {
        this.f11844a = zzimyVar;
        this.f11845b = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzczq((Clock) this.f11844a.zzb(), (zzcfe) this.f11845b.zzb());
    }
}

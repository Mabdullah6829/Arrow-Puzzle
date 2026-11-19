package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeur implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f14927a;

    /* JADX INFO: renamed from: b */
    public final zzdcq f14928b;

    /* JADX INFO: renamed from: c */
    public final zzini f14929c;

    public zzeur(zzdcq zzdcqVar, zzini zziniVar, zzini zziniVar2) {
        this.f14927a = zziniVar;
        this.f14928b = zzdcqVar;
        this.f14929c = zziniVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeup((Clock) this.f14927a.zzb(), this.f14928b.m5898a(), ((Long) this.f14929c.zzb()).longValue());
    }
}

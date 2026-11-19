package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdad implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11865a;

    /* JADX INFO: renamed from: b */
    public final zzini f11866b;

    /* JADX INFO: renamed from: c */
    public final zzdcq f11867c;

    /* JADX INFO: renamed from: d */
    public final zzini f11868d;

    public zzdad(zzini zziniVar, zzini zziniVar2, zzdcq zzdcqVar, zzini zziniVar3) {
        this.f11865a = zziniVar;
        this.f11866b = zziniVar2;
        this.f11867c = zzdcqVar;
        this.f11868d = zziniVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdac((Clock) this.f11865a.zzb(), (zzdae) this.f11866b.zzb(), this.f11867c.m5898a(), (String) this.f11868d.zzb());
    }
}

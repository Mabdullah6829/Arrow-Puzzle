package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeos implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f14420a;

    /* JADX INFO: renamed from: b */
    public final zzina f14421b;

    /* JADX INFO: renamed from: c */
    public final zzini f14422c;

    public zzeos(zzina zzinaVar, zzini zziniVar, zzini zziniVar2) {
        this.f14420a = zziniVar;
        this.f14421b = zzinaVar;
        this.f14422c = zziniVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzeor((Context) this.f14420a.zzb(), (zzdok) this.f14421b.f20011a, ((zzcop) this.f14422c).m5711a());
    }
}

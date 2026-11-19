package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcwi implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11623a;

    /* JADX INFO: renamed from: b */
    public final zzini f11624b;

    /* JADX INFO: renamed from: c */
    public final zzcyr f11625c;

    /* JADX INFO: renamed from: d */
    public final zzini f11626d;

    public zzcwi(zzcvz zzcvzVar, zzimy zzimyVar, zzcop zzcopVar, zzcyr zzcyrVar, zzdcq zzdcqVar) {
        this.f11623a = zzimyVar;
        this.f11624b = zzcopVar;
        this.f11625c = zzcyrVar;
        this.f11626d = zzdcqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzdky(new zzcvy((Context) this.f11623a.zzb(), ((zzcop) this.f11624b).m5711a(), this.f11625c.m5872a(), ((zzdcq) this.f11626d).m5898a()), zzcfy.f9953h);
    }
}

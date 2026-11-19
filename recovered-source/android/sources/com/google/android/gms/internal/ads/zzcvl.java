package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcvl implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11559a;

    /* JADX INFO: renamed from: b */
    public final zzini f11560b;

    /* JADX INFO: renamed from: c */
    public final zzemt f11561c;

    /* JADX INFO: renamed from: d */
    public final zzeqw f11562d;

    public zzcvl(zzini zziniVar, zzini zziniVar2, zzemt zzemtVar, zzeqw zzeqwVar) {
        this.f11559a = zziniVar;
        this.f11560b = zziniVar2;
        this.f11561c = zzemtVar;
        this.f11562d = zzeqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzfps zzfpsVar = (zzfps) this.f11559a.zzb();
        zzhcp zzhcpVar = (zzhcp) this.f11560b.zzb();
        zzemt zzemtVar = this.f11561c;
        return new zzerc(zzfpsVar, zzhcpVar, this.f11562d.zzb(), new zzems((Context) zzemtVar.f14246a.zzb(), (zzcvg) zzemtVar.f14247b.f20011a));
    }
}

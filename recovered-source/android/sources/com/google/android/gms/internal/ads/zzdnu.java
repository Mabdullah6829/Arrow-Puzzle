package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdnu implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f12390a;

    /* JADX INFO: renamed from: b */
    public final zzini f12391b;

    /* JADX INFO: renamed from: c */
    public final zzeoe f12392c;

    /* JADX INFO: renamed from: d */
    public final zzeqw f12393d;

    public zzdnu(zzini zziniVar, zzini zziniVar2, zzeoe zzeoeVar, zzeqw zzeqwVar) {
        this.f12390a = zziniVar;
        this.f12391b = zziniVar2;
        this.f12392c = zzeoeVar;
        this.f12393d = zzeqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzfps zzfpsVar = (zzfps) this.f12390a.zzb();
        zzhcp zzhcpVar = (zzhcp) this.f12391b.zzb();
        zzeoe zzeoeVar = this.f12392c;
        return new zzerc(zzfpsVar, zzhcpVar, this.f12393d.zzb(), new zzeod((Context) zzeoeVar.f14374a.zzb(), (zzdno) zzeoeVar.f14375b.f20011a));
    }
}

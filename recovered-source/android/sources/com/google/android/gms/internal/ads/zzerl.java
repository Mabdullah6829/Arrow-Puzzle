package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzerl implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f14724a;

    /* JADX INFO: renamed from: b */
    public final zzina f14725b;

    /* JADX INFO: renamed from: c */
    public final zzini f14726c;

    /* JADX INFO: renamed from: d */
    public final zzini f14727d;

    /* JADX INFO: renamed from: e */
    public final zzerr f14728e;

    public zzerl(zzini zziniVar, zzina zzinaVar, zzini zziniVar2, zzini zziniVar3, zzerr zzerrVar) {
        this.f14724a = zziniVar;
        this.f14725b = zzinaVar;
        this.f14726c = zziniVar2;
        this.f14727d = zziniVar3;
        this.f14728e = zzerrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzerj((Context) this.f14724a.zzb(), (zzcwx) this.f14725b.f20011a, (zzfps) this.f14726c.zzb(), (zzhcp) this.f14727d.zzb(), this.f14728e.f14745a.f14744a);
    }
}

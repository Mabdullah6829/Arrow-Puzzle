package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdsn implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzdvq f12814a;

    /* JADX INFO: renamed from: b */
    public final zzini f12815b;

    public zzdsn(zzdvq zzdvqVar, zzimy zzimyVar) {
        this.f12814a = zzdvqVar;
        this.f12815b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzdky(new zzdvp(this.f12814a.f13118a.m6020a()), (Executor) this.f12815b.zzb());
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcxl implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcwq f11679a;

    /* JADX INFO: renamed from: b */
    public final zzini f11680b;

    public zzcxl(zzcwq zzcwqVar, zzimy zzimyVar) {
        this.f11679a = zzcwqVar;
        this.f11680b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzcxk(this.f11679a.f11635a.f11613d, (Executor) this.f11680b.zzb());
    }
}

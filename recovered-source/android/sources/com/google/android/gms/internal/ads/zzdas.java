package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdas implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11906a;

    /* JADX INFO: renamed from: b */
    public final zzini f11907b;

    public zzdas(zzimy zzimyVar, zzimy zzimyVar2) {
        this.f11906a = zzimyVar;
        this.f11907b = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky((zzdhq) this.f11906a.zzb(), (Executor) this.f11907b.zzb());
    }
}

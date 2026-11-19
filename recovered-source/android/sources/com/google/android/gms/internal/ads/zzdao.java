package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdao implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11899a;

    /* JADX INFO: renamed from: b */
    public final zzini f11900b;

    public zzdao(zzimy zzimyVar, zzimy zzimyVar2) {
        this.f11899a = zzimyVar;
        this.f11900b = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky((zzdhq) this.f11899a.zzb(), (Executor) this.f11900b.zzb());
    }
}

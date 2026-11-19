package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdau implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11910a;

    /* JADX INFO: renamed from: b */
    public final zzini f11911b;

    public zzdau(zzimy zzimyVar, zzimy zzimyVar2) {
        this.f11910a = zzimyVar;
        this.f11911b = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky((zzdhq) this.f11910a.zzb(), (Executor) this.f11911b.zzb());
    }
}

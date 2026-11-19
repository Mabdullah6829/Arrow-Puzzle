package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdap implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11901a;

    /* JADX INFO: renamed from: b */
    public final zzini f11902b;

    public zzdap(zzimy zzimyVar, zzimy zzimyVar2) {
        this.f11901a = zzimyVar;
        this.f11902b = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky((zzdhq) this.f11901a.zzb(), (Executor) this.f11902b.zzb());
    }
}

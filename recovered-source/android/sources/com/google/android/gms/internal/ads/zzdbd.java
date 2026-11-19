package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdbd implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11926a;

    /* JADX INFO: renamed from: b */
    public final zzini f11927b;

    public zzdbd(zzimy zzimyVar, zzimy zzimyVar2) {
        this.f11926a = zzimyVar;
        this.f11927b = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky((zzdhq) this.f11926a.zzb(), (Executor) this.f11927b.zzb());
    }
}

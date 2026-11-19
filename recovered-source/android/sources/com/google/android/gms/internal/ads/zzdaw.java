package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdaw implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11913a;

    /* JADX INFO: renamed from: b */
    public final zzini f11914b;

    public zzdaw(zzimy zzimyVar, zzimy zzimyVar2) {
        this.f11913a = zzimyVar;
        this.f11914b = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky((zzdhq) this.f11913a.zzb(), (Executor) this.f11914b.zzb());
    }
}

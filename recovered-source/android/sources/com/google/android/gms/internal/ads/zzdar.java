package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdar implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11904a;

    /* JADX INFO: renamed from: b */
    public final zzini f11905b;

    public zzdar(zzimy zzimyVar, zzimy zzimyVar2) {
        this.f11904a = zzimyVar;
        this.f11905b = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky((zzdhq) this.f11904a.zzb(), (Executor) this.f11905b.zzb());
    }
}

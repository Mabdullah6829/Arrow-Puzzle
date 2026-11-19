package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgez implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17121a;

    /* JADX INFO: renamed from: b */
    public final zzini f17122b;

    public zzgez(zzimy zzimyVar, zzimy zzimyVar2) {
        this.f17121a = zzimyVar;
        this.f17122b = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executor = (Executor) this.f17121a.zzb();
        return new zzgey(executor);
    }
}

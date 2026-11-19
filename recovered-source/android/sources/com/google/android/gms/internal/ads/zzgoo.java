package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgoo implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17935a;

    /* JADX INFO: renamed from: b */
    public final zzini f17936b;

    /* JADX INFO: renamed from: c */
    public final zzini f17937c;

    public zzgoo(zzimy zzimyVar, zzimy zzimyVar2, zzina zzinaVar) {
        this.f17935a = zzimyVar;
        this.f17936b = zzinaVar;
        this.f17937c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgon((zzglk) this.f17935a.zzb(), (ExecutorService) this.f17936b.zzb(), (zzgqo) this.f17937c.zzb());
    }
}

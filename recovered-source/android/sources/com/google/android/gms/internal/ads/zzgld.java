package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgld implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17708a;

    /* JADX INFO: renamed from: b */
    public final zzini f17709b;

    /* JADX INFO: renamed from: c */
    public final zzini f17710c;

    public zzgld(zzimy zzimyVar, zzina zzinaVar, zzina zzinaVar2) {
        this.f17708a = zzinaVar;
        this.f17709b = zzinaVar2;
        this.f17710c = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgla((Context) this.f17708a.zzb(), (ExecutorService) this.f17709b.zzb(), (zzgfs) this.f17710c.zzb());
    }
}

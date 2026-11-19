package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgql implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f18059a;

    /* JADX INFO: renamed from: b */
    public final zzini f18060b;

    /* JADX INFO: renamed from: c */
    public final zzina f18061c;

    public zzgql(zzimy zzimyVar, zzina zzinaVar, zzina zzinaVar2) {
        this.f18059a = zzinaVar;
        this.f18060b = zzimyVar;
        this.f18061c = zzinaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context context = (Context) this.f18059a.f20011a;
        return new zzgqk(context, (ExecutorService) this.f18061c.f20011a, zzgqk.f18051h);
    }
}

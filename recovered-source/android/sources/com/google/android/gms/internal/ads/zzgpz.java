package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgpz implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f18016a;

    /* JADX INFO: renamed from: b */
    public final zzina f18017b;

    public zzgpz(zzina zzinaVar, zzina zzinaVar2) {
        this.f18016a = zzinaVar;
        this.f18017b = zzinaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzgpy((Context) this.f18016a.f20011a, (ExecutorService) this.f18017b.f20011a);
    }
}

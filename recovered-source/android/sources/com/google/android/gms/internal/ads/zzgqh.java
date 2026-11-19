package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgqh implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f18047a;

    /* JADX INFO: renamed from: b */
    public final zzina f18048b;

    public zzgqh(zzina zzinaVar, zzina zzinaVar2) {
        this.f18047a = zzinaVar;
        this.f18048b = zzinaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzgqg((Context) this.f18047a.f20011a, (ExecutorService) this.f18048b.f20011a);
    }
}

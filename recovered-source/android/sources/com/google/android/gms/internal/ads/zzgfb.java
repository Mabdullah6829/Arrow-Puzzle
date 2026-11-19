package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgfb implements zzgew {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f17128a = Executors.newSingleThreadScheduledExecutor();

    @Override // com.google.android.gms.internal.ads.zzgew
    /* JADX INFO: renamed from: a */
    public final void mo6967a(Runnable runnable, long j2) {
        this.f17128a.schedule(runnable, j2, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final void zzb() {
    }
}

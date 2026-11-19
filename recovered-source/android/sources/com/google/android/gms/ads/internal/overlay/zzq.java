package com.google.android.gms.ads.internal.overlay;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class zzq implements Callable {

    /* JADX INFO: renamed from: a */
    public final long f3378a;

    public zzq(long j2) {
        this.f3378a = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.f3286R.remove(Long.valueOf(this.f3378a)) == null) {
            return null;
        }
        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdOverlayObjectsCleanupTask", new Exception("Key was non-null in AdOverlayObjectsCleanupTask"));
        return null;
    }
}

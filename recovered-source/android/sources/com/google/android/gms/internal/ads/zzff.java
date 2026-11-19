package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzff implements zzdp {
    @Override // com.google.android.gms.internal.ads.zzdp
    /* JADX INFO: renamed from: a */
    public final zzea mo5975a(Looper looper, Handler.Callback callback) {
        return new zzfh(new Handler(looper, callback));
    }

    @Override // com.google.android.gms.internal.ads.zzdp
    public final long zza() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.zzdp
    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzdp
    public final long zzc() {
        return System.nanoTime();
    }
}

package com.google.android.gms.ads.internal.util;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class zzbu {

    /* JADX INFO: renamed from: a */
    public long f3543a;

    /* JADX INFO: renamed from: b */
    public long f3544b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public final Object f3545c = new Object();

    public zzbu(long j2) {
        this.f3543a = j2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3140a() {
        synchronized (this.f3545c) {
            try {
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f3544b + this.f3543a > jElapsedRealtime) {
                    return false;
                }
                this.f3544b = jElapsedRealtime;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

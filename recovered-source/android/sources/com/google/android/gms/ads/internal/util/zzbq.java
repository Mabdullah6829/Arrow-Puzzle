package com.google.android.gms.ads.internal.util;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzgax;

/* JADX INFO: loaded from: classes.dex */
public final class zzbq {

    /* JADX INFO: renamed from: a */
    public HandlerThread f3535a = null;

    /* JADX INFO: renamed from: b */
    public zzgax f3536b = null;

    /* JADX INFO: renamed from: c */
    public int f3537c = 0;

    /* JADX INFO: renamed from: d */
    public final Object f3538d = new Object();

    /* JADX INFO: renamed from: a */
    public final Looper m3128a() {
        Looper looper;
        Object obj = this.f3538d;
        synchronized (obj) {
            try {
                if (this.f3537c != 0) {
                    Preconditions.m3545i(this.f3535a, "Invalid state: handlerThread should already been initialized.");
                } else if (this.f3535a == null) {
                    zze.m3150k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f3535a = handlerThread;
                    handlerThread.start();
                    this.f3536b = new zzgax(this.f3535a.getLooper());
                    zze.m3150k("Looper thread started.");
                } else {
                    zze.m3150k("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.f3537c++;
                looper = this.f3535a.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }
}

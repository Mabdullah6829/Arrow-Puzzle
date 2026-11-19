package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class zzmv {

    /* JADX INFO: renamed from: a */
    public final Object f20475a;

    /* JADX INFO: renamed from: b */
    public Looper f20476b;

    /* JADX INFO: renamed from: c */
    public HandlerThread f20477c;

    /* JADX INFO: renamed from: d */
    public int f20478d;

    public zzmv() {
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m8765a() {
        HandlerThread handlerThread;
        synchronized (this.f20475a) {
            try {
                zzgtr.m7133f(this.f20478d > 0);
                int i2 = this.f20478d - 1;
                this.f20478d = i2;
                if (i2 == 0 && (handlerThread = this.f20477c) != null) {
                    handlerThread.quit();
                    this.f20477c = null;
                    this.f20476b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzmv(int i2) {
        this.f20475a = new Object();
        this.f20476b = null;
        this.f20477c = null;
        this.f20478d = 0;
    }
}

package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdt {

    /* JADX INFO: renamed from: a */
    public boolean f12859a;

    public zzdt() {
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m6050a() {
        if (this.f12859a) {
            return false;
        }
        this.f12859a = true;
        notifyAll();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6051b() {
        boolean z = false;
        while (!this.f12859a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m6052c(long j2) {
        if (j2 > 0) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = j2 + jElapsedRealtime;
                if (j3 < jElapsedRealtime) {
                    m6051b();
                } else {
                    boolean z = false;
                    while (!this.f12859a && jElapsedRealtime < j3) {
                        try {
                            wait(j3 - jElapsedRealtime);
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f12859a;
    }
}

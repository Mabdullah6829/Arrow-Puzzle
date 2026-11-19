package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgqm {

    /* JADX INFO: renamed from: a */
    public final zzgfs f18062a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f18063b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public long f18064c = -1;

    /* JADX INFO: renamed from: d */
    public long f18065d = -1;

    /* JADX INFO: renamed from: e */
    public Throwable f18066e = null;

    /* JADX INFO: renamed from: f */
    public final int f18067f;

    public zzgqm(int i2, zzgfs zzgfsVar) {
        this.f18067f = i2;
        this.f18062a = zzgfsVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m7057a() {
        if (this.f18063b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f18064c = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public final void m7058b(Throwable th) {
        if (this.f18063b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f18066e = th;
    }

    /* JADX INFO: renamed from: c */
    public final void m7059c() {
        AtomicBoolean atomicBoolean = this.f18063b;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f18065d = SystemClock.uptimeMillis();
        this.f18062a.mo6973b(this.f18067f - 1, atomicBoolean.get() ? this.f18065d - this.f18064c : -1L, null, this.f18066e);
    }
}

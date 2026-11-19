package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
final class zza implements Runnable {

    /* JADX INFO: renamed from: s */
    public final Runnable f4658s;

    public zza(Runnable runnable) {
        this.f4658s = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f4658s.run();
    }
}

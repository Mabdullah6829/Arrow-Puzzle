package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
final class zzgav implements ThreadFactory {

    /* JADX INFO: renamed from: s */
    public final ThreadFactory f16887s = Executors.defaultThreadFactory();

    private zzgav() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f16887s.newThread(runnable);
        if (threadNewThread == null) {
            throw new NullPointerException("Default ThreadFactory returned null thread");
        }
        threadNewThread.setName("punch".concat(String.valueOf(threadNewThread.getName())));
        return threadNewThread;
    }

    public /* synthetic */ zzgav(int i2) {
    }
}

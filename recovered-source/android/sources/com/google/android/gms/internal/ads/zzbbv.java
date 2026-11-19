package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class zzbbv implements ThreadFactory {

    /* JADX INFO: renamed from: s */
    public final ThreadFactory f7541s = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: t */
    public final AtomicInteger f7542t = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f7541s.newThread(runnable);
        int andIncrement = this.f7542t.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(andIncrement).length() + 5);
        sb.append("gads-");
        sb.append(andIncrement);
        threadNewThread.setName(sb.toString());
        return threadNewThread;
    }
}

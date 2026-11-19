package com.google.android.gms.internal.consent_sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzcy implements Executor {

    /* JADX INFO: renamed from: t */
    public final ThreadPoolExecutor f21619t;

    /* JADX INFO: renamed from: s */
    public final AtomicInteger f21618s = new AtomicInteger(1);

    /* JADX INFO: renamed from: u */
    public WeakReference f21620u = new WeakReference(null);

    public zzcy() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.android.gms.internal.consent_sdk.zzcx
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                zzcy zzcyVar = this.f21617s;
                Thread thread = new Thread(runnable, AbstractC0271e0.m396d(zzcyVar.f21618s.getAndIncrement(), "Google consent worker #"));
                zzcyVar.f21620u = new WeakReference(thread);
                return thread;
            }
        });
        this.f21619t = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f21620u.get()) {
            runnable.run();
        } else {
            this.f21619t.execute(runnable);
        }
    }
}

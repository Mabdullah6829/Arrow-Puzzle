package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class zzcee implements ThreadFactory {

    /* JADX INFO: renamed from: s */
    public final AtomicInteger f9825s = new AtomicInteger(1);

    public zzcee(zzceg zzcegVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f9825s.getAndIncrement();
        return new Thread(runnable, AbstractC1456a.m2447n(new StringBuilder(String.valueOf(andIncrement).length() + 31), "AdWorker(SCION_TASK_EXECUTOR) #", andIncrement));
    }
}

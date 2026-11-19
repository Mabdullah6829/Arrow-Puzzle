package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class zzfny implements ThreadFactory {

    /* JADX INFO: renamed from: s */
    public final AtomicInteger f16194s = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f16194s.getAndIncrement();
        return new Thread(runnable, AbstractC1456a.m2447n(new StringBuilder(String.valueOf(andIncrement).length() + 14), "AdWorker(NG) #", andIncrement));
    }
}

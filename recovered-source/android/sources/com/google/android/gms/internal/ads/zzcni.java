package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class zzcni implements ThreadFactory {

    /* JADX INFO: renamed from: s */
    public final AtomicInteger f10595s = new AtomicInteger(1);

    /* JADX INFO: renamed from: t */
    public final int f10596t;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f10595s.getAndIncrement();
        return new zzcnh(this, runnable, AbstractC1456a.m2447n(new StringBuilder(String.valueOf(andIncrement).length() + 26), "AdWorker(WebViewStartup) #", andIncrement), runnable);
    }
}

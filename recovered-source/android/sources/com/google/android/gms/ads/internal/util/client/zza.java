package com.google.android.gms.ads.internal.util.client;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
final class zza implements ThreadFactory {

    /* JADX INFO: renamed from: s */
    public final AtomicInteger f3401s = new AtomicInteger(1);

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f3402t;

    public zza(String str) {
        this.f3402t = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f3401s.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.f3402t;
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2438e(12, length, str));
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}

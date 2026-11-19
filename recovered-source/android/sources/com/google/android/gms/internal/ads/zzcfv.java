package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class zzcfv implements ThreadFactory {

    /* JADX INFO: renamed from: s */
    public final AtomicInteger f9942s = new AtomicInteger(1);

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f9943t;

    public zzcfv(String str) {
        this.f9943t = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f9942s.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.f9943t;
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2438e(12, length, str));
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
